
package jurnal1;

import java.util.Scanner;

public class Jurnal1 {

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        System.out.print("Masukkan Angka : ");
        int n = scnr.nextInt();
        int count = 1;
        int c = 1, b = 1, a = 0;
        while(count < n){
            if(count == 1)
            {
                System.out.print(c+" ");
            }
            c = b + a;
            System.out.print(c+" ");
            
            a = b;
            b = c;
            
            count++;
        }
        System.out.println("");
    }
    
}
