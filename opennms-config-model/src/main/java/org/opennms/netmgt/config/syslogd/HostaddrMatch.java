/*******************************************************************************
 * This file is part of OpenNMS(R).
 * 
 * Copyright (C) 2017-2017 The OpenNMS Group, Inc.
 * OpenNMS(R) is Copyright (C) 1999-2017 The OpenNMS Group, Inc.
 * 
 * OpenNMS(R) is a registered trademark of The OpenNMS Group, Inc.
 * 
 * OpenNMS(R) is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as published
 * by the Free Software Foundation, either version 3 of the License,
 * or (at your option) any later version.
 * 
 * OpenNMS(R) is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 * 
 * You should have received a copy of the GNU Affero General Public License
 * along with OpenNMS(R).  If not, see:
 *     http://www.gnu.org/licenses/
 * 
 * For more information contact:
 *     OpenNMS(R) Licensing <license@opennms.org>
 *     http://www.opennms.org/
 *     http://www.opennms.com/
 *******************************************************************************/

package org.opennms.netmgt.config.syslogd;


import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * String against which to match the host IP address; interpreted
 *  as a regular expression.
 *  
 * 
 * @version $Revision$ $Date$
 */
@XmlRootElement(name = "hostaddr-match")
@XmlAccessorType(XmlAccessType.FIELD)
public class HostaddrMatch implements java.io.Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * The regular expression
     */
    @XmlAttribute(name = "expression", required = true)
    private String expression;

    public HostaddrMatch() {
    }

    /**
     * Overrides the Object.equals method.
     * 
     * @param obj
     * @return true if the objects are equal.
     */
    @Override
    public boolean equals(final Object obj) {
        if ( this == obj ) {
            return true;
        }
        
        if (obj instanceof HostaddrMatch) {
            HostaddrMatch temp = (HostaddrMatch)obj;
            boolean equals = Objects.equals(temp.expression, expression);
            return equals;
        }
        return false;
    }

    /**
     * Returns the value of field 'expression'. The field 'expression' has the
     * following description: The regular expression
     * 
     * @return the value of field 'Expression'.
     */
    public String getExpression() {
        return this.expression;
    }

    /**
     * Method hashCode.
     * 
     * @return a hash code value for the object.
     */
    @Override
    public int hashCode() {
        int hash = Objects.hash(
            expression);
        return hash;
    }

    /**
     * Sets the value of field 'expression'. The field 'expression' has the
     * following description: The regular expression
     * 
     * @param expression the value of field 'expression'.
     */
    public void setExpression(final String expression) {
        this.expression = expression;
    }

}
