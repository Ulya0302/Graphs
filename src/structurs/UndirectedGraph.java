package structurs;

public class UndirectedGraph extends AbstractGraph {

    public UndirectedGraph(Object ... values) {
        super(values);
    }

    public UndirectedGraph(GraphNode... nodes) {
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
                otherNode.addEdge(mainNode, 0);


//                mainNode.getEdgesPairs().put(otherNode, 0);
//                otherNode.getEdgesPairs().put(mainNode, 0);
            }
        }
    }

}
