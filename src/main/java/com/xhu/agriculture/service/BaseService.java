package com.xhu.agriculture.service;

/**
 * 基本的servcie接口
 * @param <T>
 */
public interface BaseService<T> {
    /**
     * 通过id查询
     * @param id
     * @return
     */
    T findById(Integer id);

    /**
     * 通过id删除
     * @param id
     */
    void deleteById(Integer id);

    /**
     * 通过修改
     * @param t
     */
    void update(T t);

    /**
     * 插入数据
     * @param t
     */
    void insert(T t);
}
