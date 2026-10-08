package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class OrderCalculatorTest {

    @Test
    void shouldCalculateOrderTotal() {

        com.quickcart.OrderCalculator calculator =
                new com.quickcart.OrderCalculator();

        double total =
                calculator.calculateTotal(100.0, 2);

        assertEquals(200.0, total);
    }
}