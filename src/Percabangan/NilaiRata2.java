// Mengimpor kelas
import javax.swing.JOptionPane;
import java.text.DecimalFormat;

//Deklarasi kelas NilaiRata2
public class NilaiRata2 {

    public static void main(String[] args) {

        // Deklarasi veriabel
        int jumlahPelajaran, perulangan;
        String strJumlahPelajaran, strNilai;
        double nilai, jumlah, rata2;

        // Memberi nilai awal ke variabel
        perulangan = 1;
        jumlah = 0;

        // Input jumlah siswa
        strJumlahPelajaran = JOptionPane.showInputDialog(null, "Masukkan jumlah pelajaran!",
                "Jumlah Pelajaran", JOptionPane.QUESTION_MESSAGE);

        // konversi ke integer
        jumlahPelajaran = Integer.parseInt(strJumlahPelajaran);

        if (jumlahPelajaran < 1)
            System.exit(0);

        // Input nilai siswa
        while (perulangan <= jumlahPelajaran) {

            // Input nilai siswa
            strNilai = JOptionPane.showInputDialog(null, "Masukkan nilai pelajaran ke " +
                    perulangan, "Nilai Pelajaran", JOptionPane.QUESTION_MESSAGE);

            // Konversi ke Integer
            nilai = Double.parseDouble(strNilai);

            jumlah = jumlah + nilai;
            perulangan = perulangan + 1;

        } // Akhir pernyataan while

        // Membuat obyek untuk memformat angka
        DecimalFormat duaAngka = new DecimalFormat("0.00");

        rata2 = jumlah / jumlahPelajaran;

        JOptionPane.showMessageDialog(null, "Jumlah pelajaran : " + jumlahPelajaran +
                "\nTotal nilai pelajaran : " + duaAngka.format(jumlah) + "\nNilai rata-rata : " +
                duaAngka.format(rata2), "Nilai Rata-Rata Siswa", JOptionPane.INFORMATION_MESSAGE);

        // Mengakhiri program GUI
        System.exit(0);

    } // Akhir metoda main
} // Akhir kelas NilaiRata2