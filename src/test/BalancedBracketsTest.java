package test;


import org.junit.Test;
import main.BalancedBrackets;
import static org.junit.Assert.*;

public class BalancedBracketsTest {

    //TODO: add tests here
    @Test
    public void emptyTest() {

        assertTrue(true);
    }

    @Test
    public void onlyBracketsReturnsTrue() {
        BalancedBrackets test_Class = new BalancedBrackets();
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }

    @Test
    public void testFacingWrongDirectionBracketReturnsFalse() {
        BalancedBrackets test_Class = new BalancedBrackets();
        assertFalse(BalancedBrackets.hasBalancedBrackets("]["));
    }

    @Test
    public void testMultipleWrongDirectionBracket() {
        BalancedBrackets test_Class = new BalancedBrackets();
        assertTrue(BalancedBrackets.hasBalancedBrackets("]]][[["));
    }

    @Test
    public void testMultipleUnbalancedBracketsReturnsTrue() {
        BalancedBrackets test_Class = new BalancedBrackets();
        assertTrue(BalancedBrackets.hasBalancedBrackets("]]]][][[[["));
    }

    @Test
    public void testWordReturnsTrue() {
        BalancedBrackets test_Class = new BalancedBrackets();
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }

    @Test
    public void testWordReturnsFalse() {
        BalancedBrackets test_Class = new BalancedBrackets();
        assertFalse(BalancedBrackets.hasBalancedBrackets("["));
    }

    @Test
    public void testRandomPlacementOfBracketReturnsTrue() {
        BalancedBrackets test_Class = new BalancedBrackets();
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }

    @Test
    public void testRandomPlacementOfBracketReturnsFalse(){
        BalancedBrackets test_Class = new BalancedBrackets();
        assertFalse(BalancedBrackets.hasBalancedBrackets("[["));
    }

    @Test
    public void testDoublePlacementOfBracketReturnsTrue() {
        BalancedBrackets test_Class = new BalancedBrackets();
        assertTrue(BalancedBrackets.hasBalancedBrackets("[[]]"));
    }

    @Test
    public void testBracketlessStringReturnsTrue(){
        BalancedBrackets test_Class = new BalancedBrackets();
        assertTrue(BalancedBrackets.hasBalancedBrackets(""));
    }

}
