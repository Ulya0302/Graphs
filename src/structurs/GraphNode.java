package structurs;

import java.util.ArrayList;

public class GraphNode {
    /**The current status of node for searching:
     * 0 - white
      *2 - black*/
    private int status;

    /**name of node, for example number, name of airport or smth else*/
    private Object name;

    /**the list of edges this node*/
    private ArrayList<Edge> edges = new ArrayList<>();


    /**
     * @param val is name of graph node
     */
    public GraphNode(Object val) {
        this.status = 0;
        this.name = val;
    }


    /**
     * @param node node to add edge to
     * @param val distance from current node and param node
     */
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

    /**
     * Contains pair node and val
     */
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




