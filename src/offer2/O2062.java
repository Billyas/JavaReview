package offer2;

public class O2062 {
    static class Trie {
        // 记录前缀树的根节点
        TreeNode root;
        class TreeNode{
            TreeNode[] next;
            boolean isEnd;
            public TreeNode (){
                next = new TreeNode[26];
            }
        }

        /** Initialize your data structure here. */
        public Trie() {
            root = new TreeNode();
        }

        /** Inserts a word into the trie. */
        public void insert(String word) {
            TreeNode curr = root;
            for(char ch : word.toCharArray()){
                if(curr.next[ch-'a']==null){
                    curr.next[ch-'a'] = new TreeNode();
                }
                curr = curr.next[ch-'a'];
            }
            curr.isEnd = true;
        }

        /** Returns if the word is in the trie. */
        public boolean search(String word) {
            TreeNode cur = root;
            for(char ch : word.toCharArray()){
                // 如果对应节点为空，则表明不存在这个单词，返回false
                if(cur.next[ch - 'a'] == null)
                    return false;
                cur = cur.next[ch - 'a'];
            }
            // 检查最后一个字符是否是结尾
            return cur.isEnd;

        }

        /** Returns if there is any word in the trie that starts with the given prefix. */
        public boolean startsWith(String prefix) {
            TreeNode cur = root;
            for(char ch : prefix.toCharArray()){
                if(cur.next[ch - 'a'] == null)
                    return false;
                cur = cur.next[ch - 'a'];
            }
            return true;

        }
    }

    public static void main(String[] args) {
        Trie trie = new Trie();
        trie.insert("apple");
        System.out.println(trie.search("apple"));   // 返回 True
        System.out.println(trie.search("app"));     // 返回 False
        System.out.println(trie.startsWith("app")); // 返回 True
        trie.insert("app");
        System.out.println(trie.search("app"));     // 返回 True


    }
}
