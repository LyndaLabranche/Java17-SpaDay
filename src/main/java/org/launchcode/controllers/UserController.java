package org.launchcode.controllers;

import org.launchcode.models.Client;
import org.launchcode.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import java.util.Objects;


@Controller
@RequestMapping("/user")
public class UserController {

    @GetMapping("/add")
    public String displayAddUserForm(){
        return "/user/add";
    }

    @PostMapping("/add")
    public String processAddUserForm(Model model, @ModelAttribute User user, String verify) {
            // add form submission handling code here
            verify ="12345";
            if(!Objects.equals(user.getPassword(), verify)){
                model.addAttribute("error", "Please make sure your passwords match!");
                model.addAttribute("username", user.getUsername());
                model.addAttribute("email", user.getEmail());
                return "/user/add";
            }else{
//                UserData.add(user);
                model.addAttribute("username", user.getUsername());
//                model.addAttribute("users", UserData.getAll());
                return "/user/index";
            }
    }

}
