package structurs;

public class DirectedGraph extends AbstractGraph {

    public DirectedGraph(Object ... values) {
        super(values);
    }

    public DirectedGraph(GraphNode... nodes) {
        super(nodes);
    }

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
                mainNode.addEdge(otherNode, 0);
            }
        }
    }

}
