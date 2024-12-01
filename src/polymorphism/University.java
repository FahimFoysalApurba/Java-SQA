package polymorphism;

public class University {
    public double calculateTuition(double baseFee) {
        return baseFee;
    }

    // Overloaded method to calculate tuition for postgraduate students (with additional fees)
    public double calculateTuition(double baseFee, double researchFee) {
        return baseFee + researchFee;
    }

    // Overloaded method to calculate tuition for international students (with a surcharge)
    public double calculateTuition(double baseFee, double surcharge, double researchFee) {
        return baseFee + surcharge + researchFee;
    }
}



