package com.driver;

public class F1 extends Car {
        private int currentGare;

    public F1(String name, boolean isManual) {
        super(name,4,0,6,isManual,"Racing",1);
        this.currentGare=1;

    }

    public void accelerate(int rate){
        int newSpeed = getCurrentSpeed()+rate; //set the value of new speed by using currentSpeed and rate

        /**
         * speed 0: gear 1
         * speed 1-50: gear 1
         * speed 51-100: gear 2
         * speed 101-150: gear 3
         * speed 151-200: gear 4
         * speed 201-250: gear 5
         * speed more than 250: gear 6
         */

        if(newSpeed == 0) {
            currentGare=1;
        } else if (newSpeed>=1&&newSpeed<=50) {
            currentGare=1;
        }
        else if (newSpeed>=51&&newSpeed<=100) {
            currentGare=2;
        }
        else if (newSpeed>=101&&newSpeed<=150) {
            currentGare=3;
        }
        else if (newSpeed>=151&&newSpeed<=200) {
            currentGare=4;
        }else if (newSpeed>=201&&newSpeed<=250) {
            currentGare=5;
        }
        else if (newSpeed>250) {
            currentGare=6;
        }

        if(newSpeed > 0) {
            changeSpeed(newSpeed, getCurrentDirection());
        }
    }
}
