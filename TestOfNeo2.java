package Tests;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TestOfNeo2 {
    public static void main(String[] args) {
        System.out.print("Введите число в двоичной системе: ");
        Scanner str = new Scanner(System.in);
        String dv = str.next();
        List<Double> Answer= new ArrayList<>();
        for (int i=0; i<dv.length();i++)
        {
            int value=dv.length()-1-i;
            char a=dv.charAt(value);
            if(a=='1'|| a=='0'){
                if (a=='1'){
                    int b=1;
                    Answer.add(i,b*Math.pow(2,i));
                }
                else {int b=0;
                    Answer.add(i,b*Math.pow(2,i)); }
            }
        else {
                System.out.println("Вы ввели неверное число в двоичной системе.");
                System.exit(1);
            }


        }
         int v =0;
        for (int i=0;i< Answer.size();i++)
        {
            v+=Answer.get(i);
        }
        if (v>10000)
        {
            System.out.println("Ваше число больше 10000 в 10-чной системе!");
        }
        else
        System.out.println("Введенное число в двоичной системе: "+v);

       }
}

