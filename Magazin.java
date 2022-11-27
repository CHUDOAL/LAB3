//package LAB3; 

import java.util.*;
import java.util.Collections;
import java.util.List;
import java.lang.String;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

import javax.swing.table.TableRowSorter;

public class Magazin {
    public static String user;
    public static String[] zakaz = new String[2];
    public static String adres;
    public static String dates;
    
    public static void main(String[] args){
        
        Setuser(); SetTovar(); setadres(); setdata();
        Getuser(); GetTovar(); Getadres(); Getdata();

        ArrayList<Ages> Konst = new ArrayList<Ages>();

        Konst.add(new Ages("Rodot", 12000));
        Konst.add(new Ages("Rodot", 33333));
        Konst.add(new Ages("Boss", 234));
        Konst.add(new Ages("Director", 1000000));

        Collections.sort(Konst);
          
        System.out.println("\n Сортировка: \n\n");

        for (Object o : Konst){
            System.out.println(o);
        }

        System.out.println("\n Поиск: \n\n");

        Comparator<Ages> c = new Comparator<Ages>() {
            public int compare(Ages u1, Ages u2)
            {
                return u1.getZp().compareTo(u2.getZp());
            }
        };


        int index = Collections.binarySearch(Konst, new Ages(null, 234), c);

        if (index >= 0){
            System.out.println("Работник с такой зп найден!!!");
        }
        else{
            System.out.println("Работник с такой зп не найден!!!");
        }
        
       // System.out.println(index);

    }

    public static void Setuser(){

        
        User set = new User("Boss");
        set.setUser();

    }

    public static void Getuser(){

        
        System.out.print(user+", ");

    }

    public static void SetTovar(){

        
        Tovar set = new Tovar();
        set.Settovar();

    }

    public static void GetTovar(){

        for (int i = 0; i < 2; i++)
        {       
            System.out.print(zakaz[i]);
        }
        System.out.print(", ");
    }

    public static void setadres(){

        
        Adres set3 = new Adres();
        set3.setadres();

    }

    public static void Getadres(){

        System.out.print(adres);
        
    }

    public static void setdata(){

        
        Data set3 = new Data();
        set3.setdata();

    }

    public static void Getdata(){

        System.out.print(dates);
        
    }
    
    public static void Ages()
    {
        Ages set = new Ages("Boss", 999999);
        set.getUser();
        set.getUser(34);
    }

}


