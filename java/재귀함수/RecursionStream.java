package ch3;

import java.util.stream.LongStream;

public class RecursionStream {
    long RecursiveFunc(int num) {
        long result = LongStream.rangeClosed(1,5).reduce((long x, long y) -> x + y).getAsLong();
        return result;
    }
    public static void main(String[] args) {
        RecursionStream rec = new RecursionStream();
        rec.RecursiveFunc(5);
    }
}
