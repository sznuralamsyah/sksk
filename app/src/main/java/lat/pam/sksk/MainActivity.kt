package lat.pam.sksk

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import lat.pam.sksk.R

class MainActivity : AppCompatActivity() {

    private var mCount = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Menginisialisasi TextView dan Button
        val mShowCount = findViewById<TextView>(R.id.show_count)
        val buttonCountUp = findViewById<Button>(R.id.button_count)

        // Menambahkan aksi ketika tombol di klik
        buttonCountUp.setOnClickListener {
            mCount++
            mShowCount.text = mCount.toString() // Menampilkan jumlah ketukan
        }
    }
}
