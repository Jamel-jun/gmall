package com.jamel.gmall.pms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.jamel.gmall.pms.entity.SkuImagesEntity;
import com.atguigu.core.bean.PageVo;
import com.atguigu.core.bean.QueryCondition;


/**
 * sku图片
 *
 * @author jamel
 * @email 1013893774@qq.com
 * @date 2020-02-12 16:38:56
 */
public interface SkuImagesService extends IService<SkuImagesEntity> {

    PageVo queryPage(QueryCondition params);
}

