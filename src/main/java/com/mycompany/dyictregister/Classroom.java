/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dyictregister;

/**
 *
 * @author Rofhiwa_CodeOG
 */

public class Classroom extends Register {
    private String roomName;

    public Classroom(String roomName, String regName, String studName, String className) {
        super(regName, studName, className);
        this.roomName = roomName;
    }

    public String getRoomName() { return roomName; }
    public void setRoomName(String roomName) { this.roomName = roomName; }
}
