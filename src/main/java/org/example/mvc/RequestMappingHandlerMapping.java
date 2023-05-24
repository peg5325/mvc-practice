package org.example.mvc;

import org.example.mvc.controller.Controller;
import org.example.mvc.controller.HomeController;

import java.util.HashMap;
import java.util.Map;

public class RequestMappingHandlerMapping {

    //key : urlPath, value : Controller
    private Map<String, Controller> mappings = new HashMap<>();

    void init() {
        // 어떠한 경로도 설정하지 않으면, HomeController를 실행.
        mappings.put("/", new HomeController());
    }

    public Controller findHandler(String uriPath) {
        // urlPath와 일치하는 Controller를 return
        return mappings.get(uriPath);
    }
}
