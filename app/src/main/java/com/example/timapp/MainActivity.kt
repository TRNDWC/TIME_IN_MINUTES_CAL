package com.example.timapp

import android.app.DatePickerDialog
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import java.text.SimpleDateFormat
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btnClicker: Button = findViewById(R.id.btnCal)
        btnClicker.setOnClickListener {
            pickdate()
        }
    }

    private fun pickdate() {
        val myCalendar = Calendar.getInstance()
        val year = myCalendar.get(Calendar.YEAR)
        val month = myCalendar.get(Calendar.MONTH)
        val day = myCalendar.get(Calendar.DAY_OF_MONTH)

        val tvSelectedDate: TextView? = findViewById(R.id.tvSelectedDate)
        val tvSelectedMinute: TextView? = findViewById(R.id.tvSelectedDateInMinutes)

        val dpd = DatePickerDialog(this,{ _, selectedYear, selectedMonth, selectedDay ->

            val selectedDate="$selectedDay/${selectedMonth+1}/$selectedYear"
            tvSelectedDate?.text=selectedDate

            val sdf= SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH)
            val theDate= sdf.parse(selectedDate)

            theDate?.let {
                val selectedDateInMinute = theDate.time / 60000
                val currentDate = sdf.parse(sdf.format(System.currentTimeMillis()))
                currentDate?.let {
                    val currentDateInMinute = currentDate.time/60000
                    val difference = currentDateInMinute - selectedDateInMinute
                    tvSelectedMinute?.text = difference.toString()
                }
            }
        }, year, month, day
        )
        dpd.datePicker.maxDate= System.currentTimeMillis() - 86400000
        dpd.show()
    }

}