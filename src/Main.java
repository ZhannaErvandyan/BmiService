
public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();

        int weightInKg = 98;
        double heightInMetres = 1.87;

        double bmi = service.calculate(weightInKg, heightInMetres);
        System.out.println("Индекс массы тела составляет "+ bmi);


    }
}



