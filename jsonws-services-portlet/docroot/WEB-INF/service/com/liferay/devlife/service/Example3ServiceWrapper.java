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
 * Provides a wrapper for {@link Example3Service}.
 *
 * @author Brian Wing Shun Chan
 * @see Example3Service
 * @generated
 */
public class Example3ServiceWrapper implements Example3Service,
	ServiceWrapper<Example3Service> {
	public Example3ServiceWrapper(Example3Service example3Service) {
		_example3Service = example3Service;
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _example3Service.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_example3Service.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _example3Service.invokeMethod(name, parameterTypes, arguments);
	}

	@Override
	public com.liferay.portal.model.User getCurrentUser()
		throws java.lang.Exception {
		return _example3Service.getCurrentUser();
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public Example3Service getWrappedExample3Service() {
		return _example3Service;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedExample3Service(Example3Service example3Service) {
		_example3Service = example3Service;
	}

	@Override
	public Example3Service getWrappedService() {
		return _example3Service;
	}

	@Override
	public void setWrappedService(Example3Service example3Service) {
		_example3Service = example3Service;
	}

	private Example3Service _example3Service;
}