package structurs;

import algorithms.BFS;
import algorithms.DFS;

import java.util.ArrayList;
import java.util.Arrays;


/**The class is an abstract graph
 * It is understood that the names of the nodes are unique.*/
public abstract class AbstractGraph {

    /**Simplifies finding nodes by name.*/
    private ArrayList<GraphNode> nodes = new ArrayList<>();


    /**
     *
     * @param nodes a set of nodes
     */
    AbstractGraph(GraphNode... nodes) {
        this.nodes.addAll(Arrays.asList(nodes));
    }

    /**
     * GraphNodes will be created automatically
     * @param values A set of node names
     */
    AbstractGraph(Object... values) {
        for (Object el: values) {
            nodes.add(new GraphNode(el));
        }
    }

    /**Find node by current value and change it on new value*/
    public void changeNodeValue(Object curVal, Object newVal) {
        getNodeByName(curVal).setName(newVal);
    }

    /**Find node by name
     * @param val name or val in node*/
    public GraphNode getNodeByName(Object val) {
        for (GraphNode el : nodes) {
            if (el.getName().equals(val)) {
                return el;
            }
        }
        return null;
    }

    /**
     * This is an depth-first search
     * @param valFrom value of start node
     * @param valTo value of searching node
     * @param recursiveSearch if param recursiveSearch is true then uses recursive DFS else with stack DFS
     * @return return true if way from valFrom to valTo exists*/
    public boolean wayExists(Object valFrom, Object valTo, boolean recursiveSearch) {
        setStartValues();
        return DFS.wayExists(getNodeByName(valFrom), valTo, recursiveSearch);

    }

    /**This is an breadth-first search
     * @param valFrom value of start node
     * @param valTo value of searching node
     * @return return true if way from valFrom to valTo exists*/
    public boolean wayExists(Object valFrom, Object valTo) {
        setStartValues();
        return BFS.findWay(getNodeByName(valFrom), valTo);
    }

    /**Set node.status = 0 for all nodes in graphs*/
    private void setStartValues() {
        for (GraphNode el : nodes)
            el.setStatus(0);
    }
}
