import static org.junit.Assert.*;
import org.junit.*;

public class MethodsTests {
  @Test 
  public void testSumEvensLength4() {
    int[] input1 = { 12, 13, 7, 2};
    assertEquals(EvensExample.sumEvenIndices(input1), 19);
  }
  @Test 
  public void testSumEvenLength5() {
    int[] input1 = { 12, 13, 7, 2, 33};
    assertEquals(EvensExample.sumEvenIndices(input1), 52);
  }
  @Test
  public void testSumEvenLength6() {
    int[] input1 = { 12, 13, 7, 8, 5, 3};
    assertEquals(EvensExample.sumEvenIndices(input1), 24);
  }

  @Test
  public void Linked1(){
    LinkedList l = new LinkedList();
    l.append(3);
    l.append(4);
    l.append(20);
    l.prepend(1);
    assertEquals("1 3 4 20", l.toString());
  }
}