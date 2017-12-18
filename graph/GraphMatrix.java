package graph;

import java.util.LinkedList;
import java.util.Queue;

public class GraphMatrix {
	private int[][]  graph;
	private boolean[] visited;  
	private int size;
	
	public GraphMatrix(int[][] graph) {
		this.graph = graph;
		size = graph.length;
		visited = new boolean[size];
	}
	
	/**
	 * 关于matrix的深度优先搜索     (递归)
	 * @param k 从节点k开始
	 */
	public  void DFSM(int k) {
		System.out.print(" " + k);
		visited[k] = true;
		for (int i = 0; i < size; i++) {
			if (graph[k][i] == 1 && !visited[i]) {
				DFSM(i);
			}
		}
	}
	
	/**
	 * 关于matrix的广度优先搜索     (队列)
	 * @param k 从节点k开始
	 */
    public  void BFSM(int k) {
		Queue<Integer> queue = new LinkedList<>();
		System.out.print("广度优先：" + k);
		visited[k] = true;
		queue.offer(k);   
	  
	    while (!queue.isEmpty() ) {
	    	int temp = queue.poll();
	    	for (int i = 0; i < size; i++) {
				if (graph[temp][i] == 1 && !visited[i]) {
					System.out.print(" " + i);
					visited[i] = true;
					queue.offer(i);
				}
			}
	    }
		
	}
}
