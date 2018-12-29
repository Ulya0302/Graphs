package algoritms;

import structurs.GraphNode;

public class DFS {

    private static Object el;

    public static GraphNode recursiveFinder(GraphNode graph, Object el) {
        DFS.el = el;
        GraphNode temp;
        temp = recursiveHelper(graph);
        if (temp != null)
                return temp;
        return null;
    }

    private static GraphNode recursiveHelper(GraphNode node) {
//        System.out.println(node.getValue()+ " р " + node.getStatus());
        GraphNode temp;
        node.setStatus(2);
        for (GraphNode curNode: node.getEdges()) {
//            System.out.println(node.getValue()+ " " + curNode.getValue()+ " ц " + curNode.getStatus());
            if (curNode.getValue() == el)
                return curNode;
            if (curNode.getStatus() == 0) {
                temp = recursiveHelper(curNode);
                if (temp != null)
                    return temp;
            }
        }
        return null;
    }
}
