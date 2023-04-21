import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace() {
    int[] input1 = { 3 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 3 }, input1);
	}


  @Test
  public void testReversed() {
    int[] input1 = { };
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));
  }

  @Test
  public void Linked1(){
    LinkedList l = new LinkedList();
    l.append(3);
    l.append(4);
    l.append(20);
    l.prepend(1);
    assertEquals("1 3 4 20 ", l.toString());
  }

  @Test
  public void Linked2(){
    LinkedList l = new LinkedList();
    l.append(3);
    l.append(6);
    assertEquals("3 6 ", l.toString());
  }
}
