package com.raag.test.data.entity

import javax.persistence.*
import kotlin.collections.List

@Entity
@Table(name="product")
data class Product (

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column("product_id")
	var productId: Int? = null,

	var name: String? = null,

	@Column("category_id")
	var categoryId: Int? = null,

	@Column("bar_code")
	var barCode: String? = null,

	var price: Double? = null,

	@Column("stock_quantity")
	var stockQuantity: Int? = null,

	var status: Boolean? = null,

	@ManyToOne
	@JoinColumn(name = "category_id", insertable = false, updatable = false)
	var category: Category? = null,

	@OneToMany(referencedBy="sale")
	var sales: List<ProductSale>? = null
)
