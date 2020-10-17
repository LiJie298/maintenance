package com.casciences.maintenance.controller;

import com.casciences.maintenance.entity.EquipInfo;
import com.casciences.maintenance.service.base.EquipInfoService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * (EquipInfo)表控制层
 *
 * @author makejava
 * @since 2020-09-13 22:04:40
 */
@Controller
@RequestMapping("equipInfo")
public class EquipInfoController {
    /**
     * 服务对象
     */
    @Resource
    private EquipInfoService equipInfoService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    @ResponseBody
    public EquipInfo selectOne(Integer id) {
        return this.equipInfoService.queryById(id);
    }

}