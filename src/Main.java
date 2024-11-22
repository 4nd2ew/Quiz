import Quiz.Question;
import Quiz.QuestionType;
import Quiz.Quiz;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int score = 0;
        Scanner scanner = new Scanner(System.in);

        Question question1 = new Question(
                "What is 2 + 2?",
                "a) 1\n" +
                        "b) 2\n" +
                        "c) 4",
                "c");

        Question question2 = new Question(
                "What is 5 + 2?",
                "a) 7\n" +
                        "b) 2\n" +
                        "c) 4",
                "a");

        Question question3 = new Question(
                "Number 4 = ?",
                "a) 4\n" +
                        "b) 8 / 2\n" +
                        "c) 8",
                "ab");

        Question question4 = new Question(
                "What are you?",
                "a) Pako\n" +
                        "b) Trouba\n" +
                        "c) Lump",
                "abc");

        ArrayList<Question> singlePickQuestions = new ArrayList<>();
        singlePickQuestions.add(question1);
        singlePickQuestions.add(question2);

        ArrayList<Question> multiPickQuestions = new ArrayList<>();
        multiPickQuestions.add(question3);
        multiPickQuestions.add(question4);

        QuestionType singlePickQType = new QuestionType("Question with single answer", singlePickQuestions);
        QuestionType multiPickQType =new QuestionType("Question with multiple answers", multiPickQuestions);

        ArrayList<QuestionType> questionTypes = new ArrayList<>();
        questionTypes.add(singlePickQType);
        questionTypes.add(multiPickQType);

        Quiz quiz1 = new Quiz(questionTypes, 0);

        System.out.println("You had " + quiz1.play() + "/" + Question.qCount + " answers correct");
    }
}
