import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        double kilo,boy;
        Scanner input=new Scanner(System.in);
        System.out.print("Boy Uzunluğunuzu Metre Cinsinden Giriniz:");
        boy=input.nextDouble();

        System.out.print("Kilonuzu Kg Cinsinden Giriniz:");
        kilo=input.nextDouble();

        double sonuc=kilo/(boy*boy);
        System.out.print("Boy Kilo Endeksiniz:"+sonuc);


        }
    }
