package com.jamel.gmall.pms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.jamel.gmall.pms.entity.SpuImagesEntity;
import com.atguigu.core.bean.PageVo;
import com.atguigu.core.bean.QueryCondition;


/**
 * spu图片
 *
 * @author jamel
 * @email 1013893774@qq.com
 * @date 2020-02-12 16:38:56
 */
public interface SpuImagesService extends IService<SpuImagesEntity> {

    PageVo queryPage(QueryCondition params);
}

