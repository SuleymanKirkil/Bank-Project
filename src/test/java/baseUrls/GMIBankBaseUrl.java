package baseUrls;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;
import io.cucumber.java.Before;
import utilities.ConfigReader;

public class GMIBankBaseUrl {

            public static RequestSpecification spec;
        //@Before(value= "@Api")
        public static void setUp(){
            spec=new RequestSpecBuilder().setBaseUri(ConfigReader.getProperty("GMIBankUrl")).build();

        }
    }


