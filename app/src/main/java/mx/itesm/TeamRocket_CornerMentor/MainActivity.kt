package mx.itesm.TeamRocket_CornerMentor

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import androidx.recyclerview.widget.LinearLayoutManager
import mx.itesm.TeamRocket_CornerMentor.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding



    var adaptadorMaterias:AdaptadorMaterias? = null


    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(R.layout.activity_main)
        val arrMaterias= arrayOf(Materias("Matematicas"))
        val layout= LinearLayoutManager(this)
        layout.orientation=LinearLayoutManager.VERTICAL
        binding.rvMaterias.layoutManager=layout
        adaptadorMaterias= AdaptadorMaterias(this, arrMaterias)
        binding.rvMaterias.adapter=adaptadorMaterias

        //Boton Menu
        val boton = findViewById<ImageButton>(R.id.btnMenu)
        boton.setOnClickListener {
            val intent = Intent(this, menuApp::class.java)
            startActivity(intent)
        }

    }
}