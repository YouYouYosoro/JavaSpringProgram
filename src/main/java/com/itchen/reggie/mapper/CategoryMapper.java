package com.itchen.reggie.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.itchen.reggie.entity.Category;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CategoryMapper extends BaseMapper<Category> {
    /**
     * 继承BaseMapper，常见的增删改查方法里面都有
     */
}
