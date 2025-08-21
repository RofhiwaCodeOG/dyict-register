
package com.mycompany.dyictregister;


/**
 *
 * @author Rofhiwa_CodeOG
 */

// Base class for common properties
public class Register {
    private String regName, studName, className;

    public Register(String regName, String studName, String className) {
        this.regName = regName;
        this.studName = studName;
        this.className = className;
    }

    public String getRegName() { return regName; }
    public void setRegName(String regName) { this.regName = regName; }

    public String getStudName() { return studName; }
    public void setStudName(String studName) { this.studName = studName; }

    public String getClassName() { return className; }
    public void setClassName(String className) { this.className = className; }

    public void displayInfo() {
        System.out.println("Name: " + studName + ", Register: " + regName + ", Class: " + className);
    }
}