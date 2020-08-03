
import java.util.*;
import java.util.stream.Stream;
import java.util.stream.Collectors;

public class BowlingGame {

    private static final int totalFrame = 10;
    // List<Integer> throwScores = new ArrayList();

    public int getScore(Integer[] numberList){

        List<Integer> throwScores = Stream.of(numberList).collect(Collectors.toList());

        int frameAmount = 1;
        int score = 0;
        int isOneFrame = 1;
        int index;

        for( index=0 ; index < throwScores.size(); index++){
            int currentThrow = throwScores.get(index);
            int preThrow = 0;

            if(frameAmount == totalFrame) break;

            if(currentThrow == 10) {
                frameAmount++;
                score += currentThrow + throwScores.get(index+1) + throwScores.get(index+2);
            }
            if(isOneFrame == 2){
                frameAmount++;
                if(currentThrow + preThrow == 10){
                    score += 10 + throwScores.get(index+1);
                }else{
                    score += currentThrow + preThrow;
                }
                isOneFrame = 1;
            }else{
                isOneFrame += 1;
                preThrow = currentThrow;
            }
        }

        if(throwScores.get(index) == 10 ){
            score += 10 + throwScores.get(index+1)+throwScores.get(index+2);
        }else if(throwScores.get(index)+throwScores.get(index+1) == 10){
            score += 10 + throwScores.get(index+2);
        }else{
            score += throwScores.get(index) + throwScores.get(index+1);
        }

        return score;
    }

}