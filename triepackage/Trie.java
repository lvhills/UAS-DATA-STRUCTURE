package triepackage;

public class Trie {
    private TrieNode root;

    public Trie() {
        root = new TrieNode();
    }

    public void insert(String NIK, String nama, String birthPlace, String birthDate) {
        String TTL = birthPlace + ", " + birthDate;
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
}
