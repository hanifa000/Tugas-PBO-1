import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Tentukan Bangku untuk mereka:)");
        String[] mahasiswa = {"Dhandy", "Ezy", "Atiya", "Hanny", "Putra", "Surya"};

        for (int i = 0; i < mahasiswa.length; i++) {
            System.out.println(mahasiswa[i]);
        }

        // Membuat Array dan Scanner
        String[][] meja = new String[2][3];
        Scanner scan = new Scanner(System.in);

        //mengisi setiap meja
        for (int bar = 0; bar < meja.length; bar++) {
            for (int kol = 0; kol < meja[bar].length; kol++) {
                System.out.format("Siapa yang akan duduk di meja (%d,%d): ", bar, kol);
                meja[bar][kol] = scan.nextLine();
            }
        }

        // menampilkan isi Array
        System.out.println("------------------------------");
        for (int bar = 0; bar < meja.length; bar++) {
            for (int kol = 0; kol < meja[bar].length; kol++) {
                System.out.format("| %s | \t", meja[bar][kol]);
            }
            System.out.println("");
        }
        System.out.println("------------------------------");

        Scanner input = new Scanner(System.in);
        System.out.println("Isi nilai salah satu siswa");
        System.out.print("Masukkan Nama : ");
        String name = input.nextLine();

        if(!name.equals("")){
            System.out.println("Nama : "+name);
        }

        char nilai;
        Scanner inp = new Scanner(System.in);
        System.out.print("Input Nilai " +name );
        System.out.print(" (A - E): ");
        nilai = inp.next().charAt(0);
        if (nilai == 'A' ) {
            System.out.println("Pertahankan!");
        }
        else if (nilai == 'B' ) {
            System.out.println("Harus lebih baik lagi");
        }
        else if (nilai == 'C' ) {
            System.out.println("Perbanyak belajar");
        }
        else if (nilai == 'D' ) {
            System.out.println("Jangan keseringan main");
        }
        else if (nilai == 'E' ) {
            System.out.println("Kebanyakan bolos...");
        }
        else {
            System.out.println("Maaf, format nilai tidak sesuai");
        }

        // membuat variabel dan scanner
        boolean running = true;
        int counter = 0;
        String jawab;
        Scanner scn = new Scanner(System.in);

        while( running ) {
            System.out.println("Apakah anda ingin keluar?");
            System.out.print("Jawab [ya/tidak]> ");

            jawab = scn.nextLine();

            // cek jawabnnya, kalau ya maka berhenti mengulang
            if( jawab.equalsIgnoreCase("ya") ){
                running = false;
            }

            counter++;
        }

        System.out.println("Anda sudah melakukan perulangan sebanyak " + counter + " kali");

    }
}
