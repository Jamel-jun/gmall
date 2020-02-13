package com.jamel.gmall.pms.dao;

import com.jamel.gmall.pms.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author jamel
 * @email 1013893774@qq.com
 * @date 2020-02-12 16:38:56
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
