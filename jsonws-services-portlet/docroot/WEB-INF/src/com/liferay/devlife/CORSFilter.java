package com.liferay.devlife;

import com.liferay.portal.security.auth.AuthTokenUtil;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author Tomas Polesovsky
 */
public class CORSFilter implements Filter {

	@Override
	public void doFilter(
			ServletRequest servletRequest, ServletResponse servletResponse,
			FilterChain chain)
		throws IOException, ServletException {

		final HttpServletRequest request = (HttpServletRequest)servletRequest;
		HttpServletResponse response = (HttpServletResponse)servletResponse;

		if (isCORSAllowed(request)) {

			// cookies are allowed

			response.setHeader("Access-Control-Allow-Credentials", "true");

			// the origin is allowed

			response.setHeader("Access-Control-Allow-Origin",
				request.getHeader("Origin"));

			HttpServletRequest csrfRequest =
				new HttpServletRequestWrapper(request) {

					@Override
					public String getParameter(String name) {
						if (name.equals("p_auth")) {
							return AuthTokenUtil.getToken(request);
						}

						return super.getParameter(name);
					}

				};

			chain.doFilter(csrfRequest, response);
			return;
		}

		chain.doFilter(request, response);
	}

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
	}

	protected boolean isCORSAllowed(HttpServletRequest request) {
		String origin = request.getHeader("Origin");

		if (!"http://alpha.cz".equals(origin)) {
			return false;
		}

		String uri = request.getRequestURI();

		if(!uri.startsWith("/api/jsonws/jsonws-services-portlet.example4/get-current-user")) {
			return false;
		}

		return true;
	}

	@Override
	public void destroy() {
	}

}
