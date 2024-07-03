public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double weight = 72.5; // масса в килограммах
        double height = 1.81; // рост в метрах
        int index = (int) service.calculate(weight, height);
        System.out.println(index);
    }
}
