public class BmiService {
    public double calculate(int height, int weight) {
        double bmi = (weight * 10000) / (double) (height * height);
        return bmi;
    }
}