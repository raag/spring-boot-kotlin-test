package com.raag.test.data.entity

import javax.persistence.*
import kotlin.collections.List

@Entity
@Table(name = "customer")
data class Customer(

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column("customer_id")
	val customerId: Int,

	val name: String,

	@Column(name = "last_name")
	val lastName: String,

	@Column(name = "cell_phone")
	val cellPhone: String,

	val address: String,

	val email: String,

	@OneToMany(mappedBy = "customer")
	val sales: List<Sale>
)
