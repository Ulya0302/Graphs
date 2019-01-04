package structurs;

import java.util.ArrayList;

public class GraphNode {
    //0 - white
    //1 -gray
    //2 - black
    private int status;
    private Object name;
    private ArrayList<Edge> edges = new ArrayList<>();

    public GraphNode(Object val) {
        this.status = 0;
        this.name = val;
    }

    public void addEdge(GraphNode node, int val) {
        edges.add(new Edge(node, val));
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int code) {
        this.status = code;
    }

    public Object getName() {
        return name;
    }

    public void setName(Object value) {
        this.name = value;
    }

    public ArrayList<Edge> getEdges() {
        return edges;
    }

    //    private ArrayList<GraphNodeValue> edges = new ArrayList<>();

    public class Edge {
        private GraphNode  node;
        private int val;
        Edge(GraphNode node, int val) {
            this.node = node;
            this.val = val;
        }

        public GraphNode getNode() {return node;}

        public int getVal() {return val; }
    }
}




