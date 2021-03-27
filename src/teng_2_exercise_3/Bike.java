/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teng_2_exercise_3;

/**
 * @author lbwagnerm
 */
public class Bike extends Vehicle {
    private String type;

    public Bike(String type) {
        this(false, false, 2, type);
    }


    public Bike(boolean motor, boolean drivingLicense, int numberOfWheels, String type) {
        super(motor, drivingLicense, numberOfWheels);
        this.type = type;
    }

    @Override
    public String toString() {
        return super.toString() + " its a (n) " + type;
    }
}
