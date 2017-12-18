package com.fitri;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/selamatdatang")
public class SelamatDatang {
    
    @RequestMapping()
    public String selamatdatang(Model model){
        model.addAttribute("fitri", "Selamat Datang Di Website Ini");
        return "selamatdatang";
    }
    
    @RequestMapping("/hidangan")
    public String hidangan(Model model){
        model.addAttribute("fitri", "Silakan Dinikmati Hidangannya");
        return "selamatdatang";
    }
}
