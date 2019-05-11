package com.drakenelson.action.Greeting;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.stereotype.Component;
import com.opensymphony.xwork2.ActionSupport;

import java.io.Serializable;

@Data
@EqualsAndHashCode(callSuper = false)
@Component
public class GreetingAction extends ActionSupport implements Serializable {
    private String name;

    public String execute() throws Exception {
        return SUCCESS;
    }

}