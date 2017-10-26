import java.util.Arrays;

public class TheStack{
	
	
	private String[] stackArray;
	private int stackSize;
	
	private int topOfStack = -1;
	
	TheStack(int size) {
	
	   stackSize = size;
	   stackArray = new String[size];
	   Arrays.fill(stackArray, "-1");
	
	
	}
	
	
}