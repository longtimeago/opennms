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

package org.opennms.netmgt.config.snmpinterfacepoller;


import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Package encapsulating addresses, services to be polled
 *  for these addresses, etc..
 * 
 * @version $Revision$ $Date$
 */
@XmlRootElement(name = "package")
@XmlAccessorType(XmlAccessType.FIELD)

@SuppressWarnings("all") public class Package implements java.io.Serializable {


    /**
     * Name or identifier for this package.
     */
    @XmlAttribute(name = "name", required = true)
    private String name;

    /**
     * A rule which addresses belonging to this package
     *  must pass. This package is applied only to addresses that pass
     *  this filter.
     */
    @XmlElement(name = "filter", required = true)
    private org.opennms.netmgt.config.snmpinterfacepoller.Filter filter;

    /**
     * Addresses in this package
     */
    @XmlElement(name = "specific")
    private java.util.List<String> specificList;

    /**
     * Range of addresses in this package.
     */
    @XmlElement(name = "include-range")
    private java.util.List<org.opennms.netmgt.config.snmpinterfacepoller.IncludeRange> includeRangeList;

    /**
     * Range of addresses to be excluded from this
     *  package.
     */
    @XmlElement(name = "exclude-range")
    private java.util.List<org.opennms.netmgt.config.snmpinterfacepoller.ExcludeRange> excludeRangeList;

    /**
     * A file URL holding specific addresses to be polled.
     *  Each line in the URL file can be one of:
     *  <IP><space>#<comments> or <IP> or
     *  #<comments>. Lines starting with a '#' are ignored and so
     *  are characters after a '<space>#' in a line.
     */
    @XmlElement(name = "include-url")
    private java.util.List<String> includeUrlList;

    /**
     * Interfaces to be polled for addresses belonging to
     *  this package.
     */
    @XmlElement(name = "interface", required = true)
    private java.util.List<org.opennms.netmgt.config.snmpinterfacepoller.Interface> _interfaceList;

    public Package() {
        this.specificList = new java.util.ArrayList<String>();
        this.includeRangeList = new java.util.ArrayList<org.opennms.netmgt.config.snmpinterfacepoller.IncludeRange>();
        this.excludeRangeList = new java.util.ArrayList<org.opennms.netmgt.config.snmpinterfacepoller.ExcludeRange>();
        this.includeUrlList = new java.util.ArrayList<String>();
        this._interfaceList = new java.util.ArrayList<org.opennms.netmgt.config.snmpinterfacepoller.Interface>();
    }

    /**
     * 
     * 
     * @param vExcludeRange
     * @throws IndexOutOfBoundsException if the index given is outside
     * the bounds of the collection
     */
    public void addExcludeRange(final org.opennms.netmgt.config.snmpinterfacepoller.ExcludeRange vExcludeRange) throws IndexOutOfBoundsException {
        this.excludeRangeList.add(vExcludeRange);
    }

    /**
     * 
     * 
     * @param index
     * @param vExcludeRange
     * @throws IndexOutOfBoundsException if the index given is outside
     * the bounds of the collection
     */
    public void addExcludeRange(final int index, final org.opennms.netmgt.config.snmpinterfacepoller.ExcludeRange vExcludeRange) throws IndexOutOfBoundsException {
        this.excludeRangeList.add(index, vExcludeRange);
    }

    /**
     * 
     * 
     * @param vIncludeRange
     * @throws IndexOutOfBoundsException if the index given is outside
     * the bounds of the collection
     */
    public void addIncludeRange(final org.opennms.netmgt.config.snmpinterfacepoller.IncludeRange vIncludeRange) throws IndexOutOfBoundsException {
        this.includeRangeList.add(vIncludeRange);
    }

    /**
     * 
     * 
     * @param index
     * @param vIncludeRange
     * @throws IndexOutOfBoundsException if the index given is outside
     * the bounds of the collection
     */
    public void addIncludeRange(final int index, final org.opennms.netmgt.config.snmpinterfacepoller.IncludeRange vIncludeRange) throws IndexOutOfBoundsException {
        this.includeRangeList.add(index, vIncludeRange);
    }

