package com.raag.test.data.mapper

import org.mapstruct.Mapper
import org.mapstruct.Mappings
import org.mapstruct.Mapping
import org.mapstruct.InheritInverseConfiguration
import com.raag.test.core.dto.ProductDTO
import com.raag.test.data.entity.Product
import org.springframework.stereotype.Component

@Mapper(componentModel = "spring", uses = [CategoryMapper::class])
interface ProductMapper {

	@Mappings(value = [
		Mapping(source = "productId", target = "productId"),
		Mapping(source = "name", target = "product"),
		Mapping(source = "categoryId", target = "categoryId"),
		Mapping(source = "barCode", target = "barCode"),
		Mapping(source = "price", target = "price"),
		Mapping(source = "stockQuantity", target = "stockQuantity"),
		Mapping(source = "status", target = "status"),
		Mapping(source = "category", target = "category")
	])
	fun toProductDTO(product: Product): ProductDTO
	fun toProductsDTO(products: List<Product>): List<ProductDTO>

	@InheritInverseConfiguration
	@Mapping(target = "sales", ignore = true)
	fun toProduct(productDTO: ProductDTO): Product

}

