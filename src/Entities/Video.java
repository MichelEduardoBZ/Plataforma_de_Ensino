package Entities;

public class Video extends Lesson {
	
	//Atributos

	private String url;
	private Integer seconds;
	
	//Contrutores
	
	public Video() {
	}

	public Video(String title, String url, Integer seconds) {
		super(title);
		this.url = url;
		this.seconds = seconds;
	}

	public String getUrl() {
		return url;
	}

	//Getter e Setters
	
	public void setUrl(String url) {
		this.url = url;
	}

	public Integer getSeconds() {
		return seconds;
	}

	public void setSeconds(Integer seconds) {
		this.seconds = seconds;
	}

	//Extends
	
	@Override
	public Integer duration() {
		return this.getSeconds();
	}

}
