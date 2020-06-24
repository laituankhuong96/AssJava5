package com.khuonglt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.khuonglt.services.CategoryService;
import com.khuonglt.services.ProductService;

@Controller
public class CategoryController {

	@Autowired
	private CategoryService categoryService;

	@Autowired
	private ProductService productService;

	@GetMapping("/load")
	public String category(ModelMap model) {
		model.addAttribute("categories", categoryService.findAll());
		return "load";
	}

//	@GetMapping("/products")
//	public String getPrByCate(@RequestParam("cateID") int id, ModelMap model) {
//		model.addAttribute("categories", categoryService.findAll());
//		model.addAttribute("products", productService.searchByCateID(id));
//		return "load";
//	}

//	@GetMapping("/searchProduct")
//	public String searchByPriceRange(ModelMap model, @RequestParam("priceRange") String priceRange) {
//		long[] price = test.getPrice(priceRange);
//		model.addAttribute("products", productService.SearchByPriceRange(price[0], price[1]));
//		return "load";
//	}

}
