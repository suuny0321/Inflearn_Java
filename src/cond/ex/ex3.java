package cond.ex;

public class ex3 {
    public static void main(String[] args) {
        int dollar=50;
        int total=0;

        if(dollar<0){
            System.out.println("잘못된금액입니다");
        } else if (dollar==0) {
            System.out.println("환전할 금액이 없습니다");

        } else{
            total=1300*dollar;
            System.out.println(total);



        }
    }
}
