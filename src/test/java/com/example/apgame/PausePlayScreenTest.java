package com.example.apgame;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;


import static org.junit.jupiter.api.Assertions.*;

class PausePlayScreenTest {
    private PausePlayScreen pausePlayScreen;
    private Parent mockParent;

    @BeforeEach
    void setUp() {
        mockParent = mock(Parent.class);

        pausePlayScreen = new PausePlayScreen(800, 600, mockParent);
    }

    @Test
    void testSetScreen() {
        StickHero.stage = mock(Stage.class);

        pausePlayScreen.setScreen();

        verify(StickHero.stage).setTitle("StickHero");
        verify(StickHero.stage).setScene(any(Scene.class));
        verify(StickHero.stage).show();
    }
}