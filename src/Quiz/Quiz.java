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
        String answer;
        System.out.println("Welcome to quiz Math Quiz.");
        System.out.println("This quiz has " + Question.qCount + " questions.");
        System.out.println();

        for(QuestionType questionType: questionTypes){
            for(Question question: questionType.getQuestions()){
                System.out.print(question.getQuestion());
                System.out.println(" /" + questionType.getQTypeName());
                System.out.println(question.getOptions());
                answer = scanner.next();
                if(answer.equals(question.getAnswer()))
                    score++;
            }
        }
        return score;
    }
}
