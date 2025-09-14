package com.roynaldi19.kotlinrestfullapi.repository

import com.roynaldi19.kotlinrestfullapi.entity.Product
import org.springframework.data.jpa.repository.JpaRepository

interface ProductRepository: JpaRepository<Product, String> {
}