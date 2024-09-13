package problemsolvedtest;

import org.junit.jupiter.api.Test;
import problemsolved.Problems;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ProblemTest {

    @Test
    public void test_To_checkThat_A_Problem_ClassExist(){
        Problems problem = new Problems("ayo");
        assertTrue(problem.isSolved());
    }

}
