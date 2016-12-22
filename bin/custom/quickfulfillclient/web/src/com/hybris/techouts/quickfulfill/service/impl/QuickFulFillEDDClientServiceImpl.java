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
package com.hybris.techouts.quickfulfill.service.impl;

import org.apache.log4j.Logger;

import com.hybris.techouts.quickfulfill.service.QuickFulFillEDDClientService;
import com.hybris.techouts.quickfulfill.wsdto.EDDRequestWsDTO;
import com.hybris.techouts.quickfulfill.wsdto.EDDResponseWsDTO;


/**
 * @author Pradeep
 *
 */
public class QuickFulFillEDDClientServiceImpl implements QuickFulFillEDDClientService
{

	//@Autowired
	//private ConfigurationService configurationService;

	private static final Logger LOG = Logger.getLogger(QuickFulFillEDDClientServiceImpl.class);

	/*
	 * Call Service to get the EDD slots from Logistic service.
	 *
	 * @param
	 *
	 * @return
	 */
	@Override
	public EDDResponseWsDTO getEDDDetials(final EDDRequestWsDTO eddRequest)
	{

		return null;

	}//

}//
