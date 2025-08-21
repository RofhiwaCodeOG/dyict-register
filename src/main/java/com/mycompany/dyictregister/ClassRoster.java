/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dyictregister;

/**
 *
 * @author Rofhiwa_CodeOG
 */

// Fixed student lists for each class
public class ClassRoster {
    public static final String[] safari = {
        "Siphokazi", "Rethabile", "Amanda", "Tshego", "Marcia",
        "Rofhiwa", "Pertunia", "Tiisetso", "Pheshla", "Tumza",
        "Akani", "Lebo", "Keo", "Usha", "Sandile",
        "Mogadi", "Uviwe", "Kwena", "Gomolemo", "Mandy",
        "Lisa", "Yvone", "Gogo", "SiphoEsihle", "Elton"
    };

    public static final String[] opera = {
        "Banele", "Neo", "Kefilwe", "Mpho", "Onkarabile",
        "Lethabo", "Naledi", "Aobakwe", "Boitumelo", "Kagiso",
        "Otsile", "Palesa", "Itumeleng", "Kelebogile", "Tebogo",
        "Omphile", "Ofentse", "Thato", "Lesedi", "Tumelo",
        "Thapelo", "Karabo", "Refilwe", "Olebogeng", "Tshepo"
    };

    public static final String[] hanna = {
        "Ayanda", "Ntando", "Siphesihle", "Lwandile", "Khanyisile",
        "Sibusiso", "Nosipho", "Bongiwe", "Lindiwe", "Thobile",
        "Zanele", "Nomvula", "Vusi", "Thami", "Nomsa",
        "Sandile", "Njabulo", "Noluthando", "Zama", "Lebo",
        "Boikanyo", "Thembeka", "Andile", "Khaya", "Nandi"
    };

    public static final String[] mozilla = {
        "Jordan", "Taylor", "Morgan", "Alex", "Cameron",
        "Riley", "Bailey", "Casey", "Devon", "Harley",
        "Jamie", "Kendall", "Logan", "Peyton", "Reagan",
        "Skylar", "Sydney", "Tatum", "Tristan", "Avery",
        "Dakota", "Elliot", "Finley", "Gray", "Hunter"
    };

    public static String getStudent(String className, int number) {
        try {
            switch (className) {
                case "Safari": return safari[number - 1];
                case "Opera": return opera[number - 1];
                case "Hanna": return hanna[number - 1];
                case "Mozilla": return mozilla[number - 1];
                default: return null;
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            return null;
        }
    }
}