package com.xhu.agriculture.web.controller;

import com.xhu.agriculture.comment.PageDto;
import com.xhu.agriculture.comment.ResultUtil;
import com.xhu.agriculture.comment.ResultVo;
import com.xhu.agriculture.enums.ErrorCodeEnum;
import com.xhu.agriculture.exception.BusinessException;
import com.xhu.agriculture.repository.TestDomain;
import com.xhu.agriculture.service.TestService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Description
 * @Author fengwen
 * @Date 2019/7/6 22:49
 * @Version V1.0
 */
@Controller
@Slf4j
@RequestMapping(value = "test")
public class TestDomainController extends BaseController{


    /**
     * 插入
     * @param testDomain
     * @return
     */
    @RequestMapping(value = "insert",method = RequestMethod.POST)
    @ResponseBody
    public ResultVo insert(TestDomain testDomain){
        /**
         * 1、调用service的插入方法
         */
        boolean result = testService.insert(testDomain);

        /**
         * 2、查看插入是否成功
         */
        if(!result){
            throw new BusinessException(ErrorCodeEnum.DATA_SAVE_ERROR);
        }

        /**
         * 3、返回数据
         */
        return ResultUtil.success();
    }


    /**
     * id查询
     * @param id
     * @return
     */
    @RequestMapping(value = "get",method = RequestMethod.GET)
    @ResponseBody
    public ResultVo getById(Integer id){
        /**
         * 1、调用service的查询方法
         */
        TestDomain testDomain = testService.findById(id);

        /**
         * 2、查看是否成功
         */
        if(testDomain==null){
            throw new BusinessException(ErrorCodeEnum.DATA_NULL_ERROR);
        }

        /**
         * 3、返回数据
         */
        return ResultUtil.success(testDomain);
    }


    /**
     * 修改
     * @param testDomain
     * @return
     */
    @RequestMapping(value = "update",method = RequestMethod.POST)
    @ResponseBody
    public ResultVo update(TestDomain testDomain){
        /**
         * 1、调用service的修改方法
         */
        boolean result = testService.update(testDomain);

        /**
         * 2、查看是否成功
         */
        if(!result){
            throw new BusinessException(ErrorCodeEnum.DATA_UPDATE_ERROR);
        }

        /**
         * 3、返回数据
         */
        return ResultUtil.success();
    }



    /**
     * 删除
     * @param id
     * @return
     */
    @RequestMapping(value = "delete",method = RequestMethod.POST)
    @ResponseBody
    public ResultVo delete(Integer id){
        /**
         * 1、调用service的删除方法
         */
        boolean result = testService.deleteById(id);

        /**
         * 2、查看是否成功
         */
        if(!result){
            throw new BusinessException(ErrorCodeEnum.DATA_DELETE_ERROR);
        }

        /**
         * 3、返回数据
         */
        return ResultUtil.success();
    }

    /**
     * 分页
     * @param pageNo
     * @param pageSize
     * @return
     */
    @RequestMapping(value = "list",method = RequestMethod.GET)
    @ResponseBody
    public ResultVo listAll(Long pageNo,Long pageSize){
        /**
         * 1、调用service的删除方法
         */
        PageDto<TestDomain> testDomainPageDto = testService.listAll(pageNo, pageSize);

        /**
         * 3、返回数据
         */
        return ResultUtil.success(testDomainPageDto);
    }


}
