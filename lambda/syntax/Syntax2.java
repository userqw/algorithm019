package syntax;

import lambadaInterface.LambdaNoneReturnSingleParameter;
import lambadaInterface.LambdaSingleReturnMutipleParameter;
import lambadaInterface.LambdaSingleReturnSingleParameter;

public class Syntax2 {
    public static void main(String[] args) {
        //lambda语法简化
        /*省略参数类型*/
        LambdaSingleReturnMutipleParameter lambda1 = (a,b)->{
            return a + b;
        };
        /*当只有一个参数时 省略参数括号*/
        LambdaSingleReturnSingleParameter lambda2 = a ->{
            return a;
        };
        /*如果方法只有一条语句可以省略大括号*/
        LambdaNoneReturnSingleParameter lambda3 = a -> System.out.println("");
        /*省略掉大括号时省略掉return*/
        LambdaSingleReturnSingleParameter lambda4 = a ->a;
        LambdaSingleReturnMutipleParameter lambda5 = (a,b) ->a+b;

    }
}
