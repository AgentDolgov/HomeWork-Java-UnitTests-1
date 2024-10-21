public class Calculator {

        public double calculateDiscount(double total, double discountPercentage) {
            if (total <= 0 || discountPercentage < 0 || discountPercentage > 100) {
                throw new ArithmeticException("Invalid input");
            }
    
            double discountAmount = total * discountPercentage / 100;
            return total - discountAmount;
        }
    }
    