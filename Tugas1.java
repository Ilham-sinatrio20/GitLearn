package Jobsheet7;

import java.util.Scanner;

public class Tugas1 {
    public static void main(String[] args){
    
        //Variabel
        Scanner sc = new Scanner(System.in);
        
        //Proses
        System.out.print("Masukan N : ");
        int N = sc.nextInt();
        
        //Output
        for(int i=1;i<=N;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
