package coll1.example;

import java.util.HashMap;

public class Logger {
    public enum LogLevel {
        ERROR,
        WARNING,
        INFO,
        DEBUG
    }

    HashMap<LogLevel, Integer> counter = new HashMap<>();

    public void log(String msg, LogLevel level) {
        System.out.println(msg);

        if (!counter.containsKey(level)) {
            counter.put(level, 0); // also if not exist
        }
        counter.replace(level, counter.get(level) + 1); // only if already exists

    }

    public int get_count(LogLevel level) {
        if (!counter.containsKey(level)) {
            return 0;
        }
        return counter.get(level);

    }
}
