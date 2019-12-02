package edu.svsu.zodiac3

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity(), AdapterView.OnItemClickListener {

    override fun onItemClick(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
        val item = listSigns.getItemAtPosition(position).toString()
        val selection = Intent(this@MainActivity, SignDetails::class.java)
        if (item == "Aries") {
            selection.putExtra("NAME", "Aries")
            selection.putExtra("DESC", "courageous and the energetic.")
            selection.putExtra("SYMBOL", "Ram")
            selection.putExtra("MONTH", "April")
            startActivity(selection)
        }
        if (item == "Taurus") {
            selection.putExtra("NAME", "Taurus")
            selection.putExtra("DESC", "known for being reliable, practical, ambitious and sensual.")
            selection.putExtra("SYMBOL", "Bull")
            selection.putExtra("MONTH", "May")
            startActivity(selection)
        }
        if (item == "Gemini") {
            selection.putExtra("NAME", "Gemini")
            selection.putExtra("DESC", "Gemini-born: clever and intellectual.")
            selection.putExtra("SYMBOL", "Twins")
            selection.putExtra("MONTH", "June")
            startActivity(selection)
        }
        if (item == "Cancer") {
            selection.putExtra("NAME", "Cancer")
            selection.putExtra("DESC", "tenacious, loyal and sympathetic.")
            selection.putExtra("SYMBOL", "Crab")
            selection.putExtra("MONTH", "July")
            startActivity(selection)
        }
        if (item == "Leo") {
            selection.putExtra("NAME", "Leo")
            selection.putExtra("DESC", "warm, action-oriented and driven by the desire to be loved and admired.")
            selection.putExtra("SYMBOL", "Lion")
            selection.putExtra("MONTH", "August")
            startActivity(selection)
        }
        if (item == "Virgo") {
            selection.putExtra("NAME", "Virgo")
            selection.putExtra("DESC", "methodical, meticulous, analytical and mentally astute.")
            selection.putExtra("SYMBOL", "Virgin")
            selection.putExtra("MONTH", "September")
            startActivity(selection)
        }
        if (item == "Libra") {
            selection.putExtra("NAME", "Libra")
            selection.putExtra("DESC", "famous for maintaining balance and harmony.")
            selection.putExtra("SYMBOL", "Scales")
            selection.putExtra("MONTH", "October")
            startActivity(selection)
        }
        if (item == "Scorpio") {
            selection.putExtra("NAME", "Scorpio")
            selection.putExtra("DESC", "strong willed and mysterious.")
            selection.putExtra("SYMBOL", "Scorpion")
            selection.putExtra("MONTH", "November")
            startActivity(selection)
        }
        if (item == "Sagittarius") {
            selection.putExtra("NAME", "Sagittarius")
            selection.putExtra("DESC", "born adventurers.")
            selection.putExtra("SYMBOL", "Archer")
            selection.putExtra("MONTH", "December")
            startActivity(selection)
        }
        if (item == "Capricorn") {
            selection.putExtra("NAME", "Capricorn")
            selection.putExtra("DESC", "the most determined sign in the Zodiac.")
            selection.putExtra("SYMBOL", "Goat")
            selection.putExtra("MONTH", "January")
            startActivity(selection)
        }
        if (item == "Aquarius") {
            selection.putExtra("NAME", "Aquarius")
            selection.putExtra("DESC", "humanitarians to the core.")
            selection.putExtra("SYMBOL", "Water Bearer")
            selection.putExtra("MONTH", "February")
            startActivity(selection)
        }
        if (item == "Pisces") {
            selection.putExtra("NAME", "Pisces")
            selection.putExtra("DESC", " the proverbial dreamers of the Zodiac.")
            selection.putExtra("SYMBOL", "Fish")
            selection.putExtra("MONTH", "March")
            startActivity(selection)
        }

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        listSigns.setOnItemClickListener(this)
    }
}
