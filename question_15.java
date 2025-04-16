import java.util.*;
public class question_15 {
    

static class Node {
    int val, row, col;
    Node(int v, int r, int c) {
        val = v; row = r; col = c;
    }
}

    public static int kthSmallest(int[][] matrix, int k) {
        PriorityQueue<Node> pq = new PriorityQueue<>(Comparator.comparingInt(a -> a.val));
        int n = matrix.length;

        for (int i = 0; i < n; i++) {
            pq.offer(new Node(matrix[i][0], i, 0));
        }

        for (int i = 1; i < k; i++) {
            Node node = pq.poll();
            if (node.col + 1 < n) {
                pq.offer(new Node(matrix[node.row][node.col + 1], node.row, node.col + 1));
            }
        }

        return pq.poll().val;
    }

    public static void main(String[] args) {
        int[][] matrix = {
            {1, 5, 9},
            {10, 11, 13},
            {12, 13, 15}
        };
        System.out.println("K-th Smallest: " + kthSmallest(matrix, 8)); // Output: 13
    }
}

