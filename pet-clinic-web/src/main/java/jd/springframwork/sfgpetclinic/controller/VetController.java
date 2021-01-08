package jd.springframwork.sfgpetclinic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * author JD
 * created 1/8/21 3:47 PM
 */
@Controller
public class VetController {

    @RequestMapping({"/vets","/vets/index","/vets/index.html"})
    public String listVets(){

        return "vets/index";
    }
}
