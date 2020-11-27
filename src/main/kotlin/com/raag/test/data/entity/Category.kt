package com.raag.test.data.entity

import javax.persistence.*
import kotlin.collections.List

@Entity
@Table(name = "category")
data class Category(

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column("category_id")
	var categoryId: Int? = null,

	var description: String? = null,

	var status: Boolean? = null,

	@OneToMany(mappedBy="category")
	var products: List<Product>? = null
)
