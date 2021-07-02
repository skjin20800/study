package Graph;

import java.util.ArrayList;
import java.util.Arrays;

public class Graph {
    private  boolean[] visited ; //방문 여부 배열
    private ArrayList<ArrayList<Integer>> graph = new ArrayList<ArrayList<Integer>>(); // 그래프, 2차원 ArrayList

    public boolean[] getVisited() {
        return visited;
    }

    public void setVisited(boolean[] visited) {
        this.visited = visited;
    }

    public ArrayList<ArrayList<Integer>> getGraph() {
        return graph;
    }

    public void setGraph(ArrayList<ArrayList<Integer>> graph) {
        this.graph = graph;
    }

    @Override
    public String toString() {
        return "Graph{" +
                "visited=" + Arrays.toString(visited) +
                ", graph=" + graph +
                '}';
    }
}
