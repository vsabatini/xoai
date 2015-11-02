//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.2-147 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.01.13 at 08:24:23 PM WET 
//

package com.lyncode.xoai.serviceprovider.oaipmh.spec;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * Java class for IdentifyType complex type.
 * 
 *
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 



















 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IdentifyType", propOrder = { "repositoryName", "baseURL",
		"protocolVersion", "adminEmail", "earliestDatestamp", "deletedRecord",
		"granularity", "compression", "description" })
public class IdentifyType {

	@XmlElement(required = true)
	protected String repositoryName;
	@XmlElement(required = true)
	@XmlSchemaType(name = "anyURI")
	protected String baseURL;
	@XmlElement(required = true)
	protected String protocolVersion;
	@XmlElement(required = true)
	protected List<String> adminEmail;
	@XmlElement(required = true)
	protected Date earliestDatestamp;
	@XmlElement(required = true)
	protected DeletedRecordType deletedRecord;
	@XmlElement(required = true)
	protected GranularityType granularity;
	protected List<String> compression;
	protected List<DescriptionType> description;

	/**
	 * Gets the value of the repositoryName property.
	 * 
	 * @return possible object is ;
	 * 
	 */
	public String getRepositoryName() {
		return repositoryName;
	}

	/**
	 * Sets the value of the repositoryName property.
	 * 
	 * @param value
	 *            allowed object is ;
	 * 
	 */
	public void setRepositoryName(String value) {
		this.repositoryName = value;
	}

	/**
	 * Gets the value of the baseURL property.
	 * 
	 * @return possible object is ;
	 * 
	 */
	public String getBaseURL() {
		return baseURL;
	}

	/**
	 * Sets the value of the baseURL property.
	 * 
	 * @param value
	 *            allowed object is ;
	 * 
	 */
	public void setBaseURL(String value) {
		this.baseURL = value;
	}

	/**
	 * Gets the value of the protocolVersion property.
	 * 
	 * @return possible object is ;
	 * 
	 */
	public String getProtocolVersion() {
		return protocolVersion;
	}

	/**
	 * Sets the value of the protocolVersion property.
	 * 
	 * @param value
	 *            allowed object is ;
	 * 
	 */
	public void setProtocolVersion(String value) {
		this.protocolVersion = value;
	}

	/**
	 * Gets the value of the adminEmail property.
	 * 
	 *
	 * This accessor method returns a reference to the live list, not a
	 * snapshot. Therefore any modification you make to the returned list will
	 * be present inside the JAXB object. This is why there is not a
	  method for the adminEmail property.
	 * 
	 *
	 * For example, to add a new item, do as follows:
	 * 

	 * getAdminEmail().add(newItem);

	 * 
	 * 
	 *
	 * Objects of the following type(s) are allowed in the list ;
	 * 
	 * 
	 */
	public List<String> getAdminEmail() {
		if (adminEmail == null) {
			adminEmail = new ArrayList<String>();
		}
		return this.adminEmail;
	}

	/**
	 * Gets the value of the earliestDatestamp property.
	 * 
	 * @return possible object is ;
	 * 
	 */
	public Date getEarliestDatestamp() {
		return earliestDatestamp;
	}

	/**
	 * Sets the value of the earliestDatestamp property.
	 * 
	 * @param value
	 *            allowed object is ;
	 * 
	 */
	public void setEarliestDatestamp(Date value) {
		this.earliestDatestamp = value;
	}

	/**
	 * Gets the value of the deletedRecord property.
	 * 
	 * @return possible object is ;
	 * 
	 */
	public DeletedRecordType getDeletedRecord() {
		return deletedRecord;
	}

	/**
	 * Sets the value of the deletedRecord property.
	 * 
	 * @param value
	 *            allowed object is ;
	 * 
	 */
	public void setDeletedRecord(DeletedRecordType value) {
		this.deletedRecord = value;
	}

	/**
	 * Gets the value of the granularity property.
	 * 
	 * @return possible object is ;
	 * 
	 */
	public GranularityType getGranularity() {
		return granularity;
	}

	/**
	 * Sets the value of the granularity property.
	 * 
	 * @param value
	 *            allowed object is ;
	 * 
	 */
	public void setGranularity(GranularityType value) {
		this.granularity = value;
	}

	/**
	 * Gets the value of the compression property.
	 * 
	 *
	 * This accessor method returns a reference to the live list, not a
	 * snapshot. Therefore any modification you make to the returned list will
	 * be present inside the JAXB object. This is why there is not a
	  method for the compression property.
	 * 
	 *
	 * For example, to add a new item, do as follows:
	 * 

	 * getCompression().add(newItem);

	 * 
	 * 
	 *
	 * Objects of the following type(s) are allowed in the list ;
	 * 
	 * 
	 */
	public List<String> getCompression() {
		if (compression == null) {
			compression = new ArrayList<String>();
		}
		return this.compression;
	}

	/**
	 * Gets the value of the description property.
	 * 
	 *
	 * This accessor method returns a reference to the live list, not a
	 * snapshot. Therefore any modification you make to the returned list will
	 * be present inside the JAXB object. This is why there is not a
	  method for the description property.
	 * 
	 *
	 * For example, to add a new item, do as follows:
	 * 

	 * getDescription().add(newItem);

	 * 
	 * 
	 *
	 * Objects of the following type(s) are allowed in the list
	 * ;
	 * 
	 * 
	 */
	public List<DescriptionType> getDescription() {
		if (description == null) {
			description = new ArrayList<DescriptionType>();
		}
		return this.description;
	}

}