/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.parkinglot.decorator;

/**
 *
 * @author katbassett
 */
import com.mycompany.parkinglot.parking.ParkingLot;
import com.mycompany.parkinglot.parking.ParkingPermit;
import com.mycompany.parkinglot.currency.Money;

import java.time.Instant;

public abstract class ParkingChargeCalculator {

    public ParkingChargeCalculator() {

    }

    public abstract Money getParkingCharge(Instant incurred, ParkingLot lot, ParkingPermit permit);
}