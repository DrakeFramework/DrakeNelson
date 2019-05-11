package com.drakenelson.action.Greeting;

import framework.common.BaseAction;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.springframework.stereotype.Component;
import com.opensymphony.xwork2.ActionSupport;

import java.io.Serializable;

@Data
@EqualsAndHashCode(callSuper = false)
@Component
public class GreetingAction extends BaseAction {
    private String name;

    public String execute() throws Exception {
        return SUCCESS;
    }

}
