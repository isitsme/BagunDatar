
package bangun_datar;

public class Bangun_Datar {

    public static void main(String[] args) {
        
        BangunDatar bangunDatar = new BangunDatar();
        
        persegi Persegi = new persegi();
        Persegi.sisi = 2;
        
        lingkaran lingkaran = new lingkaran();
        lingkaran.r = 22;
      
        PersegiPanjang persegiPanjang = new PersegiPanjang();
        persegiPanjang.panjang = 8;
        persegiPanjang.lebar = 4;
        
        Segitiga mSegitiga = new Segitiga();
        mSegitiga.alas = 12;
        mSegitiga.tinggi = 8;
       
        bangunDatar.luas();
        bangunDatar.keliling();
        
        persegi.luas();
        persegi.keliling();
        
        lingkaran.luas();
        lingkaran.keliling();
        
        persegiPanjang.luas();
        persegiPanjang.keliling();
        
        mSegitiga.luas();
        mSegitiga.keliling();
    }

}
