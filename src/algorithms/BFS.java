package algorithms;

import structurs.GraphNode;

import java.util.ArrayDeque;


/**
 * Breadth-first search algorithm
 */
public class BFS {

    /**
     *
     * @param startNode the node that starts the search
     * @param el the value of the desired node
     * @return return true if way from startNode to node with el value exists
     */
    public static boolean findWay(GraphNode startNode, Object el) {
        GraphNode curNode;
        ArrayDeque<GraphNode> deque = new ArrayDeque<>();
        deque.add(startNode);
        while (!deque.isEmpty()) {
            curNode = deque.pop();
            curNode.setStatus(2);
            if (curNode.getName() == el)
                return true;
            for (GraphNode.Edge edge: curNode.getEdges()) {
                if (edge.getNode().getStatus() == 0 && !deque.contains(edge.getNode())){
                    deque.add(edge.getNode());
                }
            }
        }
        return false;
    }
}
