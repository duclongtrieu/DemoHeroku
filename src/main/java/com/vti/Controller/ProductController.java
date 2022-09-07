package com.vti.Controller;

import com.vti.Entity.Product;
import com.vti.Repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class ProductController {

    @Autowired
    private ProductRepository productRepo;

    @GetMapping("/product/list")
    public String getAll(Model model) {
        List<Product> products = productRepo.findAll();
        model.addAttribute("ListProduct", products);
        return "product-list";
    }

    @GetMapping ("/product/add")
    public String add(Model model) {
        return "product-add";
    }

    @PostMapping("/product/save")
    public String save(@ModelAttribute Product product) {
        productRepo.save(product);
        return "redirect:/product/list";
    }

}
