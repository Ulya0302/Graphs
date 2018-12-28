import java.util.ArrayList;
import java.util.List;

public class GraphTest {
    public static void main(String[] args) {
        GraphNode one = new GraphNode("1");
        GraphNode two = new GraphNode("2");
        GraphNode three = new GraphNode("3");
        GraphNode four = new GraphNode("4");
        GraphNode five = new GraphNode("5");
        GraphNode six = new GraphNode("6");
        GraphNode seven = new GraphNode("7");
        GraphNode eight = new GraphNode("8");
        GraphNode nine = new GraphNode("9");
        one.addEdges(two, nine);
        two.addEdges(one, three, four, six);
        three.addEdges(two, four);
        four.addEdges(two, three, five);
        five.addEdges(four);
        six.addEdges(two, seven, eight);
        seven.addEdges(six);
        eight.addEdges(six);
        nine.addEdges(one);
        GraphNode temp = DFS.recursiveFinder(one, "8");
        if (temp != null){
            System.out.println(temp.getValue());
        }
        else
            System.out.println("Not");

    }

}
