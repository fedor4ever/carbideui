/*
* Copyright (c) 2006-2010 Nokia Corporation and/or its subsidiary(-ies). 
* All rights reserved.
* This component and the accompanying materials are made available
* under the terms of "Eclipse Public License v1.0"
* which accompanies this distribution, and is available
* at the URL "http://www.eclipse.org/legal/epl-v10.html".
*
* Initial Contributors:
* Nokia Corporation - initial contribution.
*
* Contributors:
*
* Description:
*
*/
package com.nokia.tools.media.utils.layers;

import org.eclipse.swt.widgets.Composite;

public interface ILayerEffectDialogContributor {

	/**
	 * Setter of the property <tt>layerEffect</tt>
	 * 
	 * @param layerEffect
	 *            The getILayerEffect to set.
	 */
	public void setLayerEffect(ILayerEffect layerEffect);

	/**
	 * Return's dialog controls for current effect
	 */
	public Composite createDialogControls(Composite parent);

	/**
	 * @return Returns the layerEffect.
	 */
	public ILayerEffect getLayerEffect();

}
