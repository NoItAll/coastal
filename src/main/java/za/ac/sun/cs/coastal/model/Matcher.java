/*
 * This file is part of the COASTAL tool, https://deepseaplatform.github.io/coastal/
 *
 * Copyright (c) 2019-2020, Computer Science, Stellenbosch University.
 * All rights reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *  http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package za.ac.sun.cs.coastal.model;

import za.ac.sun.cs.coastal.COASTAL;
import za.ac.sun.cs.coastal.Configuration;
import za.ac.sun.cs.coastal.diver.SymbolicState;
import za.ac.sun.cs.coastal.symbolic.exceptions.COASTALException;
import za.ac.sun.cs.coastal.symbolic.exceptions.UnsupportedOperationException;

/**
 * Model for java.util.regex.Matcher that simply notifies the user that this functionality is unimplemented.
 */
public class Matcher {

	public Matcher(COASTAL coastal, Configuration config) {
	}

	public boolean find____Z(SymbolicState state) throws COASTALException {
		throw new UnsupportedOperationException("Matcher.find() is unimplemented");
	}
	
}
