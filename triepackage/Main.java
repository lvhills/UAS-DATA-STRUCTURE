package triepackage;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Trie trie = new Trie();

        // Panggil Data untuk memuat data ke dalam Trie
        Data.DataPenduduk(trie);

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Pilih opsi:");
            System.out.println("1. Insert data");
            System.out.println("2. Search data");
            System.out.println("3. Delete data");
            System.out.println("4. Display all data");
            System.out.println("5. Exit");
            int choice = scanner.nextInt();
            scanner.nextLine();  // consume newline

            switch (choice) {
                case 1:
                    System.out.println("Masukkan Nama:");
                    String nama = scanner.nextLine();
                    System.out.println("Masukkan Tempat Lahir:");
                    String tempatLahir = scanner.nextLine();
                    System.out.println("Masukkan Tanggal Lahir (YYYY-MM-DD):");
                    String tanggalLahir = scanner.nextLine();
                    System.out.println("Asal Provinsi:");
                    String asalProvinsi = scanner.nextLine();

                    String NIK = trie.generateNIK(asalProvinsi);
                    if (NIK == null) {
                        System.out.println("Provinsi Tidak Ada / Tidak Tersedia");
                    } else {
                        trie.insert(NIK, nama, tempatLahir, tanggalLahir);
                        System.out.println("Data telah berhasil didaftarkan. NIK anda yaitu " + NIK);
                    }
                    break;
                case 2:
                    System.out.print("Masukkan NIK yang akan dicari: ");
                    String nikToSearch = scanner.nextLine();
                    String[] result = trie.search(nikToSearch);
                    if (result != null) {
                        System.out.println("Data ditemukan:");
                        System.out.println("Nama: " + result[0]);
                        System.out.println("Tempat Tanggal Lahir: " + result[1]);
                    } else {
                        System.out.println("Data tidak ditemukan untuk NIK " + nikToSearch);
                    }
                    break;
                case 3:
                    System.out.print("Masukkan NIK yang akan dihapus: ");
                    String nikToDelete = scanner.nextLine();
                    String[] deletedData = trie.delete(nikToDelete);
                    if (deletedData != null) {
                        System.out.println("Data dengan NIK: " + deletedData[0]);
                        System.out.println("Nama: " + deletedData[1]);
                        System.out.println("Tempat Tanggal Lahir: " + deletedData[2]);
                        System.out.println("Berhasil dihapus.");
                    } else {
                        System.out.println("Data tidak ditemukan atau gagal dihapus.");
                    }
                    break;
                case 4:
                    trie.displayAllData();
                    break;
                case 5:
                    System.out.println("Keluar dari program.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        }
    }
}
