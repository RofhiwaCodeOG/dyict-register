package com.mycompany.dyictregister;

import javax.swing.*;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class DYICTRegister {

    static ArrayList<AttendanceRecord> attendanceLog = new ArrayList<>();

    public static void main(String[] args) {
        while (true) {
            String[] options = {"Student", "Facilitator", "Admin", "Exit"};
            String role = (String) JOptionPane.showInputDialog(
                    null, "Who are you?", "DYICT Register",
                    JOptionPane.QUESTION_MESSAGE, null, options, options[0]);

            if (role == null || role.equals("Exit")) {
                break;
            }

            switch (role) {
                case "Student":
                case "Facilitator":
                    handleAttendance(role);
                    break;
                case "Admin":
                    handleAdmin();
                    break;
            }
        }
    }

    private static void handleAttendance(String role) {
        String[] classes = {"Safari", "Opera", "Hanna", "Mozilla"};
        String chosenClass = (String) JOptionPane.showInputDialog(
                null, "Select your class:", "Class Selection",
                JOptionPane.PLAIN_MESSAGE, null, classes, classes[0]);

        if (chosenClass == null) {
            return;
        }

        if (role.equals("Facilitator")) {
            // Handle facilitator attendance
            String facilitatorName = getFacilitatorName(chosenClass);
            if (facilitatorName == null) {
                JOptionPane.showMessageDialog(null, "No facilitator assigned to this class.");
                return;
            }

            String[] statusOptions = {"Present", "Absent"};
            String status = (String) JOptionPane.showInputDialog(
                    null, "Hi " + facilitatorName + "! Mark your attendance:",
                    "Facilitator Attendance", JOptionPane.PLAIN_MESSAGE, null, statusOptions, statusOptions[0]);

            if (status != null) {
                AttendanceRecord record = new AttendanceRecord(facilitatorName, chosenClass, role, status);
                attendanceLog.add(record);
                JOptionPane.showMessageDialog(null, facilitatorName + " marked as " + status + " in " + chosenClass);
            }

        } else {
            // Handle student attendance
            try {
                String numberInput = JOptionPane.showInputDialog("Enter your number (1–25):");
                if (numberInput == null) {
                    return;
                }

                int number = Integer.parseInt(numberInput);

                String name = ClassRoster.getStudent(chosenClass, number);
                if (name == null) {
                    JOptionPane.showMessageDialog(null, "Number is out of range.");
                    return;
                }

                String[] statusOptions = {"Present", "Absent"};
                String status = (String) JOptionPane.showInputDialog(
                        null, "Hi " + name + "! Mark your attendance:",
                        "Attendance", JOptionPane.PLAIN_MESSAGE, null, statusOptions, statusOptions[0]);

                if (status != null) {
                    AttendanceRecord record = new AttendanceRecord(name, chosenClass, role, status);
                    attendanceLog.add(record);
                    JOptionPane.showMessageDialog(null, name + " marked as " + status + " in " + chosenClass);
                }

            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Invalid number input.");
            }
        }
    }

    private static void handleAdmin() {
        String username = JOptionPane.showInputDialog("Enter Admin Username:");
        String password = JOptionPane.showInputDialog("Enter Admin Password:");

        if ("admin".equals(username) && "1234".equals(password)) {
            String[] adminActions = {"View Attendance", "Export Attendance", "Back"};
            String choice = (String) JOptionPane.showInputDialog(
                    null, "Admin Panel:", "Choose Action",
                    JOptionPane.PLAIN_MESSAGE, null, adminActions, adminActions[0]);

            if ("View Attendance".equals(choice)) {
                viewAttendanceSummary();
            } else if ("Export Attendance".equals(choice)) {
                exportAttendanceToCSV();
            }

        } else {
            JOptionPane.showMessageDialog(null, "Access Denied. Incorrect credentials.");
        }
    }

    private static void viewAttendanceSummary() {
        if (attendanceLog.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No attendance has been recorded yet.");
        } else {
            StringBuilder summary = new StringBuilder("Attendance Records:\n\n");
            for (AttendanceRecord record : attendanceLog) {
                summary.append(record.toString()).append("\n");
            }
            JTextArea textArea = new JTextArea(summary.toString());
            JScrollPane scrollPane = new JScrollPane(textArea);
            textArea.setLineWrap(true);
            textArea.setWrapStyleWord(true);
            scrollPane.setPreferredSize(new java.awt.Dimension(500, 300));
            JOptionPane.showMessageDialog(null, scrollPane, "Attendance Summary", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    private static void exportAttendanceToCSV() {
        try (PrintWriter writer = new PrintWriter(new FileWriter("attendance_log.csv"))) {
            writer.println("Name,Class,Role,Status,Time");
            for (AttendanceRecord record : attendanceLog) {
                writer.println(record.toCSV());
            }
            JOptionPane.showMessageDialog(null, "Attendance exported successfully to attendance_log.csv");
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error writing to file: " + e.getMessage());
        }
    }

    // Helper method to fetch facilitator name by class
    private static String getFacilitatorName(String className) {
        switch (className) {
            case "Safari":
                return "Mr Bila";
            case "Opera":
                return "Mr joseph";
            case "Mozilla":
                return "Mathapelo";
            case "Hanna":
                return "jowi";

            default:
                return null;
        }
    }
}
