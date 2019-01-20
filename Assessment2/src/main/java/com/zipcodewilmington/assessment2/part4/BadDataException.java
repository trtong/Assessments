package com.zipcodewilmington.assessment2.part4;

import java.io.IOException;

public class BadDataException extends IOException {

    public BadDataException() {}

    public BadDataException(String message){
        super(message);
    }
}
