/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buoi78_collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 *
 * @author tiennh
 */
public class DemoCollection {
    public static void main(String[] args) {
        List<Integer> myList = new ArrayList<>();
        myList.add(1);
        myList.add(2);
        myList.add(1);
        myList.add(3);
        myList.add(2);
        myList.add(3);
        myList.add(1);
        myList.add(1);
        myList.add(4);
        
        System.out.println("myList: " + myList.toString());
        
        Set<Integer> mySet = new HashSet<>();
        mySet.add(1);
        mySet.add(2);
        mySet.add(1);
        mySet.add(3);
        mySet.add(2);
        mySet.add(3);
        mySet.add(1);
        mySet.add(1);
        mySet.add(5);
        mySet.add(6);
        mySet.add(7);
        System.out.println("mySet: " + mySet.toString());
        
        System.out.println("--------------");
        
//        myList.addAll(mySet);
//        System.out.println("myList after addAll(): " + myList.toString());

//        mySet.addAll(myList);
//        System.out.println("mySet: after addAll():" + mySet.toString());

//        myList.removeAll(mySet);
//        System.out.println("myList: after addAll():" + myList.toString());

        mySet.removeAll(myList);
        System.out.println("mySet: after addAll():" + mySet.toString());
    }
}
