/*
 * #%L
 * servo-cloudwatch
 * %%
 * Copyright (C) 2011 - 2012 Netflix
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */
package com.netflix.servo.aws;

import com.netflix.servo.annotations.DataSourceType;
import org.testng.annotations.Test;
import static org.testng.Assert.*;
/**
 * User: gorzell
 * Date: 1/9/12
 * Time: 6:44 PM
 */
public class DataSourceTypeToAwsUnitTest {
    @Test
    public void testGetUnit() throws Exception {
        String cs = "Count/Second";
        String none = "None";

        String val = DataSourceTypeToAwsUnit.getUnit(DataSourceType.COUNTER);
        assertEquals(val, cs);

        val = DataSourceTypeToAwsUnit.getUnit(DataSourceType.GAUGE);
        assertEquals(val, none);

        val = DataSourceTypeToAwsUnit.getUnit(DataSourceType.INFORMATIONAL);
        assertEquals(val, none);
    }
}
