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
        int start = Rename.rename(inputList[0]); // 출발역
        int end = Rename.rename(inputList[1]); // 도착역

        Graph gp = new Graph(); // 그래프 객체
        ReadSubway.ReadSubway(gp); // 텍스트의 지하철역을 읽고, 그래프 생성
        DFS.findByRoot(start,end,gp);// DFS 알고리즘 사용


    }
}




