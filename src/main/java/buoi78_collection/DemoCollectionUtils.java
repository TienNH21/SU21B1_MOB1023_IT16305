/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buoi78_collection;

import buoi1.Nguoi;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author tiennh
 */
public class DemoCollectionUtils {
    public static void main(String[] args) {
        List<Nguoi> list = new ArrayList<Nguoi>();
        
        Nguoi n1 = new Nguoi("B", 1, "HN"),
            n2 = new Nguoi("C", 0, "BN"),
            n3 = new Nguoi("A", 1, "ND");

        list.add(n1);
        list.add(n2);
        list.add(n3);

        Comparator<Nguoi> soSanhTheoTen = new Comparator<Nguoi>() {
            @Override
            public int compare(Nguoi nguoi1, Nguoi nguoi2) {
                return nguoi1.getHoTen().compareTo( nguoi2.getHoTen() );
            }
        };
        System.out.println("Danh sách trước khi suffle: " + list.toString());
        
        Collections.sort(list, soSanhTheoTen);
        
        System.out.println("Danh sách sau khi suffle: " + list.toString());
        
        
//
//        Collections.shuffle(list);
//
        
//        List<Integer> myList = new ArrayList<>();
//        myList.add(10);
//        myList.add(13);
//        myList.add(7);
//        myList.add(3);
//        
//        System.out.println("myList: " + myList);
//        
//        Collections.sort(myList);
//        System.out.println("------------------");
//        System.out.println("myList.sort(): " + myList);
//
//        Collections.reverse(myList);
//        System.out.println("------------------");
//        System.out.println("myList.reverse(): " + myList);
    }
}
