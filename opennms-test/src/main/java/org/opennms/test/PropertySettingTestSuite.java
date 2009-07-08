/*******************************************************************************
 * This file is part of the OpenNMS(R) Application.
 *
 * Copyright (C) 2005-2008 The OpenNMS Group, Inc.  All rights reserved.
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

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestResult;
import junit.framework.TestSuite;

public class PropertySettingTestSuite extends TestSuite {
    
    String m_propertyName;
    String m_propertyValue;
    
    public PropertySettingTestSuite(String propertyName, String propertyValue) {
        super();
        m_propertyName = propertyName;
        m_propertyValue = propertyValue;
    }
    
    public PropertySettingTestSuite(Class<? extends TestCase> theClass, String name, String propertyName, String propertyValue) {
        super(theClass, name);
        m_propertyName = propertyName;
        m_propertyValue = propertyValue;
    }

    public PropertySettingTestSuite(Class<? extends TestCase> theClass, String propertyName, String propertyValue) {
        super(theClass);
        m_propertyName = propertyName;
        m_propertyValue = propertyValue;
    }

    public PropertySettingTestSuite(String name, String propertyName, String propertyValue) {
        super(name);
        m_propertyName = propertyName;
        m_propertyValue = propertyValue;
    }
    
    public void runTest(Test test, TestResult result) {
        setProperty();
        super.runTest(test, result);
    }

    private void setProperty() {
        System.setProperty(m_propertyName, m_propertyValue);
    }
    
    

}
