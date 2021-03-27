/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teng_2_exercise_3;

/**
 * @author lbwagnerm
 */
public class Motorbike extends Vehicle {
    private String type;
    private final String typeOfDrivingLicense;

    public Motorbike(String type) {
        this(true, true, 2, type);
    }

    public Motorbike(boolean motor, boolean drivingLicense, int numberOfWheels, String type) {
        super(motor, drivingLicense, numberOfWheels);
        this.type = type;
        this.typeOfDrivingLicense = "category A";
    }

    @Override
    public String toString() {
        return super.toString() + " of the " + typeOfDrivingLicense + " its a (n) " + type;
    }
}
