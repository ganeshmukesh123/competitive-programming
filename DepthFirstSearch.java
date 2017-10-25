import java.util.LinkedList;


class Graph{
    int V;
    LinkedList <Integer> adjList[];
    private final boolean directed;
    Graph(int V,boolean directed){
        this.V=V;
        this.directed=directed;
        adjList=new LinkedList[V];
        for(int i=0;i<V;i++){
            adjList[i]=new LinkedList();
        }
    }

    void addEdge(int u,int v){
        if(!adjList[u].contains(v)) {
            adjList[u].addFirst(v);
        }
        if(!directed) {
            if (!adjList[v].contains(u)) {
                adjList[v].addFirst(u);
            }
        }
    }

    void DFS(){
        boolean visited[] = new boolean[V];
        for(int i=0;i<V;i++){
            if(visited[i]==false){
                System.out.print(i+" ");
                DFS_VISIT(i,visited);
            }
        }
    }

    void DFS_VISIT(int u,boolean visited[]){
        visited[u]=true;
        for(Integer v:adjList[u]){
            if(visited[v]==false){
                System.out.print(v+"  ");
                DFS_VISIT(v,visited);
            }
        }
    }

    void printGraph(){
        for (int i=0;i<V;i++){

            System.out.println("Adjacency List for vertex "+i);
            System.out.print("head");

            for(int j=0;j<adjList[i].size();j++){
                System.out.print("--> "+adjList[i].get(j));
            }
            System.out.println();
        }
    }
}
public class DepthFirstSearch {
    public static void main(String args[]){
        Graph gp =new Graph(5,true);
        gp.addEdge(0,1);
        gp.addEdge(0,2);
        gp.addEdge(1,2);
        gp.addEdge(2,0);
        gp.addEdge(2,3);
        gp.addEdge(3,3);

        System.out.println("---------------------------------");
        System.out.println("Edges of graph\n");
        gp.printGraph();

        System.out.println("---------------------------------");
        System.out.println("Depth first search \n");
        gp.DFS();

    }
}
