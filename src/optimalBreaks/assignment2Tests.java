package optimalBreaks;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.Test;

public class assignment2Tests {

	@Test
	public void testEmptybreakList() {
		BreakSchedule x= new BreakSchedule();
		String w= "Holiday";
		ArrayList<Integer> b= null;
		assertEquals(0, x.totalCost(w,b));
	}
	
	
	@Test
	public void testEmptyString() {
		BreakSchedule x= new BreakSchedule();
		String w= "";
		ArrayList<Integer> b= new ArrayList<Integer>();
		b.add(3);
		assertEquals(0, x.totalCost(w,b));
	}
	
	@Test
	public void testEasybreakList() {
		BreakSchedule x= new BreakSchedule();
		String w= "Holiday";
		ArrayList<Integer> b= new ArrayList<Integer>();
		b.add(3);
		assertEquals(7, x.totalCost(w,b));
	}
	
	@Test
	public void testEasy2breakList() {
		BreakSchedule x= new BreakSchedule();
		String w= "Holiday";
		ArrayList<Integer> b= new ArrayList<Integer>();
		b.add(6);
		assertEquals(0, x.totalCost(w,b));
	}

	@Test
	public void testEasy3breakList() {
		BreakSchedule x= new BreakSchedule();
		String w= "Holiday";
		ArrayList<Integer> b= new ArrayList<Integer>();
		b.add(0);
		b.add(1);
		b.add(2);
		assertEquals(12, x.totalCost(w,b));
	}
	
	@Test
	public void testEasy4breakList() {
		BreakSchedule x= new BreakSchedule();
		String w= "Holiday";
		ArrayList<Integer> b= new ArrayList<Integer>();
		b.add(4);
		b.add(6);
		assertEquals(7, x.totalCost(w,b));
	}
	
	@Test
	public void testEmptybreakSchedule() {
		BreakSchedule x= new BreakSchedule();
		String w= "Holiday";
		ArrayList<Integer> b= null;
		assertEquals(null, x.breakSchedule(w,b));
	}
	
	@Test
	public void testEmptybreakScheduleEasy() {
		BreakSchedule x= new BreakSchedule();
		String w= "Holiday";
		ArrayList<Integer> b= new ArrayList<Integer>();
		b.add(3);
		ArrayList<Integer> schedule= x.breakSchedule(w,b);
		
		ArrayList<Integer> answer = new ArrayList<Integer>(); 
		answer.add(3);
		for(int i=0; i< schedule.size(); i++){
		 assertEquals(answer.get(i), schedule.get(i));
		}
	}
	
	@Test
	public void testEasy3breakSchedule() {
		BreakSchedule x= new BreakSchedule();
		String w= "Holiday";
		ArrayList<Integer> b= new ArrayList<Integer>();
		b.add(0);
		b.add(3);
		ArrayList<Integer> schedule = x.breakSchedule(w,b);
		ArrayList<Integer> answer = new ArrayList<Integer>(); 
		answer.add(3);
		answer.add(0);
		for(int i=0; i< schedule.size(); i++){
		 assertEquals(answer.get(i), schedule.get(i));
		}
	}
	
	@Test
	public void testEasy4breakSchedule() {
		BreakSchedule x= new BreakSchedule();
		String w= "Holiday";
		ArrayList<Integer> b= new ArrayList<Integer>();
		b.add(0);
		b.add(1);
		b.add(3);
		ArrayList<Integer> schedule= x.breakSchedule(w,b);
		ArrayList<Integer> answer = new ArrayList<Integer>(); 
		answer.add(3);
		answer.add(1);
		answer.add(0);
		for(int i=0; i< schedule.size(); i++){
		 assertEquals(answer.get(i), schedule.get(i));
		}
	}

	@Test
	public void testEasy5breakSchedule() {
		BreakSchedule x= new BreakSchedule();
		String w= "Holiday";
		ArrayList<Integer> b= new ArrayList<Integer>();
		b.add(6);
		ArrayList<Integer> schedule= x.breakSchedule(w,b);
		System.out.println(schedule);
		assertEquals(null, schedule);		
	}
	
	@Test
	public void custom0() {
		BreakSchedule x= new BreakSchedule();
		String w= "abcdefghijklmnopqrst";
		ArrayList<Integer> b= new ArrayList<Integer>();
		
		b.add(3);
		b.add(8);
		b.add(10);
		b.add(12); 
		b.add(13);
	    b.add(16);
		System.out.println(x.breakSchedule(w,b));
		
		assertEquals(54, x.totalCost(w,b));	
	
	}
	
	@Test
    public void testPersonal26CharacterBreakSchedule() {
        BreakSchedule x= new BreakSchedule();
        String w= "abcdefghijklmnopqrstuvwxyz";
        ArrayList<Integer> b= new ArrayList<Integer>();
        b.add(1);
        b.add(4);
        b.add(9);
        b.add(12);
        b.add(15);
        b.add(17);
        assertEquals(70, x.totalCost(w,b));
    }
	
	@Test
	public void custom1() {
		BreakSchedule x= new BreakSchedule();
		String w= "envelope";
		ArrayList<Integer> b= new ArrayList<Integer>();
		
		b.add(1);
		b.add(3);
		
		
		assertEquals(12, x.totalCost(w,b));	
	}

	@Test
    public void garbagetest() {
        BreakSchedule x= new BreakSchedule();
        String w= "abcdefghijkfjkebsfkebfkanfajbflabfjabefhebflhebfjhbfljhbFJEBf";
        ArrayList<Integer> b= new ArrayList<Integer>();
        b.add(1);
        b.add(4);
        b.add(9);
        b.add(12);
        b.add(15);
        b.add(17);
        b.add(22);
        b.add(34);
        b.add(35);
        b.add(37);
        b.add(40);
        b.add(42);
        b.add(45);
        b.add(48);
        b.add(50);
        
        assertEquals(230, x.totalCost(w,b));
    }
	
	@Test
	   public void testPersonal52CharacterBreakSchedule() {
	       BreakSchedule x= new BreakSchedule();
	       String w= "abcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyz";
	       ArrayList<Integer> b= new ArrayList<Integer>();
	       b.add(1);
	       b.add(4);
	       b.add(9);
	       b.add(12);
	       b.add(15);
	       b.add(17);
	       b.add(24);
	       b.add(26);
	       b.add(37);
	       b.add(42);
	       b.add(50);
	       assertEquals(181, x.totalCost(w,b));
	   }
	@Test
	   public void testPersonal52dCharacterBreakSchedule() {
	       BreakSchedule x= new BreakSchedule();
	       String w= "abcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyz";
	       ArrayList<Integer> b= new ArrayList<Integer>();
	       b.add(1);
	       b.add(4);
	       b.add(9);
	       b.add(12);
	       b.add(15);
	       b.add(17);
	       b.add(24);
	       b.add(26);
	       b.add(37);
	       b.add(42);
	       b.add(50);
	       ArrayList<Integer> schedule= x.breakSchedule(w,b);
	       ArrayList<Integer> answer = new ArrayList<Integer>(); 
	       answer.add(26);
	       answer.add(9);
	       answer.add(4);
	       answer.add(1);
	       answer.add(17);
	       answer.add(12);
	       answer.add(15);
	       answer.add(24);
	       answer.add(37);
	       answer.add(42);
	       answer.add(50);
	       for(int i=0; i< schedule.size(); i++){
	        assertEquals(answer.get(i), schedule.get(i));
	       }
	   }
	
	
	
	
	
	


}
