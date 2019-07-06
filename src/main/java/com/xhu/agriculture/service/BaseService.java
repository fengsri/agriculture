package com.xhu.agriculture.service;

import com.xhu.agriculture.comment.PageDto;
import org.apache.ibatis.annotations.Param;

import java.util.List;

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
    boolean deleteById(Integer id);

    /**
     * 通过修改
     * @param t
     */
    boolean update(T t);

    /**
     * 插入数据
     * @param t
     */
    boolean insert(T t);

    /**
     * 总的数
     * @return
     */
    long count();


    /**
     * 分页获取
     * @param pageNo
     * @param pageSize
     * @return
     */
    PageDto<T> listAll(long pageNo, long pageSize);

}
