import java.lang.String;
import java.util.Scanner;
import java.util.*;


public class Ages extends User implements Comparable<Ages>{

    int zp;
    int age;

    public Ages(String posistion, int zp)
    {
        super(posistion);
        this.zp = zp;
    }

    void getUser()
    {
        System.out.println();
        NAmme();
        System.out.println();
    }

    void getUser(int age)
    {
        NAmme();
        System.out.print(" Age: ");
        System.out.print(age);
    }

    @Override
    public int compareTo(Ages p){
        return this.zp - p.zp;
    }

    @Override
    public String toString() {
        return "Posistion: " + position + ", Зарплата: " + zp;
    }

    public Integer getZp(){
        return (zp);
    }



}
