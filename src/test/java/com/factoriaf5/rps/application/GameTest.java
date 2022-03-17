package com.factoriaf5.rps.application;

import static org.junit.Assert.*;

import com.factoriaf5.rps.domain.models.*;
import com.factoriaf5.rps.domain.contracts.*;

import org.junit.Test;

public class GameTest {
    
    @Test
    public void justASimpleTest() {
        assertTrue(true);
    }

    @Test
    public void isRock() {
        // Given
        Material expected = new Rock();
        MaterialFactory objectfactory = new MaterialFactory();
        
        // When
        Material actual = objectfactory.createObject("R");

        // Then
        assertEquals(expected.getClass(), actual.getClass());
    }

    @Test
    public void isPaper() {
        // Given
        Material expected = new Paper();
        MaterialFactory objectfactory = new MaterialFactory();

        // When
        Material actual = objectfactory.createObject("P");

        // Then
        assertEquals(expected.getClass(), actual.getClass());
    }

    @Test
    public void isScissors() {
        // Given
        Material expected = new Scissors();
        MaterialFactory objectfactory = new MaterialFactory();

        // When
        Material actual = objectfactory.createObject("S");

        // Then
        assertEquals(expected.getClass(), actual.getClass());
    }

    @Test
    public void test_paper_wins_rock() {
        // Given
        MaterialFactory objectfactory = new MaterialFactory();
        Material object1 = objectfactory.createObject("R");
        Material object2 = objectfactory.createObject("P");
        String expected = "Rock loses to Paper";

        // When
        String actual = Game.checkWinner(object1, object2);

        // Then
        assertEquals(expected, actual);
    }

    @Test
    public void test_rock_wins_scissors() {
        // Given
        MaterialFactory objectfactory = new MaterialFactory();
        Material object1 = objectfactory.createObject("R");
        Material object2 = objectfactory.createObject("S");
        String expected = "Rock wins to Scissors";

        // When    
        String actual = Game.checkWinner(object1, object2);

        // Then
        assertEquals(expected, actual);
    }

    @Test
    public void test_scissors_wins_paper() {
        MaterialFactory objectfactory = new MaterialFactory();
        Material object1 = objectfactory.createObject("S");
        Material object2 = objectfactory.createObject("P");
        String expected = "Scissors wins to Paper";

        // When
        String actual = Game.checkWinner(object1, object2);

        // Then
        assertEquals(expected, actual);
    }
}
