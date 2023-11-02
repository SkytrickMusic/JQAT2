public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();

        System.out.println("рост 1.87м вес 98кг");
        System.out.println("Индекс массы тела " + (service.calculate(1.87, 98)));
        System.out.println();
        System.out.println("рост 1.72м вес 73кг");
        System.out.println("Индекс массы тела " + (service.calculate(1.72, 73)));
        System.out.println();
        System.out.println("рост 1.65м вес 55кг");
        System.out.println("Индекс массы тела " + (service.calculate(1.65, 55)));
        System.out.println();
        System.out.println("рост 1.75м вес 84кг");
        System.out.println("Индекс массы тела " + (service.calculate(1.75, 84)));


    }
}
