package ru.netology.sqr;

public class SQRService {

    public int calculate(int min, int max) {
        int amountNumbers = 0;
        for (int i = 10; i <= 99; i++) {
            if (i * i >= min && i * i <= max) {
                amountNumbers++;
            }
        }
        return amountNumbers;
    }
}