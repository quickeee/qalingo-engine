/**
 * Most of the code in the Qalingo project is copyrighted Hoteia and licensed
 * under the Apache License Version 2.0 (release version 0.7.0)
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 *                   Copyright (c) Hoteia, 2012-2013
 * http://www.hoteia.com - http://twitter.com/hoteia - contact@hoteia.com
 *
 */
package fr.hoteia.qalingo.web.service;

import javax.servlet.http.HttpServletRequest;

import fr.hoteia.qalingo.core.common.domain.Localization;

public interface BackofficeUrlService {

	String buildHomeUrl(HttpServletRequest request);
	
	String buildLoginUrl(HttpServletRequest request);
	
	String buildLogoutUrl(HttpServletRequest request);
	
	String buildUserDetailsUrl(HttpServletRequest request);
	
	String buildUserEditUrl(HttpServletRequest request);
	
	String buildCatalogUrl(HttpServletRequest request);
	
	String buildPromotionUrl(HttpServletRequest request);
	
	String buildShippingUrl(HttpServletRequest request);

	String buildOrderListUrl(HttpServletRequest request);

	String buildCustomerListUrl(HttpServletRequest request);

	String buildFaqUrl(HttpServletRequest request);
	
	String buildForbiddenUrl(HttpServletRequest request);
	
	String buildChangeLanguageUrl(HttpServletRequest request, Localization localization);
	
	String buildSpringSecurityCheckUrl(HttpServletRequest request);
	
	String buildForgottenPasswordUrl(HttpServletRequest request);
	
	String buildSearchUrl(HttpServletRequest request);
}