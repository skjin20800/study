package Graph;

import java.io.*;
import java.util.ArrayList;

public class ReadSubway {


    //텍스트의 지하철역 그래프를 보고 2차원 배열 Graph를 만들어주는 메서드
    public  static  Graph ReadSubway(Graph graph){

        ArrayList<ArrayList<Integer>> readGraph = graph.getGraph();

        try {
            //파일 객체 생성
            File file = new File("/home/hodooai/test2/Arraytest/src/subway.txt");
            //입력 스트림 생성
            FileReader filereader = new FileReader(file);

            //입력 버퍼 생성
            BufferedReader bufReader = new BufferedReader(filereader);
            String line = "";

            int node = 0;

            //노드당 간선 연결
            //노드 수만큼 반복
            while((line = bufReader.readLine()) != null){
                readGraph.add(new ArrayList<Integer>());// 노드 생성

                    // 간선 정보를 버퍼로 받는다.
                    String edges  =  line;
                    // 버퍼를 -로 스플릿하여 간선하나하나를 edge[]에 저장한다.
                    String[] edge = edges.split("-");

                    //해당 노드의 입력된 간선 수만큼 반복문 진행
                    for(int j = 0; j < edge.length; j++) {

                        // 해당 노드에 edge[]에 저장되어있는 간선을 부여한다.
                        // 이때 간선의 한글명을 rename으로 숫자로 변환
                        readGraph.get(node).add(Rename.rename(edge[j]));// 간선 내용 생성
                    }
                node++;
//                System.out.println(line);
            }

            graph.setVisited(new boolean[node]); // 방문여부 배열 생성
            bufReader.close();
        }catch (FileNotFoundException e) {
            // TODO: handle exception
        }catch(IOException e){
            System.out.println(e);
        }
        return  graph;
    }


}
