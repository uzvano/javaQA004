public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double m = 72.5; // масса в килограммах
        double h = 1.81; // рост в метрах
        double bmi = service.calculate(m, h);
        System.out.println(bmi);
    }
}
