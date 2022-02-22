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
public class BinarySearch {
    
    public static int binarySearch(ArrayList<HospitalData> arrayList, int first, int last, double target) {
        int midpoint = (first + last) / 2;
        if (first > last)
            return -1;
        if (arrayList.get(midpoint).getAdmittedPrice() == target) 
            return midpoint;
        if (arrayList.get(midpoint).getAdmittedPrice() < target)
            return binarySearch(arrayList, midpoint + 1, last, target);
        else
            return binarySearch(arrayList, first, midpoint - 1, target);
    }
    
    public static int admittedPriceBinarySearch(ArrayList<HospitalData> arrayList, double target) {
        int first = 0;
        int last = arrayList.size() - 1;
        while (first <= last) {
            int midpoint = (first + last) / 2;
            if (arrayList.get(midpoint).getAdmittedPrice() == target)
                return midpoint;
            else if (arrayList.get(midpoint).getAdmittedPrice() < target)
                first = midpoint + 1;
            else
                last = midpoint - 1;
        }
        return -1;
    }
    
    public static int hospitalNameBinarySearch(ArrayList<HospitalData> arrayList, String target) {
        int first = 0;
        int last = arrayList.size() - 1;
        while (first <= last) {
            int midpoint = (first + last) / 2;
            if (arrayList.get(midpoint).getHospitalName().compareTo(target) == 0) 
                return midpoint;
            else if (arrayList.get(midpoint).getHospitalName().compareTo(target) < 0) 
                first = midpoint + 1;
            else
                last = midpoint - 1;
        }
        return -1;
    }
    
    public static int hospitalCategoryBinarySearch(ArrayList<HospitalData> arrayList, String target) {
        int first = 0;
        int last = arrayList.size() - 1;
        while (first <= last) {
            int midpoint = (first + last) / 2;
            if (arrayList.get(midpoint).getHospitalCategory().compareTo(target) == 0) 
                return midpoint;
            else if (arrayList.get(midpoint).getHospitalCategory().compareTo(target) < 0) 
                first = midpoint + 1;
            else
                last = midpoint - 1;
        }
        return -1;
    }
    
}
