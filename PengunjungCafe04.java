public class PengunjungCafe04 {
   
    static void daftarPengunjung(String... namaPengunjung) {
        System.out.println("Daftar Nama Pengunjung:");

        if (namaPengunjung.length == 0) {
            System.out.println("- (Tidak ada pengunjung)");
            return;
        }
   
        for (String nama : namaPengunjung) {
            System.out.println("- " + nama);
            
        }    
    }
    public static void main(String[] args) {
        daftarPengunjung("Ali", "Budi", "Citra");
        daftarPengunjung("Andi");
        daftarPengunjung("Doni", "Eti", "Fahmi", "Galih");
        daftarPengunjung();
    }
}