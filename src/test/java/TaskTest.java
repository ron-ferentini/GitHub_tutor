import org.example.Task;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TaskTest {

    private final Task task = new Task();

    @Test
    public void testFactorialOfZero() {
        int input = 0;
        int expected = 1;
        int result = task.factorial(input);
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void testFactorialOfOne() {
        int input = 1;
        int expected = 1;
        int result = task.factorial(input);
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void testFactorialOfPositiveNumber() {
        int input = 5;
        int expected = 120;
        int result = task.factorial(input);
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void testFactorialOfLargeNumber() {
        int input = 10;
        int expected = 3628800;
        int result = task.factorial(input);
        Assertions.assertEquals(expected, result);
    }
}
