package com.drakenelson.actions.HelloWorld;

import com.opensymphony.xwork2.ActionSupport;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.stereotype.Component;

@Component
@Data
@EqualsAndHashCode(callSuper=false)
public class HelloWorldAction extends ActionSupport {

    private String name;

    public String execute() throws Exception {
        return SUCCESS;
    }
}