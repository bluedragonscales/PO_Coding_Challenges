package com.kyla.challenge1;

public class MemorySizeChallenge {

    public static void main(String[] args) {

//        Create a function that takes the memory size (ms is a string type) as an argument and returns the actual
//        memory size.

//        Examples:
//        actualMemorySize("32GB") --> "29.76GB"
//        actualMemorySize("2GB") --> "1.86GB"
//        actualMemorySize("512MB") --> "476MB"
//
//        Notes
//                -The actual storage loss on a USB device is 7% of the overall memory size!
//                -If the actual memory size was greater than 1 GB, round your result to two decimal places.
//        -If the memory size after adjustment is smaller than 1 GB, return the result in MB.



        String memoryAnswer = memoryCalc("512GB");
        System.out.println(memoryAnswer);

    }


    public static String memoryCalc(String memory) {
        String correctMemory = "";
        int stringMeasurement = memory.indexOf("B") -1;
        int stringBytes = memory.indexOf("B");
        String memoryType = memory.substring(stringMeasurement, stringBytes+1);

        double memoryAmount = Double.parseDouble(memory.substring(0, stringMeasurement));
        double multipliedMemory = memoryAmount * 0.07;

        double adjustedMemory = memoryAmount - multipliedMemory;

        int mbType = 0;
        if(memoryType.equals("MB")) {
            mbType = (int) adjustedMemory;
            correctMemory = mbType + memoryType;
        }
        else {
            double memRounded = Math.round(adjustedMemory * 100) / 100.00;
            correctMemory = memRounded + memoryType;
        }

        return correctMemory;

    }

}
