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
            provinceCount.put(kodeProvinsi, 45); // Starting from 45
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
        String kodeProvinsi = Data.KodeProvinsi.getOrDefault(asalProvinsi, null);
        if (kodeProvinsi == null) {
            return null;
        }
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

    public String[] delete(String NIK) {
        return delete(root, NIK, 0);
    }

    private String[] delete(TrieNode node, String NIK, int depth) {
        if (depth == NIK.length()) {
            if (!node.isEndOfWord) {
                return null;
            }
            String[] deletedData = {node.NIK, node.nama, node.TTL};
            node.isEndOfWord = false;
            if (node.children.isEmpty()) {
                return deletedData;
            } else {
                return null;
            }
        }
        char ch = NIK.charAt(depth);
        TrieNode child = node.children.get(ch);
        if (child == null) {
            return null;
        }
        String[] deletedData = delete(child, NIK, depth + 1);
        if (deletedData != null && child.children.isEmpty() && !child.isEndOfWord) {
            node.children.remove(ch);
        }
        return deletedData;
    }

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
