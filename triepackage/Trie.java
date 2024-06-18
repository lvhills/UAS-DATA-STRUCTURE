package triepackage;


import java.util.HashMap;
import java.util.Map;

public class Trie {
    private TrieNode root;
    private Map<String, Integer> provinceCount;

    public Trie() {
        root = new TrieNode();
        provinceCount = new HashMap<>();
        initializeProvinceCounts();
    }

    private void initializeProvinceCounts() {
        for (String kodeProvinsi : Data.KodeProvinsi.values()) {
            provinceCount.put(kodeProvinsi, 45); // Starting from 45, so the next will be 46
        }
    }

    public void insert(String NIK, String nama, String tempatLahir, String tanggalLahir) {
        String TTL = tempatLahir + ", " + tanggalLahir;
        TrieNode node = root;
        for (int i = 0; i < NIK.length(); i++) {
            char ch = NIK.charAt(i);
            node.children.putIfAbsent(ch, new TrieNode());
            node = node.children.get(ch);
        }
        node.isEndOfWord = true;
        node.NIK = NIK;
        node.nama = nama;
        node.TTL = TTL;
    }

    public String generateNIK(String asalProvinsi) {
        String kodeProvinsi = Data.KodeProvinsi.getOrDefault(asalProvinsi, "00");
        int count = provinceCount.getOrDefault(kodeProvinsi, 45) + 1;
        provinceCount.put(kodeProvinsi, count);
        return String.format("%s%06d", kodeProvinsi, count);
    }

    public String[] search(String NIK) {
        TrieNode node = root;
        for (int i = 0; i < NIK.length(); i++) {
            char ch = NIK.charAt(i);
            if (!node.children.containsKey(ch)) {
                return null;
            }
            node = node.children.get(ch);
        }
        if (node != null && node.isEndOfWord) {
            return new String[]{node.nama, node.TTL};
        }
        return null;
    }

    public void delete(String NIK) {
        delete(root, NIK, 0);
    }

    private boolean delete(TrieNode node, String NIK, int depth) {
        if (depth == NIK.length()) {
            if (!node.isEndOfWord) {
                return false;
            }
            node.isEndOfWord = false;
            return node.children.isEmpty();
        }
        char ch = NIK.charAt(depth);
        TrieNode child = node.children.get(ch);
        if (child == null) {
            return false;
        }
        boolean shouldDeleteCurrentNode = delete(child, NIK, depth + 1);

        if (shouldDeleteCurrentNode) {
            node.children.remove(ch);
            return node.children.isEmpty();
        }
        return false;
    }

    // New method to get all data
    public void displayAllData() {
        displayAllData(root);
    }

    private void displayAllData(TrieNode node) {
        if (node == null) {
            return;
        }
        if (node.isEndOfWord) {
            System.out.println("NIK: " + node.NIK);
            System.out.println("Nama: " + node.nama);
            System.out.println("Tempat Tanggal Lahir: " + node.TTL);
            System.out.println();
        }
        for (TrieNode child : node.children.values()) {
            displayAllData(child);
        }
    }
}
