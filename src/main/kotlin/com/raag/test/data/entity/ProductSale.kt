package com.raag.test.data.entity

import javax.persistence.*

@Entity
@Table(name = "product_sale")
data class ProductSale(

	@EmbeddedId
	val id: ProductSalePK,

	val quantity: Int,

	val total: Double,

	val status: Boolean,

	@ManyToOne
	@JoinColumn(name = "sale_id", insertable = false, updatable = false)
	val sale: Sale,

	@ManyToOne
	@JoinColumn(name = "product_id", insertable = false, updatable = false)
	val product: Product,
)
