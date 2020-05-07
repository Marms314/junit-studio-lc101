package test;

import main.BalancedBrackets;
import org.junit.Test;

import static org.junit.Assert.*;

public class BalancedBracketsTest {

    @Test
    public void onlyBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }

    @Test
    public void hasBracketsAroundWords() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[LaunchCode]"));
    }

    @Test
    public void hasBracketsSomewhereInTheMiddle() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("Launch[Code]"));
    }

    @Test
    public void hasBracketsAtTheBeginning() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]LaunchCode"));
    }

    @Test
    public void hasBracketsAtTheEnd() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("LaunchCode[]"));
    }

    @Test
    public void hasNoBrackets() {
        assertTrue(BalancedBrackets.hasBalancedBrackets(""));
    }

    @Test
    public void hasMissingRightBracket() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[LaunchCode"));
    }

    @Test
    public void hasMissingLeftBracket() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("LaunchCode]"));
    }

    @Test
    public void hasOnlyBackwardsBrackets() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]["));
    }

    @Test
    public void hasBackwardsBracketsBetweenWords() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("Launch]Code["));
    }

    @Test
    public void hasExtraLeftBracket() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[[Launch]Code"));
    }

    @Test
    public void hasExtraRightBracket() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[Launch]Code]"));
    }

}
