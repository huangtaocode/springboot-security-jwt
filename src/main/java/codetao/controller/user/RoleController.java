package codetao.controller.user;

import codetao.domain.Role;
import codetao.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by taohuang on 2018/3/2.
 */
@Controller
@RequestMapping("role")
public class RoleController {

    @Autowired
    private RoleService roleService;

    @RequestMapping("/list")
    @ResponseBody
    public List<Role> list(){




        return roleService.findAll();
    }
}
