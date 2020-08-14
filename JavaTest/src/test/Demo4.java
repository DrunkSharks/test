package test;

import java.lang.annotation.Annotation;

public class Demo4 {
	
	@AnnotationTest(name="liu")
	public void info() {
		
	}

	public static void main(String[] args) throws NoSuchMethodException, SecurityException {
		Class clazz=new Demo4().getClass();
		Annotation[] at=clazz.getMethod("info").getAnnotations();
		for(Annotation t:at) {
			if(t instanceof AnnotationTest) {
				System.out.println(((AnnotationTest)t).name());
			}
		}
	}
}
