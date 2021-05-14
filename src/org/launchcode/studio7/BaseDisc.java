package org.launchcode.studio7;

import java.util.ArrayList;

public abstract class BaseDisc {
    private String name;
    private int storageCapacity;
    private int remainingCapacity;
    private int capacityUsed;
    private String discType;
    private ArrayList<String> contents;

    public BaseDisc(String aName, int aStorageCapacity, String aDiscType, int aCapacityUsed) {
        name = aName;
        storageCapacity = aStorageCapacity;
        discType = aDiscType;

    }

    private int checkCapacity(int dataWritten) {
        if (storageCapacity < dataWritten) {
            return storageCapacity;
        }
        return dataWritten;

        private int spaceLeft() {
            return storageCapacity - capacityUsed;
        }
    }
}


//    private String name;
//    private int usedCapacity;
//    private int totalCapacity;
//    private int availableCapacity = totalCapacity = usedCapacity;
//    private ArrayList<String> contents;
//    private String discType;

