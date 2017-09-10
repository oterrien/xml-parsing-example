//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.09.10 at 12:24:21 PM CEST 
//


package com.ote.test.structure;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.jvnet.jaxb2_commons.lang.JAXBToStringStrategy;
import org.jvnet.jaxb2_commons.lang.ToString2;
import org.jvnet.jaxb2_commons.lang.ToStringStrategy2;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;


/**
 * <p>Java class for FeatureTeam complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FeatureTeam"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="application" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="person" type="{}Person" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FeatureTeam", propOrder = {
    "id",
    "name",
    "application",
    "person"
})
@Generated(value = "com.sun.tools.xjc.Driver", date = "2017-09-10T12:24:21+02:00", comments = "JAXB RI v2.2.11")
public class FeatureTeam implements ToString2
{

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-09-10T12:24:21+02:00", comments = "JAXB RI v2.2.11")
    protected long id;
    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-09-10T12:24:21+02:00", comments = "JAXB RI v2.2.11")
    protected String name;
    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-09-10T12:24:21+02:00", comments = "JAXB RI v2.2.11")
    protected String application;
    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-09-10T12:24:21+02:00", comments = "JAXB RI v2.2.11")
    protected List<Person> person;

    /**
     * Gets the value of the id property.
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-09-10T12:24:21+02:00", comments = "JAXB RI v2.2.11")
    public long getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-09-10T12:24:21+02:00", comments = "JAXB RI v2.2.11")
    public void setId(long value) {
        this.id = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-09-10T12:24:21+02:00", comments = "JAXB RI v2.2.11")
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-09-10T12:24:21+02:00", comments = "JAXB RI v2.2.11")
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the application property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-09-10T12:24:21+02:00", comments = "JAXB RI v2.2.11")
    public String getApplication() {
        return application;
    }

    /**
     * Sets the value of the application property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-09-10T12:24:21+02:00", comments = "JAXB RI v2.2.11")
    public void setApplication(String value) {
        this.application = value;
    }

    /**
     * Gets the value of the person property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the person property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPerson().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Person }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-09-10T12:24:21+02:00", comments = "JAXB RI v2.2.11")
    public List<Person> getPerson() {
        if (person == null) {
            person = new ArrayList<Person>();
        }
        return this.person;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-09-10T12:24:21+02:00", comments = "JAXB RI v2.2.11")
    public String toString() {
        final ToStringStrategy2 strategy = JAXBToStringStrategy.INSTANCE;
        final StringBuilder buffer = new StringBuilder();
        append(null, buffer, strategy);
        return buffer.toString();
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-09-10T12:24:21+02:00", comments = "JAXB RI v2.2.11")
    public StringBuilder append(ObjectLocator locator, StringBuilder buffer, ToStringStrategy2 strategy) {
        strategy.appendStart(locator, this, buffer);
        appendFields(locator, buffer, strategy);
        strategy.appendEnd(locator, this, buffer);
        return buffer;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-09-10T12:24:21+02:00", comments = "JAXB RI v2.2.11")
    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy2 strategy) {
        {
            long theId;
            theId = this.getId();
            strategy.appendField(locator, this, "id", buffer, theId, true);
        }
        {
            String theName;
            theName = this.getName();
            strategy.appendField(locator, this, "name", buffer, theName, (this.name!= null));
        }
        {
            String theApplication;
            theApplication = this.getApplication();
            strategy.appendField(locator, this, "application", buffer, theApplication, (this.application!= null));
        }
        {
            List<Person> thePerson;
            thePerson = (((this.person!= null)&&(!this.person.isEmpty()))?this.getPerson():null);
            strategy.appendField(locator, this, "person", buffer, thePerson, ((this.person!= null)&&(!this.person.isEmpty())));
        }
        return buffer;
    }

}
