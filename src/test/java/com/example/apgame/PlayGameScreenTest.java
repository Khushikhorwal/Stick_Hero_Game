import javafx.stage.Stage;
import org.junit.jupiter.api.Test;
import org.testfx.framework.junit5.ApplicationTest;
import static org.junit.jupiter.api.Assertions.*;

public class PlayGameScreenTest extends ApplicationTest {

    @Test
    public void testInitialization() {
        // Create an instance of PlayGameScreen
        PlayGameScreen playGameScreen = new PlayGameScreen(800, 600);

        // Verify that the game is initialized correctly
        assertNotNull(playGameScreen.player);
        assertNotNull(playGameScreen.canvas);
        assertNotNull(playGameScreen.scene);
        assertNotNull(playGameScreen.platform1);
        assertNotNull(playGameScreen.platform2);
        assertNotNull(playGameScreen.rnd);
        assertNotNull(playGameScreen.revive);
        assertNotNull(playGameScreen.cancel);
        assertNotNull(playGameScreen.pause);
        assertNotNull(playGameScreen.flip);
    }

    @Test
    public void testResetGame() {
        // Create an instance of PlayGameScreen
        PlayGameScreen playGameScreen = new PlayGameScreen(800, 600);

        // Reset the game
        playGameScreen.resetGame();

        // Verify that the game is reset correctly
        assertNotNull(playGameScreen.platform1);
        assertNotNull(playGameScreen.platform2);
        assertNotNull(playGameScreen.player);
        assertEquals(PlayGameScreen.Phase.WAITING, playGameScreen.phase);
        assertFalse(playGameScreen.revive.isVisible());
        assertFalse(playGameScreen.cancel.isVisible());
        assertTrue(playGameScreen.playing);
    }

    // The start method is required for JavaFX Application Tests
    @Override
    public void start(Stage stage) {
        // Start the JavaFX application
        playGameScreen.resumeGame(stage);
    }
}