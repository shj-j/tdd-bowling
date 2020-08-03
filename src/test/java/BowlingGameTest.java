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

    @Test
    public void should_return_102_if_strike(){
        Integer[] numbers = {4,3,7,1,10,0,10,0,4,0,3,4,3,4,8,1,6,0,1,0};
        assertEquals(102, bowlingGame.getScore(numbers));
    }


    @Test
    public void should_return_131_if_strike_in_last_frame_and_first_nine_frame(){
        Integer[] numbers = {4,3,7,1,10,0,10,0,4,0,3,4,3,4,8,1,6,0,10,10,10};
        assertEquals(131, bowlingGame.getScore(numbers));
    }

    @Test
    public void should_return_74_if_spare(){
        Integer[] numbers = {1,9,7,1,4,3,7,1,4,0,3,4,3,4,8,1,6,0,1,0};
        assertEquals(74, bowlingGame.getScore(numbers));
    }

    @Test
    public void should_return_84_if_spare_in_last_frame_and_first_nine_frame(){
        Integer[] numbers = {1,9,7,1,4,3,7,1,4,0,3,4,3,4,8,1,6,0,9,1,1};
        assertEquals(84, bowlingGame.getScore(numbers));
    }

    @Test
    public void should_return_300_if_all_strike(){
        Integer[] numbers = {10,0,10,0,10,0,10,0,10,0,10,0,10,0,10,0,10,0,10,10,10};
        assertEquals(300, bowlingGame.getScore(numbers));
    }



}
