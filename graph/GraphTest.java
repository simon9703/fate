package graph;

public class GraphTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[][] matrix = {{0, 1, 1, 0, 0},    //graph  0
        		         {1, 0, 0, 1, 0},    //     1    2
        		         {1, 0, 0, 0, 1},    //     3
        		         {0, 1, 0, 0, 1},    //        4
        		         {0, 0, 1, 1, 0}};
        GraphMatrix graph = new GraphMatrix(matrix);
        GraphMatrix graph2 = new GraphMatrix(matrix);
        graph.BFSM(0);
        System.out.println();
        graph2.DFSM(0);
        System.out.println();
        
        VNode v1 = new VNode('a');   //graph  a
        ENode e1 = new ENode(1);     //     b    c
        ENode e2 = new ENode(2);     //     d
        v1.firstEdge = e1;           //        3
        e1.nextEdge = e2;
        
        VNode v2 = new VNode('b');
        ENode e3= new ENode(3);
        v2.firstEdge = e3;
        
        VNode v3 = new VNode('c');
        ENode e4 = new ENode(4);
        v3.firstEdge = e4;
        
        VNode v4 = new VNode('d');
        ENode e5 = new ENode(4);
        v4.firstEdge = e5;
        
        VNode v5 = new VNode('e');
        VNode[] vNodes = {v1, v2, v3, v4, v5};
        GraphList g1 = new GraphList(vNodes);
        GraphList g2 = new GraphList(vNodes);
        g2.BFS(0);
        System.out.println();
        g1.DFS(0);
	}

}
