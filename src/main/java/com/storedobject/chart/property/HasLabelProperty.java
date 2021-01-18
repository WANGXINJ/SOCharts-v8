/*
 *  Copyright 2019-2020 Syam Pillai
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 *
 */

package com.storedobject.chart.property;

import com.storedobject.chart.component.ComponentPart;

/**
 * Interface to denote that a {@link ComponentPart} has {@link LabelProperty}.
 *
 * @author Syam
 */
public interface HasLabelProperty {

	/**
	 * Get the label property.
	 *
	 * @return Label property.
	 */
	LabelProperty getLabelProperty();

	/**
	 * Set the label property.
	 *
	 * @param labelProperty Label property to set. It could be <code>null</code>.
	 */
	void setLabelProperty(LabelProperty labelProperty);
}