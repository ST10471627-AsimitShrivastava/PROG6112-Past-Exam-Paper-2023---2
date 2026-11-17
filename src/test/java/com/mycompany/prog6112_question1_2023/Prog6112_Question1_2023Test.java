
package com.mycompany.prog6112_question1_2023;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class EstateAgentTest {

    // I create an EstateAgent object for my tests.
    EstateAgent agent;

    // I prepare the EstateAgent object before each test.
    @Before
    public void setUp() {
        agent = new EstateAgent();
    }

    // I test whether the correct total sales are returned.
    @Test
    public void CalculateTotalSales_ReturnsTotalSales() {

        // I provide Joe Bloggs's property sales.
        double[] propertySales = {
            800000,
            1500000,
            2000000
        };

        // I calculate the total property sales.
        double actual = agent.EstateAgentSales(propertySales);

        // I check that the total is correct.
        double expected = 4300000;

        assertEquals(expected, actual, 0.01);
    }

    // I test whether the correct commission is returned.
    @Test
    public void CalculateTotalCommission_ReturnsCommission() {

        // I provide the total property sales.
        double propertySales = 4300000;

        // I calculate the estate agent's commission.
        double actual = agent.EstateAgentCommission(propertySales);

        // I check that the commission is correct.
        double expected = 86000;

        assertEquals(expected, actual, 0.01);
    }

    // I test whether the correct top estate agent position is returned.
    @Test
    public void TopAgent_ReturnsTopPosition() {

        // I provide the total sales for both estate agents.
        double[] totalSales = {
            4300000,
            3500000
        };

        // I find the position of the top estate agent.
        int actual = agent.TopEstateAgent(totalSales);

        // I check that Joe Bloggs is in position zero.
        int expected = 0;

        assertEquals(expected, actual);
    }
}
