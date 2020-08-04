
import java.util.*;
import java.util.stream.Stream;
import java.util.stream.Collectors;

public class BowlingGame {

    private static final int totalFrame = 10;
    private static final int maximumScoreForThrow = 10;
    


    public List<Frame> storeFrame(List<Integer> throwScores){
        List<Frame> frames = new ArrayList<>();

        for(int i = 0; i < totalFrame*2 ; i += 2){
            int currentThrow = throwScores.get(i);
            int nextThrow = throwScores.get(i+1);

            frames.add(new Frame(currentThrow,nextThrow));
        }
        frames.add(new Frame(throwScores.get(totalFrame),0));
        return frames;
    }

    public int getScore(Integer[] numberList){

        List<Integer> throwScores = Stream.of(numberList).collect(Collectors.toList());
        List<Frame> frames = storeFrame(throwScores);

        int score = 0;
        int index;
        for( index = 0; index< totalFrame-1;index++){
            Frame currentFrame = frames.get(index);
            Frame nextFrame = frames.get(index+1);

            if(currentFrame.getFirstThrow() == maximumScoreForThrow){
                if(nextFrame.getFirstThrow() != maximumScoreForThrow){
                    score += currentFrame.getScore() + nextFrame.getScore();
                }else if(nextFrame.getFirstThrow() == maximumScoreForThrow){
                    score += currentFrame.getScore() + nextFrame.getScore()+frames.get(index+1).getScore();
                }
            }else if(currentFrame.getScore() == maximumScoreForThrow){
                score += currentFrame.getScore() + nextFrame.getFirstThrow();
            }else{
                score += currentFrame.getScore();
            }
        }
        Frame current = frames.get(index);
        Frame next = frames.get(index+1);

        if (current.getFirstThrow() == maximumScoreForThrow || current.getScore() == maximumScoreForThrow){
            score += current.getScore() + next.getFirstThrow();
        }else{
            score += current.getScore();
        }
        return score;
    }

}