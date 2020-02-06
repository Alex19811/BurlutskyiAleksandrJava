/*
package AAA_Proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class Main {
        public static void main(String[] args) {
            System.out.println(getInstatce(new Foolmpi().bar(1)));
           //Foo foo =(Foo) Proxy.newProxyInstance(
            // Object foo = java.lang.reflect.Proxy.newProxyInstance(
             return;

                    Foo.class.getClassLoader(),
                    new Class[]{Foo.class},
                    new InvocationHandler() {
                        @Override
                        public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                            if (args != null && args[0] == null) {
                                System.out.println("The...");

                                return null;
                            }
                            return "bar";
                        }
                    });
            System.out.printf("Result =%s%n", foo.bar(null));
        }
    }

*/
