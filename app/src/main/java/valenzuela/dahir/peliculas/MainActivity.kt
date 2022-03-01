package valenzuela.dahir.peliculas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    var peliculas: ArrayList<Pelicula> = ArrayList()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun llenar_peliculas(){
        val pelicula1=Pelicula(1,getString(R.string.peli1),getString(R.string.peli1_desc), 176, R.drawable.batman_poster)
        peliculas.add(pelicula1)

        val pelicula2=Pelicula(1,getString(R.string.peli2),getString(R.string.peli2_desc), 100, R.drawable.broly_poster)
        peliculas.add(pelicula2)

        val pelicula3=Pelicula(1,getString(R.string.peli3),getString(R.string.peli3_desc), 100, R.drawable.deamon_slayer_poster)
        peliculas.add(pelicula3)

        val pelicula4=Pelicula(1,getString(R.string.peli4),getString(R.string.peli4_desc), 100, R.drawable.cloverfield_poster)
        peliculas.add(pelicula4)

        val pelicula5=Pelicula(1,getString(R.string.peli5),getString(R.string.peli5_desc), 100, R.drawable.spiderman_poster)
        peliculas.add(pelicula5)
    }
}