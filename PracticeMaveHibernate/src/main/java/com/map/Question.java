package com.map;

import java.util.List;

import javax.persistence.*;

@Entity
public class Question {

    @Id
    @Column(name = "question_id")
    private int id;

    @Column(name = "questions")
    private String question;
     
    @Column(name = "a_id")
    @OneToMany(mappedBy = "question")
    private List<Answer> answers;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public List<Answer> getAnswers() {
		return answers;
	}

	public void setAnswer(List<Answer> answers) {
		this.answers = answers;
	}

	public Question(int id, String question, List<Answer> answers) {
		super();
		this.id = id;
		this.question = question;
		this.answers = answers;
	}

	public Question() {
        super();
    }
}
