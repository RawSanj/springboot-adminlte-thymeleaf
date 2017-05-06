package com.rawsanj.adminlte.web.controller;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Sanjay on 8/15/2016.
 */

@Controller
public class DashboardController {

    @RequestMapping("/")
    public String index() {
        return "dashboard/index";
    }

    // Added to test 500 page
    @RequestMapping(path = "/tigger-error", produces = MediaType.APPLICATION_JSON_VALUE)
    public void error500() throws Exception {
        throw new Exception();
    }

}
