import java.util.Scanner;

public class Wskazniek_bmi_Mikolaj_Lapinski {
    public static void main(String[] args) {
        Scanner Uzytkownik = new Scanner(System.in);
        float Waga;
        float Wzrost;
        float BMI;
        System.out.println("Podaj wagę: ");
        Waga = Uzytkownik.nextFloat();
        System.out.println("Podaj wzrost: ");
        Wzrost = Uzytkownik.nextFloat();
        BMI = Waga/(Wzrost*Wzrost);
        if (BMI<16){

        }else if (16<=BMI&&BMI<=16.99){

        } else if (17<=BMI&&BMI<=18.49) {

        } else if (18.50<=BMI&&BMI<=22.99) {

        }else if (23<=BMI&&BMI<=24.99) {

        }else if (25<=BMI&&BMI<=27.49) {

        }else if (27.50<=BMI&&BMI<=29.99) {

        }else if (30<=BMI&&BMI<=34.99) {

        }else if (35<=BMI && BMI<=39.99) {

        }else if (40<=BMI){

        }
    }

}
