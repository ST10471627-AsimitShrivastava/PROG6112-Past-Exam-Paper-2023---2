
package com.mycompany.estateagentcommissionapplication;

public class EstateAgent implements IEstateAgent {

    // I calculate the commission earned from the property sale.
    @Override
    public double CalculateCommission(String propertyPrice,
            String agentCommission) {

        // I convert the entered values into numbers.
        double price = Double.parseDouble(propertyPrice);
        double percentage = Double.parseDouble(agentCommission);

        // I calculate the commission using the percentage.
        double commission = price * percentage / 100;

        // I return the calculated commission.
        return commission;
    }

    // I check that all the information entered is valid.
    @Override
    public boolean ValidateData(Data dataToValidate) {

        // I check that the agent location is not empty.
        if (dataToValidate.getAgentLocation() == null
                || dataToValidate.getAgentLocation().trim().isEmpty()) {
            return false;
        }

        // I check that the agent name is not empty.
        if (dataToValidate.getAgentName() == null
                || dataToValidate.getAgentName().trim().isEmpty()) {
            return false;
        }

        // I check that the property price and commission are not empty.
        if (dataToValidate.getPropertyPrice() == null
                || dataToValidate.getPropertyPrice().trim().isEmpty()
                || dataToValidate.getAgentCommission() == null
                || dataToValidate.getAgentCommission().trim().isEmpty()) {
            return false;
        }

        try {

            // I convert the property price and commission to numbers.
            double price = Double.parseDouble(dataToValidate.getPropertyPrice());
            double percentage = Double.parseDouble(dataToValidate.getAgentCommission());

            // I check that both numbers are greater than zero.
            if (price <= 0 || percentage <= 0) {
                return false;
            }

        } catch (NumberFormatException e) {

            // I reject the information if it is not a valid number.
            return false;
        }

        // I return true when all the information is valid.
        return true;
    }
}
