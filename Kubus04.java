import java.util.Scanner;

public class Kubus04 {
    static int hitungVolumeKubus(int sisi) {
        return sisi * sisi * sisi;
    }
   
    static int hitungLuasPermukaanKubus(int sisi) {
        return 6 * sisi * sisi;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan panjang sisi kubus: ");
        int s = input.nextInt();
        int volume = hitungVolumeKubus(s);
        int luasPermukaan = hitungLuasPermukaanKubus(s);
        System.out.println("Volume kubus adalah: " + volume);
        System.out.println("Luas permukaan kubus adalah: " + luasPermukaan);

        input.close();
    }
}

    

