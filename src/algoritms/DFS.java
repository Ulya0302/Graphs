package algoritms;

import structurs.GraphNode;

public class DFS {

    private static Object el;

    public static boolean wayExists(GraphNode startNode, Object el) {
        DFS.el = el;
        return recursiveHelper(startNode);
    }

    private static boolean recursiveHelper(GraphNode node) {
        System.out.println(node.getName()+ " р " + node.getStatus());
        GraphNode curNode;
        boolean flag;
        node.setStatus(2);
        for (GraphNode.Edge curEdge: node.getEdges()) {
            curNode = curEdge.getNode();
            System.out.println(node.getName()+ " " + curNode.getName()+ " ц " + curNode.getStatus());
            if (curNode.getName() == el) {
                return true;
            }
            if (curNode.getStatus() == 0) {
                flag = recursiveHelper(curNode);
                if (flag)
                    return flag;
            }
        }
        return false;
    }
}
