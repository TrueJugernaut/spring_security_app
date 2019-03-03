package soh.labor.application.service;

import soh.labor.application.models.User;

/**
 * Service class for {@link soh.labor.application.models.User}
 *
 * @author Nesterov Yehor
 * @version 0.25
 */

public interface UserService {
    void safe(User user);

    User findByUsername(String username);

}
