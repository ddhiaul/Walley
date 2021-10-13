package com.ddhiaul.walley

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_result.*

class ResultActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        val intent = intent
        val inputed = intent.getStringExtra("inputed")
        val resultNeeded = intent.getStringExtra("resultNeeded").toString()
        val resultAiw = intent.getStringExtra("resultAiw").toString()
        val resultSaved = intent.getStringExtra("resultSaved").toString()
        tv_resultNeeded.setText("Rp $resultNeeded")
        tv_resultAsset.setText("Rp $resultAiw")
        tv_resultInvestmen.setText("Rp $resultAiw")
        tv_resultWanted.setText("Rp $resultAiw")
        tv_resultSaved.setText("Rp $resultSaved")
        tv_inputed.setText("Rp $inputed")
    }
}