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
}
