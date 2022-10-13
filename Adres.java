import java.lang.String;
import java.util.Scanner;

public class Adres {
    
    public void setadres(){

        System.out.print("Введите свою страну: ");
        Scanner country = new Scanner(System.in);
        Magazin.adres = country.nextLine();
        
        System.out.print("Введите свой город: ");
        Scanner city = new Scanner(System.in);
        Magazin.adres = Magazin.adres + " " + city.nextLine() + " will be delivered ";

    }
}
