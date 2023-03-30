public class BmiService {
    public double calculate(double height, int weight) {
        weight = 94;
        double index = height * height;
        double bmi = (double) (weight / index);

        return bmi;
    }
}
