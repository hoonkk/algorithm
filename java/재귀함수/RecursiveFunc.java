package ch2;

public class RecursiveFunc {

    int RecFunc(int num) {
        if (num == 1)
            return 1;

        int result = num + RecFunc(num - 1);

        return result;
    }
    public static void main(String[] args){
        RecursiveFunc RecF = new RecursiveFunc();
        System.out.println("1부터 5까지의 합은 : " + RecF.RecFunc(5));
    }
}
