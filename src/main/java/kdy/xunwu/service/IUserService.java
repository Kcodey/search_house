package kdy.xunwu.service;
import kdy.xunwu.entity.User;
/**
 * Created by BigK
 * 2019-02-20 22:10
 */
public interface IUserService  {
    User findUserByName(String userName);
}
