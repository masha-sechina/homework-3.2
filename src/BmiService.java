public class BmiService {
    public int calculate (double a,int b){
        int bmi;
        bmi = (int) (b / (a * a));

        return bmi;
    }
}
