package ru.ifmo.cse.phms.util;

import java.util.Random;

public class RandomUtils {
    public static int intBetween(int start, int end) {
        return new Random().nextInt(end - start + 1) + start;
    }
}
