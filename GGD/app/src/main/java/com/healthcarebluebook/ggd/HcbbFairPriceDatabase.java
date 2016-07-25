package com.healthcarebluebook.ggd;

import java.util.HashMap;

/**
 * Created by ajohnson on 5/16/16.
 */
public class HcbbFairPriceDatabase {

    public static HcbbFairPrice GetHcbbFairPrice(String procedureName, String zipCode) {
        // Concatenate the procedure name, - and zip code to find the key used in the HashMap
        String key = procedureName + "-" + zipCode;
        // first check to see our database contains the key
        if (fairPriceDatabase.containsKey(key)) {
            // Return the fair price data for this procedure/zip code
            return (HcbbFairPrice) fairPriceDatabase.get(key);
        } else {
            return null;
        }
    }

    private static HashMap<String, HcbbFairPrice> fairPriceDatabase =
            new HashMap<String, HcbbFairPrice> ()
    {{
        // populate the database with our prices
        // Nashville
        put("Sleep Study-37211", new HcbbFairPrice("Sleep Study", "37211", "$1,301", "$4,210"));
        put("Tonsillectomy-37211", new HcbbFairPrice("Tonsillectomy", "37211", "$3,128", "$8,503"));
        put("Knee Arthroscopy-37211", new HcbbFairPrice("Knee Arthroscopy", "37211", "$4,262", "$11,008"));
        put("Chest CT-37211", new HcbbFairPrice("Chest CT", "37211", "$427", "$1,687"));
        put("Total Knee Replacement-37211", new HcbbFairPrice("Total Knee Replacement", "37211", "$32,807", "$49,240"));
        put("Foot Fracture Surgery-37211", new HcbbFairPrice("Foot Fracture Surgery", "37211", "$12,947", "$32,367"));
        put("Nasal Septum Repair-37211", new HcbbFairPrice("Nasal Septum Repair", "37211", "$6,190", "$15,196"));
        put("Pacemaker Insertion-37211", new HcbbFairPrice("Pacemaker Insertion", "37211", "$19,118", "$47,795"));

        // San Juan
        put("Sleep Study-00901", new HcbbFairPrice("Sleep Study", "00901", "$1,113", "$2,782"));
        put("Tonsillectomy-00901", new HcbbFairPrice("Tonsillectomy", "00901", "$2,529", "$6,322"));
        put("Knee Arthroscopy-00901", new HcbbFairPrice("Knee Arthroscopy", "00901", "$3,658", "$9,145"));
        put("Chest CT-00901", new HcbbFairPrice("Chest CT", "00901", "$299", "$747"));
        put("Total Knee Replacement-00901", new HcbbFairPrice("Total Knee Replacement", "00901", "$18,127", "$45,317"));
        put("Foot Fracture Surgery-00901", new HcbbFairPrice("Foot Fracture Surgery", "00901", "$11,603", "$29,008"));
        put("Nasal Septum Repair-00901", new HcbbFairPrice("Nasal Septum Repair", "00901", "$3,411", "$8,527"));
        put("Pacemaker Insertion-00901", new HcbbFairPrice("Pacemaker Insertion", "00901", "$16,461", "$41,153"));

        // Anchorage
        put("Sleep Study-99501", new HcbbFairPrice("Sleep Study", "99501", "$3,270", "$5,457"));
        put("Tonsillectomy-99501", new HcbbFairPrice("Tonsillectomy", "99501", "$4,520", "$11,188"));
        put("Knee Arthroscopy-99501", new HcbbFairPrice("Knee Arthroscopy", "99501", "$14,647", "$24,618"));
        put("Chest CT-99501", new HcbbFairPrice("Chest CT", "99501", "$828", "$2,043"));
        put("Total Knee Replacement-99501", new HcbbFairPrice("Total Knee Replacement", "99501", "$63,673", "$99,109"));
        put("Foot Fracture Surgery-99501", new HcbbFairPrice("Foot Fracture Surgery", "99501", "18,436", "$46,090"));
        put("Nasal Septum Repair-99501", new HcbbFairPrice("Nasal Septum Repair", "99501", "$4,437", "$11,092"));
        put("Pacemaker Insertion-99501", new HcbbFairPrice("Pacemaker Insertion", "99501", "$27,304", "$68,260"));

        // Seattle
        put("Sleep Study-98174", new HcbbFairPrice("Sleep Study", "98174", "$1,337", "$6,590"));
        put("Tonsillectomy-98174", new HcbbFairPrice("Tonsillectomy", "98174", "$2,801", "$12,748"));
        put("Knee Arthroscopy-98174", new HcbbFairPrice("Knee Arthroscopy", "98174", "$5,292", "$15,671"));
        put("Chest CT-98174", new HcbbFairPrice("Chest CT", "98174", "$581", "$1,944"));
        put("Total Knee Replacement-98174", new HcbbFairPrice("Total Knee Replacement", "98174", "$41,001", "$53,649"));
        put("Foot Fracture Surgery-98174", new HcbbFairPrice("Foot Fracture Surgery", "98174", "15,470", "$38,675"));
        put("Nasal Septum Repair-98174", new HcbbFairPrice("Nasal Septum Repair", "98174", "$5,675", "$19,379"));
        put("Pacemaker Insertion-98174", new HcbbFairPrice("Pacemaker Insertion", "98174", "$23,006", "$57,665"));

    }};

}
