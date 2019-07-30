package okipramitasari12.gmail.myapplication

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.view.View

class MenuAwal : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu_awal)
    }

    fun data(view: View) {
        val intent = Intent(this@MenuAwal, MainActivity::class.java)
        startActivity(intent)
    }
}
