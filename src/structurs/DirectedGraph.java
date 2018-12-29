package structurs;

public class DirectedGraph extends Graph{

    public DirectedGraph(Object ... values) {
        super(values);
    }

    public DirectedGraph(GraphNode ... nodes) {
        super(nodes);
    }

    public void addEdges(Object mainValue, Object ... values) throws Exception {
        GraphNode mainNode = getNodeByVal(mainValue);
        GraphNode temp;
        if (mainNode == null)
            throw new Exception("No nodes with value " + mainValue.toString());
        for (Object el: values) {
            temp = getNodeByVal(el);
            if (temp == null)
                System.out.println("No node with value" + el.toString());
            else {
                mainNode.getEdges().add(temp);
            }
        }
    }
}
