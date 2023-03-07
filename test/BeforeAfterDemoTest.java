import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BeforeAfterDemoTest {

    @BeforeEach
    public void init(){
        System.out.println("Initiliazer block called");
    }

    @AfterEach
    public void retroSpective(){
        System.out.println("AfterEach block called");
    }


    @Test
    public void test1(){
        System.out.println("Running test 1");
    }

    @Test
    public void test2(){
        System.out.println("Running test 2");
    }

    @Test
    public void test3(){
        System.out.println("Running test 3");
    }

}
