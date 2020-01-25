package life.majiang.community.advice;

import life.majiang.community.exception.CustomizeException;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by lenovo on 2020/1/25 13:40
 */
@ControllerAdvice
public class CustomizeExceptionHandler {

    @ExceptionHandler(Exception.class)
    ModelAndView handle(Throwable e, Model model) {
        if (e instanceof CustomizeException) {
            model.addAttribute("message",e.getMessage());
        } else {
            model.addAttribute("message","服务器冒烟了，要不然稍后试试？");
        }
        return new ModelAndView("error");
    }
}
