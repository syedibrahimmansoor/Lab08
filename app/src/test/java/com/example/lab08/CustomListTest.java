package com.example.lab08;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CustomListTest {

    private CustomList list;

    private CustomList mockCityList() {
        list = new CustomList();
        list.addCity(new City("Charlottetown", "PEI"));
        return list;
    }

    @Test
    public void testHasCity() {
        list = mockCityList();
        City city = new City("Charlottetown", "PEI");
        assertTrue(list.hasCity(city));
    }
}
