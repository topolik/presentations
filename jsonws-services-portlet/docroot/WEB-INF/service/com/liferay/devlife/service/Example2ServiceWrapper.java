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

package com.liferay.devlife.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link Example2Service}.
 *
 * @author Brian Wing Shun Chan
 * @see Example2Service
 * @generated
 */
public class Example2ServiceWrapper implements Example2Service,
	ServiceWrapper<Example2Service> {
	public Example2ServiceWrapper(Example2Service example2Service) {
		_example2Service = example2Service;
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _example2Service.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_example2Service.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _example2Service.invokeMethod(name, parameterTypes, arguments);
	}

	@Override
	public java.util.List<com.liferay.portal.model.User> getUsersFiltered()
		throws java.lang.Exception {
		return _example2Service.getUsersFiltered();
	}

	@Override
	public java.util.List<com.liferay.portal.model.User> getUsersUsingToken(
		java.lang.String token) throws java.lang.Exception {
		return _example2Service.getUsersUsingToken(token);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public Example2Service getWrappedExample2Service() {
		return _example2Service;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedExample2Service(Example2Service example2Service) {
		_example2Service = example2Service;
	}

	@Override
	public Example2Service getWrappedService() {
		return _example2Service;
	}

	@Override
	public void setWrappedService(Example2Service example2Service) {
		_example2Service = example2Service;
	}

	private Example2Service _example2Service;
}