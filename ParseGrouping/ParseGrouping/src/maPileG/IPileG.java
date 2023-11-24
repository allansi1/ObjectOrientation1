package maPileG;

public interface IPileG <T> {
	
	public boolean push(T e);
	public T pop();
	public T top();
	public boolean empty();
	public boolean full();
	public int maxSize();
	public int size();

}
