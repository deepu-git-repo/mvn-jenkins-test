package org.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }

    public static class OrderCalculator {

        public double calculateTotal(double price, int quantity) {

            if (price < 0) {
                throw new IllegalArgumentException(
                        "Price cannot be negative"
                );
            }

            if (quantity < 0) {
                throw new IllegalArgumentException(
                        "Quantity cannot be negative"
                );
            }

            return price * quantity;
        }
    }
}
