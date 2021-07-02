package Graph;

import java.util.ArrayList;

public class DFS {

    private static int result = 0; //최단거리 변수
    private static boolean state = false; // 최단거리를 찾았을때 재귀함수를 멈춰주는 역할

    // DFS 함수 정의
    public  static void findByRoot(int start, int end, Graph graph) throws Exception {

        boolean[] dfsVisited  = graph.getVisited(); //방문 여부 배열
        ArrayList<ArrayList<Integer>> dfsGraph = graph.getGraph();

        if(state == false){ //재귀함수를 빠르게 빠져나가기위해 위쪽에 선언

            // 해당노드 true 변환
            dfsVisited[start] = true;

            // 현재 노드와 연결된 다른 노드를 재귀적으로 방문
            // 현재 노드의 간선 수만큼 반복문 진행
            for (int i = 0; i < dfsGraph.get(start).size(); i++) {

                // y = 현재 노드.i번째 간선의 값
                int y = dfsGraph.get(start).get(i);

                // y = 도착 지점, 도착지에 도착했을때 최단거리 출력
                if(y == end && state == false){
                    result++; // 마지막 이동값 1증가
                    System.out.println("최단거리 : "+result);
                    state = true; // 상태 true 변환

                    // else if : 미도착시 다음 간선 검사 진행,
                    // 방문 안한 간선만 방문
                }else if (!dfsVisited[y]) {
                    result++; // 이동값 1증가
                    findByRoot(y, end, graph); // 다음간선의 시작지점 y와 도착지점 end와 함께 dfs 재귀호출
                }
            }
        }
    }



    public  static  String SADANG="사당";

    //Enum
    //Class이름 method naming
    //



}
