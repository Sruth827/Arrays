/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arrays.arraylists;

import java.util.ArrayList;

/**
 *
 * @author Sean Ruth 900485278
 */
public class ArraysArrayLists {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Arrays function with a predetermined size in memory
        int[] intArr = new int[5];
        System.out.println("Integer Array containing 5 elements");
        intArr[0] = 1;
        intArr[1] = 2;
        intArr[2] = 3;
        intArr[3] = 4;
        intArr[4] = 5;
        for(int nums : intArr){
            System.out.println(nums);
        }
        
        //ArrayList functions much like a vector in C++ where you can add or remove elements contigously to the Array. 
        
        ArrayList<String> classmates = new ArrayList<String>(); 
        classmates.add("Classmates");
        classmates.add("Sean"); 
        classmates.add("John");
        classmates.add("Mike");
        classmates.add("Steve");
        
        for(String names: classmates){
            System.out.println(names);
        }
    
        classmates.set(1, "John has withdrawn from class");
        
        for (String names: classmates){
            System.out.println(names);
        }
    }
    
}
