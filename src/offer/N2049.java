package offer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class N2049 {
    private int ans, n;
    private long maxScore;
    private Map<Integer, List<Integer>> graph;
    public int countHighestScoreNodes(int[] parents) {
        maxScore = ans = 0;
        n = parents.length;
        graph = new HashMap<>();
        for(int i = 1; i < n; i++) {
            List<Integer> list = graph.getOrDefault(parents[i], new ArrayList<>());
            list.add(i);
            graph.put(parents[i], list);
        }
        dfs(0);
        return ans;
    }

    private int dfs(int node) {
        int left, right;
        if(graph.containsKey(node)) {
            List<Integer> list = graph.get(node);
            left = dfs(list.get(0));
            right = list.size() > 1 ? dfs(list.get(1)) : 0;
        } else {
            left = right = 0;
        }
        long score = (long)Math.max(1, left) * (long)Math.max(1, right) * (long)Math.max(1, n - 1 - left - right);
        if(score > maxScore) {
            maxScore = score;
            ans = 1;
        } else if(score == maxScore)
            ans++;
        return left + right + 1;
    }
    public static void main(String[] args) {
        int[]parent = {-1,2,0,2,0};
        N2049 n = new N2049();
        n.countHighestScoreNodes(parent);
    }
}
