package SS4.Sw;

import java.time.Instant;

public class StopWatch {
    private long startTime;
    private long endTime;

    public StopWatch() {
        startTime = getCurrentTime();
    }

    private long getCurrentTime() {
        return Instant.now().toEpochMilli();
    }

    public long getStartTime() {
        return startTime;
    }

    public long getEndTime() {
        return endTime;
    }

    public void start() {
        startTime = getCurrentTime();
    }

    public void stop() {
        endTime = getCurrentTime();
    }

    public long getElapsedTime() {
        if (endTime == 0) {
            return 0;
        }
        return endTime - startTime;
    }
}

