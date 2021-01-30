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

/**
 * Represents an area (mostly a rectangular block). Mainly used as a building
 * block for constructing grids-like things.
 *
 * @author Syam
 */
public class Area extends VisibleProperty {

	private AreaStyle style;

	/**
	 * Constructor.
	 */
	public Area() {
	}

	@Override
	protected void buildProperties() {
		super.buildProperties();

		property("areaStyle", style);
	}

	/**
	 * Get the style.
	 *
	 * @param create Whether to create if not exists or not.
	 * @return Style.
	 */
	public AreaStyle getStyle(boolean create) {
		return style;
	}

	/**
	 * Set the style.
	 *
	 * @param style Style to set.
	 */
	public void setStyle(AreaStyle style) {
		this.style = style;
	}
}
