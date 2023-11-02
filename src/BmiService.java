public class BmiService {
    public int calculate(double meters, int kilograms) {
        meters = meters * meters;
        double result = kilograms / meters;
        return (int) result;
    }
}
