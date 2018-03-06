package codetao.web.controller.user;

import codetao.domain.Role;
import codetao.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

/**
 * Created by taohuang on 2018/3/2.
 */
@RestController
@RequestMapping("/roles")
public class RoleController {

    @Autowired
    private RoleService roleService;

    @GetMapping
    public List<Role> list(){
        System.out.println(">>>>> request list <<<<<");
        return roleService.findAll();
    }

    @PostMapping
    public Role create(@RequestBody Map<String, String> map) throws Exception{
        String name = map.get("name");
        if(StringUtils.isEmpty(name)){
            throw new Exception("abc");
        }

        Role role = new Role();
        role.setName(name);
        return roleService.create(role);
    }

    @PutMapping("/{id}")
    public void update(@PathVariable String id, @RequestBody Map<String, String> map){
        System.out.println(id);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) throws Exception{
        Role role = roleService.getById(id);
        if(role == null){
            throw new Exception("role not found");
        }
        roleService.delete(role);
    }
}
