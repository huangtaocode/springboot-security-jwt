package codetao.service;

import codetao.domain.Role;
import codetao.repository.RoleDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleService {

    @Autowired
    private RoleDao roleDao;

    public List<Role> findAll(){
        List<Role> roles = roleDao.findAll();

        return roles;
    }


    public Role create(Role entity){
        return roleDao.save(entity);
    }

    public Role getById(Long id){
        return roleDao.getOne(id);
    }

    public void delete(Long id){
        roleDao.delete(id);
    }

    public void delete(Role entity){
        roleDao.delete(entity);
    }
}
