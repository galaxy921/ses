package ses.dao;

import ses.model.User;

import java.util.List;

public interface UserDao {
    /**
     * 列出用户列表
     * @return List
     */
    List<User> queryUser();
}
