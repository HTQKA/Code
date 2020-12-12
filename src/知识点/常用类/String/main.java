package 知识点.常用类.String;

import java.util.Arrays;

/**
 * @author XYSIMJ
 * @create 2020-11-03-下午7:53
 */
/*
设计一个类来村塾学生成绩
 */
public class main {

    public static void main(String[] args) {
        int[] scores = new int[]{88, 77, 51, 66};
        Score score = new Score(scores);
        score.printScores();
        scores[2] = 99;
        score.printScores();

    }


}

class Score{
    private int[] scores;

    public Score(int[] scores) {
        //int数组------->字符串数组
        //字符数组---------->int数组
        this.scores = new int[scores.length];
        for (int i = 0; i < scores.length; i++) {
            String s = String.valueOf(scores[i]);
            this.scores[i]  = Integer.parseInt(s);
        }


    }

    public void printScores() {
        System.out.println(Arrays.toString(scores));
    }
}
