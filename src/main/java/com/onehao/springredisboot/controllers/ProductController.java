package com.onehao.springredisboot.controllers;

import com.onehao.springredisboot.bean.Product;
import com.onehao.springredisboot.mappers.ProductMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by michael.wh on 2017/6/2.
 */
@RestController
@RequestMapping("/product")
public class ProductController {
    Product p1 = new Product(1L, "p1", 1000L);
    Product p2 = new Product(2L, "p2", 2000L);

    @Autowired
    private ProductMapper productMapper;

    @GetMapping("/{id}")
    public Product getProductInfo(
            @PathVariable("id") Long productId) {

        if(productId.longValue() == 1){
            return p1;
        }else if(productId.longValue() == 2){
            return p2;
        }
        return productMapper.select(productId);
    }

    @PutMapping("/{id}")
    public Product updateProductInfo(
            @PathVariable("id") Long productId,
            @RequestBody Product newProduct) {
// TODO
        return null;
    }
}
