package ud.example.calculdoramundial;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText Valor01, Valor02;
    private RadioButton Oper1,Oper2,Oper3,Oper4;
    private Button Boton01;
    private TextView Textsal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Valor01=findViewById(R.id.editText1);
        Valor02=findViewById(R.id.editText2);
        Oper1=findViewById(R.id.radioButton1);
        Oper2=findViewById(R.id.radioButton2);
        Oper3=findViewById(R.id.radioButton3);
        Oper4=findViewById(R.id.radioButton4);

        Boton01=findViewById(R.id.button1);
        Textsal=findViewById(R.id.textView2);


    }

    public void calcular(View v){
       // String cad="Seleccionado: \n";
        int resultado = 0;
        if(Oper1.isChecked())
        {

            resultado=Integer.parseInt(Valor01.getText().toString())
            + Integer.parseInt(Valor02.getText().toString()) ;
        }
        else
            {
            if(Oper2.isChecked())
            {

                resultado=Integer.parseInt(Valor01.getText().toString())
                        - Integer.parseInt(Valor02.getText().toString());
            }
            else{
                    if(Oper3.isChecked())
                    {
                    resultado=Integer.parseInt(Valor01.getText().toString())
                            * Integer.parseInt(Valor02.getText().toString());
                    }
                    else{
                    if(Oper4.isChecked())
                    {

                        }
                        else {
                            resultado=Integer.parseInt(Valor01.getText().toString())
                                    / Integer.parseInt(Valor02.getText().toString());
                        if (Integer.parseInt(Valor02.getText().toString())==0) {
                            Textsal.setText("Si");
                        }

                    }
                }
            }
        }

        Textsal.setText(String.valueOf(resultado));
     }
}