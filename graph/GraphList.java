package graph;

import java.util.LinkedList;
import java.util.Queue;

public class GraphList {
	private VNode[] vNodes;  
	private boolean[] visited;
	private int size;
	
	public GraphList(VNode[] vNodes) {
	    this.vNodes = vNodes;
	    size = vNodes.length;
	    visited = new boolean[size];
	}
	
	
	public void DFS(int k) {
		System.out.print(" " + vNodes[k].data);
		visited[k] = true;
		
		ENode node = vNodes[k].firstEdge;
		while(node != null) {
			if (!visited[node.ivex]) {
				DFS(node.ivex);
			}
			node = node.nextEdge;
		}
	}
	
	public void BFS(int k) {
		Queue<Integer> queue = new LinkedList<>();
		System.out.print("广度优先：" + vNodes[k].data);
		visited[k] = true;
		queue.offer(k);
		
		while (!queue.isEmpty()) {
			int i = queue.poll();
			ENode node = vNodes[i].firstEdge;
			while (node != null) {
				if (!visited[node.ivex]) {
					System.out.print(" " + vNodes[node.ivex].data);
					visited[node.ivex] = true;
					queue.offer(node.ivex);
				}
				node = node.nextEdge;
			}
		}
	}
}
