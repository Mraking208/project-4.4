public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double height = 1.78;
        int weight = 94;
        double bmi = service.calculate(height);

        System.out.println("Индекс массы тела: " + bmi);
    }
}