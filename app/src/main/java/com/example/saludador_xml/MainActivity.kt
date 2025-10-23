package com.example.saludador_xml

import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.inputmethod.InputMethodManager
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
class MainActivity : AppCompatActivity() {

    private lateinit var etNombre: EditText
    private lateinit var btnSaludar: Button
    private lateinit var tvMensaje: TextView
    private lateinit var tvContador: TextView
    companion object {
        private const val MAX_LENGTH = 20
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        etNombre = findViewById(R.id.etNombre)
        btnSaludar = findViewById(R.id.btnSaludar)
        tvMensaje = findViewById(R.id.tvMensaje)
        tvContador = findViewById(R.id.tvContador)
        setupTextWatcher()
        btnSaludar.setOnClickListener {
            handleSaludarClick()
        }
    }

    private fun setupTextWatcher() {
        etNombre.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
            }

            override fun afterTextChanged(s: Editable?) {
                val texto = s?.toString() ?: ""
                val longitud = texto.length

                btnSaludar.isEnabled = texto.isNotBlank()

                tvContador.text = "$longitud / $MAX_LENGTH"
            }
        })
    }

    private fun handleSaludarClick() {
        val nombre = etNombre.text.toString().trim()

        if (nombre.isEmpty()) {
            tvMensaje.text = "Introduce tu nombre"
        } else {
            tvMensaje.text = "Hola, $nombre ¿Como Estas?"
        }
        hideKeyboard()
    }
    private fun hideKeyboard() {
        val imm = getSystemService(INPUT_METHOD_SERVICE) as InputMethodManager
        val view = currentFocus ?: etNombre
        imm.hideSoftInputFromWindow(view.windowToken, 0)
    }

    override fun onStop() {
        super.onStop()
        resetUi()
    }

    private fun resetUi() {
        etNombre.text.clear()
        tvMensaje.text = ""
        btnSaludar.isEnabled = false
        tvContador.text = "0 / $MAX_LENGTH"
    }
}