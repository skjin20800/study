package Graph;

import java.io.BufferedReader;
import java.util.ArrayList;

public class Subway {
    public   int result = 0; //최단거리 변수
    public  boolean state = false; // 최단거리를 찾았을때 재귀함수를 멈춰주는 역할
    public  boolean[] visited ; //방문 여부 배열
    public  ArrayList<ArrayList<Integer>> graph = new ArrayList<ArrayList<Integer>>(); // 그래프


    public  void inputToGraph(int node, BufferedReader br) throws  Exception{

        //노드 생성
        visited = new boolean[node];

        // 그래프 초기화, 각 노드가 연결된 정보를 표현
        for (int i = 0; i <node; i++) {
            graph.add(new ArrayList<Integer>());
        }

        //노드당 간선 연결
        //노드 수만큼 반복
        for(int i = 1; i < node; i++) {
            // 간선 정보를 버퍼로 받는다.
            String edges  = br.readLine();
            // 버퍼를 -로 스플릿하여 간선하나하나를 edge[]에 저장한다.
            String[] edge = edges.split("-");

            //해당 노드의 입력된 간선 수만큼 반복문 진행
            for(int j = 0; j < edge.length; j++) {

                // 해당 노드에 edge[]에 저장되어있는 간선을 부여한다.
                // 이때 간선의 한글명을 rename으로 숫자로 변환
                graph.get(i).add(Subway.rename(edge[j]));
            }
        }

        br.close(); // 버퍼 끊기
    }

    // DFS 함수 정의
    public  void dfs(int start, int end) throws Exception {
        if(state == false){ //재귀함수를 빠르게 빠져나가기위해 위쪽에 선언

            // 해당노드 true 변환
            visited[start] = true;

            // 현재 노드와 연결된 다른 노드를 재귀적으로 방문
            // 현재 노드의 간선 수만큼 반복문 진행
            for (int i = 0; i < graph.get(start).size(); i++) {

                // y = 현재 노드.i번째 간선의 값
                int y = graph.get(start).get(i);

                // y = 도착 지점, 도착지에 도착했을때 최단거리 출력
                if(y == end && state == false){
                    result++; // 마지막 이동값 1증가
                    System.out.println("최단거리 : "+result);
                    state = true; // 상태 true 변환

                    // else if : 미도착시 다음 간선 검사 진행,
                    // 방문 안한 간선만 방문
                }else if (!visited[y]) {
                    result++; // 이동값 1증가
                    dfs(y, end); // 다음간선의 시작지점 y와 도착지점 end와 함께 dfs 재귀호출
                }
            }
        }
    }



    public static int rename(String name){ // String To int
        if(name.equals("사당")) {
            return 1;
        } else if (name.equals("교대")) {
            return 2;
        } else if (name.equals("강남")) {
            return 3;
        } else if (name.equals("역삼")) {
            return 4;
        } else if (name.equals("선릉")) {
            return 5;
        } else if (name.equals("삼성")) {
            return 6;
        } else if (name.equals("양재")) {
            return 7;
        } else if (name.equals("약수")) {
            return 8;
        } else if (name.equals("옥수")) {
            return 9;
        } else if (name.equals("남부")) {
            return 10;
        } else if (name.equals("시민")) {
            return 11;
        } else if (name.equals("청계")) {
            return 12;
        } else if (name.equals("판교")) {
            return 13;
        } else {
            System.out.println(name);
            return -2;
        }
    }

}
