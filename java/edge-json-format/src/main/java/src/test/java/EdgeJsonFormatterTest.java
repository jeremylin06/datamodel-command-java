/******************************************************************
 *
 * Copyright 2017 Samsung Electronics All Rights Reserved.
 *
 *
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 *
 ******************************************************************/

package src.test.java;

import org.edge.json.format.EdgeData;
import org.edge.json.format.EdgeJsonFormatter;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class EdgeJsonFormatterTest {
  private final Logger logger = LoggerFactory.getLogger(getClass());

  @Before
  public void start() {
    logger.info("start");
  }

  @After
  public void stop() throws Exception {
    logger.info("stop");
  }

  @Test
  public void testParsingJSON() throws Exception {
    logger.info("[TEST] testParsingJSON");
    EdgeJsonFormatter.encodeEdgeDataToJsonString(null);
  }

  @Test
  public void testGeneratorJSON() throws Exception {
	  logger.info("[TEST] testGeneratorJSON");
	  EdgeJsonFormatter.decodeJsonStringToEdgeData(null);
  }
  
  @Test
  public void testParsingJSON2() throws Exception {
    logger.info("[TEST] testParsingJSON2");
    String version = "";
    String protocolCategory = "opcua";
    EdgeData data = new EdgeData(version, protocolCategory);
    EdgeJsonFormatter.encodeEdgeDataToJsonString(data);
  }

  @Test
  public void testGeneratorJSON2() throws Exception {
	  logger.info("[TEST] testGeneratorJSON2");
	  EdgeJsonFormatter.decodeJsonStringToEdgeData("");
  }
}
