package com.example.pr4

import android.content.Intent
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity6 : AppCompatActivity() {
    private lateinit var emailCodeField1: EditText
    private lateinit var emailCodeField2: EditText
    private lateinit var emailCodeField3: EditText
    private lateinit var emailCodeField4: EditText
    private lateinit var goToMainActivity7Button: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main6)

        emailCodeField1 = findViewById(R.id.emailCodeField1)
        emailCodeField2 = findViewById(R.id.emailCodeField2)
        emailCodeField3 = findViewById(R.id.emailCodeField3)
        emailCodeField4 = findViewById(R.id.emailCodeField4)
        goToMainActivity7Button = findViewById(R.id.svo)

        // Добавляем слушатель текста для каждого поля EditText
        emailCodeField1.addTextChangedListener(textWatcher)
        emailCodeField2.addTextChangedListener(textWatcher)
        emailCodeField3.addTextChangedListener(textWatcher)
        emailCodeField4.addTextChangedListener(textWatcher)

        // Добавляем обработчик нажатия на кнопку
        goToMainActivity7Button.setOnClickListener {
            // Проверяем, что все поля заполнены
            val code = "${emailCodeField1.text}${emailCodeField2.text}${emailCodeField3.text}${emailCodeField4.text}"
            if (code.length == 4) {
                // Выводим сообщение
                Toast.makeText(this@MainActivity6, "ПАСХАЛКО", Toast.LENGTH_SHORT).show()
                // Переходим на следующую активити
                startActivity(Intent(this@MainActivity6, MainActivity7::class.java))
            } else {
                // Если не все поля заполнены, выводим предупреждение
                Toast.makeText(this@MainActivity6, "Введите код полностью", Toast.LENGTH_SHORT).show()
            }
        }
    }

    private val textWatcher = object : TextWatcher {
        override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}

        override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {}

        override fun afterTextChanged(s: Editable?) {
            if (s?.length == 1) {
                // Переносим фокус на следующее поле после ввода символа
                when (s) {
                    emailCodeField1.text -> emailCodeField2.requestFocus()
                    emailCodeField2.text -> emailCodeField3.requestFocus()
                    emailCodeField3.text -> emailCodeField4.requestFocus()
                }
            }
        }
    }
}

