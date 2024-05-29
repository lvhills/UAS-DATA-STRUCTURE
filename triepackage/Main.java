package triepackage;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Trie trie = new Trie();
        trie.insert("1234567890", "John Doe", "New York", "1990-01-01");

        Scanner scanner = new Scanner(System.in);
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
    }
}
