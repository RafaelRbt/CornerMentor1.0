package mx.itesm.TeamRocket_CornerMentor

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class AdaptadorMaterias(private val contexto:Context, var arrMaterias:Array<Materias>):
    RecyclerView.Adapter<AdaptadorMaterias.RenglonMateria>()  {

    var adaptadorMaterias:AdaptadorMaterias?=null

    class RenglonMateria(var vistaRenglon: View) : RecyclerView.ViewHolder(vistaRenglon) {
        fun set (materia:Materias){
            vistaRenglon.findViewById<TextView>(R.id.ttvMaterias).text = materia.nombre
        }

    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RenglonMateria {
        val vista=LayoutInflater.from(contexto).inflate(R.layout.renglon_materias,
        parent,false)


        return RenglonMateria(vista)
    }
    override fun getItemCount(): Int {
        // Regresa el número de renglones de la lista
        return arrMaterias.size

    }
    override fun onBindViewHolder(holder: RenglonMateria, position: Int) {
        // Cuando se llena de valores el renglón 'position'
        val materia=arrMaterias[position]
        holder.set(materia)
    }




}