package main;

import structurs.UndirectedGraph;

public class GraphTest {
    public static void main(String[] args) throws Exception {
        UndirectedGraph undirectedGraph = new UndirectedGraph("1", "2", "3", "4", "5", "6", "7", "8", "9");
        undirectedGraph.addEdges("1", "2", "9");
        undirectedGraph.addEdges("2", "3", "4", "6");
        undirectedGraph.addEdges("3", "4");
        undirectedGraph.addEdges("4", "5");
        undirectedGraph.addEdges("6", "7", "8");
        undirectedGraph.wayExists("1", "90", true);
        undirectedGraph.wayExists("1", "90", false);
        boolean flag = undirectedGraph.wayExists("1", "90");
        if (flag)
            System.out.println("Way exists");
        else
            System.out.println("No way");
//        undirectedGraph.addEdge("1", "2", 100);

    }
}
