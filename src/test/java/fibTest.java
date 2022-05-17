import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class fibTest {
    @Test
    void fifthElementEqualsThree(){
        fib fib = new fib();
        int[] arr = fib.fibbonacci();

        assertEquals(3, arr[5]);
    }

}
