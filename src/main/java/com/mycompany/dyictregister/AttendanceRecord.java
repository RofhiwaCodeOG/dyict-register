
package com.mycompany.dyictregister;

/**
 *
 * @author Rofhiwa_CodeOG
 */

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

// Represents an attendance entry
public class AttendanceRecord {
    private String name, className, role, status, timeStamp;

    public AttendanceRecord(String name, String className, String role, String status) {
        this.name = name;
        this.className = className;
        this.role = role;
        this.status = status;
        this.timeStamp = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
    }

    public String toCSV() {
        return String.join(",", name, className, role, status, timeStamp);
    }

    @Override
    public String toString() {
        return role + " " + name + " (" + className + ") marked " + status + " at " + timeStamp;
    }
}
