package com.fitri;

import javax.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/keluar")
public class KeluarController {
    
    @RequestMapping() 
    public String keluar(HttpSession session, Model model) {
        session.invalidate();
        return "selamatdatang ";
    }
    
}
