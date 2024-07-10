public class BmiService {
    public int calculate(double weightKg, double heightM) {
        return (int) (weightKg / (heightM * heightM));
    }
}
