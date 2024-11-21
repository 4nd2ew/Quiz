package Quiz;

import java.util.ArrayList;
import java.util.Scanner;

public class Quiz {
    Scanner scanner = new Scanner(System.in);
    private final ArrayList<QuestionType> questionTypes;
    private int score;

    public Quiz(ArrayList<QuestionType> questionTypes, int score){
        this.questionTypes = questionTypes;
        this.score = score;
    }

    public int play(){
        System.out.println("Welcome to quiz Math Quiz.");
        System.out.println("This quiz has " + Question.qCount + " questions.");

        for(QuestionType questionType: questionTypes){
            for(Question question: questionType.getQuestions()){
                System.out.println(question.getQuestion());
                System.out.println(question.getOptions());

                if(scanner.next() == question.getAnswer())
                    score++;
            }
        }
        return score;
    }
}
