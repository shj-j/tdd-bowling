import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BowlingGameTest {
    BowlingGame bowlingGame = new BowlingGame();

    @Test
    public void should_return_zero_if_all_zero(){
        Integer[] numbers = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
        assertEquals(0, bowlingGame.getScore(numbers));
    }

    @Test
    public void should_return_20_if_all_one(){
        Integer[] numbers = {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1};
        assertEquals(20, bowlingGame.getScore(numbers));
    }


}
