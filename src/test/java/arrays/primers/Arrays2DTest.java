package arrays.primers;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

import static java.util.Arrays.asList;
import static org.junit.Assert.assertEquals;

public class Arrays2DTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final Arrays2D arrays2D = new Arrays2D();

    @Before
    public void redirectStreams(){
        System.setOut(new PrintStream(outContent));
    }

    @After
    public void restoreStreams(){
        System.setOut(System.out);
    }

    @Test
    public void out() {
        System.out.print("hello");
        assertEquals("hello", outContent.toString());
    }

    @Test
    public void performOps_byDefault_printsExpected(){
        ArrayList<ArrayList<Integer>> test = new ArrayList<>(3);
        test.add(new ArrayList<>(asList(1, 2, 3, 4)));
        test.add(new ArrayList<>(asList(5, 6, 7, 8)));
        test.add(new ArrayList<>(asList(9, 10, 11, 12)));

        ArrayList<ArrayList<Integer>> B = arrays2D.performOps(test);
        for (int i = 0; i < B.size(); i++) {
            for (int j = 0; j < B.get(i).size(); j++) {
                System.out.print(B.get(i).get(j) + " ");
            }
        }

        assertEquals("4 3 2 1 8 7 6 5 12 11 10 9 ", outContent.toString());
    }
}
