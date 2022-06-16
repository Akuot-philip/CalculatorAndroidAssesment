package dev.akuot.clculatorandroidassesment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.google.android.material.textfield.TextInputLayout

class MainActivity : AppCompatActivity() {
    lateinit var tilFirstnumber:TextInputLayout
    lateinit var tilSecondnumber:TextInputLayout
    lateinit var etFirstnumber:EditText
    lateinit var etSecondnumber:EditText
    lateinit var btnAdd:Button
    lateinit var btnSubtract:Button
    lateinit var btnModulus:Button
    lateinit var btnDivision:Button
    lateinit var tvDisplayresult:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tilFirstnumber=findViewById(R.id.tilFirstnumber)
        tilSecondnumber=findViewById(R.id.tilSecondnumber)
        etFirstnumber=findViewById(R.id.etFirstnumber)
        etSecondnumber=findViewById(R.id.etSecondnumber)
        btnAdd=findViewById(R.id.btnAdd)
        btnDivision=findViewById(R.id.btnDivision)
        btnModulus=findViewById(R.id.btnModulus)
        btnSubtract=findViewById(R.id.btnSubtract)
        tvDisplayresult=findViewById(R.id.tvDisplayresult)

        btnAdd.setOnClickListener {
            var num1=etFirstnumber.text.toString().toDouble()
            var num2=etSecondnumber.text.toString().toDouble()
            add(num1, num2)

    }
        btnSubtract.setOnClickListener {
            var num1=etFirstnumber.text.toString().toDouble()
            var num2=etSecondnumber.text.toString().toDouble()
            subtract(num1, num2)

        }
        btnModulus.setOnClickListener {
            var num1=etFirstnumber.text.toString().toDouble()
            var num2=etSecondnumber.text.toString().toDouble()
            modulus(num1, num2)

        }
        btnDivision.setOnClickListener {
            var num1=etFirstnumber.text.toString().toDouble()
            var num2=etSecondnumber.text.toString().toDouble()
            division(num1, num2)

        }

}
    fun add(num1:Double,num2:Double){
        var total=num1+num2

        tvDisplayresult.text=total.toString()
    }
    fun subtract(num1:Double,num2:Double){
        var total=num1-num2

        tvDisplayresult.text=total.toString()
    }
    fun modulus(num1:Double,num2:Double){
        var total=num1%num2

        tvDisplayresult.text=total.toString()
    }
    fun division(num1:Double,num2:Double){
        var total=num1/num2

        tvDisplayresult.text=total.toString()
    }

}