package structurs;

import algoritms.DFS;

import java.util.ArrayList;
import java.util.Arrays;

public abstract class AbstractGraph {

    private ArrayList<GraphNode> nodes = new ArrayList<>();

    AbstractGraph(GraphNode... nodes) {
        this.nodes.addAll(Arrays.asList(nodes));
    }

    AbstractGraph(Object... values) {
        for (Object el: values) {
            nodes.add(new GraphNode(el));
        }
    }

    public void changeNodeValue(Object curVal, Object newVal) {
        getNodeByName(curVal).setName(newVal);
    }

    GraphNode getNodeByName(Object val) {
        for (GraphNode el : nodes) {
            if (el.getName().equals(val)) {
                return el;
            }
        }
        return null;
    }

    public void findWay(Object valFrom, Object valTo) {
        setStartValues();
        boolean flag = DFS.wayExists(getNodeByName(valFrom), valTo);
        if (flag){
            System.out.println("Way exists");
        }
        else
            System.out.println("No way");
    }

    //Set node.status = 0 for all nodes in graphs
    private void setStartValues() {
        for (GraphNode el : nodes)
            el.setStatus(0);
    }
}
