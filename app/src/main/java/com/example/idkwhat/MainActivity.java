package com.example.idkwhat;

import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    /*Vytvořte projekt, pro zapamatování si zvířat ve svém chovu.
    Projekt bude obsahovat 4 checkBoxy s názvy zvířat,
    při vybrání checkBoxu se zobrazí vyskakovácí okno (umístěné nad textem daného checkBoxu),
     kde bude zobrazen text z checkBoxu a zda zvíře je v mém chovu, či není.
     Pro všechny checkBoxy pouze jedna obslužná událost.
     Dále bude obsahovat tlačítko,
     které zobrazí ve vyskakovacím okně (umístěné v pravém horním rohu) text všech checkBoxů, která jsou vybrána.
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        View.OnClickListener onClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String idk = ((CheckBox)v).getText().toString();
                if(((CheckBox)v).isChecked()) {
                    idk += "je";
                }
                else {idk+= "neni";}
                Toast toast = Toast.makeText(getApplicationContext(),idk,Toast.LENGTH_LONG);
                toast.setGravity(Gravity.TOP|Gravity.START,v.getLeft(),v.getTop());
                toast.show();
            }
        };
        CheckBox checkBox = findViewById(R.id.checkBox);
        checkBox.setOnClickListener(onClickListener);
        CheckBox checkBox2 = findViewById(R.id.checkBox2);
        checkBox.setOnClickListener(onClickListener);
        CheckBox checkBox3 = findViewById(R.id.checkBox3);
        checkBox.setOnClickListener(onClickListener);
        CheckBox checkBox4 = findViewById(R.id.checkBox4);
        checkBox.setOnClickListener(onClickListener);

        Button button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String message = "Zvirata:\n";
                if(checkBox.isChecked()) {
                    message += checkBox.getText().toString() + "\n";
                }
                if(checkBox2.isChecked()) {
                    message += checkBox2.getText().toString() + "\n";
                }
                if(checkBox3.isChecked()) {
                    message += checkBox3.getText().toString() + "\n";
                }
                if(checkBox4.isChecked()) {
                    message += checkBox4.getText().toString() + "\n";
                }
                Toast toast = Toast.makeText(getApplicationContext(),message,Toast.LENGTH_LONG);
                toast.setGravity(Gravity.TOP|Gravity.END,60,v.getTop());
                toast.show();
            }
        });


    }


}