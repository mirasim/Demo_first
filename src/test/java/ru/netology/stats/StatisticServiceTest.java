package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatisticServiceTest {

    @Test
    void findMax() {
        StatisticService service = new StatisticService();
        long[] incomesInBillions = {12, 5, 8, 4, 5, 3, 8, 6, 11, 11, 12};
        long expected = 12;
        long actual = service.findMax(incomesInBillions);
        assertEquals(expected, actual);
    }
    @Test
    void findMax2() {
        StatisticService service = new StatisticService();
        long[] incomesInBillions = {11, 5, 8, 4, 5, 3, 8, 6, 11, 11, 12};
        long expected = 12;
        long actual = service.findMax(incomesInBillions);
        assertEquals(expected, actual);
    }


    @Test
    void waterStatus() {
        StatisticService service = new StatisticService();
         String actual = service.waterStatus(30);
         String expected = "water";
        assertEquals(expected, actual);

    }

    @Test
    void waterIceStatus() {
        StatisticService service = new StatisticService();
        String actual = service.waterStatus(-3);
        String expected = "ice";
        assertEquals(expected, actual);

    }
    @Test
    void waterSteamStatus() {
        StatisticService service = new StatisticService();
        String actual = service.waterStatus(120);
        String expected = "steam";
        assertEquals(expected, actual);

    }
}