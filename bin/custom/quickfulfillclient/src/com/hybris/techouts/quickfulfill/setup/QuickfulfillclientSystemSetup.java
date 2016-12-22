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
package com.hybris.techouts.quickfulfill.setup;

import static com.hybris.techouts.quickfulfill.constants.QuickfulfillclientConstants.PLATFORM_LOGO_CODE;

import de.hybris.platform.core.initialization.SystemSetup;

import java.io.InputStream;

import com.hybris.techouts.quickfulfill.constants.QuickfulfillclientConstants;
import com.hybris.techouts.quickfulfill.service.QuickfulfillclientService;


@SystemSetup(extension = QuickfulfillclientConstants.EXTENSIONNAME)
public class QuickfulfillclientSystemSetup
{
	private final QuickfulfillclientService quickfulfillclientService;

	public QuickfulfillclientSystemSetup(final QuickfulfillclientService quickfulfillclientService)
	{
		this.quickfulfillclientService = quickfulfillclientService;
	}

	@SystemSetup(process = SystemSetup.Process.INIT, type = SystemSetup.Type.ESSENTIAL)
	public void createEssentialData()
	{
		quickfulfillclientService.createLogo(PLATFORM_LOGO_CODE);
	}

	private InputStream getImageStream()
	{
		return QuickfulfillclientSystemSetup.class.getResourceAsStream("/quickfulfillclient/sap-hybris-platform.png");
	}
}
