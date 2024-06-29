import java.util.ArrayList;

public class Node {
    
    String value;
    ArrayList<Node> neighbours;

    public Node(String s){
        value = s;
        neighbours = new ArrayList<Node>();
    }

    public void addNeighbour(Node n){
        neighbours.add(n);
    }

    public void removeNeighbour(Node n){
        neighbours.remove(n);
    }

    public Node getNeighbour(String s){
        for(Node n : neighbours){
            if(n.value.equals(s)){
                return n;
            }
        }
        return null;
    }

    public ArrayList<Node> getNeighbours(){
        return neighbours;
    }

    public String toStringNeighbours(){
        String msg = "";
        for(Node n : neighbours) {
            msg += n.value + "->";
        }
        return msg;
    }
}
