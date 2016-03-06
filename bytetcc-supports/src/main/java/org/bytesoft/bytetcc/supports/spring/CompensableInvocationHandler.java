/**
 * Copyright 2014-2016 yangming.liu<bytefox@126.com>.
 *
 * This copyrighted material is made available to anyone wishing to use, modify,
 * copy, or redistribute it subject to the terms and conditions of the GNU
 * Lesser General Public License, as published by the Free Software Foundation.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY
 * or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU Lesser General Public License
 * for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this distribution; if not, see <http://www.gnu.org/licenses/>.
 */
package org.bytesoft.bytetcc.supports.spring;

import java.lang.reflect.Method;

public class CompensableInvocationHandler implements java.lang.reflect.InvocationHandler,
		net.sf.cglib.proxy.InvocationHandler, org.springframework.cglib.proxy.InvocationHandler {

	private String beanName;
	private Object delegate;
	private Class<?> targetClass;
	private Class<?> interfaceClass;
	private String confirmableKey;
	private String cancellableKey;

	public Object invoke(Object object, Method method, Object[] args) throws Throwable {
		try {
			// TODO
			if (java.lang.reflect.InvocationHandler.class.isInstance(this.delegate)) {
				return ((java.lang.reflect.InvocationHandler) this.delegate).invoke(object, method, args);
			} else if (net.sf.cglib.proxy.InvocationHandler.class.isInstance(this.delegate)) {
				return ((net.sf.cglib.proxy.InvocationHandler) this.delegate).invoke(object, method, args);
			} else if (org.springframework.cglib.proxy.InvocationHandler.class.isInstance(this.delegate)) {
				return ((org.springframework.cglib.proxy.InvocationHandler) this.delegate).invoke(object, method, args);
			} else {
				return null; // TODO
			}
		} finally {
			// TODO
		}
	}

	public String getBeanName() {
		return beanName;
	}

	public void setBeanName(String beanName) {
		this.beanName = beanName;
	}

	public Object getDelegate() {
		return delegate;
	}

	public void setDelegate(Object delegate) {
		this.delegate = delegate;
	}

	public Class<?> getTargetClass() {
		return targetClass;
	}

	public void setTargetClass(Class<?> targetClass) {
		this.targetClass = targetClass;
	}

	public Class<?> getInterfaceClass() {
		return interfaceClass;
	}

	public void setInterfaceClass(Class<?> interfaceClass) {
		this.interfaceClass = interfaceClass;
	}

	public String getConfirmableKey() {
		return confirmableKey;
	}

	public void setConfirmableKey(String confirmableKey) {
		this.confirmableKey = confirmableKey;
	}

	public String getCancellableKey() {
		return cancellableKey;
	}

	public void setCancellableKey(String cancellableKey) {
		this.cancellableKey = cancellableKey;
	}

}