package syntax;

import lambadaInterface.LambdaSingleReturnSingleParameter;

public class Syntax3 {
    public static void main(String[] args) {
        /*方法的引用*/
        /*可以快速的将一个lambda表达式的实现指向一个已经实现的方法*/

        LambdaSingleReturnSingleParameter lambda1 = a -> change(a);
        /*静态方法拿类直接引用*/
        LambdaSingleReturnSingleParameter lambda2 = Syntax3::change;

    }

    private static int change(int a){
        return a * 2;
    }
}
