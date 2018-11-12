package mechamoedson.springmvc.exemplo.dao;

import java.util.List;
import mechamoedson.springmvc.exemplo.model.User;
 
public interface UserDao {
 
    User findById(int id);
     
    User findBySSO(String sso);
     
    void save(User user);
     
    void deleteBySSO(String sso);
     
    List<User> findAllUsers();
 
}