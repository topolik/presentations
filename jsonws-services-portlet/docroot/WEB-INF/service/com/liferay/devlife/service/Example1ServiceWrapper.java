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
 * Provides a wrapper for {@link Example1Service}.
 *
 * @author Brian Wing Shun Chan
 * @see Example1Service
 * @generated
 */
public class Example1ServiceWrapper implements Example1Service,
	ServiceWrapper<Example1Service> {
	public Example1ServiceWrapper(Example1Service example1Service) {
		_example1Service = example1Service;
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _example1Service.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_example1Service.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _example1Service.invokeMethod(name, parameterTypes, arguments);
	}

	@Override
	public com.liferay.portal.model.User getSignedUser()
		throws java.lang.Exception {
		return _example1Service.getSignedUser();
	}

	@Override
	public java.util.List<com.liferay.portal.model.User> getUsers()
		throws java.lang.Exception {
		return _example1Service.getUsers();
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public Example1Service getWrappedExample1Service() {
		return _example1Service;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedExample1Service(Example1Service example1Service) {
		_example1Service = example1Service;
	}

	@Override
	public Example1Service getWrappedService() {
		return _example1Service;
	}

	@Override
	public void setWrappedService(Example1Service example1Service) {
		_example1Service = example1Service;
	}

	private Example1Service _example1Service;
}