public class Main {
    public static void main(String[] args) {
        BmiService service=new BmiService();
        int bmi;
        bmi = service.calculate(1.7 , 70);
        System.out.println("Индекс массы тела: " + bmi);
    }
}
