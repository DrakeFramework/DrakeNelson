package com.drakenelson.actions.Greeting;

import lombok.Data;
import org.springframework.stereotype.Component;

import java.io.Serializable;

@Component
@Data
public class GreetingModel implements Serializable {
    private String name;
    private String nameVal;

}
