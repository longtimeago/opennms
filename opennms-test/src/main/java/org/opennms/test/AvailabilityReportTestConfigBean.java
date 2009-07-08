/*******************************************************************************
 * This file is part of the OpenNMS(R) Application.
 *
 * Copyright (C) 2009 The OpenNMS Group, Inc.  All rights reserved.
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
 * applicationContext-reporting.xml.
 * In particular, this sets up system properties that are needed by Spring.
 * System properties are not set until afterPropertiesSet() is called.
 * 
 * @author <a href="mailto:jonathan@opennms.org">Jonathan Sartin</a>
 */
public class AvailabilityReportTestConfigBean extends DaoTestConfigBean implements InitializingBean {
    private String m_reportDirectory = "target/share/reports";

    public AvailabilityReportTestConfigBean() {
        super();
    }

    public void afterPropertiesSet() {
        super.afterPropertiesSet();
        
        System.setProperty("opennms.report.dir", m_reportDirectory);
        
    }


    public void setRerpotDirectory(String reportDirectory) {
        m_reportDirectory = reportDirectory;
    }
}
