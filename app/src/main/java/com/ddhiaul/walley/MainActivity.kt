package com.ddhiaul.walley

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private lateinit var input : String
    private var resultNeeded : Int? = null
    private var resultAiw : Int? = null
    private var resultSaved : Int? = null
    private var fieldEmpty : Boolean = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_count.setOnClickListener {
            input = et_input.text.toString().trim()
            if (input.isEmpty()){
                fieldEmpty = true
                et_input.error = resources.getString(R.string.error_empty_field)
            }
            if (!fieldEmpty) {
                resultNeeded = (input.toInt() / 10 * 3)
                resultAiw = (input.toInt() / 10 * 2)
                resultSaved = (input.toInt() / 10)
                val intent = Intent(this, ResultActivity::class.java)
                intent.putExtra("inputed", input)
                intent.putExtra("resultNeeded", resultNeeded.toString())
                intent.putExtra("resultAiw", resultAiw.toString())
                intent.putExtra("resultSaved", resultSaved.toString())
                startActivity(intent)
            }
        }
    }
}