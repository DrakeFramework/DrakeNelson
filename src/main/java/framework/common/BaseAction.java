package framework.common;

import com.opensymphony.xwork2.ActionSupport;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

@Data
@EqualsAndHashCode(callSuper = false)
public class BaseAction extends ActionSupport implements Serializable {
    private static final long serialVersionUID = 1L;
    private String pageName = "";
    private String notification = "";
    private String errorPage = "error.jsp";
    private String info = "";

}
