package com.xhu.agriculture.repository;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Description 测试
 * @Author chenlinghong
 * @Date 2019/3/29 18:15
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TestDomain extends BaseDomain{

    private static final long serialVersionUID = 5996101266734316172L;

    /**
     * 名称
     */
    private String name;
}
