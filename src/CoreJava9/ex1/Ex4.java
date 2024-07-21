package CoreJava9.ex1;

public class Ex4 {
    public static void main(String[] args) {
        //4. double 타입인 양수 값 중 가장 작은 값과 가장 큰 값을 출력하는 프로그램을 작성하라(자바API에서 Math.nextUp을 찾는다 )

        int a = 20;
        int b = 30;
        int c= 40;

        int max = (a > b) ? ((a >c )? a:c) : ((b>c) ? b:c);
        int max2 =Math.max(a,Math.max(b,c));
        System.out.println("조건 연산자만 사용해 최대값 출력 : "+max);
        System.out.println("/Math.max를 사용: "+max2);

    }
}
