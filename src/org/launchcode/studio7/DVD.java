package org.launchcode.studio7;

public class DVD extends BaseDisc implements OpticalDisc {
    public DVD(String aName, int aStorageCapacity, String aDiscType, int aCapacityUsed) {
        super(aName, aStorageCapacity, aDiscType, aCapacityUsed);
    }

    @Override
    public void spinDisc() {
        System.out.println("A DVD spins at a rate of 570 - 1600 RMP");
    }

    @Override
    public void readData() {
        System.out.println("Troo0 wuuuuv");
    }

    // TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.

}
