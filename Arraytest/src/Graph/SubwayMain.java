package Graph;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class SubwayMain {
    public static void main(String[] args) throws Exception{

        // 버퍼변수 선언
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine(); // 입력 받기 (출발역, 도착역, 노드, 간선수)

        // 입력값 split하기
        String[] inputList = input.split(" ");

        //Rename함수 = 역명을 사전에 정의해놓은 int형으로 변환시켜준다.
        int start = Subway.rename(inputList[0]); // 출발역
        int end = Subway.rename(inputList[1]); // 도착역
        int node = Integer.parseInt(inputList[2]); // 노드수
        node++; // 노드를 1번부터 계산하기위해 1 증가


        Subway sb = new Subway();
        sb.inputToGraph(node, br);

        //dfs 함수 호출
        sb.dfs(start,end);
포스트브릿
    }
}




