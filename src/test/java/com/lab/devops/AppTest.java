package com.lab.devops;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppTest {
    @Test
    public void testAdd() {
        // Kiểm tra xem hàm add(5, 10) có trả về đúng 15 hay không
        assertEquals(15, App.add(5, 10));
    }
    
    @Test
    public void testAddNegative() {
        // Kiểm tra với số âm
        assertEquals(-5, App.add(5, -10));
    }
}