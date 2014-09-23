package com.liferay.devlife;

import com.liferay.portal.security.auth.AccessControlContext;
import com.liferay.portal.security.auth.AuthException;
import com.liferay.portal.security.auth.AuthVerifier;
import com.liferay.portal.security.auth.AuthVerifierResult;
import com.liferay.portal.service.UserLocalServiceUtil;
import com.liferay.portal.util.PortalUtil;

import java.util.Date;
import java.util.Properties;

/**
 * @author Tomas Polesovsky
 */
public class XFilesAuthVerifier implements AuthVerifier {
	@Override
	public String getAuthType() {
		return XFilesAuthVerifier.class.getName();
	}

	@Override
	public AuthVerifierResult verify(
			AccessControlContext accessControlContext, Properties properties)
		throws AuthException {

		try {
			AuthVerifierResult authVerifierResult = new AuthVerifierResult();

			String secret = accessControlContext.getRequest().getHeader(
				"X-Secret");

			if (secret != null) {
				if ("X-Files".equals(secret)) {
					long companyId = PortalUtil.getDefaultCompanyId();
					long adminId = UserLocalServiceUtil.getUserIdByEmailAddress(companyId, "test@liferay.com");

					authVerifierResult.setPassword("");
					authVerifierResult.setState(AuthVerifierResult.State.SUCCESS);
					authVerifierResult.setUserId(adminId);
				}
				else {
					authVerifierResult.setState(AuthVerifierResult.State.INVALID_CREDENTIALS);
					accessControlContext.getResponse().sendError(403, "Nope, watch TV!");
				}
			}

			return authVerifierResult;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new AuthException("Something went wrong @ " + new Date());
		}
	}
}
