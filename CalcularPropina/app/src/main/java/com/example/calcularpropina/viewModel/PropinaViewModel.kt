package com.example.calcularpropina.viewModel

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import com.example.calcularpropina.model.PropinaState

class PropinaViewModel {
    var state by mutableStateOf(PropinaState())
        private set
    private val ONLY_NUMBERS = Regex("^\\d+\$")
    fun onPrecioChange(value: String) {
        if (value.isEmpty() || value.matches(ONLY_NUMBERS)) {
            state = state.copy(precioMenu = value)
        }
    }

    fun onPorcentajeChange(value: String) {
        if (value.isEmpty() || value.matches(ONLY_NUMBERS)) {
            state = state.copy(porcentajePropina = value)
        }
    }
    fun calcularPropina() {
        val precio = state.precioMenu.toDoubleOrNull()
        val porcentaje = state.porcentajePropina.toDoubleOrNull()

        if (precio != null && porcentaje != null) {
            val propina = precio * (porcentaje / 100)
            val total = precio + propina
            state = state.copy(propina = propina, totalConPropina = total)
        } else {
            state = state.copy(propina = null, totalConPropina = null)
        }
    }
    fun incrementarPropina() {
        val actual = state.porcentajePropina.toDoubleOrNull() ?: 0.0
        val nuevo = actual + 1
        state = state.copy(porcentajePropina = nuevo.toString())
    }

    fun decrementarPropina() {
        val actual = state.porcentajePropina.toDoubleOrNull() ?: 0.0
        val nuevo = (actual - 1).coerceAtLeast(0.0) // mai menor de 0
        state = state.copy(porcentajePropina = nuevo.toString())
    }
}