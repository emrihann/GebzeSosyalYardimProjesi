/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gebzesosyalyardim.GebzeSosyalYardim.controller.TestController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author emirh
 */
@Controller
public class WebController {
    @GetMapping(value = {"/", "/{x:^(?!api$).*}/**"})
    public String redirectToReact() {
        return "forward:/index.html";
    }
}
