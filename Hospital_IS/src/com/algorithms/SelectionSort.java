/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.algorithms;

import com.hospital_is.HospitalData;
import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author abc
 */
public class SelectionSort {
    
    public static void priceBasedSelectionSort(ArrayList<HospitalData> hospitalData) {
        for (int i = 0; i < hospitalData.size() - 1; i++) {
            int minPosition = i;
            for (int j = i + 1; j < hospitalData.size(); j++) {
                if (hospitalData.get(j).getAdmittedPrice() < hospitalData.get(minPosition).getAdmittedPrice()) {
                    minPosition = j;
                }
            }
            Collections.swap(hospitalData, minPosition, i); 
        }
    }
    
    public static void nameBasedSelectionSort(ArrayList<HospitalData> hospitalData) {
        for (int i = 0; i < hospitalData.size() - 1; i++) {
            int minPosition = i;
            for (int j = i + 1; j < hospitalData.size(); j++) {
                if (hospitalData.get(j).getHospitalName().compareTo(hospitalData.get(minPosition).getHospitalName()) < 0) {
                    minPosition = j;
                }
            }
            Collections.swap(hospitalData, minPosition, i); 
        }
    }
    
    public static void categoryBasedSelectionSort(ArrayList<HospitalData> hospitalData) {
        for (int i = 0; i < hospitalData.size() - 1; i++) {
            int minPosition = i;
            for (int j = i + 1; j < hospitalData.size(); j++) {
                if (hospitalData.get(j).getHospitalCategory().compareTo(hospitalData.get(minPosition).getHospitalCategory()) < 0) {
                    minPosition = j;
                }
            }
            Collections.swap(hospitalData, minPosition, i); 
        }
    }
    
}
