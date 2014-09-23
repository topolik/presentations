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
 * Provides a wrapper for {@link Example4Service}.
 *
 * @author Brian Wing Shun Chan
 * @see Example4Service
 * @generated
 */
public class Example4ServiceWrapper implements Example4Service,
	ServiceWrapper<Example4Service> {
	public Example4ServiceWrapper(Example4Service example4Service) {
		_example4Service = example4Service;
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _example4Service.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_example4Service.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _example4Service.invokeMethod(name, parameterTypes, arguments);
	}

	@Override
	public com.liferay.portal.model.User getCurrentUser()
		throws java.lang.Exception {
		return _example4Service.getCurrentUser();
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public Example4Service getWrappedExample4Service() {
		return _example4Service;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedExample4Service(Example4Service example4Service) {
		_example4Service = example4Service;
	}

	@Override
	public Example4Service getWrappedService() {
		return _example4Service;
	}

	@Override
	public void setWrappedService(Example4Service example4Service) {
		_example4Service = example4Service;
	}

	private Example4Service _example4Service;
}