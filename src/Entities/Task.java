package Entities;

public class Task extends Lesson {
	
	//Atributos

	private String description;
	private Integer questionCount;
	
	//Construtores 
	
	public Task() {
	}

	public Task(String title, String description, Integer questionCount) {
		super(title);
		this.description = description;
		this.questionCount = questionCount;
	}

	//Getter e Setters
	
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Integer getQuestionCount() {
		return questionCount;
	}

	public void setQuestionCount(Integer questionCount) {
		this.questionCount = questionCount;
	}

	//Extends
	
	@Override
	public Integer duration() {
		return (this.getQuestionCount() * 5)  * 60;
	}

}
