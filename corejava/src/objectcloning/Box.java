package objectcloning;

public class Box implements Cloneable {
	
	private int value;
	
	public Box() {
		value=0;
	}
public void setValue(int v)
{
	value=v;
}
public int getValue() {
	return value;
	
}
public Box clone() throws CloneNotSupportedException {
	return (Box)super.clone();
	
}
}
