package org.sbelei.restsample;

import io.restassured.module.mockmvc.RestAssuredMockMvc;
import org.junit.Before;

/*
Class name base test
 */
public class ThisRestBaseTest {

    @Before
    public void setup() {
        // shall add verivyer to do it
        RestAssuredMockMvc.standaloneSetup(new HelloController());
    }
}
