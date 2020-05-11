package com.flexibledev.tobaccoshop.controllers;

import com.flexibledev.tobaccoshop.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/product")
public class ProductController {

    private final ProductService productService;

    @Autowired
    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/detail/{id}")
    ModelAndView detail(@PathVariable long id) {
        ModelAndView mv = new ModelAndView("product/detail");
        mv.addObject("product", productService.getProduct(id));
        return mv;
    }

    @GetMapping("/add")
    ModelAndView add() {
        return new ModelAndView("product/add");
    }

}
