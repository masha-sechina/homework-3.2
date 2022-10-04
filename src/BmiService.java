public class BmiService {
    public int calculate(double height, int weight) {
        int bmi;
        bmi = (int) (weight / (height * height));

        return bmi;
    }
}
