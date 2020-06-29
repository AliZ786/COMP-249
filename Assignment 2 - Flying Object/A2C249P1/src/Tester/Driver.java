// -----------------------------------------------------
// Part: I
// Written by: Souvik Palal Alam (40044092) & Mohammad Ali Zahir (40077619)
// -----------------------------------------------------
package Tester;

import Airplane.Airplane;
import Helicopter.Helicopter;
import Helicopter.Quadcopter;
import Multirotor.Multirotor;
import UAV.UAV;
import UAVchild.AgriculturalDrone;
import UAVchild.MAV;

public class Driver {

	public static void main(String[] args) {
		
		Airplane a1 = new Airplane("Boeing", 2500000, 400);
		Airplane a2 = new Airplane("Gulfstream", 2200000, 410);
		Airplane a3 = new Airplane("Bombardier", 2350000, 395);
        Helicopter h1 = new Helicopter("Boeing", 1000000, 250, 4, 2008, 10);
        Helicopter h2 = new Helicopter("Airbus", 1100000, 275, 6, 2005, 8);
        Quadcopter q1 = new Quadcopter("DJI", 2000, 100, 2, 2013, 0, 600);
        Quadcopter q2 = new Quadcopter("EHang", 80000, 101, 4, 2017, 1, 150);
        Multirotor m1 = new Multirotor("Boeing", 46000, 98, 2, 2010, 6, 4);
        Multirotor m2 = new Multirotor("Parrot", 52000, 105, 2, 2011, 3, 8);
        UAV uav1 = new UAV(101.56, 429000);
        UAV uav2 = new UAV(101.21, 431000);
        AgriculturalDrone ad1 = new AgriculturalDrone(89.45, 300000, "HAL", 10 );
        AgriculturalDrone ad2 = new AgriculturalDrone(90.01, 295000, "HAL", 9);
        MAV mav1 = new MAV(43.25, 150000, "Parrot", 5);
        MAV mav2 = new MAV(43.24, 151000, "Parrot", 4.83);
		
        System.out.println(a1.toString());
        System.out.println(h1.toString());
        System.out.println(q1.toString());
        System.out.println(m1.toString());
        System.out.println(uav1.toString());
        System.out.println(ad1.toString());
        System.out.println(mav1.toString());
        
        System.out.println();
        
        FlyingObject[] fo = new FlyingObject[15];
        
        fo[0] = a1;
        fo[1] = a2;
        fo[2] = a3;
        fo[3] = h1;
        fo[4] = h2;
        fo[5] = q1;
        fo[6] = q2;
        fo[7] = m1;
        fo[8] = m2;
        fo[9] = uav1;
        fo[10] = uav2;
        fo[11] = ad1;
        fo[12] = ad2;
        fo[13] = mav1;
        fo[14] = mav2;
        
        int index1 = 0, index2 = 0;
        double min1 = Double.MAX_VALUE, min2 = min1;
        for (int i = 0; i < fo.length; i++) {
            FlyingObject fo1 = fo[i];
            if (fo1.getPrice() < min1) {
                min2 = min1;
                min1 = fo1.getPrice();
                index2 = index1;
                index1 = i;
            }
            else if (fo1.getPrice() < min2) {
                index2 = i;
                min2 = fo1.getPrice();
            }
        }
        
        System.out.println("Least expensive object information:");
        System.out.println("Location: " + index1);
        System.out.println(fo[index1]);
        System.out.println();
        System.out.println("2nd least expensive object information:");
        System.out.println("Location: " + index2);
        System.out.println(fo[index2]);
        System.out.println("");
        
        
        
	}
	
	
}