    /**
     * 
     * 
     * @param vIncludeUrl
     * @throws IndexOutOfBoundsException if the index given is outside
     * the bounds of the collection
     */
    public void addIncludeUrl(final String vIncludeUrl) throws IndexOutOfBoundsException {
        this.includeUrlList.add(vIncludeUrl);
    }

    /**
     * 
     * 
     * @param index
     * @param vIncludeUrl
     * @throws IndexOutOfBoundsException if the index given is outside
     * the bounds of the collection
     */
    public void addIncludeUrl(final int index, final String vIncludeUrl) throws IndexOutOfBoundsException {
        this.includeUrlList.add(index, vIncludeUrl);
    }

    /**
     * 
     * 
     * @param vInterface
     * @throws IndexOutOfBoundsException if the index given is outside
     * the bounds of the collection
     */
    public void addInterface(final org.opennms.netmgt.config.snmpinterfacepoller.Interface vInterface) throws IndexOutOfBoundsException {
        this._interfaceList.add(vInterface);
    }

    /**
     * 
     * 
     * @param index
     * @param vInterface
     * @throws IndexOutOfBoundsException if the index given is outside
     * the bounds of the collection
     */
    public void addInterface(final int index, final org.opennms.netmgt.config.snmpinterfacepoller.Interface vInterface) throws IndexOutOfBoundsException {
        this._interfaceList.add(index, vInterface);
    }

    /**
     * 
     * 
     * @param vSpecific
     * @throws IndexOutOfBoundsException if the index given is outside
     * the bounds of the collection
     */
    public void addSpecific(final String vSpecific) throws IndexOutOfBoundsException {
        this.specificList.add(vSpecific);
    }

    /**
     * 
     * 
     * @param index
     * @param vSpecific
     * @throws IndexOutOfBoundsException if the index given is outside
     * the bounds of the collection
     */
    public void addSpecific(final int index, final String vSpecific) throws IndexOutOfBoundsException {
        this.specificList.add(index, vSpecific);
    }

    /**
     * Method enumerateExcludeRange.
     * 
     * @return an Enumeration over all possible elements of this collection
     */
    public java.util.Enumeration<org.opennms.netmgt.config.snmpinterfacepoller.ExcludeRange> enumerateExcludeRange() {
        return java.util.Collections.enumeration(this.excludeRangeList);
    }

    /**
     * Method enumerateIncludeRange.
     * 
     * @return an Enumeration over all possible elements of this collection
     */
    public java.util.Enumeration<org.opennms.netmgt.config.snmpinterfacepoller.IncludeRange> enumerateIncludeRange() {
        return java.util.Collections.enumeration(this.includeRangeList);
    }

    /**
     * Method enumerateIncludeUrl.
     * 
     * @return an Enumeration over all possible elements of this collection
     */
    public java.util.Enumeration<String> enumerateIncludeUrl() {
        return java.util.Collections.enumeration(this.includeUrlList);
    }

    /**
     * Method enumerateInterface.
     * 
     * @return an Enumeration over all possible elements of this collection
     */
    public java.util.Enumeration<org.opennms.netmgt.config.snmpinterfacepoller.Interface> enumerateInterface() {
        return java.util.Collections.enumeration(this._interfaceList);
    }

    /**
     * Method enumerateSpecific.
     * 
     * @return an Enumeration over all possible elements of this collection
     */
    public java.util.Enumeration<String> enumerateSpecific() {
        return java.util.Collections.enumeration(this.specificList);
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
        
        if (obj instanceof Package) {
            Package temp = (Package)obj;
            boolean equals = Objects.equals(temp.name, name)
                && Objects.equals(temp.filter, filter)
                && Objects.equals(temp.specificList, specificList)
                && Objects.equals(temp.includeRangeList, includeRangeList)
                && Objects.equals(temp.excludeRangeList, excludeRangeList)
                && Objects.equals(temp.includeUrlList, includeUrlList)
                && Objects.equals(temp._interfaceList, _interfaceList);
            return equals;
        }
        return false;
    }

