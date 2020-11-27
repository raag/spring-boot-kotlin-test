package com.raag.test.data.entity

import javax.persistence.*
import java.io.Serializable

@Embeddable
data class ProductSalePK(
	@Column(name = "sale_id")
	val saleId: Int,

	@Column(name = "product_id")
	val productId: Int
): Serializable
