package model;

import enums.MessageSubject;
import lombok.Data;

@Data
public class Message {

    private MessageSubject subject;
    private String email;
    private String orderReference;
    private String message;

}
