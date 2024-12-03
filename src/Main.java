public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double height = 1.87;
        double weight = 98;
        int index = service.calculate(weight, height);
        System.out.println(index);
        System.out.println(service.calculate(60, 1.70));
        System.out.println(service.calculate(80, 1.80));
        System.out.println(service.calculate(87, 1.90));
        System.out.println(service.calculate(50, 1.60));

    }
}





