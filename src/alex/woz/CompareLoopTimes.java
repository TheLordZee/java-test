package alex.woz;
import java.time.*;

public class CompareLoopTimes {
    public static void main(String[] args) {
        final int REPEAT = 100_000;
        int startTime, endTime;
        final int FACTOR = 1_000_000;
        LocalDateTime now;
        now = LocalDateTime.now();
        startTime = now.getNano() + (now.getSecond() * 1000000000);
        for(int x = 0; x <= REPEAT; ++x)
            for(int y = 0; y <= REPEAT; ++y);
        now = LocalDateTime.now();
        endTime = now.getNano() + (now.getSecond() * 1000000000);
        System.out.println("Time for loops starting from 0: " +
                        ((endTime - startTime) / FACTOR) + " milliseconds");
        now = LocalDateTime.now();
        startTime = now.getNano() + (now.getSecond() * 1000000000);
        for(int x = REPEAT; x >= 0; --x)
            for(int y = REPEAT; y >= 0; --y);
        now = LocalDateTime.now();
        endTime = now.getNano() + (now.getSecond() * 1000000000);
        System.out.println("Time for loops ending with 0: " +
                        ((endTime - startTime) / FACTOR) + " milliseconds");
    }
}
