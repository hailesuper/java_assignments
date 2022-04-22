package test.assignment07.Exercise5FileIOStream.Quesion2.entity;

import jdk.jfr.StackTrace;

import java.time.LocalDateTime;

public class MyException extends Exception {
    private String message;
    private String reason;
    private StackTrace stackTrace;
    private LocalDateTime time;

    public MyException(String message, String reason, StackTrace stackTrace, LocalDateTime time) {
        this.message = message;
        this.reason = reason;
        this.stackTrace = stackTrace;
        this.time = time;
    }
}
