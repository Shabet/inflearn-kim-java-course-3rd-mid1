package section04.lang.clazz;

import java.lang.reflect.InvocationTargetException;

public class ClassCreateMain {

    public static void main(String[] args) throws Exception {
        Class<Hello> helloClass = Hello.class;
        //Class.forName("section04.lang.clazz.Hello");

        Hello hello = (Hello) helloClass.getDeclaredConstructor().newInstance();
        String result = hello.hello();
        System.out.println("hello = " + hello);
        System.out.println("result = " + result);
    }
}
