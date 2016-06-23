package com.zhangzhihao.SpringMVCWithJavaConfig.Controller;


import com.zhangzhihao.SpringMVCWithJavaConfig.Annotation.Auth;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class MustLoginController {
    /**
     * 必须登录才可以进入
     */
//    @AuthByRole()
    @Auth
    @RequestMapping("/MustLogin")
    public String MustLogin(){
        return "/MustLogin/MustLogin";
    }
}
