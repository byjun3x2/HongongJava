package test0203;

public class Main {
    public static void main(String[] args) {

        // Q. var 1 부터 var 4까지 + 연산을 수행해서 int 타입 result 변수에 9가 저장되도록 result 변수에 코드를 작성해보자.

        long var1 = 2L; // 2
        float var2 = 1.8f;  // 1
        double var3 = 2.5; // 2
        String var4 = "3.9"; //

        int result =  (int) var1 + (int) var2 + (int) var3 + (int) Math.round(Double.parseDouble(var4));

        System.out.println(result);
    }
}
