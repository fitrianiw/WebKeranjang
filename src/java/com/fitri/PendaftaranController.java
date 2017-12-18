package com.fitri;

import com.fitri.dao.PelayananPengguna;
import com.fitri.model.User;
import com.fitri.utils.PasswordDigest;
import static com.mchange.v2.c3p0.impl.C3P0Defaults.user;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
@RequestMapping("/pendaftaran")
public class PendaftaranController {
    
    @Autowired
    PelayananPengguna fb;
    
    @RequestMapping()
    public String formPendaftaran(Model model){
        FormPendaftaranBean pendaftaranBean = new FormPendaftaranBean();
        model.addAttribute("pendaftaranBean", pendaftaranBean);
        return "pendaftaran";
    }
    
    @RequestMapping(value="/simpan")
    public String simpanPendaftaran(@ModelAttribute("pendaftaranBean") FormPendaftaranBean pendaftaranBean, Model model){
        User user = new User();
        String encryptedPassword = PasswordDigest.createEncryptedPassword(pendaftaranBean.getPassword());
        System.out.println("Username "+pendaftaranBean.getNamadepan()+" = "+encryptedPassword);
        user.setNamadepan(pendaftaranBean.getNamadepan());
        user.setNamabelakang(pendaftaranBean.getNamabelakang());
        user.setUsername(pendaftaranBean.getUsername());
        user.setPassword(encryptedPassword);
        user.setTempatlahir(pendaftaranBean.getTempatlahir());
        user.setEmail(pendaftaranBean.getEmail());
        user.setAlamat(pendaftaranBean.getAlamat());
        
        fb.simpanPengguna(user);
        
        model.addAttribute("data", pendaftaranBean);
        return "pendaftaranberhasill";
    }
}
