package fr.brand.helloworld

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class MainActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // Modifications :
        val textViewTitle =findViewById<TextView>(R.id.textViewHomeTitle)
        val buttonHome = findViewById<Button>(R.id.buttonHome)

        // buttonHome.setOnClickListener { textViewTitle.text = "Hi Clem" }
        buttonHome.setOnClickListener(View.OnClickListener {
            textViewTitle.setText("Epsi")
            val newIntent = Intent(application, DetailActivity::class.java)
            startActivity(newIntent)
        })

    }
}