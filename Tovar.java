import java.lang.String;
import java.util.Scanner;

public class Tovar {

    public  void Settovar(){
    String zakaz2;
    int i;
    for (i = 0; i < 2; i++){
        System.out.print("Название товара: ");
        Scanner name = new Scanner(System.in);
        zakaz2 = name.nextLine();

        System.out.print("Сколько вы хотите товара: ");
        Scanner kolich = new Scanner(System.in);
        Magazin.zakaz[i] = zakaz2 + " " + kolich.nextLine() + " thing ";
    }
    }

}       



