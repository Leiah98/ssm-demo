package com.ssm.demo.dao;

import com.ssm.demo.entity.AdminUser;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * @program: ssm-demo
 * @description: 默认用户
 * @author: Leiah1998
 * @create: 2019-08-06 15:27
 **/
public interface AdminUserDao {
    /**
     * 新增用户记录
     * @param user
     * @return
     */
    int addUser(AdminUser user);

    /**
     * 批量删除
     * @param ids
     * @return
     */
    int deleteBatch(Object[] ids);

    /**
     * 根据参数查询用户列表
     * @param param
     * @return
     */
    List<AdminUser> findAdminUsers(Map param);

    /**
     * 查询用户总数
     * @param param
     * @return
     */
    int getTotalAdminUser(Map param);

    /**
     * 根据用户名和密码获取用户记录
     * @param userName
     * @param passwordMD5
     * @return
     */
    AdminUser getAdminUserByUserNameAndPassword(@Param("userName") String userName, @Param("passwordMD5") String passwordMD5);

    /**
     * 根据id获取用户记录
     * @param id
     * @return
     */
    AdminUser getAdminUserById(Long id);

    /**
     * 根据userToken获取用户记录
     * @param userToken
     * @return
     */
    AdminUser getAdminUserByToken(String userToken);

    /**
     * 根据用户名获取用户记录
     * @param userName
     * @return
     */
    AdminUser getAdminUserByUserName(String userName);

    /**
     * 查询所有用户列表
     * @return
     */
    List<AdminUser> getAllAdminUsers();

    /**
     * 批量新增用户记录
     * @param adminUsers
     * @return
     */
    int insertUsersBatch(@Param("adminUsers") List<AdminUser> adminUsers);

    /**
     * 修改密码
     * @param userId
     * @param newPassword
     * @return
     */
    int updateUserPassword(@Param("userId") Long userId, @Param("newPassword") String newPassword);

    /**
     * 更新用户Token值
     * @param userId
     * @param newToken
     * @return
     */
    int updateUserToken(@Param("userId") Long userId, @Param("newToken") String newToken);
}
