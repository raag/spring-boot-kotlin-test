package com.raag.test.data.entity

import java.time.LocalDateTime
import javax.persistence.*
import kotlin.collections.List

@Entity
@Table(name="sale")
data class Sale (

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column("sale_id")
	val saleId: Int,

	@Column("customer_id")
	val customerId: Int,

	@Column("sale_date")
	val saleDate: LocalDateTime,

	@Column("pay_method")
	val payMethod: String,

	val comment: String,
	
	val status: String,

	@ManyToOne
	@JoinColumn(name = "customer_id", insertable = false, updatable = false)
	val customer: Customer,

	@OneToMany(referencedBy="product")
	val products: List<ProductSale>

)
