import java.lang.String;
import java.util.Scanner;

public class User {

        String position;

                public User(String position){
                this.position = position;
        }

        public String names;



        public void setUser(){



                System.out.print("Введите свое имя: ");
                Scanner name = new Scanner(System.in);
                Magazin.user = name.nextLine();

                System.out.print("Введите свою фамилию: ");
                Scanner surname = new Scanner(System.in);
                Magazin.user = Magazin.user + " " + surname.nextLine();


        }

        public void NAmme(){
                names = Magazin.user;
                System.out.print(names);
        }




}