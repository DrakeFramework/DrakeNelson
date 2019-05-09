package com.drakenelson.actions.Greeting;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.stereotype.Component;
import com.opensymphony.xwork2.ActionSupport;

@Component
//@Data
//@EqualsAndHashCode(callSuper=false)
public class GreetingAction extends ActionSupport  {
    private String strNameVal;

    public String execute() throws Exception {
        return SUCCESS;
    }

    public String getStrNameVal() {
        return strNameVal;
    }

    public void setStrNameVal(String strNameVal) {
        this.strNameVal = strNameVal;
    }



}