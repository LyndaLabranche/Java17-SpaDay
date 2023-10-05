package org.launchcode.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@Controller
@RequestMapping("user")
public class UserController {

    public String displayAddUserForm(){
        return "add.html";
    }

}
