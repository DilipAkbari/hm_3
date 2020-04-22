package uk.co.expedia.resources.testdata;

import org.testng.annotations.DataProvider;

public class TestData {
    @DataProvider(name = "LoginCredintials")
    public Object[][] getLoginData() {
        return new Object[][]{
                {"xyz13@gmail.com", "abc123"}


        };

    }
}
