package com.raag.test.core.controller

import org.springframework.web.bind.annotation.*
import com.raag.test.core.usecase.product.ListProductsUseCase
import com.raag.test.core.dto.ProductDTO

@RestController
@RequestMapping("/product")
class ProductController(private val listProductsUseCase: ListProductsUseCase) {
	
	@GetMapping
	fun list(): List<ProductDTO> = listProductsUseCase.execute()

}
