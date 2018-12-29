package structurs;

import algoritms.DFS;

import java.util.ArrayList;
import java.util.Arrays;

public abstract class Graph {

    protected ArrayList<GraphNode> nodes = new ArrayList<>();

    public Graph(GraphNode ... nodes) {
        this.nodes.addAll(Arrays.asList(nodes));
    }

    public Graph(Object ... values) {
        for (Object el: values) {
            nodes.add(new GraphNode(el));
        }
    }

    public GraphNode getNodeByVal(Object val) {
        for (GraphNode el : nodes) {
            if (el.getValue().equals(val)) {
                return el;
            }
        }
        return null;
    }

    public void findWay(Object valFrom, Object valTo) {
        GraphNode temp = DFS.recursiveFinder(getNodeByVal(valFrom), valTo);
        if (temp != null){
            System.out.println(temp.getValue());
        }
        else
            System.out.println("No way");

    }

}
