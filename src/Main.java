public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double weightKg = 72.5; // масса в килограммах
        double heightM = 1.81; // рост в метрах
        int index = service.calculate(weightKg, heightM);
        System.out.println(index);
    }
}

