package com.itchen.reggie.dto;

import com.itchen.reggie.entity.Setmeal;
import com.itchen.reggie.entity.SetmealDish;
import lombok.Data;
import java.util.List;

@Data
public class SetmealDto extends Setmeal {

    private List<SetmealDish> setmealDishes;

    private String categoryName;
}
