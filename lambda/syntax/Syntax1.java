package syntax;

import lambadaInterface.*;

public class Syntax1 {
    /**/
    public static void main(String[] args) {
//        1 lambda表达式的基础语法
//        lambda是一个匿名函数（参数列表 方法体）
//        ()参数列表 {}方法体 ->分隔符 读做gose to
        /*无参无返回值*/
        LambdaNoneReturnAndParameter lambda1 = () -> {
            System.out.println("this my first lambda function");
        };
        lambda1.test();
        /*无返回值 一个参数*/
        LambdaNoneReturnSingleParameter lambda2 = (int a)->{
            System.out.println(a);
        };
        lambda2.test(10);
        /*无返回值 多个参数*/
        LambdaNoneReturnMutipleParameter lambda3 = (int a,int b)->{
            System.out.println(a+b);
        };
        lambda3.test(10,20);
        /*有返回值无参数*/
        LambdaSingleReturnNoneParameter lambda4 = ()->{
            return 100;
        };
        int ret1 = lambda4.test();
        System.out.println(ret1);
        /*有返回值，单个参数*/
        LambdaSingleReturnSingleParameter lambda5 = (int a)->{
            return a * 2;
        };
        int ret2 = lambda5.test(3);
        System.out.println(ret2);
        LambdaSingleReturnMutipleParameter lambda6 = (int a,int b)->{
            return a + b;
        };
        int ret3 = lambda6.test(20, 30);
        System.out.println(ret3);
    }
}
