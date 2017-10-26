//problem statement https://www.hackerrank.com/challenges/bfsshortreach/problem
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

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
            adjList[u].add(v);
        }
        if(!directed) {
            if (!adjList[v].contains(u)) {
                adjList[v].add(u);
            }
        }
    }

    int[] BFS(int start){
        final int WHITE = 0;
        final int GRAY = 1;
        final int BLACK = 2;
        int distance[]=new int[V];
        int color[]=new int[V];
        LinkedList<Integer> queue=new LinkedList();
        color[start]=GRAY;
        queue.add(start);
        while(!queue.isEmpty()){
            int u=queue.poll();
            for(Integer v:adjList[u]) {
                if(color[v]==WHITE && distance[v]==0){
                    //color[v]=GRAY;
                    distance[v]=distance[u]+1;
                    queue.add(v);
                }
            }
            //color[u]=BLACK;
        }
        
        return distance;
    }

}


public class BfsShortReach {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            int n = in.nextInt();
            Graph gp=new Graph(n,false);
            int m = in.nextInt();
            for(int a1 = 0; a1 < m; a1++){
                int u = in.nextInt();
                int v = in.nextInt();
                gp.addEdge(u-1,v-1);
            }
            int s = in.nextInt();
            int dist[] = gp.BFS(s-1);
            for(int i=0;i<n;i++){
                if(i!=(s-1)){
                    if(dist[i]==0){
                        System.out.print(-1+" ");
                    }
                    else{
                        System.out.print(dist[i]*6 +" ");
                    }
                }
            }
            System.out.println();
        }
        in.close();
    }
}
