/*******************************************************************************
 * This file is part of the OpenNMS(R) Application.
 *
 * Copyright (C) 2007-2008 The OpenNMS Group, Inc.  All rights reserved.
 *
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc.:
 *
 *      51 Franklin Street
 *      5th Floor
 *      Boston, MA 02110-1301
 *      USA
 *
 * For more information contact:
 *
 *      OpenNMS Licensing <license@opennms.org>
 *      http://www.opennms.org/
 *      http://www.opennms.com/
 *
 *******************************************************************************/

package org.opennms.test;

import org.springframework.beans.factory.InitializingBean;

/**
 * Support class to help with configuration that needs to happen in
 * integration tests before Spring attempts to do context initialization of
 * applicationContext-svclayer.xml in the web application.
 * In particular, this sets up system properties that are needed by Spring.
 * System properties are not set until afterPropertiesSet() is called.
 * 
 * @author <a href="mailto:dj@opennms.org">DJ Gregor</a>
 */
public class WebAppTestConfigBean extends DaoTestConfigBean implements InitializingBean {
    private String m_webAppLogsDirectory = "target/test/logs/webapp";
    private String m_layoutApplicationsVertically = "false";

    public WebAppTestConfigBean() {
        super();
    }

    public void afterPropertiesSet() {
        super.afterPropertiesSet();
        
        System.setProperty("distributed.layoutApplicationsVertically", m_layoutApplicationsVertically);
        System.setProperty("opennms.webapplogs.dir", m_webAppLogsDirectory);
    }

    public String getLayoutApplicationsVertically() {
        return m_layoutApplicationsVertically;
    }

    public void setLayoutApplicationsVertically(String layoutApplicationsVertically) {
        m_layoutApplicationsVertically = layoutApplicationsVertically;
    }

    public String getWebAppLogsDirectory() {
        return m_webAppLogsDirectory;
    }

    public void setWebAppLogsDirectory(String webAppLogsDirectory) {
        m_webAppLogsDirectory = webAppLogsDirectory;
    }
}
