package com.mycompany.estateagentcommissionapplication;

public class EstateAgentData {

    private String agentLocation;
    private String agentName;
    private String propertyPrice;
    private String agentCommission;

    // I store the information entered by the user.
    public Data(String agentLocation, String agentName,
            String propertyPrice, String agentCommission) {

        this.agentLocation = agentLocation;
        this.agentName = agentName;
        this.propertyPrice = propertyPrice;
        this.agentCommission = agentCommission;
    }

    // I return the estate agent location.
    public String getAgentLocation() {
        return agentLocation;
    }

    // I return the estate agent name.
    public String getAgentName() {
        return agentName;
    }

    // I return the property price.
    public String getPropertyPrice() {
        return propertyPrice;
    }

    // I return the commission percentage.
    public String getAgentCommission() {
        return agentCommission;
    }
}
}
