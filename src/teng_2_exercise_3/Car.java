/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teng_2_exercise_3;

/**
 *
 * @author lbwagnerm
 */
public class Car extends Vehicle {

    private final String type;
    private final String typeOfDrivingLicense;

    public Car(String type) {
        this(true, true, 4, type);
    }
    
    public Car(boolean motor, boolean drivingLicense, int numberOfWheels, String type) {
        super(motor, drivingLicense, numberOfWheels);
        this.typeOfDrivingLicense = "category B";
        this.type = type;
    }

    @Override
    public String toString() {
        return super.toString() + " of the " + typeOfDrivingLicense + " its a (n) " + type;
    }
}
