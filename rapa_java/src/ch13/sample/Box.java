package ch13.sample;

public class Box<T> {
	private T content;
	public void setContent(T content) {
		this.content = content;
	}
	
	public T getContent() {
		return this.content;
	}

}
