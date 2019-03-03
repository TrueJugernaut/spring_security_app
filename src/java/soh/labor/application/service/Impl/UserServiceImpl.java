package soh.labor.application.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import soh.labor.application.dao.RoleDao;
import soh.labor.application.dao.UserDao;
import soh.labor.application.models.Role;
import soh.labor.application.models.User;
import soh.labor.application.service.UserService;

import java.util.HashSet;
import java.util.Set;

/**
 * Implementation of {@link UserService} interface
 *
 * @author Nesterov Yehor
 * @version 0.25
 */

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Autowired
    private RoleDao roleDao;

    @Autowired
    private BCryptPasswordEncoder passwordEncoder;

    @Override
    public void safe(User user) {
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        Set<Role> roles = new HashSet<>();
        roles.add(roleDao.getOne(1L));
        user.setRoles(roles);
        userDao.save(user);
    }

    @Override
    public User findByUsername(String username) {
        return userDao.findByUsername(username);
    }
}
