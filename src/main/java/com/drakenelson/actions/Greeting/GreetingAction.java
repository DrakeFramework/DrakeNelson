package com.drakenelson.actions.Greeting;

import com.opensymphony.xwork2.Preparable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.stereotype.Component;
import com.opensymphony.xwork2.ActionSupport;

import java.io.Serializable;

//@Data
//@EqualsAndHashCode(callSuper = false)
//@Component
public class GreetingAction extends ActionSupport implements Serializable {
    private String nameVal;
    private String otherVal;

    public String getNameVal() {
        return nameVal;
    }

    public void setNameVal(String nameVal) {
        this.nameVal = nameVal;
    }

    public String getOtherVal() {
        return otherVal;
    }

    public void setOtherVal(String otherVal) {
        this.otherVal = otherVal;
    }

    public String execute() throws Exception {
        return SUCCESS;
    }

}