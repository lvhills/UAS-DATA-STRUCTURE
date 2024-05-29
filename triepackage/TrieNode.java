package triepackage;

import java.util.HashMap;

public class TrieNode {
    HashMap<Character, TrieNode> children;
    boolean isEndOfWord;
    String NIK;
    String nama;
    String TTL;

    public TrieNode() {
        children = new HashMap<>();
        isEndOfWord = false;
        NIK = "";
        nama = "";
        TTL = "";
    }
}
