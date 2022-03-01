import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.*;

class projectTest {

    @Test
    void top_3_wicket_takers_test1() { //test 1  to find top 3 wicket takers
        ArrayList<String> names = new ArrayList<String>(Arrays.asList("ROHIT","SHIKHAR DHAWAN","VIRAT KOHLI","KL RAHUL","MS DHONI","KEDAR JADHAV","AMBATI RAYUDU","RAVINDRA JADEJA","JASPRIT BUMRAH","ASHWIN","ISHANT SHARMA" ));

        ArrayList<Integer> wickets=new ArrayList<>(Arrays.asList(11,12,13,14,15,16,17,18,19,20,21));
        ArrayList<String> expected=new ArrayList<>(Arrays.asList("ISHANT SHARMA","ASHWIN","JASPRIT BUMRAH"));
        ArrayList<String> actual=project.top_3_wicket_takers(names,wickets);
        assertEquals(expected,actual);   //check if the expected output matches the actual code

    }

    @Test
    void top_3_wicket_takers_test2()  //test 2  to find top 3 wicket takers
    {
        ArrayList<String> names = new ArrayList<String>(Arrays.asList("ROHIT","SHIKHAR DHAWAN","VIRAT KOHLI","KL RAHUL","MS DHONI","KEDAR JADHAV","AMBATI RAYUDU","RAVINDRA JADEJA","JASPRIT BUMRAH","ASHWIN","ISHANT SHARMA" ));
        ArrayList<Integer> wickets=new ArrayList<>(Arrays.asList(11,12,26,14,15,24,17,18,19,20,21));
        ArrayList<String> expected=new ArrayList<>(Arrays.asList("VIRAT KOHLI", "KEDAR JADHAV", "ISHANT SHARMA"));
        ArrayList<String> actual=project.top_3_wicket_takers(names,wickets);
        assertEquals(expected,actual); //check if the expected output matches the actual code

    }

    @Test
    void top_3_wicket_takers_test3()  //test 3  to find top 3 wicket takers
    {
        ArrayList<String> names = new ArrayList<String>(Arrays.asList("ROHIT","SHIKHAR DHAWAN","VIRAT KOHLI","KL RAHUL","MS DHONI","KEDAR JADHAV","AMBATI RAYUDU","RAVINDRA JADEJA","JASPRIT BUMRAH","ASHWIN","ISHANT SHARMA" ));

        ArrayList<Integer> wickets=new ArrayList<>(Arrays.asList(11,12,13,14,15,26,17,28,19,20,30));
        ArrayList<String> expected=new ArrayList<>(Arrays.asList("ISHANT SHARMA", "RAVINDRA JADEJA", "KEDAR JADHAV"));
        ArrayList<String> actual=project.top_3_wicket_takers(names,wickets);
        assertEquals(expected,actual);  //check if the expected output matches the actual code

    }

    @Test
    void top_3_wicket_takers_test4()  //test 4  to find top 3 wicket takers
    {
        ArrayList<String> names = new ArrayList<String>(Arrays.asList("ROHIT","SHIKHAR DHAWAN","VIRAT KOHLI","KL RAHUL","MS DHONI","KEDAR JADHAV","AMBATI RAYUDU","RAVINDRA JADEJA","JASPRIT BUMRAH","ASHWIN","ISHANT SHARMA" ));

        ArrayList<Integer> wickets=new ArrayList<>(Arrays.asList(21,12,13,14,11,16,17,18,19,2,26));
        ArrayList<String> expected=new ArrayList<>(Arrays.asList("ISHANT SHARMA", "ROHIT", "JASPRIT BUMRAH"));
        ArrayList<String> actual=project.top_3_wicket_takers(names,wickets);
        assertEquals(expected,actual);  //check if the expected output matches the actual code

    }

    @Test
    void top_3_wicket_takers_test5() //test 5  to find top 3 wicket takers
    {
        ArrayList<String> names = new ArrayList<String>(Arrays.asList("ROHIT","SHIKHAR DHAWAN","VIRAT KOHLI","KL RAHUL","MS DHONI","KEDAR JADHAV","AMBATI RAYUDU","RAVINDRA JADEJA","JASPRIT BUMRAH","ASHWIN","ISHANT SHARMA" ));

        ArrayList<Integer> wickets=new ArrayList<>(Arrays.asList(21,12,13,14,11,16,17,18,45,2,26));
        ArrayList<String> expected=new ArrayList<>(Arrays.asList("JASPRIT BUMRAH", "ISHANT SHARMA", "ROHIT"));
        ArrayList<String> actual=project.top_3_wicket_takers(names,wickets);
        assertEquals(expected,actual);  //check if the expected output matches the actual code

    }

