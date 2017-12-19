package com.fitri;

import com.fitri.dao.PelayananProduct;
import com.fitri.model.Productt;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/selamatdatang")
public class SelamatDatang {
    
    @Autowired
    PelayananProduct dao;
    
    @RequestMapping()
    public String selamatdatang(Model model) {
        List<Productt> prod = dao.showAllProduct();
        model.addAttribute("produk", prod);
        model.addAttribute("fitri", "Selamat Datang Di Website Ini");
        return "selamatdatang";
    }

    @RequestMapping("/hidangan")
    public String hidangan(Model model) {
        model.addAttribute("fitri", "Silakan Dinikmati Hidangannya");
        return "selamatdatang";
    }
}
