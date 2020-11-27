package com.raag.test.core.usecase.product

import com.raag.test.data.repository.ProductRepository
import com.raag.test.data.entity.Product
import org.springframework.stereotype.Component

@Component
class FetchProductUseCase(private val productRepository: ProductRepository) {

	fun execute(productId: Int): Product? {
		val product = productRepository.findById(productId)
		if (product.isPresent()) {
			return product.get()
		}

		return null
	}

}
