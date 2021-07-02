import Graph.Subway;
import org.junit.jupiter.api.Test;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class SubwayTest {

    @Test
    public void mainInputToGraph()throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Subway sb = new Subway();
        sb.inputToGraph(1, br);
    }

}
