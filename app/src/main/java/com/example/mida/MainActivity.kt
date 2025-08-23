package com.example.mida

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.example.mida.model.EstadoRepository

class MainViewModel : ViewModel() {
    private val repository = EstadoRepository()
    val estado: LiveData<String> = repository.estado
    fun actualizarEstado(etapa: String) {
        repository.actualizarEstado(etapa)
    }
}