    @Test
    void top_3_run_scorers_test1() //test 1  to find top 3 run scorers
    {
        ArrayList<String> names = new ArrayList<String>(Arrays.asList("ROHIT","SHIKHAR DHAWAN","VIRAT KOHLI","KL RAHUL","MS DHONI","KEDAR JADHAV","AMBATI RAYUDU","RAVINDRA JADEJA","JASPRIT BUMRAH","ASHWIN","ISHANT SHARMA" ));

        ArrayList<Integer> runs=new ArrayList<>(Arrays.asList(11,12,13,14,15,16,17,18,19,20,21));
        ArrayList<String> expected=new ArrayList<>(Arrays.asList("ISHANT SHARMA","ASHWIN","JASPRIT BUMRAH"));
        ArrayList<String> actual=project.top_3_run_scorers(names,runs);
        assertEquals(expected,actual);  //check if the expected output matches the actual code

    }

    @Test
    void top_3_run_scorers_test2()// test 2 to find top 3 run scorers
    {
        ArrayList<String> names = new ArrayList<String>(Arrays.asList("ROHIT","SHIKHAR DHAWAN","VIRAT KOHLI","KL RAHUL","MS DHONI","KEDAR JADHAV","AMBATI RAYUDU","RAVINDRA JADEJA","JASPRIT BUMRAH","ASHWIN","ISHANT SHARMA" ));

        ArrayList<Integer> runs=new ArrayList<>(Arrays.asList(11,12,26,14,15,24,17,18,19,20,21));
        ArrayList<String> expected=new ArrayList<>(Arrays.asList("VIRAT KOHLI", "KEDAR JADHAV", "ISHANT SHARMA"));
        ArrayList<String> actual=project.top_3_run_scorers(names,runs);
        assertEquals(expected,actual);  //check if the expected output matches the actual code

    }

    @Test
    void top_3_run_scorers_test3()  // test 3 to find top 3 run scorers
    {
        ArrayList<String> names = new ArrayList<String>(Arrays.asList("ROHIT","SHIKHAR DHAWAN","VIRAT KOHLI","KL RAHUL","MS DHONI","KEDAR JADHAV","AMBATI RAYUDU","RAVINDRA JADEJA","JASPRIT BUMRAH","ASHWIN","ISHANT SHARMA" ));

        ArrayList<Integer> runs=new ArrayList<>(Arrays.asList(11,12,13,14,15,26,17,28,19,20,30));
        ArrayList<String> expected=new ArrayList<>(Arrays.asList("ISHANT SHARMA", "RAVINDRA JADEJA", "KEDAR JADHAV"));
        ArrayList<String> actual=project.top_3_run_scorers(names,runs);
        assertEquals(expected,actual);  //check if the expected output matches the actual code

    }

    @Test
    void top_3_run_scorers_test4()  // test 4 to find top 3 run scorers
    {
        ArrayList<String> names = new ArrayList<String>(Arrays.asList("ROHIT","SHIKHAR DHAWAN","VIRAT KOHLI","KL RAHUL","MS DHONI","KEDAR JADHAV","AMBATI RAYUDU","RAVINDRA JADEJA","JASPRIT BUMRAH","ASHWIN","ISHANT SHARMA" ));

        ArrayList<Integer> runs=new ArrayList<>(Arrays.asList(21,12,13,14,11,16,17,18,19,2,26));
        ArrayList<String> expected=new ArrayList<>(Arrays.asList("ISHANT SHARMA", "ROHIT", "JASPRIT BUMRAH"));
        ArrayList<String> actual=project.top_3_run_scorers(names,runs);
        assertEquals(expected,actual);   //check if the expected output matches the actual code

    }

    @Test
    void top_3_run_scorers_test5()  // test 5 to find top 3 run scorers
    {
        ArrayList<String> names = new ArrayList<String>(Arrays.asList("ROHIT","SHIKHAR DHAWAN","VIRAT KOHLI","KL RAHUL","MS DHONI","KEDAR JADHAV","AMBATI RAYUDU","RAVINDRA JADEJA","JASPRIT BUMRAH","ASHWIN","ISHANT SHARMA" ));

        ArrayList<Integer> runs=new ArrayList<>(Arrays.asList(21,12,13,14,11,16,17,18,45,2,26));
        ArrayList<String> expected=new ArrayList<>(Arrays.asList("JASPRIT BUMRAH", "ISHANT SHARMA", "ROHIT"));
        ArrayList<String> actual=project.top_3_run_scorers(names,runs);
        assertEquals(expected,actual);   //check if the expected output matches the actual code

    }

