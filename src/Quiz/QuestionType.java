package Quiz;
import java.util.ArrayList;

public class QuestionType {
    private final String qTypeName;
    private final ArrayList<Question> questions;

    public QuestionType(String qTypeName, ArrayList<Question> questions){
        this.qTypeName = qTypeName;
        this.questions = questions;
    }

    public ArrayList<Question> getQuestions(){
        return questions;
    }
    public String getQTypeName(){
        return this.qTypeName;
    }
}
