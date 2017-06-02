package com.onehao.springredisboot.mappers;

import com.onehao.springredisboot.bean.Product;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * Created by michael.wh on 2017/6/2.
 */
@Mapper
public interface ProductMapper {
    Product select(
            @Param("id")
                    long id);
    void update(Product product);
}