package structurs;

import java.util.ArrayList;
import java.util.Arrays;

public class GraphNode {
    private ArrayList<GraphNode> edges = new ArrayList<GraphNode>() {
    };
    //0 - white
    //1 - gray
    //2 - black
    private int status;
    private Object value;

    public GraphNode(Object val) {
        this.status = 0;
        this.value = val;
    }

    public void addEdges(GraphNode ... arr) {
        edges.addAll(Arrays.asList(arr));
    }

    public ArrayList<GraphNode> getEdges() {
        return edges;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int code) {
        this.status = code;
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }
}
