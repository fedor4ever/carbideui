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
package com.nokia.tools.theme.s60.morphing.valuemodels;

import java.util.HashMap;

import com.nokia.tools.theme.s60.morphing.KErrArgument;


public interface BaseValueModelInterface {
    
    final String SCALEABLEITEM = "SCALEABLEITEM";
    final String IID = "IID";
    final String INPUT = "INPUT";
    final String INPUTA = "INPUTA";
    final String INPUTB = "INPUTB";
    final String OUTPUT = "OUTPUT";
    final String REFER = "REF";
    final String END = "END";
    final String UID_STR = "UID";
    final String EFFECT = "EFFECT";
    final String ANIMATION = "ANIMATION";
    final String MININTERVAL = "MININTERVAL";
    final String PREPROCESS="PREPROCESS";
    final String COMMAND="COMMAND";
    final String VALUE="VALUE";
    final String TIMINGMODEL="TIMINGMODEL";
    final String TIMINGID="TIMINGID";
    final String COMMENT = "//";
    final String NL ="\r\n";
    final String EQUAL = "=";
    final String FSLASH = "/";
    final String RGB = "RGB";
    final String RGBA = "RGBA";
    final String A = "A";
    final String NONE = "none";
    final String SPACE =" ";
    final String TAB = "\t";
    final String INT = "INT";
    
    
    
    /**
     * This method allows to set the parameters for the value model based on
     * which the value will be calculated.
     * @param params    HashMap containing the parameters to be set
     */
    public void setParameters(HashMap<String, String> params) throws KErrArgument;
    
    
    /**
     * This method returns the calculated value for this value model 
     * - the value is calculated as a function of the timing model and the 
     * parameters set for this value model.  
     * 
     * @return the int value for this value model at this point of time.
     */
    public HashMap getValue(); 
    
    /**
     * this method return the parameters assocated with the value model
     * @param params
     * @return
     */
    public HashMap<String,String> getParameters();
    
    public void Tick( int par1, int par2);
    
    public void Begin();
    
    public StringBuffer getValueModelString(int prevLayerPosition, int currentPosition, java.util.Map effectValues);
    
    
}
