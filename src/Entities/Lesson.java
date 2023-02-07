package Entities;

public abstract class Lesson {

	//Atributos
	
	private String title;
	
	//Construtores 
	
	public Lesson() {
	}

	public Lesson(String title) {
		this.title = title;
	}

	//Getters e Setters
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	
	//Método abstrato
	
	public abstract Integer duration();
	
}
