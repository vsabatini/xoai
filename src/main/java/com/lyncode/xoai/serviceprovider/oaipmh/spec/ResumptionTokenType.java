//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.2-147 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.01.13 at 08:24:23 PM WET 
//

package com.lyncode.xoai.serviceprovider.oaipmh.spec;

import java.util.Date;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;

/**
 * A resumptionToken may have 3 optional attributes and can be used in ListSets,
 * ListIdentifiers, ListRecords responses.
 * 
 * <p>
 * Java class for resumptionTokenType complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="resumptionTokenType">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *       &lt;attribute name="expirationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="completeListSize" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *       &lt;attribute name="cursor" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "resumptionTokenType", propOrder = { "value" })
public class ResumptionTokenType {

	@XmlValue
	protected String value;
	@XmlAttribute(name = "expirationDate")
	@XmlSchemaType(name = "dateTime")
	protected Date expirationDate;
	@XmlAttribute(name = "completeListSize")
	@XmlSchemaType(name = "positiveInteger")
	protected long completeListSize;
	@XmlAttribute(name = "cursor")
	@XmlSchemaType(name = "nonNegativeInteger")
	protected long cursor;

	/**
	 * Gets the value of the value property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getValue() {
		return value;
	}

	/**
	 * Sets the value of the value property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setValue(String value) {
		this.value = value;
	}

	/**
	 * Gets the value of the expirationDate property.
	 * 
	 * @return possible object is {@link XMLGregorianCalendar }
	 * 
	 */
	public Date getExpirationDate() {
		return expirationDate;
	}

	/**
	 * Sets the value of the expirationDate property.
	 * 
	 * @param value
	 *            allowed object is {@link XMLGregorianCalendar }
	 * 
	 */
	public void setExpirationDate(Date value) {
		this.expirationDate = value;
	}

	/**
	 * Gets the value of the completeListSize property.
	 * 
	 * @return possible object is {@link BigInteger }
	 * 
	 */
	public long getCompleteListSize() {
		return completeListSize;
	}

	/**
	 * Sets the value of the completeListSize property.
	 * 
	 * @param value
	 *            allowed object is {@link BigInteger }
	 * 
	 */
	public void setCompleteListSize(long value) {
		this.completeListSize = value;
	}

	/**
	 * Gets the value of the cursor property.
	 * 
	 * @return possible object is {@link BigInteger }
	 * 
	 */
	public long getCursor() {
		return cursor;
	}

	/**
	 * Sets the value of the cursor property.
	 * 
	 * @param value
	 *            allowed object is {@link BigInteger }
	 * 
	 */
	public void setCursor(long value) {
		this.cursor = value;
	}

}
