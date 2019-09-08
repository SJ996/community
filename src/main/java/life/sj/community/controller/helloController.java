package life.sj.community.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class helloController {
//    一个/表示访问根目录下的路径不写他会自己去templates下面找index.html文件
   @GetMapping("/")
    public String index(){
        return "index";
    }
}
