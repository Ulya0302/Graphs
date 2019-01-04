package structurs;

/**
 * The distance from node one to node two is equal to the distance from node two to node one
 */
public class UndirectedGraph extends AbstractGraph {

    /**
     * GraphNodes will be created automatically
     * @param values A set of node names
     */
    public UndirectedGraph(Object ... values) {
        super(values);
    }

    /**
     *
     * @param nodes a set of nodes
     */
    public UndirectedGraph(GraphNode... nodes) {
        super(nodes);
    }

    /**
     * If no node with mainValue it throws exception,
     * If no node with another value then skip it,
     * All edges have values 1.
     * @param mainValue automatically add edges from mainValue to all in values and vice versa.
     */
    public void addEdges(Object mainValue, Object ... values) throws Exception {
        GraphNode mainNode = getNodeByName(mainValue);
        GraphNode otherNode;
        if (mainNode == null)
            throw new Exception("No nodes with value " + mainValue.toString());
        for (Object el: values) {
            otherNode = getNodeByName(el);
            if (otherNode == null)
                System.out.println("No node with value" + el.toString());
            else {
                mainNode.addEdge(otherNode, 1);
                otherNode.addEdge(mainNode, 1);
            }
        }
    }

    /**
     * Add new edge from node with valOne to node with valTwo and vice versa
     * @param val distance between nodeOne and nodeTwo (nodeTwo and nodeOne)
     * */
    public void addEdge(Object valOne, Object valTwo, int val) throws Exception {
        GraphNode nodeOne = getNodeByName(valOne);
        GraphNode nodeTwo = getNodeByName(valTwo);
        if (nodeOne == null)
            throw new Exception("No nodes with value " + valOne.toString());
        if (nodeTwo == null)
            throw new Exception("No nodes with value " + valTwo.toString());
        nodeOne.addEdge(nodeTwo, val);
        nodeTwo.addEdge(nodeOne, val);
    }
}
