public class BmiService {

    public int calculate(double weight, double height) {
        double bmi = weight / Math.pow(height, 2); // масса на рост в квадрате
        bmi = (double) ((int) (bmi * 100)) / 100; // округление до двух чисел после запятой



        return (int) bmi;
    }
}
