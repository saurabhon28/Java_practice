package com.map;

import javax.persistence.*;

@Entity
public class Answer {

    @Id
    @Column(name = "answer_id")
    private int answer_id;

    @Column(name = "answers")
    private String answers;

    @ManyToOne
    private Question question;

    public int getId() {
        return answer_id;
    }

    public void setId(int answer_id) {
        this.answer_id = answer_id;
    }

    public String getAnswer() {
        return answers;
    }

    public void setAnswer(String answers) {
        this.answers = answers;
    }

    public Question getQuestion() {
        return question;
    }

    public void setQuestion(Question question) {
        this.question = question;
    }

    public Answer(int answer_id, String answers) {
        super();
        this.answer_id = answer_id;
        this.answers = answers;
    }

    public Answer() {
        super();
    }
}
