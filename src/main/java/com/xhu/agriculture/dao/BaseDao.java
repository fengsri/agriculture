package com.xhu.agriculture.dao;

import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Description 基础接口
 * @Author chenlinghong
 * @Date 2019/4/11 20:31
 * @Version V1.0
 */
public interface BaseDao<T>{
    /**
     * 新增数据
     *
     * @param t
     * @return
     */
    int insert(T t);

    /**
     * 根据ID删除
     *
     * @param id
     * @return
     */
    int deleteById(Integer id);

    /**
     * 根据ID获取
     *
     * @param id
     * @return
     */
    T getById(Integer id);

    /**
     * 分页获取
     *
     * @param offset 偏移量
     * @param rows   行数
     * @return
     */
    List<T> listAll(@Param("offset") long offset, @Param("rows") long rows);

    /**
     * 获取总行数
     *
     * @return
     */
    long count();

    /**
     * 更新基本信息
     *
     * @param t
     * @return
     */
    int update(T t);
}
