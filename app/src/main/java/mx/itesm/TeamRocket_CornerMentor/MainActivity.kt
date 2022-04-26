package mx.itesm.TeamRocket_CornerMentor

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import mx.itesm.TeamRocket_CornerMentor.databinding.ActivityMainBinding
import mx.itesm.TeamRocket_CornerMentor.databinding.RenglonMateriasBinding

class MainActivity : AppCompatActivity() {


    private lateinit var binding: ActivityMainBinding

    var adaptadorMaterias:AdaptadorMaterias? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val arrMaterias= arrayOf(Materias("Matematicas"),("fisica"),("Politica"),("Animacion")
            ,("Arte Digital"),("Lenguas extranjeras"),("Arquitectura"),("Diseño"))
        val layout= LinearLayoutManager(this)
        layout.orientation=LinearLayoutManager.VERTICAL
        adaptadorMaterias=AdaptadorMaterias(this,arrMaterias)
        binding.rvMaterias.adapter=adaptadorMaterias
//aa



    }
}