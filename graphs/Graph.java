import java.util.ArrayList;

public class Graph {
    
    ArrayList<Node> nodes;

    public Graph(){
        nodes = new ArrayList<Node>();
    }

    public void addNode(String s){
        Node n = new Node(s);

        Node isDuplicate = getNode(n.value);

        if(isDuplicate == null){
            nodes.add(n);
        }
        else{
            return;
        }

    }  

    public boolean findNode(Node n){
        for(Node node : nodes){
            if(node == n){
                return true;
            }
        }
        return false;
    }


    public Node getNode(String s){
        for(Node n : nodes){
            if(n.value.equals(s)){
                return n;
            }
        }
        return null;
    }

    public void print(){
        for(Node n : nodes){
            System.out.println(n.value + ": " + n.toStringNeighbours());
        }
    }

    public void addEdge(String s1, String s2){
        Node node1 = getNode(s1);
        Node node2 = getNode(s2);

        if(node1 != null && node2 != null){
            node1.addNeighbour(node2);
            node2.addNeighbour(node1);
        }

      
    }

    public void removeEdge(String s1, String s2){
        Node node1 = getNode(s1);
        Node node2 = getNode(s2);

        if(node1 != null && node2 != null){
            node1.removeNeighbour(node2);
            node2.removeNeighbour(node1);
        }
    }

    public void removeNode(String s){
        Node node = getNode(s);

        if(node != null){
            //loop through and remove Node a from neighbours
            for(Node n : node.getNeighbours()){
                n.removeNeighbour(node);
            }
            //remove node a
            nodes.remove(node);
        }

    }

    




}
