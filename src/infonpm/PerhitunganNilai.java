
package infonpm;


public class PerhitunganNilai extends NilaiSiswa{
  private double absen;
  private InfoNpm infoNpm;

public PerhitunganNilai (InfoNpm infoNpm, double tugas, double uts, double uas, double absen){
    super(tugas, uts, uas);
    this.absen = absen;
    this.infoNpm = infoNpm;
}  
 public void info(){
     System.out.println(infoNpm.toString());
     double total = (getTugas()*0.10) + (getUts() +0.20) + (getUas()*0.30) + (absen * 0.40) ;
     String grade = grade(total);
     
     System.out.println("Nilai Tugas: " + getTugas());
     System.out.println("Nliai UTS: " + getUts());
     System.out.println("Nilai UAS: " + getUas());
     System.out.println("Nilai Total: " + total);
     System.out.println("Niliai Grade: " + grade);
 }
 
 private String grade (double total){
     if (total >= 85 ){
         return "A";
     }else if (total >= 70){
         return "B";
     }else if (total >= 55){
         return "c";
     }else if (total >= 40){
         return "D";
     }else {
         return "E";
     }
 }

}
