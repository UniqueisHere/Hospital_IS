/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.algorithms;

import com.hospital_is.HospitalData;
import java.util.ArrayList;

/**
 *
 * @author abc
 */
public class MergeSort {
    
    public static void mergeSort(ArrayList<HospitalData> arrayList) {
        if (arrayList.size() <= 1) 
            return;
        int midpoint = arrayList.size() / 2;
        
        ArrayList<HospitalData>leftArrayList = new ArrayList<HospitalData>();
        ArrayList<HospitalData> rightArrayList = new ArrayList<HospitalData>();
        
        for (int i = 0; i < midpoint; i++) {
            leftArrayList.add(arrayList.get(i));
        }
        
        for (int i = 0; i < arrayList.size() - midpoint; i++) {
            rightArrayList.add(arrayList.get(i));
        }
        
        mergeSort(leftArrayList);
        mergeSort(rightArrayList);
    }
    
    public static void merge(ArrayList<HospitalData> leftArrayList, ArrayList<HospitalData> rightArrayList, 
            ArrayList<HospitalData> arrayList) {
        int leftFirst = 0;
        int rightFirst = 0;
        int currentIndex = 0;
        
        while (leftFirst < leftArrayList.size() && rightFirst < rightArrayList.size()) {
            if  (leftArrayList.get(leftFirst).getAdmittedPrice() < rightArrayList.get(rightFirst).getAdmittedPrice()) {
                arrayList.add(currentIndex, leftArrayList.get(leftFirst));
                leftFirst ++;
            }else {
                arrayList.add(currentIndex, rightArrayList.get(rightFirst));
                rightFirst ++;
            }
            currentIndex ++;
        } 
        
        while(leftFirst < leftArrayList.size()) {
            arrayList.add(currentIndex, leftArrayList.get(leftFirst));
            leftFirst ++;
            currentIndex ++;
        }
        
        while(rightFirst < rightArrayList.size()) {
            arrayList.add(currentIndex, rightArrayList.get(rightFirst));
            rightFirst ++;
            currentIndex ++;
        }
    }
    
}
