package algorithms;

import structurs.GraphNode;

import java.util.Stack;

/**
 * Depth-first search algorithm
 * Contains two versions: recursive and with stack
 */
public class DFS {

    /**
     * The value of the desired node
     */
    private static Object el;

    /**
     * @param startNode the node that starts the search
     * @param el the value of the desired node
     * @param type type of searching: true if recursive
     * @return return true if way from startNode to node with el value exists
     */
    public static boolean wayExists(GraphNode startNode, Object el, boolean type) {
        DFS.el = el;
        if (type)
            return recursiveSearch(startNode);
        return nonRecursiveSearch(startNode);
    }

    private static boolean recursiveSearch(GraphNode node) {
        GraphNode curNode;
        boolean flag;
        node.setStatus(2);
        for (GraphNode.Edge curEdge: node.getEdges()) {
            curNode = curEdge.getNode();
            if (curNode.getStatus() != 0)
                continue;
            if (curNode.getName() == el) {
                return true;
            }
            flag = recursiveSearch(curNode);
            if (flag)
                return true;

        }
        return false;
    }

    private static boolean nonRecursiveSearch(GraphNode startNode) {
        GraphNode curNode;
        Stack<GraphNode> stack = new Stack<>();
        stack.push(startNode);
        while (!stack.empty()) {
            curNode = stack.pop();
            if (curNode.getName() == el)
                return true;
            if (curNode.getStatus() == 0) {
                curNode.setStatus(2);
                for (GraphNode.Edge edge: curNode.getEdges()) {
                    if (edge.getNode().getStatus() == 0)
                        stack.push(edge.getNode());
                }
            }
        }
        return false;
    }

}
