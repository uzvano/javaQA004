public class BmiService {
    public double calculate(double weightKg, double heightM) {
        return (int) (weightKg / (heightM * heightM));  // метод возвращает целое число
    }
}
