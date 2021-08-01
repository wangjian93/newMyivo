package com.ivo.home;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Myivo 主页面
 * @author wj
 * @version 1.0
 */
@Controller
public class HomeController {

    /** 主页面 **/
    private static final String HOME_PAGE_URL = "page/home.html";

    @RequestMapping(value = {"/", "/home"})
    public static String home() {
        System.out.println(HOME_PAGE_URL);
        return HOME_PAGE_URL;
    }
}
