package cn.smart.ai;

public class InterfaceTest {
	public static final String IMG_PATH = "path";
	
	static {
		System.loadLibrary("DetectJNI");
	}
	
	public static void main(String[] args) {
		InterfaceTest test = new InterfaceTest();
		System.out.println(test.init(IMG_PATH));
//		System.out.println(test.detect(IMG_PATH));
	}
	
	public native String init(String img);
	public native String detect(String img);
	
}
