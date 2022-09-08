
package com.example.hiltroomdatabase

import android.annotation.SuppressLint
import java.text.SimpleDateFormat
import java.util.Date


class DateFormatter {

    @SuppressLint("SimpleDateFormat")
    private val formatter = SimpleDateFormat("d MMM yyyy HH:mm:ss")

    fun formatDate(timestamp: Long): String {
        return formatter.format(Date(timestamp))
    }
}
