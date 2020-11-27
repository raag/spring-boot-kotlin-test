package com.raag.test.core.usecase.product

import com.raag.test.data.repository.ProductRepository
import com.raag.test.core.dto.ProductDTO
import com.raag.test.data.mapper.ProductMapper
import org.springframework.stereotype.Service
import org.springframework.beans.factory.annotation.Autowired

@Service
class ListProductsUseCase (
	@Autowired val mapper: ProductMapper,
	@Autowired val productRepository: ProductRepository
) {


	fun execute(): List<ProductDTO> {
		val products = productRepository.findAll()
		return mapper.toProductsDTO(products) 
	} 
}
