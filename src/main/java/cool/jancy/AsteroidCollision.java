package cool.jancy;

import java.util.ArrayDeque;
import java.util.Arrays;

/**
 * @author dengjie
 * @version 1.0
 * @ClassName : AsteroidCollision
 * @description: TODO
 * @date 2024/5/6 下午3:30
 */
public class AsteroidCollision {

    public static int[] asteroidCollision(int[] asteroids) {
        int length = asteroids.length;
        ArrayDeque<Integer> integers = new ArrayDeque<>(length);
        for (int i = 0; i < length; i++) {
            if (integers.isEmpty()) {
                integers.push(asteroids[i]);
            } else {
                if (asteroids[i] == Math.abs(asteroids[i]) || integers.getFirst() != Math.abs(integers.getFirst())) {
                    integers.push(asteroids[i]);
                } else {
                    if (Math.abs(asteroids[i]) > Math.abs(integers.getFirst())) {
                        integers.pop();
                        integers.push(asteroids[i]);
                    } else if (Math.abs(asteroids[i]) == Math.abs(integers.getFirst())) {
                        integers.pop();
                    }
                }
            }
        }
        int[] intArray = new int[integers.size()];
        int index = 0;
        while (!integers.isEmpty()) {
            intArray[index++] = integers.removeLast();
        }
        if (intArray.length == asteroids.length) {
            return intArray;
        }
        return asteroidCollision(intArray);
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(asteroidCollision(new int[]{10, 2, -5})));
    }
}
