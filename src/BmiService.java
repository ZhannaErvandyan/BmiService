public class BmiService {

    public int calculate (int weightInKg, double heightInMetres) {
        double bmi = weightInKg / heightInMetres / heightInMetres;
        return(int) bmi;

    }
}


