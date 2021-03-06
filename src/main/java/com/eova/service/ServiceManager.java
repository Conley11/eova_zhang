/**
 * Copyright (c) 2013-2016, czhang. All rights reserved.
 *
 * Licensed under the GPL license: http://www.gnu.org/licenses/gpl.txt
 * To use it on other terms please contact us at 1623736450@qq.com
 */
package com.eova.service;

/**
 * 服务管理中心
 * 
 * @author czhang
 *
 */
public class ServiceManager {
	/** 权限服务 **/
	public static AuthService auth;
	/** 元服务 **/
	public static MetaService meta;

	public static void init() {
		auth = new AuthService();
		meta = new MetaService();
	}
}