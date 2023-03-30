public class BmiService {
    public double calculate(double height, int weight) {
        double index = height * height;
        double bmi = (double) (weight / index);

        return bmi;
    }
}
