package org.example.mvc.view;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Map;

public interface View {
    //jsp view 일수도 있고, redirect view 일수도 있어서 다형성을 이용해 interface로 만듦.

    void render(Map<String, ?> model, HttpServletRequest request, HttpServletResponse response) throws Exception;
}
