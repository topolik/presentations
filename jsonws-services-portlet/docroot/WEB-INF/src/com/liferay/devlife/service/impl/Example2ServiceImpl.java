/**
 * Copyright (c) 2000-2013 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.devlife.service.impl;

import com.liferay.devlife.service.base.Example2ServiceBaseImpl;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.jsonwebservice.JSONWebService;
import com.liferay.portal.model.User;
import com.liferay.portal.security.ac.AccessControlThreadLocal;
import com.liferay.portal.security.ac.AccessControlled;
import com.liferay.portal.security.auth.AccessControlContext;
import com.liferay.portal.security.permission.ActionKeys;
import com.liferay.portal.security.permission.PermissionChecker;
import com.liferay.portal.security.permission.PermissionThreadLocal;
import com.liferay.portal.service.UserLocalServiceUtil;

import java.util.ArrayList;
import java.util.List;

/**
 * The implementation of the example2 remote service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.liferay.devlife.service.Example2Service} interface.
 *
 * <p>
 * This is a remote service. Methods of this service are expected to have security checks based on the propagated JAAS credentials because this service can be accessed remotely.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see com.liferay.devlife.service.base.Example2ServiceBaseImpl
 * @see com.liferay.devlife.service.Example2ServiceUtil
 */
public class Example2ServiceImpl extends Example2ServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link com.liferay.devlife.service.Example2ServiceUtil} to access the example2 remote service.
	 */

	@AccessControlled(guestAccessEnabled = true)
	public List<User> getUsersFiltered() throws Exception {
		PermissionChecker permissionChecker =
			PermissionThreadLocal.getPermissionChecker();

		long companyId = permissionChecker.getCompanyId();

		List<User> users = UserLocalServiceUtil.getCompanyUsers(
			companyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS);

		return filter(users);
	}

	protected List<User> filter(List<User> users) {
		PermissionChecker permissionChecker =
			PermissionThreadLocal.getPermissionChecker();

		List<User> result = new ArrayList(users.size());

		for (User user : users) {
			if (permissionChecker.hasPermission(
				0, User.class.getName(), user.getUserId(), ActionKeys.VIEW)) {

				result.add(user);
			}
		}

		return result;
	}

	@AccessControlled(guestAccessEnabled = true)
	public List<User> getUsersUsingToken(String token) throws Exception {
		if (!"my-super-secret-token-leaking-in-server-logs".equals(token)) {
			return new ArrayList();
		}

		PermissionChecker permissionChecker =
			PermissionThreadLocal.getPermissionChecker();

		long companyId = permissionChecker.getCompanyId();

		return UserLocalServiceUtil.getCompanyUsers(
			companyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS);
	}


}