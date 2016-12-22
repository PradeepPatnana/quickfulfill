/*
 * [y] hybris Platform
 *
 * Copyright (c) 2000-2016 SAP SE
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of SAP
 * Hybris ("Confidential Information"). You shall not disclose such
 * Confidential Information and shall use it only in accordance with the
 * terms of the license agreement you entered into with SAP Hybris.
 */
package com.hybris.techouts.quickfulfill.wsdto;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * @author Pradeep
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "EDDResponse")
@XmlType(propOrder =
{ "CartId", "ItemEDDInfo" })
public class EDDResponseWsDTO
{

	@XmlElement(name = "CartId")
	private String CartId;

	@XmlElement(name = "ItemEDDInfo")
	private List<EDDInfoWsDTO> ItemEDDInfo;

	/**
	 * @return the cartId
	 */
	public String getCartId()
	{
		return CartId;
	}

	/**
	 * @param cartId
	 *           the cartId to set
	 */
	public void setCartId(final String cartId)
	{
		CartId = cartId;
	}

	/**
	 * @return the itemEDDInfo
	 */
	public List<EDDInfoWsDTO> getItemEDDInfo()
	{
		return ItemEDDInfo;
	}

	/**
	 * @param itemEDDInfo
	 *           the itemEDDInfo to set
	 */
	public void setItemEDDInfo(final List<EDDInfoWsDTO> itemEDDInfo)
	{
		ItemEDDInfo = itemEDDInfo;
	}


}
