package edu.svsu.zodiac3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_sign_details.*

class SignDetails : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_details)

        val myIntent = Intent()
        val name = intent.extras!!.getString("NAME").toString()
        val desc = intent.extras!!.getString("DESC").toString()
        val symbol = intent.extras!!.getString("SYMBOL").toString()
        val month = intent.extras!!.getString("MONTH").toString()
        if (txtName != null) {
            txtName.setText(name)
        }
        if (txtDesc != null) {
            txtDesc.setText(name + ", or the " + symbol + ", are " + desc)
        }
        if (txtSymbol != null) {
            txtSymbol.setText(symbol)
        }
        if (txtMonth != null) {
            txtMonth.setText(month)
        }
    }
}
