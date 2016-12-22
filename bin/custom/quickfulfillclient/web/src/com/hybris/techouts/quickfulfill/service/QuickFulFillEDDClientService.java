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
package com.hybris.techouts.quickfulfill.service;

import com.hybris.techouts.quickfulfill.wsdto.EDDRequestWsDTO;
import com.hybris.techouts.quickfulfill.wsdto.EDDResponseWsDTO;


/**
 * @author Pradeep
 */
public interface QuickFulFillEDDClientService
{
	//To load EDD details for the cart Items
	public EDDResponseWsDTO getEDDDetials(final EDDRequestWsDTO eddRequest);
}
