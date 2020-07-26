package com.example.tictactoe

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.GridLayout
import android.widget.RelativeLayout
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    lateinit var btn1:Button
    lateinit var btn2:Button
    lateinit var btn3:Button
    lateinit var btn4:Button
    lateinit var btn5:Button
    lateinit var btn6:Button
    lateinit var btn7:Button
    lateinit var btn8:Button
    lateinit var btn9:Button


    lateinit var btnplayagain:Button


    var player1=true
    var player2=false



    var player1arr=ArrayList<Int>()
    var player2arr=ArrayList<Int>()



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //2D array in kotlin
       // var arr=Array(3){IntArray(3)}

        btn1=findViewById(R.id.btn1)
        btn2=findViewById(R.id.btn2)
        btn3=findViewById(R.id.btn3)
        btn4=findViewById(R.id.btn4)
        btn5=findViewById(R.id.btn5)
        btn6=findViewById(R.id.btn6)
        btn7=findViewById(R.id.btn7)
        btn8=findViewById(R.id.btn8)
        btn9=findViewById(R.id.btn9)


        btnplayagain=findViewById(R.id.btnPlayAgain)
        btnplayagain.visibility= View.GONE

        setDefault()

        btn1.setOnClickListener {

            var value=btn1.text

            if((player1)&&(value=="-")) {
                btn1.text = "X"
                player1=false
                player2=true
                value="X"
                //arr[0][0]=1
                player1arr.add(1)
            }
            if((player2)&&(value!="X"))
            {
                btn1.text="O"
                player2=false
                player1=true
                //arr[0][0]=2
                player2arr.add(1)
            }
            checkWinner()

        }
        btn2.setOnClickListener {
            var value=btn2.text

            if((player1)&&(value=="-")) {
                btn2.text = "X"
                player1=false
                player2=true
                value="X"
                //arr[0][1]=1
                player1arr.add(2)


            }
            if((player2)&&(value!="X"))
            {
                btn2.text="O"
                player2=false
                player1=true
                //arr[0][1]=2
                player2arr.add(2)

            }
            checkWinner()
        }
        btn3.setOnClickListener {
            var value=btn3.text

            if((player1)&&(value=="-")) {
                btn3.text = "X"
                player1=false
                player2=true
                value="X"
               // arr[0][2]=1
                player1arr.add(3)


            }
            if((player2)&&(value!="X"))
            {
                btn3.text="O"
                player2=false
                player1=true
             //   arr[0][2]=2
                player2arr.add(3)


            }
            checkWinner()
        }




        btn4.setOnClickListener {
            var value=btn4.text

            if((player1)&&(value=="-")) {
                btn4.text = "X"
                player1=false
                player2=true
                value="X"
                //arr[1][0]=1
                player1arr.add(4)


            }
            if((player2)&&(value!="X"))
            {
                btn4.text="O"
                player2=false
                player1=true
               // arr[1][0]=2
                player2arr.add(4)

            }
            checkWinner()
        }

        btn5.setOnClickListener {
            var value=btn5.text

            if((player1)&&(value=="-")) {
                btn5.text = "X"
                player1=false
                player2=true
                value="X"
               // arr[1][1]=1
                player1arr.add(5)


            }
            if((player2)&&(value!="X"))
            {
                btn5.text="O"
                player2=false
                player1=true
               // arr[1][1]=2
                player2arr.add(5)

            }
            checkWinner()
        }
        btn6.setOnClickListener {
            var value=btn6.text

            if((player1)&&(value=="-")) {
                btn6.text = "X"
                player1=false
                player2=true
                value="X"
               // arr[1][2]=1
                player1arr.add(6)


            }
            if((player2)&&(value!="X"))
            {
                btn6.text="O"
                player2=false
                player1=true
               // arr[1][2]=2
                player2arr.add(6)


            }
            checkWinner()
        }




        btn7.setOnClickListener {
            var value=btn7.text

            if((player1)&&(value=="-")) {
                btn7.text = "X"
                player1=false
                player2=true
                value="X"
              //  arr[2][0]=1
                player1arr.add(7)


            }
            if((player2)&&(value!="X"))
            {
                btn7.text="O"
                player2=false
                player1=true
             //   arr[2][0]=2
                player2arr.add(7)

            }
            checkWinner()
        }
        btn8.setOnClickListener {
            var value=btn8.text

            if((player1)&&(value=="-")) {
                btn8.text = "X"
                player1=false
                player2=true
                value="X"
               // arr[2][1]=1
                player1arr.add(8)


            }
            if((player2)&&(value!="X"))
            {
                btn8.text="O"
                player2=false
                player1=true
           //     arr[2][1]=2
                player2arr.add(8)

            }
            checkWinner()
        }
        btn9.setOnClickListener {
            var value=btn9.text
            if((player1)&&(value=="-")) {
                btn9.text = "X"
                player1=false
                player2=true
                value="X"
              //  arr[2][2]=1
                player1arr.add(9)

            }
            if((player2)&&(value!="X"))
            {
                btn9.text="O"
                player2=false
                player1=true
               // arr[2][2]=2
                player2arr.add(9)

            }
            checkWinner()
        }



        btnplayagain.setOnClickListener {

            setDefault()

            setTrue()

            player1=true
            player2=false
            player1arr=ArrayList<Int>()
            player2arr=ArrayList<Int>()
            btnplayagain.visibility=View.GONE
        }

    }

    private fun checkWinner() {
            var f=0
            if(player1arr.contains(1)&&player1arr.contains(2)&&player1arr.contains(3))
            {
                Toast.makeText(this,"Player 1 win",Toast.LENGTH_SHORT).show()
                f=1
                setFalse()

            }
            else if(player2arr.contains(1)&&player2arr.contains(2)&&player2arr.contains(3))
            {
                Toast.makeText(this,"Player 2 win",Toast.LENGTH_SHORT).show()
                f=1
                setFalse()

            }
            else if(player1arr.contains(4)&&player1arr.contains(5)&&player1arr.contains(6))
            {
                Toast.makeText(this,"Player 1 win",Toast.LENGTH_SHORT).show()
                f=1
                setFalse()

            }
            else if(player2arr.contains(4)&&player2arr.contains(5)&&player2arr.contains(6))
            {
                Toast.makeText(this,"Player 2 win",Toast.LENGTH_SHORT).show()
                f=1
                setFalse()

            }
            else if(player1arr.contains(7)&&player1arr.contains(8)&&player1arr.contains(9))
            {
                Toast.makeText(this,"Player 1 win",Toast.LENGTH_SHORT).show()
                f=1
                setFalse()

            }
            else if(player2arr.contains(7)&&player2arr.contains(8)&&player2arr.contains(9))
            {
                Toast.makeText(this,"Player 2 win",Toast.LENGTH_SHORT).show()
                f=1
                setFalse()

            }
            else if(player1arr.contains(1)&&player1arr.contains(4)&&player1arr.contains(7))
            {
                Toast.makeText(this,"Player 1 win",Toast.LENGTH_SHORT).show()
                f=1
                setFalse()

            }
            else if(player2arr.contains(1)&&player2arr.contains(4)&&player2arr.contains(7))
            {
                Toast.makeText(this,"Player 2 win",Toast.LENGTH_SHORT).show()
                f=1
                setFalse()

            }
            else if(player1arr.contains(2)&&player1arr.contains(5)&&player1arr.contains(8))
            {
                Toast.makeText(this,"Player 1 win",Toast.LENGTH_SHORT).show()
                f=1
                setFalse()

            }
            else if(player2arr.contains(2)&&player2arr.contains(5)&&player2arr.contains(8))
            {
                Toast.makeText(this,"Player 2 win",Toast.LENGTH_SHORT).show()
                f=1
                setFalse()

            }
            else if(player1arr.contains(3)&&player1arr.contains(6)&&player1arr.contains(9))
            {
                Toast.makeText(this,"Player 1 win",Toast.LENGTH_SHORT).show()
                f=1
                setFalse()

            }
            else if(player2arr.contains(3)&&player2arr.contains(6)&&player2arr.contains(9))
            {
                Toast.makeText(this,"Player 2 win",Toast.LENGTH_SHORT).show()
                f=1
                setFalse()

            }
            else if(player1arr.contains(1)&&player1arr.contains(5)&&player1arr.contains(9))
            {
                Toast.makeText(this,"Player 1 win",Toast.LENGTH_SHORT).show()
                f=1
                setFalse()

            }
            else if(player2arr.contains(1)&&player2arr.contains(5)&&player2arr.contains(9))
            {
                Toast.makeText(this,"Player 2 win",Toast.LENGTH_SHORT).show()
                f=1
                setFalse()

            }
            else if(player1arr.contains(3)&&player1arr.contains(5)&&player1arr.contains(7))
            {
                Toast.makeText(this,"Player 1 win",Toast.LENGTH_SHORT).show()
                f=1
                setFalse()
            }
            else if(player2arr.contains(3)&&player2arr.contains(5)&&player2arr.contains(7))
            {
                Toast.makeText(this,"Player 2 win",Toast.LENGTH_SHORT).show()
                f=1
                setFalse()
            }
        else {

                var sum=player1arr.size+player2arr.size

                //Toast.makeText(this,"$f and $sum",Toast.LENGTH_LONG).show()

                if ((sum==9) && (f ==0)) {
                    Toast.makeText(this, "It's a draw!!!", Toast.LENGTH_SHORT).show()
                    setFalse()
                }
            }

        }


    private fun setFalse()
    {
        btn1.isClickable=false
        btn2.isClickable=false
        btn3.isClickable=false
        btn4.isClickable=false
        btn5.isClickable=false
        btn6.isClickable=false
        btn7.isClickable=false
        btn8.isClickable=false
        btn9.isClickable=false


        btnplayagain.visibility=View.VISIBLE
    }

private fun setTrue()
{
    btn1.isClickable=true
    btn2.isClickable=true
    btn3.isClickable=true
    btn4.isClickable=true
    btn5.isClickable=true
    btn6.isClickable=true
    btn7.isClickable=true
    btn8.isClickable=true
    btn9.isClickable=true
}

private fun setDefault()
{
    btn1.text = "-"
    btn2.text = "-"
    btn3.text = "-"
    btn4.text = "-"
    btn5.text = "-"
    btn6.text = "-"
    btn7.text = "-"
    btn8.text = "-"
    btn9.text = "-"
}
}
