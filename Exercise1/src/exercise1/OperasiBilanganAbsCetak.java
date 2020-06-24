
package exercise1;

import java.util.InputMismatchException;
import java.util.Scanner;

final class OperasiBilanganAbsCetak {
    private static void cetaksemua(OperasiBilanganAbs OB,double x, double y){
        OB.setA(x);
        OB.setB(y);
        OB.setC();
        OB.tampil();
    }
    
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int p=0;
        double a=0;
        double b=0;
        
        try {
            System.out.print("Masukkan angka 1 : ");
            a=scan.nextInt();
            System.out.print("Masukkan angka 2 : ");
            b=scan.nextInt();
        }
        catch(InputMismatchException e){
            p=1;
            System.out.println("Maaf, program error! Jenis error : "+e);
        }
        finally{
           if (p==0){
                OperasiPenjumlahan jumlah = new OperasiPenjumlahan();
                cetaksemua(jumlah,a,b);
                 OperasiPengurangan kurang = new OperasiPengurangan();
                 cetaksemua(kurang,a,b);
                 OperasiPerkalian kali = new OperasiPerkalian();
                cetaksemua(kali,a,b);
                OperasiPembagian bagi = new OperasiPembagian();
                 cetaksemua(bagi,a,b);
                 System.out.println("Program selesai");
        }
           else{
               System.out.println("Program tidak dapat berjalan");
           }
        }

    
}}
