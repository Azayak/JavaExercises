//public class MyTimeTest {
//}

import org.junit.Test;

import static org.junit.Assert.*;

public class MyTimeTest {

    @Test
    public void incrementHour() {
        MyTime t1 = new MyTime(23,1,1);
        MyTime t2 = new MyTime(2,1,1);
        t1.incrementHour();
        t2.incrementHour();
        assertEquals(t1.getHour(),0);
        assertEquals(t1.getMinute(),1);
        assertEquals(t1.getSecond(),1);

        assertEquals(t2.getHour(),3);
        assertEquals(t2.getMinute(),1);
        assertEquals(t2.getSecond(),1);
    }

    @Test
    public void incrementMinute() {
        MyTime t1 = new MyTime(23,59,1);
        MyTime t2 = new MyTime(22,59,21);
        MyTime t3 = new MyTime(0,26,52);
        t1.incrementMinute();
        t2.incrementMinute();
        t3.incrementMinute();
        assertEquals(t1.getSecond(),1);
        assertEquals(t1.getMinute(),0);
        assertEquals(t1.getHour(),0);

        assertEquals(t2.getHour(),23);
        assertEquals(t2.getMinute(),0);
        assertEquals(t2.getSecond(),21);

        assertEquals(t3.getMinute(),27);
        assertEquals(t3.getHour(),0);
        assertEquals(t3.getSecond(),52);
    }

    @Test
    public void incrementSecond() {
        MyTime t1 = new MyTime(23,59,59);
        MyTime t2 = new MyTime(22,59,59);
        MyTime t3 = new MyTime(21,55,59);
        MyTime t4 = new MyTime(21,55,55);
        t1.incrementSecond();
        t2.incrementSecond();
        t3.incrementSecond();
        t4.incrementSecond();
        assertEquals(t1.getHour(),0);
        assertEquals(t1.getMinute(),0);
        assertEquals(t1.getSecond(),0);

        assertEquals(t2.getHour(),23);
        assertEquals(t2.getMinute(),0);
        assertEquals(t2.getSecond(),0);

        assertEquals(t3.getHour(),21);
        assertEquals(t3.getMinute(),56);
        assertEquals(t3.getSecond(),0);

        assertEquals(t4.getHour(),21);
        assertEquals(t4.getMinute(),55);
        assertEquals(t4.getSecond(),56);
    }
}
