package com.example.lab08;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class CustomListTest {

    @Test
    public void testHasCity() {
        CustomList<String> cities = new CustomList<>();
        cities.add("New York");

        assertTrue(cities.hasCity("New York"));

    }
}