    @Test
    void top_3_award_winners_test1() // test 1 to find top 3 award winners
    {
        ArrayList<String> names = new ArrayList<String>(Arrays.asList("ROHIT","SHIKHAR DHAWAN","VIRAT KOHLI","KL RAHUL","MS DHONI","KEDAR JADHAV","AMBATI RAYUDU","RAVINDRA JADEJA","JASPRIT BUMRAH","ASHWIN","ISHANT SHARMA" ));

        ArrayList<Integer> awards=new ArrayList<>(Arrays.asList(11,12,13,14,15,16,17,18,19,20,21));
        ArrayList<String> expected=new ArrayList<>(Arrays.asList("ISHANT SHARMA","ASHWIN","JASPRIT BUMRAH"));
        ArrayList<String> actual=project.top_3_award_winners(names,awards);
        assertEquals(expected,actual);  //check if the expected output matches the actual code
    }

    @Test
    void top_3_award_winners_test2() // test 2 to find top 3 award winners
    {
        ArrayList<String> names = new ArrayList<String>(Arrays.asList("ROHIT","SHIKHAR DHAWAN","VIRAT KOHLI","KL RAHUL","MS DHONI","KEDAR JADHAV","AMBATI RAYUDU","RAVINDRA JADEJA","JASPRIT BUMRAH","ASHWIN","ISHANT SHARMA" ));

        ArrayList<Integer> awards=new ArrayList<>(Arrays.asList(11,12,26,14,15,24,17,18,19,20,21));
        ArrayList<String> expected=new ArrayList<>(Arrays.asList("VIRAT KOHLI", "KEDAR JADHAV", "ISHANT SHARMA"));
        ArrayList<String> actual=project.top_3_award_winners(names,awards);
        assertEquals(expected,actual);  //check if the expected output matches the actual code
    }

    @Test
    void top_3_award_winners_test3()   // test 3 to find top 3 award winners
    {
        ArrayList<String> names = new ArrayList<String>(Arrays.asList("ROHIT","SHIKHAR DHAWAN","VIRAT KOHLI","KL RAHUL","MS DHONI","KEDAR JADHAV","AMBATI RAYUDU","RAVINDRA JADEJA","JASPRIT BUMRAH","ASHWIN","ISHANT SHARMA" ));

        ArrayList<Integer> awards=new ArrayList<>(Arrays.asList(11,12,13,14,15,26,17,28,19,20,30));
        ArrayList<String> expected=new ArrayList<>(Arrays.asList("ISHANT SHARMA", "RAVINDRA JADEJA", "KEDAR JADHAV"));
        ArrayList<String> actual=project.top_3_award_winners(names,awards);
        assertEquals(expected,actual);  //check if the expected output matches the actual code
    }

    @Test
    void top_3_award_winners_test4()   // test 1 to find top 4 award winners
    {
        ArrayList<String> names = new ArrayList<String>(Arrays.asList("ROHIT","SHIKHAR DHAWAN","VIRAT KOHLI","KL RAHUL","MS DHONI","KEDAR JADHAV","AMBATI RAYUDU","RAVINDRA JADEJA","JASPRIT BUMRAH","ASHWIN","ISHANT SHARMA" ));

        ArrayList<Integer> awards=new ArrayList<>(Arrays.asList(21,12,13,14,11,16,17,18,19,2,26));
        ArrayList<String> expected=new ArrayList<>(Arrays.asList("ISHANT SHARMA", "ROHIT", "JASPRIT BUMRAH"));
        ArrayList<String> actual=project.top_3_award_winners(names,awards);
        assertEquals(expected,actual);   //check if the expected output matches the actual code
    }

    @Test
    void top_3_award_winners_test5()    // test 1 to find top 5 award winners
    {
        ArrayList<String> names = new ArrayList<String>(Arrays.asList("ROHIT","SHIKHAR DHAWAN","VIRAT KOHLI","KL RAHUL","MS DHONI","KEDAR JADHAV","AMBATI RAYUDU","RAVINDRA JADEJA","JASPRIT BUMRAH","ASHWIN","ISHANT SHARMA" ));

        ArrayList<Integer> awards=new ArrayList<>(Arrays.asList(21,12,13,14,11,16,17,18,45,2,26));
        ArrayList<String> expected=new ArrayList<>(Arrays.asList("JASPRIT BUMRAH", "ISHANT SHARMA", "ROHIT"));
        ArrayList<String> actual=project.top_3_award_winners(names,awards);
        assertEquals(expected,actual);   //check if the expected output matches the actual code
    }

