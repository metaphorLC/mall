package com.macro.mall.dao;

import com.macro.mall.model.UmsAdmin;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @version 1.0.0
 * @program: mall
 * @className: UmsAdminDao
 * @description: 后台管理员自定义查询 Dao
 * @author: Lin
 * @create: 2026/9/12 23:30
 **/
public interface UmsAdminDao {

    List<UmsAdmin> list(
            @Param("keyword") String keyword,
            @Param("status") Integer status,
            @Param("roleId") Long roleId
    );
}
