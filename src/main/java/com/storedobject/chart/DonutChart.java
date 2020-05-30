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

package com.storedobject.chart;

/**
 * Donut chart.
 *
 * @author Syam
 */
public class DonutChart extends PieChart {

    /**
     * Constructor.
     */
    public DonutChart() {
        holeRadius = -60;
    }

    /**
     * Constructor.
     *
     * @param itemNames Item names of the slices.
     * @param values Values of the slices.
     */
    public DonutChart(AbstractData<?> itemNames, Data values) {
        super(itemNames, values);
        holeRadius = -60;
    }

    /**
     * Set the radius of the hole.
     *
     * @param holeRadius Hole radius to set.
     */
    public void setHoleRadius(Size holeRadius) {
        this.holeRadius = holeRadius.get();
    }
}
