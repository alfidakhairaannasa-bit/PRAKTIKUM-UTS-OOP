public class Sepeda {
// Atribut 
private String merk;
private int kecepatan;
// Contructor 
public Sepeda(String merk, int kecepatan) {
this.merk = merk;
this.kecepatan = kecepatan;
}
// Metode 
public void ubahKecepatan(int kecepatanBaru) {
this.kecepatan = kecepatanBaru;
}
public void tampilkaninfo() {
System.out.println("Merk: " + merk);
System.out.println("Kecepatan: " + kecepatan + " km/jam");
}
}
