/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buoi78_collection;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author tiennh
 */
public class DemoMap {
    public static void main(String[] args) {
        Map<String, Integer> mapDiem = new HashMap<String, Integer>();
        
        mapDiem.put("lab_1", 10);
        mapDiem.put("lab_2", 7);
        mapDiem.put("lab_3", 8);
        mapDiem.put("lab_4", 6);
        
        System.out.println("mapDiem = " + mapDiem.toString());
        System.out.println("Điểm lab 1: " + mapDiem.get("lab_1"));
        System.out.println("SV " + (mapDiem.containsKey("lab_5") ? "" : "không") + " có điểm lab 2");
        System.out.println("Kích thước của map: " + mapDiem.size());
        System.out.println("Empty: " + mapDiem.isEmpty());
    }
}
