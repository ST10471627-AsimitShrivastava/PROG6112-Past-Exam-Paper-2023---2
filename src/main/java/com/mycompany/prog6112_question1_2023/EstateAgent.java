package com.mycompany.prog6112_question1_2023;

public class EstateAgent implements IEstateAgent {

    // I calculate the total property sales for one estate agent.
    @Override
    public double EstateAgentSales(double[] propertySales) {

        // I start the total sales at zero.
        double totalSales = 0;

        // I use a loop to add each property sale.
        for (double sale : propertySales) {
            totalSales += sale;
        }

        // I return the total property sales.
        return totalSales;
    }

    // I calculate the estate agent's 2% commission.
    @Override
    public double EstateAgentCommission(double propertySales) {

        // I calculate 2% commission from the total sales.
        return propertySales * 0.02;
    }

    // I find the position of the estate agent with the highest sales.
    @Override
    public int TopEstateAgent(double[] totalSales) {

        // I assume the first estate agent has the highest sales.
        int topAgent = 0;

        // I compare the sales of the remaining estate agents.
        for (int i = 1; i < totalSales.length; i++) {

            // I update the position if I find higher sales.
            if (totalSales[i] > totalSales[topAgent]) {
                topAgent = i;
            }
        }

        // I return the position of the top estate agent.
        return topAgent;
    }
}
