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
        undirectedGraph.findWay("1", "9");
    }
}
