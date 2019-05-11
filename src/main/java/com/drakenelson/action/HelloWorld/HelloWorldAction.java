package com.drakenelson.action.HelloWorld;

import com.opensymphony.xwork2.ActionSupport;
import framework.common.BaseAction;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.stereotype.Component;

@Component
@Data
@EqualsAndHashCode(callSuper=false)
public class HelloWorldAction extends BaseAction {

    private String name;

    public String execute() throws Exception {
        return SUCCESS;
    }
}