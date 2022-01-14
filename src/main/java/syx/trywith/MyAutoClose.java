package syx.trywith;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;

/**
 * @author syx
 * @className MyAutoClose
 * @date 2022/01/12 11:04
 */
public class MyAutoClose implements AutoCloseable {
    @Override
    public void close() throws Exception {
        System.out.println("resource is close");
    }

    public static void main(final String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        try (MyAutoClose close = new MyAutoClose()) {
            System.out.println("  ------------- ");
        } catch (Exception e) {
            System.out.println("资源关闭报错");
        }

        System.out.println("--------  验证泛型擦除 使用反射  --------");
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.getClass().getMethod("add", Object.class).invoke(list, "syx");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        System.out.println("--------  验证泛型擦除 对比class  --------");
        ArrayList<String> strings = new ArrayList<>();
        ArrayList<Integer> ints = new ArrayList<>();
        strings.add("this is list1");
        ints.add(1);
        System.out.println(strings.getClass() == ints.getClass());
    }


    /**
     * 泛型方法
     *
     * @param tClass 用来创建泛型对象
     * @return
     * @throws IllegalAccessException
     * @throws InstantiationException
     */
    public <T> T getT(Class<T> tClass) throws IllegalAccessException, InstantiationException {
        return tClass.newInstance();
    }
}
