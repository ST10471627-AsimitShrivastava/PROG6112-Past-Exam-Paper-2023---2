package com.mycompany.prog6112_question1_2023;

public class Prog6112_Question1_2023 {

    private static final String SEPARATOR
            = "------------------------------------------------";

    public static void main(String[] args) {

        // I create a one-dimensional array to store the month names.
        String[] months = {
            "JAN",
            "FEB",
            "MAR"
        };

        // I create a one-dimensional array to store the estate agent names.
        String[] estateAgents = {
            "Joe Bloggs",
            "Jane Doe"
        };

        // I create a two-dimensional array to store the property sales.
        int[][] propertySales = {
            {800000, 1500000, 2000000},
            {700000, 1200000, 1600000}
        };

        // I create an object to perform the estate agent calculations.
        EstateAgent sales = new EstateAgent();

        // I create an array to store each estate agent's total sales.
        double[] totalSales = new double[estateAgents.length];

        // I display the report heading.
        System.out.println("ESTATE AGENTS SALES REPORT");
        System.out.println(SEPARATOR);

        // I display the month headings.
        System.out.printf("%-15s", "ESTATE AGENTS");

        for (String month : months) {
            System.out.printf("%-15s", month);
        }

        System.out.println();

        // I use an outer loop to go through each estate agent.
        for (int row = 0; row < propertySales.length; row++) {

            // I display the current estate agent's name.
            System.out.printf("%-15s", estateAgents[row]);

            // I use an inner loop to display each month's sales.
            for (int col = 0; col < propertySales[row].length; col++) {

                System.out.printf("R %-13.1f", (double) propertySales[row][col]);
            }

            System.out.println();

            // I calculate and store the total sales for each agent.
            double[] agentSales = new double[propertySales[row].length];

            for (int col = 0; col < propertySales[row].length; col++) {
                agentSales[col] = propertySales[row][col];
            }

            totalSales[row] = sales.EstateAgentSales(agentSales);
        }

        System.out.println(SEPARATOR);

        // I display the total property sales and commission for each agent.
        for (int i = 0; i < estateAgents.length; i++) {

            // I calculate the commission for the current estate agent.
            double commission = sales.EstateAgentCommission(totalSales[i]);

            System.out.printf(
                    "Total property sales for %s: R %,.2f%n",
                    estateAgents[i],
                    totalSales[i]
            );

            System.out.printf(
                    "Sales commission for %s: R %,.2f%n",
                    estateAgents[i],
                    commission
            );
        }

        System.out.println(SEPARATOR);

        // I find the position of the estate agent with the highest sales.
        int topAgent = sales.TopEstateAgent(totalSales);

        // I display the top-performing estate agent.
        System.out.println("Top performing estate agent:");
        System.out.println(estateAgents[topAgent]);

        System.out.println(SEPARATOR);
    }
}
