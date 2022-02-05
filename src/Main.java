public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int height = 164;
        int weight = 53;
        double bmi = service.calculate(height,weight);
        System.out.println("Индекс Массы Тела:" + bmi);
    }

}
