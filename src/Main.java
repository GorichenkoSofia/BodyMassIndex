public class Main {
    public static void main(String[] args) {
       BmiService service = new BmiService();
       int BMI = service.calculate(1.75,80);
       System.out.println(BMI);
    }
}