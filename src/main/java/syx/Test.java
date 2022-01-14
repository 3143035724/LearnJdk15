package syx;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Method;

/**
 * @author syx
 * @className Test
 * @date 2022/01/10 9:57
 */
public class Test {


    public static void main(String[] args) throws CloneNotSupportedException, IllegalAccessException, InstantiationException {
//        Dog dog = new Dog("A");
//        System.out.println(dog.getObjectAddress());
//        // 此时dog的引用地址并没有被修改
//        func(dog);
//        // 在func方法调用完成后，dog引用没有发生改变
//        System.out.println(dog.getObjectAddress());
//        System.out.println(dog.getName());
//
//
//        int a = 1;
//        float a1 = 1F;
//        System.out.println(a == a1);
//        Integer b = 1;
//        Float b1 = 1F;
//        System.out.println(b.equals(b1));
//        String s = "";
//        System.out.println(s.equals(null));
//        Dog d = new Dog("name");
//        Dog e = null;
//        // 必须实现Cloneable接口才可以实现对象克隆
//        e = d.clone();
//        System.out.println(e.name);

        // 反射
//        Class<?> c = Dog.class;
//        Method[] declaredMethods = c.getDeclaredMethods();
//        for (Method declaredMethod : declaredMethods) {
//            System.out.println(declaredMethod.getName());
//        }
//        System.out.println(declaredMethods);

        Integer integer = new Integer(99);
        integer = 19;

        try (FileReader fr = new FileReader("d:/input.txt");
             BufferedReader br = new BufferedReader(fr)) {

        } catch (Exception e) {
            e.printStackTrace();
        }

        // 自定义注解


    }

    private static void func(Dog dog) {
        System.out.println(dog.getObjectAddress());
        // 修改了dog的引用
        dog = new Dog("B");
        System.out.println(dog.getObjectAddress());
        System.out.println(dog.getName());

    }

//    public abstract void test();

}

class Dog implements Cloneable {

    String name;

    Dog(String name) {
        this.name = name;
    }

    String getName() {
        return this.name;
    }

    void setName(String name) {
        this.name = name;
    }

    String getObjectAddress() {
        return super.toString();
    }

    @Override
    protected Dog clone() throws CloneNotSupportedException {
        return (Dog) super.clone();
    }

    private void privateMethod() {

    }
}