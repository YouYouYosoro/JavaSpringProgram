package com.itchen.reggie.mapper;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.itchen.reggie.entity.Employee;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface EmployeeMapper extends BaseMapper<Employee> {
    /**
     * 继承BaseMapper，常见的增删改查方法里面都有
     */
}
