package ch6;

import java.util.*;

public class BFS {
    private int V; // 전 노드의 개수
    private LinkedList<Integer> adj[]; // 인접 리스트

    /** 생성자 */
    BFS(int v) {
        V = v;
        adj = new LinkedList[v]; // 그래프 생성을 위해 인접 리스트를 만들기 위하여 LinkedList 추
        for (int i=0; i<v; ++i) // 인접 리스트 초기화
            adj[i] = new LinkedList();
    }

    void addEdge(int v, int w) { adj[v].add(w); } // 노드를 잇

    void search(int s) {
        // 노드의 방문 여부 판단을 위한 bool 배열을 추가한
        boolean visited[] = new boolean[V];
        // BFS 구현을 위한 큐 생성(자바의 특성상 LinkedList로 대체)
        LinkedList<Integer> queue = new LinkedList<Integer>();

        // 현재 노드를 방문한 것으로 표시하고 큐에 삽입(enqueue)
        visited[s] = true;
        queue.add(s);

        // 큐(Queue)가 빌 때까지 반복
        while (queue.size() != 0) {
            // 방문한 노드를 큐에서 추출(dequeue)하고 값을 출력
            s = queue.poll();
            System.out.print(s + " ");

            // 방문한 노드와 인접한 모든 노드를 가져온다.
            Iterator<Integer> i = adj[s].listIterator();
            while (i.hasNext()) { // Iterator를 이용하여 순차적으로 검사한다.
                int n = i.next();
                // 방문하지 않은 노드면 방문한 것으로 표시하고 큐에 삽입(enqueue)
                if (!visited[n]) {
                    visited[n] = true;
                    queue.add(n);
                }
            }
        }
    }
    public static void main(String args[]) {
        BFS b = new BFS(4);

        b.addEdge(0, 1);
        b.addEdge(0, 2);
        b.addEdge(1, 2);
        b.addEdge(2, 0);
        b.addEdge(2, 3);
        b.addEdge(3, 3);

        b.search(1); // 1을 루트 노드로 하여 탐색한
    }
}


