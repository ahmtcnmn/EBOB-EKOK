import java.util.Scanner;

import static java.lang.System.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(in);
        int n1,n2,byk,kck,i=1,k=1,ebob = 0,ekok=0;
        out.println("EBOK ve EKOK Bulan programa hoş geldiniz");
        out.print("1. sayıyı giriniz : ");
        n1=input.nextInt();
        out.print("2. sayıyı giriniz : ");
        n2=input.nextInt();
        if (n1>n2){
            byk=n1;
            kck=n2;
        } else {
            byk=n2;
            kck=n2;
        }
        k=kck;
        // EBOB
        while (i<=byk){
            if (n1%i==0 && n2%i==0){
                ebob=i;
            }
            i++;
        }
        // EKOK
        while (k<=(byk*kck)){
            if (k%n1==0 && k%n2==0){
                ekok=k;
                break;
            }
            k++;
        }
        out.print("Girilen sayıların EBOB'u : "+ebob+"\nVe EKOK'u : "+ekok);

    }

}

