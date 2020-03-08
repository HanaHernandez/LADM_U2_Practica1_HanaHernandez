package mx.edu.ittepic.ladm_u2_practica1_hanahernandez

class Animacion(p : MainActivity) : Thread() {

    var puntero = p

    override fun run() {
        super.run()

        while (true){
            sleep(300)
            puntero.runOnUiThread {

                    puntero.lienzo!!.nieveAnimado()

            }
        }
    }
}