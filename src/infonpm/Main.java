
package infonpm;

import java.util.Scanner;

public class Main {
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        
        PerhitunganNilai[] nilaiSiswaArray = new PerhitunganNilai[3];
        int index = 0;
        
        while (true) {
            System.out.print("Masukan NPM: ");
            String npm = scanner.nextLine();
            
            if (npm.equalsIgnoreCase("exit")){
                System.out.println("program selesai, terima kasih");
                break;
            }
            
            if (npm.isEmpty()){
                System.out.println("Npm tidak boleh kosong.");
                continue;
            }
            
            
            if (npm.length() !=10) {
                System.out.println("NPM tdak sesuai, Harus terdiri dari 10 karakter.");
                continue;
            }
            
            
            System.out.println("==========================");
            System.out.println("\ninfo NPM yang dimasukan : ");
            System.out.println("\n==========================");
            
            InfoNpm NpmInfo = new InfoNpm(npm);
            
            System.out.println(NpmInfo.toString());
            System.out.println("=================================");
            
            System.out.println("program hitung nilai siswa: \n");
            System.out.print("Masukan nilai tugas: ");
            double tugas  = scanner.nextDouble();
            System.out.print("Masukan nilai UTS: ");
            double uts = scanner.nextDouble();
            System.out.print("Masukan nilai UAS: ");
            double uas =  scanner.nextDouble();
            System.out.print("Masukan nilai absen: ");
            double absen = scanner.nextDouble();
            scanner.nextLine();
            
            if (index >= nilaiSiswaArray.length){
                System.out.println("\n==============================");
                System.out.println("Array penuh, Tidak bisa meyimpan nilai lagi.");
                break;
            }
            
            PerhitunganNilai perhitunganNilai = new PerhitunganNilai(NpmInfo, tugas, uts, uas, absen);
            
            nilaiSiswaArray[index] = perhitunganNilai;
            index++;
            
            System.out.println("==============================================");
            System.out.println("Hasil Perhitungan Nilai:\n");
            
            perhitunganNilai.info();
            System.out.println("==================================\n");
            System.out.println("- jika lanjut, silahkan masukan nilai");
            System.out.println("- jika, tidak, ketik exit");
            System.out.println("==================================\n"); 
             
        }
        
        System.out.println("=================================");
        System.out.println("Nilai Semua Siswa: ");
         for (int i= 0; i < index; i++ ){
                System.out.println("Siswa: " + (i + 1) + ";");
                nilaiSiswaArray[i].info();
                System.out.println("------------------------------------------");
        }
        scanner.close();
    }
}
