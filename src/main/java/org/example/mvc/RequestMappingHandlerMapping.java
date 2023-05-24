package org.example.mvc;

import org.example.mvc.controller.*;

import java.util.HashMap;
import java.util.Map;

public class RequestMappingHandlerMapping {

    //key : urlPath, value : Controller
    private Map<HandlerKey, Controller> mappings = new HashMap<>();

    void init() {
        // 어떠한 경로도 설정하지 않으면, HomeController를 실행.
        mappings.put(new HandlerKey(RequestMethod.GET, "/"), new HomeController());
        mappings.put(new HandlerKey(RequestMethod.GET, "/users"), new UserListController());
        mappings.put(new HandlerKey(RequestMethod.POST, "/users"), new UserCreateController());
        mappings.put(new HandlerKey(RequestMethod.GET, "/user/form"), new ForwardController("/user/form"));
    }

    public Controller findHandler(HandlerKey handlerKey) {
        // urlPath와 일치하는 Controller를 return
        return mappings.get(handlerKey);
    }
}
