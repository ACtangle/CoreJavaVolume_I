package CoreJavaVolume.Role1.Character4;

import java.util.Random;

/**
 * Created by melon on 18-6-11.
 * @author melon
 * @version 1.0
 * 1.类加载时首先初始化静态域，然后初始化静态代码块的主体(只执行一次)
 * 2.类实例生成时首先初始化数据域的默认值，接着初始化代码块和初始化数据，最后才执行构造器的主体
 */
public class ConstructorTest {

    public static int id = 1;
    private String str = "str";

    static {
        System.out.println("执行static的主体:");
    }

    {
        System.out.println("执行代码块:" + str);
        System.out.println(++id);
    }

    public ConstructorTest(){
        System.out.println("执行无参构造器");
    }

    public ConstructorTest(String str) {
        System.out.println("执行有参构造器");
    }

    public static void main(String[] args) {
        ConstructorTest constructorTest = new ConstructorTest();
        ConstructorTest constructorTest1 = new ConstructorTest();
        System.out.println(++ConstructorTest.id);
    }
}
