package org.launchcode.studio7;

public class CD extends BaseDisc implements OpticalDisc {

    public CD(String aName, int aStorageCapacity, String aDiscType, int aCapacityUsed) {
        super(aName, aStorageCapacity, aDiscType, aCapacityUsed);
    }

    @Override
    public void spinDisc() {
        System.out.println("A CD spins at a rate of between 200-500 RPM");
    }

    @Override
    public void readData() {
        System.out.println("Imma leave the door open");
    }
    // TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.

}
