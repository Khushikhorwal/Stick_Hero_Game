package com.example.apgame;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StickHeroTest {

    @Test
    public void testSetGame() {
        StickHero stickHero = new StickHero();
        stickHero.setGame();

        assertNotNull(StickHero.playgamescreen);

    }

    @Test
    public void testResumeGame() {
        StickHero stickHero = new StickHero();
        stickHero.resumeGame();

        assertNotNull(StickHero.playgamescreen);

    }


}
