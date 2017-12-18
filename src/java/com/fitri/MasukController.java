package com.fitri;

import com.fitri.dao.PelayananPengguna;
import com.fitri.model.User;
import com.fitri.utils.PasswordDigest;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/masuk")
public class MasukController {
    
    
    @Autowired
    PelayananPengguna fb;
    
    @RequestMapping()
    public String segeraMasuk(Model model){
        MasukBean masukBean = new MasukBean();
        model.addAttribute("masukBean", masukBean);
        return "masuk";
    }
    
    @RequestMapping(value = "/coba")
    public String cobaMasuk(HttpSession session, @ModelAttribute("masukBean") MasukBean masukBean, Model model){
        User user = fb.findByUsername(masukBean.getUsername());
        if(user.getUsername() == null){
            model.addAttribute("fitriii", "Username Tidak Benar");
            return "masuk";
        }
        
        String encryptedPassword = PasswordDigest.createEncryptedPassword(masukBean.getPassword());
        if(!encryptedPassword.equals(user.getPassword())){
            model.addAttribute("fitriii", "Password Tidak benar");
            return "masuk";
        }
        
        session.setAttribute("user", user);
        
        return "berhasilmasuk";
    }
}
