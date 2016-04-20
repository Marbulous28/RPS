import org.junit.*;
import static org.junit.Assert.*;

public class RPSTest {

  @Test
  public void checkWinner_scissorsVpaper_Player1Wins() {
    RPS testGame = new RPS();
    assertEquals("Player One Wins", testGame.checkWinner("scissors", "paper"));
  }
  @Test
  public void checkWinner_scissorsVscissors_tie() {
    RPS testGame = new RPS();
    assertEquals("Tie", testGame.checkWinner("scissors", "scissors"));
  }

  @Test
  public void checkWinner_rockVpaper_Player2Wins() {
    RPS testGame = new RPS();
    assertEquals("Player Two Winsasf", testGame.checkWinner("rock", "paper"));
  }
}
