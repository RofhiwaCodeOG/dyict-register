
package com.mycompany.dyictregister;

/**
 *
 * @author Rofhiwa_CodeOG
 */

public class Facilitator extends Register {
    private String facName;

    public Facilitator(String facName, String regName, String studName, String className) {
        super(regName, studName, className);
        this.facName = facName;
    }

    public String getFacName() { return facName; }
    public void setFacName(String facName) { this.facName = facName; }

    @Override
    public void displayInfo() {
        System.out.println("Facilitator: " + facName + ", Class: " + getClassName());
    }
}
