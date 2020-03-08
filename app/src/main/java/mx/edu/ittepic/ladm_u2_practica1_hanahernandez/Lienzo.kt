package mx.edu.ittepic.ladm_u2_practica1_hanahernandez

import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.view.View


class Lienzo (p : MainActivity) : View(p) {



    var copo =
        Figura(150f, 150f, 20)



    override fun onDraw(c: Canvas) {
        super.onDraw(c)

        var paint = Paint()
        c.drawColor(Color.rgb(45,176,238))

        //SOl
        paint.color = Color.YELLOW
        c.drawCircle(1000f,90f,120f,paint)
        paint.style = Paint.Style.STROKE
        paint.color = Color.rgb(231,152,49)
        paint.strokeWidth = 10f
        c.drawCircle(1000f,90f,120f,paint)
        //Nubes
        paint.style = Paint.Style.FILL
        paint.color = Color.rgb(132,201,241)
        c.drawCircle(200f,200f,100f,paint)
        paint.style = Paint.Style.FILL
        paint.color = Color.rgb(132,201,241)
        c.drawCircle(300f,200f,100f,paint)
        paint.style = Paint.Style.FILL
        paint.color = Color.rgb(132,201,241)
        c.drawCircle(400f,200f,100f,paint)
        //pasto
        paint.style = Paint.Style.FILL
        paint.color = Color.rgb(26,124,26)
        c.drawRect(0f,900f,1080f,1600f,paint)
        //arbol
        paint.color = Color.rgb(124,80,26)
        c.drawRect(140f,1000f,190f,1200f,paint)
        paint.color = Color.rgb(17,201,27)
        c.drawCircle(100f,1000f,60f,paint)
        c.drawCircle(120f,935f,60f,paint)
        c.drawCircle(200f,935f,60f,paint)
        c.drawCircle(200f,1000f,60f,paint)
        //casa(techo)
        paint.style = Paint.Style.FILL
        paint.color = Color.WHITE
        c.drawRect(900f,900f,400f,1200f,paint)
        paint.style = Paint.Style.FILL
        paint.color = Color.WHITE
        c.drawLine(700f,700f,400f,900f,paint)
        c.drawLine(700f,700f,900f,900f,paint)
        //Ventana, puerta
        paint.style = Paint.Style.FILL
        paint.color = Color.MAGENTA
        c.drawRect(550f,950f,450f,1030f,paint)
        paint.color = Color.CYAN
        c.drawRect(850f,970f,700f,1200f,paint)

        //COPO
            paint.color = Color.WHITE
            copo.pintar(c,paint)

    }

    fun nieveAnimado(){
          copo.nieve(width,height)
          invalidate()
    }



}