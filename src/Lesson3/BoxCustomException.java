package Lesson3;

public class BoxCustomException extends RuntimeException{
    public BoxCustomException(String message) {
        super(message);
    }
}