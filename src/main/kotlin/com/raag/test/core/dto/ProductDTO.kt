package com.raag.test.core.dto

data class ProductDTO(
	var productId: Int? = null,
	var product: String? = null,
	var categoryId: Int? = null,
	var barCode: String? = null,
	var price: Double? = null,
	var stockQuantity: Int? = null,
	var status: Boolean? = null,
	var category: CategoryDTO? = null,
	// var sale: List<ProductSale>
)
