package codetao.controller.user;

import codetao.domain.Role;
import codetao.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

/**
 * Created by taohuang on 2018/3/2.
 */
@RestController
@RequestMapping("/role")
public class RoleController {

    @Autowired
    private RoleService roleService;

    @GetMapping("/list")
    public List<Role> list(){
        return roleService.findAll();
    }

    @PostMapping("/create")
    public void create(@RequestBody Map<String, Object> map){
        System.out.println(map);
    }
}
