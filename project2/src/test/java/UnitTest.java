//import jdk.internal.jline.internal.TestAccessible;
import org.junit.Test;
import static org.junit.Assert.*;

public class UnitTest {

    @Test
    public void testSum(){
        System.out.println("sum");
        Integer x = 15;
        Integer y  = 15;
        Integer expresult = 30;
        Integer result = Caluculator.sum(x,y);
        assertEquals(expresult,result);
        assertEquals(null,Caluculator.sum(15,null));
        assertEquals(null,Caluculator.sum(null,15));
        assertEquals(null,Caluculator.sum(null,null));


    }
    @Test
    public void lol(){
        System.out.println("lol");
    }
}
