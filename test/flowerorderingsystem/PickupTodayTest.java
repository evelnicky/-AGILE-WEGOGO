/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flowerorderingsystem;

import java.text.SimpleDateFormat;
import java.util.Date;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Evel
 */
public class PickupTodayTest {
    
    public PickupTodayTest() {
    }
    
    @Before
    public void setUp() {
    }

    /**
     * Test of ListUsers method, of class PickupToday.
     */
    @Test
    public void testListUsers() {
    }

    /**
     * Test of addRowToJTable method, of class PickupToday.
     */
    @Test
    public void testAddRowToJTable() {
    }

    /**
     * Test of recordTimestamp method, of class PickupToday.
     */
    @Test
    public void testRecordTimestamp() {
        
        PickupToday abc = new PickupToday();
        abc.i = 1;
        abc.a = 5;
        abc.b = 5;
        abc.recordTimestamp();
        assertEquals(abc.c, 10);
    }
    
    @Test
    public void testFailTimestamp() {
        
        PickupToday abc = new PickupToday();
        abc.i = -1;
        abc.a = 5;
        abc.b = 5;
        abc.recordTimestamp();
        assertEquals(abc.c, 0);
    }
    
  /*   @Test
    public void testTimestampDate() {
        
        PickupToday abc = new PickupToday();
        Date date = new Date();
        String currentTime = new SimpleDateFormat("HH:mm:ss").format(date);
        abc.recordTimestamp();
        assertEquals(abc.curTime, currentTime);
    } */

    /**
     * Test of main method, of class PickupToday.
     */
    @Test
    public void testMain() {
    }
    
}
