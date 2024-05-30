package triepackage;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Trie trie = new Trie();
        //Aceh
        trie.insert("11000001", "Rahmatullah Pratama", "Banda Aceh", "1990-01-10");
        trie.insert("11000002", "Siti Nurlela", "Sabang", "1985-05-05");
        trie.insert("11000003", "Budi Santoso", "Lhokseumawe", "1993-07-15");
        trie.insert("11000004", "Putri Wulandari", "Langsa", "1988-03-20");
        trie.insert("11000005", "Andi Setiawan", "Meulaboh", "1997-10-12");
        trie.insert("11000006", "Dewi Susanti", "Sigli", "1992-02-08");
        trie.insert("11000007", "Rizky Ramadhan", "Takengon", "1980-12-18");
        trie.insert("11000008", "Dian Anggraini", "Bireuen", "1995-08-21");
        trie.insert("11000009", "Fajar Nugroho", "Kutacane", "1984-04-03");
        trie.insert("11000010", "Maya Sari", "Tapaktuan", "1998-11-27");
        trie.insert("11000011", "Agus Suprianto", "Calang", "1983-06-09");
        trie.insert("11000012", "Fitriani Septiani", "Idi Rayeuk", "1991-09-14");
        trie.insert("11000013", "Joko Santoso", "Singkil", "1986-07-07");
        trie.insert("11000014", "Intan Permata", "Blangpidie", "1994-05-23");
        trie.insert("11000015", "Eko Prasetyo", "Lhoksukon", "1982-08-30");
        

        
        System.out.println("Contoh NIK: 11000018");
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
