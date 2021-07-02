package Graph;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

public class Virus {


    public static  int result = 0;
    public static boolean[] visited ; //노드 갯수
    public static ArrayList<ArrayList<Integer>> graph = new ArrayList<ArrayList<Integer>>(); // 간선 갯수


    // DFS 함수 정의
    public static void dfs(int x, BufferedWriter bw) throws Exception {
        // 현재 노드를 방문 처리
        visited[x] = true;

//        bw.write(x +" ");
//        bw.flush(); //플러쉬가

        // 현재 노드와 연결된 다른 노드를 재귀적으로 방문
        for (int i = 0; i < graph.get(x).size(); i++) {
            int y = graph.get(x).get(i);
            if (!visited[y]) {
                result++;
                dfs(y, bw);
            }
        }
    }




    public static void main(String[] args) throws Exception{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));//선언

        String input = br.readLine();
        int 노드 = Integer.parseInt(input);

        String input2 = br.readLine();
        int 모든간선 = Integer.parseInt(input2);

        int 시작번호= 1;

      노드 +=   노드;
      모든간선 += 모든간선;

        //노드 갯수 선정
        visited = new boolean[노드];

        // 그래프 초기화
        for (int i = 0; i <노드; i++) {
            graph.add(new ArrayList<Integer>());
        }

        //개인 간선 연결
        for(int i = 1; i < 모든간선; i++) { // 모간

            String 간선입력  = br.readLine();
            String[] 개인간선 = 간선입력.split(" ");
            int [] 개인 = new int[개인간선.length];

            for(int j = 0; j < 개인간선.length; j++) {
                개인[j] = Integer.parseInt(개인간선[j]);

                // 노드 1에 연결된 노드 정보 저장
                graph.get(i).add(개인[j]);
            }
        }

        br.close();

        dfs(시작번호,bw);
        System.out.println(result);
        bw.close();
    }
}




