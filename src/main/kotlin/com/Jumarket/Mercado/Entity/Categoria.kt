package com.Jumarket.Mercado.Entity

import jakarta.persistence.Embeddable
import jakarta.persistence.Embedded

data class Categoria(
    @Embedded val categoria : String
)
