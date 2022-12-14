package web.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import web.dao.UserDAO;
import web.model.User;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class UserServiceImpl implements UserService{
    private UserDAO userDAO;
    public UserServiceImpl(UserDAO userDAO) {
        this.userDAO = userDAO;
    }
    @Transactional
    @Override
    public List<User> allUsers() {
        return userDAO.allUsers();
    }
@Transactional
    @Override
    public void save(User user) {
        userDAO.save(user);
    }
@Transactional
    @Override
    public void delete(User user) {
        userDAO.delete(user);
    }
@Transactional
    @Override
    public User getById(Long id) {
        return userDAO.getById(id);
    }
}