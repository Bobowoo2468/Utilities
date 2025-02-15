package org.utils.stringutils;

import org.junit.jupiter.api.Test;
import org.utils.exceptions.InvalidStringInputException;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class StringParserTest {

    // methodBeingTested_InputGiven_expectedOutcome
    // One String, one separator, 2 parts -- Happy path
    @Test
    void splitString_oneSeparator_expectTwoParts() throws InvalidStringInputException {
        String inputString = "Hello|world";
        String separator = "\\|";
        StringParser sp = new StringParser();
        ArrayList<String> stringParts = sp.splitString(inputString, separator);
        assertEquals(2, stringParts.size());
    }

    // test failure case
    // methodBeingTested_InputGiven_expectedOutcome
    @Test
    void splitString_nullInput_expectException() {
        String inputString = null;
        String separator = "\\|";
        StringParser sp = new StringParser();
//        ArrayList<String> stringParts = sp.splitString(inputString, separator);
        assertThrows(InvalidStringInputException.class, () -> sp.splitString(inputString, separator));
//        assertEquals(0, stringParts.size());
    }
}