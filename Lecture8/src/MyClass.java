import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class MyClass{
	MyInterface my;
	String text = "";
	public MyClass(){
		this.my = new FakeClass();
		my.readFromKeyboard();
	}
	
	public MyClass(MyInterface my){
		this.my = my;
		return ;
	}
	public class FakeClass implements MyInterface{
		@Override
		public String readFromKeyboard() {
			// TODO Auto-generated method stub
			return "test";
		}	
	}
	
	public class ValidReader implements MyInterface{
		public String readFromKeyboard() {
			BufferedReader br = new 
					BufferedReader(new InputStreamReader(System.in));
			try {
				text = br.readLine();
			} catch (IOException e) {
				e.printStackTrace();
			}
			return text;
		}
	}
}
