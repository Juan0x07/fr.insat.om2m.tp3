/*******************************************************************************
 * Copyright (c) 2013-2016 LAAS-CNRS (www.laas.fr)
 * 7 Colonel Roche 31077 Toulouse - France
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Initial Contributors:
 *     Thierry Monteil : Project manager, technical co-manager
 *     Mahdi Ben Alaya : Technical co-manager
 *     Samir Medjiah : Technical co-manager
 *     Khalil Drira : Strategy expert
 *     Guillaume Garzone : Developer
 *     François Aïssaoui : Developer
 *
 * New contributors :
 *******************************************************************************/
//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.04.15 at 03:56:27 PM CEST 
//

package org.eclipse.om2m.commons.resource;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for anonymous complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.onem2m.org/xml/protocols}announcedMgmtResource">
 *       &lt;sequence>
 *         &lt;element name="version" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="URL" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/>
 *         &lt;element name="update" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="updateStatus" type="{http://www.onem2m.org/xml/protocols}actionStatus" minOccurs="0"/>
 *         &lt;choice minOccurs="0">
 *           &lt;element name="childResource" type="{http://www.onem2m.org/xml/protocols}childResourceRef" maxOccurs="unbounded"/>
 *           &lt;element ref="{http://www.onem2m.org/xml/protocols}subscription" maxOccurs="unbounded"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "rest" })
@XmlRootElement(name = "firmwareAnnc")
public class FirmwareAnnc extends AnnouncedMgmtResource {

	@XmlElementRefs({
			@XmlElementRef(name = "childResource", type = JAXBElement.class, required = false),
			@XmlElementRef(name = "version", type = JAXBElement.class, required = false),
			@XmlElementRef(name = "subscription", namespace = "http://www.onem2m.org/xml/protocols", type = Subscription.class, required = false),
			@XmlElementRef(name = "name", type = JAXBElement.class, required = false),
			@XmlElementRef(name = "URL", type = JAXBElement.class, required = false),
			@XmlElementRef(name = "updateStatus", type = JAXBElement.class, required = false),
			@XmlElementRef(name = "update", type = JAXBElement.class, required = false) })
	protected List<Object> rest;

	/**
	 * Gets the rest of the content model.
	 * 
	 * <p>
	 * You are getting this "catch-all" property because of the following
	 * reason: The field name "Name" is used by two different parts of a schema.
	 * See: line 65 of
	 * file:/home/francois/Downloads/XSDbundle-v1_0_0/CDT-firmware-v1_0_0.xsd
	 * line 472 of
	 * file:/home/francois/Downloads/XSDbundle-v1_0_0/CDT-commonTypes-v1_0_0.xsd
	 * <p>
	 * To get rid of this property, apply a property customization to one of
	 * both of the following declarations to change their names: Gets the value
	 * of the rest property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a
	 * snapshot. Therefore any modification you make to the returned list will
	 * be present inside the JAXB object. This is why there is not a
	 * <CODE>set</CODE> method for the rest property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getRest().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list
	 * {@link JAXBElement }{@code <}{@link ChildResourceRef }{@code >}
	 * {@link JAXBElement }{@code <}{@link String }{@code >} {@link Subscription }
	 * {@link JAXBElement }{@code <}{@link String }{@code >} {@link JAXBElement }
	 * {@code <}{@link String }{@code >} {@link JAXBElement }{@code <}
	 * {@link ActionStatus }{@code >} {@link JAXBElement }{@code <}{@link Boolean }
	 * {@code >}
	 * 
	 * 
	 */
	public List<Object> getRest() {
		if (rest == null) {
			rest = new ArrayList<Object>();
		}
		return this.rest;
	}

}