    /**
     * Method getExcludeRange.
     * 
     * @param index
     * @throws IndexOutOfBoundsException if the index given is outside
     * the bounds of the collection
     * @return the value of the
     * org.opennms.netmgt.config.snmpinterfacepoller.ExcludeRange at the given inde
     */
    public org.opennms.netmgt.config.snmpinterfacepoller.ExcludeRange getExcludeRange(final int index) throws IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this.excludeRangeList.size()) {
            throw new IndexOutOfBoundsException("getExcludeRange: Index value '" + index + "' not in range [0.." + (this.excludeRangeList.size() - 1) + "]");
        }
        
        return (org.opennms.netmgt.config.snmpinterfacepoller.ExcludeRange) excludeRangeList.get(index);
    }

    /**
     * Method getExcludeRange.Returns the contents of the collection in an Array. 
     * <p>Note:  Just in case the collection contents are changing in another
     * thread, we pass a 0-length Array of the correct type into the API call. 
     * This way we <i>know</i> that the Array returned is of exactly the correct
     * length.
     * 
     * @return this collection as an Array
     */
    public org.opennms.netmgt.config.snmpinterfacepoller.ExcludeRange[] getExcludeRange() {
        org.opennms.netmgt.config.snmpinterfacepoller.ExcludeRange[] array = new org.opennms.netmgt.config.snmpinterfacepoller.ExcludeRange[0];
        return (org.opennms.netmgt.config.snmpinterfacepoller.ExcludeRange[]) this.excludeRangeList.toArray(array);
    }

    /**
     * Method getExcludeRangeCollection.Returns a reference to 'excludeRangeList'.
     * No type checking is performed on any modifications to the Vector.
     * 
     * @return a reference to the Vector backing this class
     */
    public java.util.List<org.opennms.netmgt.config.snmpinterfacepoller.ExcludeRange> getExcludeRangeCollection() {
        return this.excludeRangeList;
    }

    /**
     * Method getExcludeRangeCount.
     * 
     * @return the size of this collection
     */
    public int getExcludeRangeCount() {
        return this.excludeRangeList.size();
    }

    /**
     * Returns the value of field 'filter'. The field 'filter' has the following
     * description: A rule which addresses belonging to this package
     *  must pass. This package is applied only to addresses that pass
     *  this filter.
     * 
     * @return the value of field 'Filter'.
     */
    public org.opennms.netmgt.config.snmpinterfacepoller.Filter getFilter() {
        return this.filter;
    }

    /**
     * Method getIncludeRange.
     * 
     * @param index
     * @throws IndexOutOfBoundsException if the index given is outside
     * the bounds of the collection
     * @return the value of the
     * org.opennms.netmgt.config.snmpinterfacepoller.IncludeRange at the given inde
     */
    public org.opennms.netmgt.config.snmpinterfacepoller.IncludeRange getIncludeRange(final int index) throws IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this.includeRangeList.size()) {
            throw new IndexOutOfBoundsException("getIncludeRange: Index value '" + index + "' not in range [0.." + (this.includeRangeList.size() - 1) + "]");
        }
        
        return (org.opennms.netmgt.config.snmpinterfacepoller.IncludeRange) includeRangeList.get(index);
    }

    /**
     * Method getIncludeRange.Returns the contents of the collection in an Array. 
     * <p>Note:  Just in case the collection contents are changing in another
     * thread, we pass a 0-length Array of the correct type into the API call. 
     * This way we <i>know</i> that the Array returned is of exactly the correct
     * length.
     * 
     * @return this collection as an Array
     */
    public org.opennms.netmgt.config.snmpinterfacepoller.IncludeRange[] getIncludeRange() {
        org.opennms.netmgt.config.snmpinterfacepoller.IncludeRange[] array = new org.opennms.netmgt.config.snmpinterfacepoller.IncludeRange[0];
        return (org.opennms.netmgt.config.snmpinterfacepoller.IncludeRange[]) this.includeRangeList.toArray(array);
    }

    /**
     * Method getIncludeRangeCollection.Returns a reference to 'includeRangeList'.
     * No type checking is performed on any modifications to the Vector.
     * 
     * @return a reference to the Vector backing this class
     */
    public java.util.List<org.opennms.netmgt.config.snmpinterfacepoller.IncludeRange> getIncludeRangeCollection() {
        return this.includeRangeList;
    }

    /**
     * Method getIncludeRangeCount.
     * 
     * @return the size of this collection
     */
    public int getIncludeRangeCount() {
        return this.includeRangeList.size();
    }

    /**
     * Method getIncludeUrl.
     * 
     * @param index
     * @throws IndexOutOfBoundsException if the index given is outside
     * the bounds of the collection
     * @return the value of the String at the given index
     */
    public String getIncludeUrl(final int index) throws IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this.includeUrlList.size()) {
            throw new IndexOutOfBoundsException("getIncludeUrl: Index value '" + index + "' not in range [0.." + (this.includeUrlList.size() - 1) + "]");
        }
        
        return (String) includeUrlList.get(index);
    }

    /**
     * Method getIncludeUrl.Returns the contents of the collection in an Array. 
     * <p>Note:  Just in case the collection contents are changing in another
     * thread, we pass a 0-length Array of the correct type into the API call. 
     * This way we <i>know</i> that the Array returned is of exactly the correct
     * length.
     * 
     * @return this collection as an Array
     */
    public String[] getIncludeUrl() {
        String[] array = new String[0];
        return (String[]) this.includeUrlList.toArray(array);
    }

    /**
     * Method getIncludeUrlCollection.Returns a reference to 'includeUrlList'. No
     * type checking is performed on any modifications to the Vector.
     * 
     * @return a reference to the Vector backing this class
     */
    public java.util.List<String> getIncludeUrlCollection() {
        return this.includeUrlList;
    }

    /**
     * Method getIncludeUrlCount.
     * 
     * @return the size of this collection
     */
    public int getIncludeUrlCount() {
        return this.includeUrlList.size();
    }

    /**
     * Method getInterface.
     * 
     * @param index
     * @throws IndexOutOfBoundsException if the index given is outside
     * the bounds of the collection
     * @return the value of the
     * org.opennms.netmgt.config.snmpinterfacepoller.Interface at the given index
     */
    public org.opennms.netmgt.config.snmpinterfacepoller.Interface getInterface(final int index) throws IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._interfaceList.size()) {
            throw new IndexOutOfBoundsException("getInterface: Index value '" + index + "' not in range [0.." + (this._interfaceList.size() - 1) + "]");
        }
        
        return (org.opennms.netmgt.config.snmpinterfacepoller.Interface) _interfaceList.get(index);
    }

    /**
     * Method getInterface.Returns the contents of the collection in an Array. 
     * <p>Note:  Just in case the collection contents are changing in another
     * thread, we pass a 0-length Array of the correct type into the API call. 
     * This way we <i>know</i> that the Array returned is of exactly the correct
     * length.
     * 
     * @return this collection as an Array
     */
    public org.opennms.netmgt.config.snmpinterfacepoller.Interface[] getInterface() {
        org.opennms.netmgt.config.snmpinterfacepoller.Interface[] array = new org.opennms.netmgt.config.snmpinterfacepoller.Interface[0];
        return (org.opennms.netmgt.config.snmpinterfacepoller.Interface[]) this._interfaceList.toArray(array);
    }

    /**
     * Method getInterfaceCollection.Returns a reference to '_interfaceList'. No
     * type checking is performed on any modifications to the Vector.
     * 
     * @return a reference to the Vector backing this class
     */
    public java.util.List<org.opennms.netmgt.config.snmpinterfacepoller.Interface> getInterfaceCollection() {
        return this._interfaceList;
    }

    /**
     * Method getInterfaceCount.
     * 
     * @return the size of this collection
     */
    public int getInterfaceCount() {
        return this._interfaceList.size();
    }

    /**
     * Returns the value of field 'name'. The field 'name' has the following
     * description: Name or identifier for this package.
     * 
     * @return the value of field 'Name'.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Method getSpecific.
     * 
     * @param index
     * @throws IndexOutOfBoundsException if the index given is outside
     * the bounds of the collection
     * @return the value of the String at the given index
     */
    public String getSpecific(final int index) throws IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this.specificList.size()) {
            throw new IndexOutOfBoundsException("getSpecific: Index value '" + index + "' not in range [0.." + (this.specificList.size() - 1) + "]");
        }
        
        return (String) specificList.get(index);
    }

    /**
     * Method getSpecific.Returns the contents of the collection in an Array. 
     * <p>Note:  Just in case the collection contents are changing in another
     * thread, we pass a 0-length Array of the correct type into the API call. 
     * This way we <i>know</i> that the Array returned is of exactly the correct
     * length.
     * 
     * @return this collection as an Array
     */
    public String[] getSpecific() {
        String[] array = new String[0];
        return (String[]) this.specificList.toArray(array);
    }

    /**
     * Method getSpecificCollection.Returns a reference to 'specificList'. No type
     * checking is performed on any modifications to the Vector.
     * 
     * @return a reference to the Vector backing this class
     */
    public java.util.List<String> getSpecificCollection() {
        return this.specificList;
    }

    /**
     * Method getSpecificCount.
     * 
     * @return the size of this collection
     */
    public int getSpecificCount() {
        return this.specificList.size();
    }

    /**
     * Method hashCode.
     * 
     * @return a hash code value for the object.
     */
    @Override
    public int hashCode() {
        int hash = Objects.hash(
            name, 
            filter, 
            specificList, 
            includeRangeList, 
            excludeRangeList, 
            includeUrlList, 
            _interfaceList);
        return hash;
    }

    /**
     * Method iterateExcludeRange.
     * 
     * @return an Iterator over all possible elements in this collection
     */
    public java.util.Iterator<org.opennms.netmgt.config.snmpinterfacepoller.ExcludeRange> iterateExcludeRange() {
        return this.excludeRangeList.iterator();
    }

    /**
     * Method iterateIncludeRange.
     * 
     * @return an Iterator over all possible elements in this collection
     */
    public java.util.Iterator<org.opennms.netmgt.config.snmpinterfacepoller.IncludeRange> iterateIncludeRange() {
        return this.includeRangeList.iterator();
    }

    /**
     * Method iterateIncludeUrl.
     * 
     * @return an Iterator over all possible elements in this collection
     */
    public java.util.Iterator<String> iterateIncludeUrl() {
        return this.includeUrlList.iterator();
    }

    /**
     * Method iterateInterface.
     * 
     * @return an Iterator over all possible elements in this collection
     */
    public java.util.Iterator<org.opennms.netmgt.config.snmpinterfacepoller.Interface> iterateInterface() {
        return this._interfaceList.iterator();
    }

    /**
     * Method iterateSpecific.
     * 
     * @return an Iterator over all possible elements in this collection
     */
    public java.util.Iterator<String> iterateSpecific() {
        return this.specificList.iterator();
    }

    /**
     */
    public void removeAllExcludeRange() {
        this.excludeRangeList.clear();
    }

    /**
     */
    public void removeAllIncludeRange() {
        this.includeRangeList.clear();
    }

    /**
     */
    public void removeAllIncludeUrl() {
        this.includeUrlList.clear();
    }

    /**
     */
    public void removeAllInterface() {
        this._interfaceList.clear();
    }

    /**
     */
    public void removeAllSpecific() {
        this.specificList.clear();
    }

    /**
     * Method removeExcludeRange.
     * 
     * @param vExcludeRange
     * @return true if the object was removed from the collection.
     */
    public boolean removeExcludeRange(final org.opennms.netmgt.config.snmpinterfacepoller.ExcludeRange vExcludeRange) {
        boolean removed = excludeRangeList.remove(vExcludeRange);
        return removed;
    }

    /**
     * Method removeExcludeRangeAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public org.opennms.netmgt.config.snmpinterfacepoller.ExcludeRange removeExcludeRangeAt(final int index) {
        Object obj = this.excludeRangeList.remove(index);
        return (org.opennms.netmgt.config.snmpinterfacepoller.ExcludeRange) obj;
    }

    /**
     * Method removeIncludeRange.
     * 
     * @param vIncludeRange
     * @return true if the object was removed from the collection.
     */
    public boolean removeIncludeRange(final org.opennms.netmgt.config.snmpinterfacepoller.IncludeRange vIncludeRange) {
        boolean removed = includeRangeList.remove(vIncludeRange);
        return removed;
    }

    /**
     * Method removeIncludeRangeAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public org.opennms.netmgt.config.snmpinterfacepoller.IncludeRange removeIncludeRangeAt(final int index) {
        Object obj = this.includeRangeList.remove(index);
        return (org.opennms.netmgt.config.snmpinterfacepoller.IncludeRange) obj;
    }

    /**
     * Method removeIncludeUrl.
     * 
     * @param vIncludeUrl
     * @return true if the object was removed from the collection.
     */
    public boolean removeIncludeUrl(final String vIncludeUrl) {
        boolean removed = includeUrlList.remove(vIncludeUrl);
        return removed;
    }

    /**
     * Method removeIncludeUrlAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public String removeIncludeUrlAt(final int index) {
        Object obj = this.includeUrlList.remove(index);
        return (String) obj;
    }

    /**
     * Method removeInterface.
     * 
     * @param vInterface
     * @return true if the object was removed from the collection.
     */
    public boolean removeInterface(final org.opennms.netmgt.config.snmpinterfacepoller.Interface vInterface) {
        boolean removed = _interfaceList.remove(vInterface);
        return removed;
    }

    /**
     * Method removeInterfaceAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public org.opennms.netmgt.config.snmpinterfacepoller.Interface removeInterfaceAt(final int index) {
        Object obj = this._interfaceList.remove(index);
        return (org.opennms.netmgt.config.snmpinterfacepoller.Interface) obj;
    }

    /**
     * Method removeSpecific.
     * 
     * @param vSpecific
     * @return true if the object was removed from the collection.
     */
    public boolean removeSpecific(final String vSpecific) {
        boolean removed = specificList.remove(vSpecific);
        return removed;
    }

    /**
     * Method removeSpecificAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public String removeSpecificAt(final int index) {
        Object obj = this.specificList.remove(index);
        return (String) obj;
    }

    /**
     * 
     * 
     * @param index
     * @param vExcludeRange
     * @throws IndexOutOfBoundsException if the index given is outside
     * the bounds of the collection
     */
    public void setExcludeRange(final int index, final org.opennms.netmgt.config.snmpinterfacepoller.ExcludeRange vExcludeRange) throws IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this.excludeRangeList.size()) {
            throw new IndexOutOfBoundsException("setExcludeRange: Index value '" + index + "' not in range [0.." + (this.excludeRangeList.size() - 1) + "]");
        }
        
        this.excludeRangeList.set(index, vExcludeRange);
    }

    /**
     * 
     * 
     * @param vExcludeRangeArray
     */
    public void setExcludeRange(final org.opennms.netmgt.config.snmpinterfacepoller.ExcludeRange[] vExcludeRangeArray) {
        //-- copy array
        excludeRangeList.clear();
        
        for (int i = 0; i < vExcludeRangeArray.length; i++) {
                this.excludeRangeList.add(vExcludeRangeArray[i]);
        }
    }

    /**
     * Sets the value of 'excludeRangeList' by copying the given Vector. All
     * elements will be checked for type safety.
     * 
     * @param vExcludeRangeList the Vector to copy.
     */
    public void setExcludeRange(final java.util.List<org.opennms.netmgt.config.snmpinterfacepoller.ExcludeRange> vExcludeRangeList) {
        // copy vector
        this.excludeRangeList.clear();
        
        this.excludeRangeList.addAll(vExcludeRangeList);
    }

    /**
     * Sets the value of 'excludeRangeList' by setting it to the given Vector. No
     * type checking is performed.
     * @deprecated
     * 
     * @param excludeRangeList the Vector to set.
     */
    public void setExcludeRangeCollection(final java.util.List<org.opennms.netmgt.config.snmpinterfacepoller.ExcludeRange> excludeRangeList) {
        this.excludeRangeList = excludeRangeList;
    }

    /**
     * Sets the value of field 'filter'. The field 'filter' has the following
     * description: A rule which addresses belonging to this package
     *  must pass. This package is applied only to addresses that pass
     *  this filter.
     * 
     * @param filter the value of field 'filter'.
     */
    public void setFilter(final org.opennms.netmgt.config.snmpinterfacepoller.Filter filter) {
        this.filter = filter;
    }

    /**
     * 
     * 
     * @param index
     * @param vIncludeRange
     * @throws IndexOutOfBoundsException if the index given is outside
     * the bounds of the collection
     */
    public void setIncludeRange(final int index, final org.opennms.netmgt.config.snmpinterfacepoller.IncludeRange vIncludeRange) throws IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this.includeRangeList.size()) {
            throw new IndexOutOfBoundsException("setIncludeRange: Index value '" + index + "' not in range [0.." + (this.includeRangeList.size() - 1) + "]");
        }
        
        this.includeRangeList.set(index, vIncludeRange);
    }

    /**
     * 
     * 
     * @param vIncludeRangeArray
     */
    public void setIncludeRange(final org.opennms.netmgt.config.snmpinterfacepoller.IncludeRange[] vIncludeRangeArray) {
        //-- copy array
        includeRangeList.clear();
        
        for (int i = 0; i < vIncludeRangeArray.length; i++) {
                this.includeRangeList.add(vIncludeRangeArray[i]);
        }
    }

    /**
     * Sets the value of 'includeRangeList' by copying the given Vector. All
     * elements will be checked for type safety.
     * 
     * @param vIncludeRangeList the Vector to copy.
     */
    public void setIncludeRange(final java.util.List<org.opennms.netmgt.config.snmpinterfacepoller.IncludeRange> vIncludeRangeList) {
        // copy vector
        this.includeRangeList.clear();
        
        this.includeRangeList.addAll(vIncludeRangeList);
    }

    /**
     * Sets the value of 'includeRangeList' by setting it to the given Vector. No
     * type checking is performed.
     * @deprecated
     * 
     * @param includeRangeList the Vector to set.
     */
    public void setIncludeRangeCollection(final java.util.List<org.opennms.netmgt.config.snmpinterfacepoller.IncludeRange> includeRangeList) {
        this.includeRangeList = includeRangeList;
    }

    /**
     * 
     * 
     * @param index
     * @param vIncludeUrl
     * @throws IndexOutOfBoundsException if the index given is outside
     * the bounds of the collection
     */
    public void setIncludeUrl(final int index, final String vIncludeUrl) throws IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this.includeUrlList.size()) {
            throw new IndexOutOfBoundsException("setIncludeUrl: Index value '" + index + "' not in range [0.." + (this.includeUrlList.size() - 1) + "]");
        }
        
        this.includeUrlList.set(index, vIncludeUrl);
    }

    /**
     * 
     * 
     * @param vIncludeUrlArray
     */
    public void setIncludeUrl(final String[] vIncludeUrlArray) {
        //-- copy array
        includeUrlList.clear();
        
        for (int i = 0; i < vIncludeUrlArray.length; i++) {
                this.includeUrlList.add(vIncludeUrlArray[i]);
        }
    }

    /**
     * Sets the value of 'includeUrlList' by copying the given Vector. All
     * elements will be checked for type safety.
     * 
     * @param vIncludeUrlList the Vector to copy.
     */
    public void setIncludeUrl(final java.util.List<String> vIncludeUrlList) {
        // copy vector
        this.includeUrlList.clear();
        
        this.includeUrlList.addAll(vIncludeUrlList);
    }

    /**
     * Sets the value of 'includeUrlList' by setting it to the given Vector. No
     * type checking is performed.
     * @deprecated
     * 
     * @param includeUrlList the Vector to set.
     */
    public void setIncludeUrlCollection(final java.util.List<String> includeUrlList) {
        this.includeUrlList = includeUrlList;
    }

    /**
     * 
     * 
     * @param index
     * @param vInterface
     * @throws IndexOutOfBoundsException if the index given is outside
     * the bounds of the collection
     */
    public void setInterface(final int index, final org.opennms.netmgt.config.snmpinterfacepoller.Interface vInterface) throws IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._interfaceList.size()) {
            throw new IndexOutOfBoundsException("setInterface: Index value '" + index + "' not in range [0.." + (this._interfaceList.size() - 1) + "]");
        }
        
        this._interfaceList.set(index, vInterface);
    }

    /**
     * 
     * 
     * @param vInterfaceArray
     */
    public void setInterface(final org.opennms.netmgt.config.snmpinterfacepoller.Interface[] vInterfaceArray) {
        //-- copy array
        _interfaceList.clear();
        
        for (int i = 0; i < vInterfaceArray.length; i++) {
                this._interfaceList.add(vInterfaceArray[i]);
        }
    }

    /**
     * Sets the value of '_interfaceList' by copying the given Vector. All
     * elements will be checked for type safety.
     * 
     * @param vInterfaceList the Vector to copy.
     */
    public void setInterface(final java.util.List<org.opennms.netmgt.config.snmpinterfacepoller.Interface> vInterfaceList) {
        // copy vector
        this._interfaceList.clear();
        
        this._interfaceList.addAll(vInterfaceList);
    }

    /**
     * Sets the value of '_interfaceList' by setting it to the given Vector. No
     * type checking is performed.
     * @deprecated
     * 
     * @param _interfaceList the Vector to set.
     */
    public void setInterfaceCollection(final java.util.List<org.opennms.netmgt.config.snmpinterfacepoller.Interface> _interfaceList) {
        this._interfaceList = _interfaceList;
    }

    /**
     * Sets the value of field 'name'. The field 'name' has the following
     * description: Name or identifier for this package.
     * 
     * @param name the value of field 'name'.
     */
    public void setName(final String name) {
        this.name = name;
    }

    /**
     * 
     * 
     * @param index
     * @param vSpecific
     * @throws IndexOutOfBoundsException if the index given is outside
     * the bounds of the collection
     */
    public void setSpecific(final int index, final String vSpecific) throws IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this.specificList.size()) {
            throw new IndexOutOfBoundsException("setSpecific: Index value '" + index + "' not in range [0.." + (this.specificList.size() - 1) + "]");
        }
        
        this.specificList.set(index, vSpecific);
    }

    /**
     * 
     * 
     * @param vSpecificArray
     */
    public void setSpecific(final String[] vSpecificArray) {
        //-- copy array
        specificList.clear();
        
        for (int i = 0; i < vSpecificArray.length; i++) {
                this.specificList.add(vSpecificArray[i]);
        }
    }

    /**
     * Sets the value of 'specificList' by copying the given Vector. All elements
     * will be checked for type safety.
     * 
     * @param vSpecificList the Vector to copy.
     */
    public void setSpecific(final java.util.List<String> vSpecificList) {
        // copy vector
        this.specificList.clear();
        
        this.specificList.addAll(vSpecificList);
    }

    /**
     * Sets the value of 'specificList' by setting it to the given Vector. No type
     * checking is performed.
     * @deprecated
     * 
     * @param specificList the Vector to set.
     */
    public void setSpecificCollection(final java.util.List<String> specificList) {
        this.specificList = specificList;
    }

}
