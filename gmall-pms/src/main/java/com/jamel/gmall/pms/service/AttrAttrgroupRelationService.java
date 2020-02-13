package com.jamel.gmall.pms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.jamel.gmall.pms.entity.AttrAttrgroupRelationEntity;
import com.atguigu.core.bean.PageVo;
import com.atguigu.core.bean.QueryCondition;


/**
 * 属性&属性分组关联
 *
 * @author jamel
 * @email 1013893774@qq.com
 * @date 2020-02-12 16:38:56
 */
public interface AttrAttrgroupRelationService extends IService<AttrAttrgroupRelationEntity> {

    PageVo queryPage(QueryCondition params);
}

