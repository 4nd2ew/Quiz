package Quiz;

public class Question {
    private final String question;
    private final String options;
    private final String answer;
    public static int qCount = 0;

    public Question(String question, String options,String answer){
        qCount++;
        this.question = question;
        this.options = options;
        this.answer = answer;
    }

    public String getQuestion(){
        return this.question;
    }

    public String getAnswer() {
        return this.answer;
    }

    public String getOptions(){
        return this.options;
    }
}
