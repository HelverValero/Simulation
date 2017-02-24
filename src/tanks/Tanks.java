/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tanks;

import Logic.Tank;

/**
 *
 * @author RA303
 */
public class Tanks {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Tank tank1 = new Tank(10, 10, 10,9,1, 0.1);
        Tank tank2 = new Tank(10, 10, 10,9,1, 0.1);
        double distanceBetweenTanks = 20;
        double heightBetweenTanks = 20;
        
        long time = 0;
        double waste = 0;
        while (!tank1.isEmpty()){
          if (tank1.jetLenght(heightBetweenTanks)<distanceBetweenTanks ||
                  tank2.isFull()) {
             waste+=tank1.flow();
          }
          else {
            tank2.setLevel(tank2.getLevel()+tank1.flow());
            time++;
          }
          tank1.nextTime();
          tank2.nextTime();
        }
        System.out.println("Desperdicio "+waste);
        System.out.println("tiempo para empezar desperdicio "+time);
    }
    
}
