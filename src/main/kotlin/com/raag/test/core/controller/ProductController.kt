package com.raag.test.core.controller

import org.springframework.web.bind.annotation.*
import com.raag.test.core.usecase.product.ListProductsUseCase
import com.raag.test.core.dto.ProductDTO
import org.springframework.beans.factory.annotation.Autowired

@RestController
@RequestMapping("/product")
class ProductController(@Autowired private val listProductsUseCase: ListProductsUseCase) {
	
	@GetMapping
	fun list(): List<ProductDTO> = listProductsUseCase.execute()

}
