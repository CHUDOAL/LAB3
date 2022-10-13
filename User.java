import java.lang.String;
import java.util.Scanner;

public class User {
    
        public void setUser(){
        
      

        System.out.print("Введите свое имя: ");
        Scanner name = new Scanner(System.in);
        Magazin.user = name.nextLine();
        
        System.out.print("Введите свою фамилию: ");
        Scanner surname = new Scanner(System.in);
        Magazin.user = Magazin.user + " " + surname.nextLine();
        
        
        }


    



}