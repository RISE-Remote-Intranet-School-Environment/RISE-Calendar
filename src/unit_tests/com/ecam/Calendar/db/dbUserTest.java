package com.ecam.Calendar.db;

import com.ecam.Calendar.model.Lecture;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;
class dbUserTest {

    @Test
    void getLectures() {
        List<Lecture> value = dbUser.getLectures("mumu");
        assertEquals("DKP",value.get(0).getTeachers().get(0));
        assertEquals("DFR",value.get(0).getTeachers().get(1));
    }
}