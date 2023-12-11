package org.ardasahin;

import java.util.Random;

public class RandomNumber {
    public int number;

    public int randomnumber() {
        Random random = new Random();
        this.number = random.nextInt(10);
        return number;
    }
}
