package soh.labor.application.service;


/**
 * Service for Security.
 *
 * @author Nesterov Yehor
 * @version 0.25
 */
public interface SecurityService {

    String findLoggedInUsername();

    void autoLogin(String username, String password);
}
