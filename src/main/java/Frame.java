public class Frame {
    private int firstThrow;
    private int secondThrow;
    private int score;

    public Frame(int firstThrow, int secondThrow){
        this.firstThrow = firstThrow;
        this.secondThrow = secondThrow;
    }

    public int getScore(){
        return firstThrow + secondThrow;
    }

    public int getFirstThrow(){
        return firstThrow;
    }


}