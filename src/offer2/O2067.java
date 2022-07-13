package offer2;

public class O2067 {
    class TrieNode{
        TrieNode[] next;
        public TrieNode(){
            next = new TrieNode[2];
        }
    }

    private TrieNode trie;

    public int findMaximumXOR(int[] nums) {
        // 记录异或最大值
        int maxXOR = Integer.MIN_VALUE;
        // 构建前缀树：将所有数都插入前缀树中。
        buildTrie(nums);
        // 查询每个数异或的最大值
        for(int num : nums){
            maxXOR = Math.max(maxXOR, searchMaxXOR(num));
        }
        // 返回最终异或的最大值
        return maxXOR;

    }

    public void buildTrie(int [] nums){
        trie = new TrieNode();
        for(int num:nums){
            TrieNode curr = trie;
            for (int i = 30; i>=0; i--){
                int d = num>>i &1;
                if(curr.next[d] == null){
                    curr.next[d] = new TrieNode();
                }
                curr = curr.next[d];
            }

        }
    }

    private int searchMaxXOR(int num){
        TrieNode cur = trie;
        // 与 num 异或值最大的数
        int xorNum = 0;

        for(int i = 30; i >= 0; i--){
            // d : num 当前"二进制位"
            int d = num >> i & 1;
            // 获取 与 d 相反的二进制位，由于 d 不是 0 就是 1
            // 当 d = 0, (d-1) * -1 = 1 ; 当 d = 1, (d - 1) * -1 = 0;
            int theOther = (d - 1) * -1;
            // 由于异或要最大，则尽量走与 num 当前二进制位 d 相反的一位，
            // 如果相反的一位为空，则只好走相同的一位了。
            if(cur.next[theOther] == null){
                cur = cur.next[d];
                xorNum = xorNum * 2 + d; // 记录走的路径，走的路径就是最后与 num 异或最大的数
            }else{
                cur = cur.next[theOther];
                xorNum = xorNum * 2 +theOther;
            }
        }
        // 返回 num 异或的最大值
        return num ^ xorNum;
    }

}
