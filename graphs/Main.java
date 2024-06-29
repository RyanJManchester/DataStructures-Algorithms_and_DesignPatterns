public class Main {
    
    public static void main(String[] args){
        System.out.println("\nGraph!\n");

        Graph graph = new Graph();

        graph.addNode("a");
        graph.addNode("b");
        graph.addNode("c");

        graph.addEdge("a", "b");
        graph.addEdge("a", "c");

        graph.removeEdge("a", "b");


        graph.removeNode("c");

        graph.print();

    }
}
