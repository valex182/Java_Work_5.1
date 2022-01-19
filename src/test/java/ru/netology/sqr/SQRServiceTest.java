package ru.netology.sqr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {

    @Test
    public void shouldCalculateNumber() {
        SQRService service = new SQRService();
        int min = 200;
        int max = 300;
        int expected = 3;

        int actual = service.calculate(min, max);

        assertEquals(expected, actual);
    }

    @Test
    public void shouldCalculateAllRange() {
        SQRService service = new SQRService();
        int min = 1;
        int max = 1000000;
        int expected = 90;

        int actual = service.calculate(min, max);

        assertEquals(expected, actual);
    }

    @Test
    public void shouldCalculateLimits() {
        SQRService service = new SQRService();
        int min = 100;
        int max = 9801;
        int expected = 90;

        int actual = service.calculate(min, max);

        assertEquals(expected, actual);
    }
}