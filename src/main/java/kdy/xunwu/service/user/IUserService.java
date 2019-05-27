package kdy.xunwu.service.user;
import kdy.xunwu.entity.User;
import kdy.xunwu.service.ServiceResult;
import kdy.xunwu.web.dto.UserDTO;

/**
 * Created by BigK
 * 2019-02-20 22:10
 */
public interface IUserService  {
    User findUserByName(String userName);

    ServiceResult<UserDTO> findById(Long userId);
    /**
     * 根据电话号码寻找用户
     * @param telephone
     * @return
     */
    User findUserByTelephone(String telephone);

    /**
     * 通过手机号注册用户
     * @param telephone
     * @return
     */
    User addUserByPhone(String telephone);

    /**
     * 修改指定属性值
     * @param profile
     * @param value
     * @return
     */
//    ServiceResult modifyUserProfile(String profile, String value);

}
