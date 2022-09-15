package main.java.chapter2;

/** [VarArgs(가변인자) 테스트]
 *
 * #가변인자(Variable Arguments)
 * - 메서드가 가지는 매개변수가
 *   한 개, 혹은 여러 개(심지어 한 개도 없는 것도 가능)일 수 있는 식으로
 *   '가변적인 갯수'의 매개변수를 가질 수 있도록 지원하는 기능
 *   ex) public testFunc(String... args) {...}
 *
 * - 세 개의 마침표(...)는 인자가 하나의 배열로, 혹은 인자가 하나의 시퀀스로서 넘어갈 수 있단 것을 의미
 * 
 *
 * # 가변인자(Varargs)가 필요한 이유, 장점
 * - 예전에는 자바에서 메서드를 호출할 때
 *   그 메서드가 인자를 여러 개 필요로 할 경우
 *   배열을 생성하고 배열 안에 값을 채워넣어준 뒤 그 배열을 매개변수로 투입하며 호출해줘야 했다.
 *   (이는 지금도 유효하며 가능함)
 *
 * (1) 근데 가변인자(VarArgs) 기능이 등장하면서 이 기능을 사용하면
 *   그 프로세스(배열 생성해서 그 안에 값 채워넣고 완성하는 등)를 자동화하고 감춰준다.
 *
 * (2) 기존에 존재하던 API 들에도 그대로 적용할 수 있어 호환된다.
 *
 * (3) 'String... args' 가 'String[]' 보다 더 가독성이 좋고 사용하기도 편리하다
 *      - 즉, public testFunc(String... args) 을 쓸 때가 
 *        public testFunc(String[] args) 을 쓸 때보다 미리 해줘야하는 것(미리 배열을 생성해서 채워넣은 뒤 투입해주고 하는 것 등)이 적다 -> 편리함
 *
 * (4) 또한 (String[]을 사용했을 때 처럼) 단일 배열만이 아닌, 여러 배열을 전달할 수 있게 해준다 -?
 *    (" It also provides an option that we can pass multiple arrays of String rather than a single one using String[]. It can be used when the programmer wishes to you Varargs as per the program requirements.")

 *
 *
 * (출처: https://medium.com/@VictoriousAura/oh-whats-this-in-public-static-void-main-string-args-in-java-d22318fc5455)
 * */

public class TestVariableArguments {

    public static void main(String[] args) {

        printNumbers(1,2,3,4,5);
    }

    private static void printNumbers(int... args) {
        // 매개변수 args 는 가변인자, variable arguments(varargs) 임.
        // 가변인자 args 는 배열형태
        for (int arg : args) {
            System.out.println("arg: " + arg);
        }
    }

}
