package com.raag.test.data.mapper

import org.mapstruct.Mapper
import org.mapstruct.Mappings
import org.mapstruct.Mapping
import org.mapstruct.InheritInverseConfiguration
import com.raag.test.core.dto.CategoryDTO
import com.raag.test.data.entity.Category

@Mapper(componentModel = "spring")
interface CategoryMapper {

	@Mappings(value = [
		Mapping(source = "categoryId", target = "categoryId"),
		Mapping(source = "description", target = "category"),
		Mapping(source = "status", target = "active")
	])
	fun toCategoryDTO(category: Category): CategoryDTO

	@InheritInverseConfiguration
	@Mapping(target = "products", ignore = true)
	fun toCategory(categoryDTO: CategoryDTO): Category

}
