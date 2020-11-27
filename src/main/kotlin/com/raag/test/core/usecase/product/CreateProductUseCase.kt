package com.raag.test.core.usecase.product

import com.raag.test.data.repository.ProductRepository
import com.raag.test.data.entity.Product
import org.springframework.stereotype.Service

@Service
class CreateProductUseCase(private val productRepository: ProductRepository) {

	fun execute(product: Product): Product = productRepository.save(product)

}
