package com.example.pr4

import android.graphics.Color
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class MainActivity8 : AppCompatActivity() {

    private lateinit var nameEditText: EditText
    private lateinit var name1EditText: EditText
    private lateinit var name2EditText: EditText
    private lateinit var name3EditText: EditText
    private lateinit var name4EditText: EditText
    private lateinit var createButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main8)

        nameEditText = findViewById(R.id.name)
        name1EditText = findViewById(R.id.name1)
        name2EditText = findViewById(R.id.name2)
        name3EditText = findViewById(R.id.name3)
        name4EditText = findViewById(R.id.name4)
        createButton = findViewById(R.id.buttonCrete)

        // Устанавливаем слушатель изменения текста для каждого EditText поля
        val textWatcher = object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}
            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {}

            override fun afterTextChanged(s: Editable?) {
                // Проверяем, все ли EditText поля заполнены
                val allFieldsFilled = (
                        nameEditText.text.isNotEmpty() &&
                                name1EditText.text.isNotEmpty() &&
                                name2EditText.text.isNotEmpty() &&
                                name3EditText.text.isNotEmpty() &&
                                name4EditText.text.isNotEmpty()
                        )

                // Включаем или выключаем кнопку и изменяем цвет фона в зависимости от того, все ли поля заполнены
                if (allFieldsFilled) {
                    createButton.isEnabled = true
                    createButton.setBackgroundColor(Color.parseColor("#1A6FEE"))
                    createButton.setTextColor(Color.WHITE)
                } else {
                    createButton.isEnabled = false
                    createButton.setBackgroundColor(Color.parseColor("#C9D4FB"))
                    createButton.setTextColor(Color.parseColor("#FFFFFF"))
                }
            }
        }

        // Присваиваем слушатель каждому EditText полю
        nameEditText.addTextChangedListener(textWatcher)
        name1EditText.addTextChangedListener(textWatcher)
        name2EditText.addTextChangedListener(textWatcher)
        name3EditText.addTextChangedListener(textWatcher)
        name4EditText.addTextChangedListener(textWatcher)
    }
}
