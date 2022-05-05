package com.project.adel;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

import com.project.adel.services.CustomerService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class MainTest {

    @Mock private CustomerService customerService;

    @BeforeEach
    void setup() {
    }

    @Test
    public void Boolean_Test() {
        assertTrue(true);
    }

    @Test
    public void Value_Test() {
        assertEquals("3", "3");
    }

    @Test
    public void Array_Test() {
        assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6}, new int[]{1, 2, 3, 4, 5, 6});
    }

    @Test
    void Mock_Test() {
        when(customerService.getCustomerName()).thenReturn("John Doe");
        assertEquals(customerService.getCustomerName(), "John Doe");
    }
}
