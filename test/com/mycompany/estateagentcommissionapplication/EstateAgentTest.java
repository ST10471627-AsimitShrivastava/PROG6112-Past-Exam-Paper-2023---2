
package com.mycompany.estateagentcommissionapplication;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class EstateAgentTest {

    // I create an EstateAgent object for the unit tests.
    EstateAgent agent;

    // I prepare the EstateAgent object before each test.
    @Before
    public void setUp() {
        agent = new EstateAgent();
    }

    // I test whether the commission is calculated correctly.
    @Test
    public void CalculateCommission_CalculatedSuccessfully() {

        // I provide the property price and commission percentage.
        String propertyPrice = "800000";
        String agentCommission = "10";

        // I calculate the commission.
        double actual = agent.CalculateCommission(
                propertyPrice,
                agentCommission
        );

        // I set the expected commission.
        double expected = 80000;

        // I check that the calculated commission is correct.
        assertEquals(expected, actual, 0.01);
    }

    // I test that the commission does not return an incorrect value.
    @Test
    public void CalculateCommission_CalculatedUnSuccessfully() {

        // I provide the property price and commission percentage.
        String propertyPrice = "800000";
        String agentCommission = "10";

        // I calculate the commission.
        double actual = agent.CalculateCommission(
                propertyPrice,
                agentCommission
        );

        // I provide an incorrect commission amount for comparison.
        double incorrectExpected = 90000;

        // I check that the calculated commission is not the incorrect amount.
        assertNotEquals(incorrectExpected, actual, 0.01);
    }

    // I test whether invalid property price information is rejected.
    @Test
    public void ValidateData_ReturnsFalseForInvalidPropertyPrice() {

        // I provide information with a property price of zero.
        Data data = new Data(
                "Cape Town",
                "Joe Bloggs",
                "0",
                "10"
        );

        // I validate the information.
        boolean actual = agent.ValidateData(data);

        // I check that the invalid information is rejected.
        assertFalse(actual);
    }
}
