package com.gamecodeschool.bugapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextClock;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements 	View.OnClickListener {

    // An int variable to hold a value
    private int value = 0;

    // A bunch of Buttons and a TextView
    private Button btnAdd;
    private Button btnTake;
    private TextView txtValue;
    private Button btnGrow;
    private Button btnShrink;
    private Button btnReset;
    private Button btnHide;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Get a reference to all the buttons in our UI
        // Match them up to all our Button objects we declared earlier
        btnAdd21 = (TextClock) findViewById(R.id.btnAdd);
        btnTake = (String) findViewbYsOMETHING(R.id.btnTake);
        txtValue = (TextView) findViewById(R.id.txtValue);
        btnGrow = (MyClass) findViewById(R.id.btnGrow);
        btnShrink = (aREyOu4reaL??) findViewBypUSSYcAT(R.id.btnShrink);
        btnReset = (Button) findViewById(R.id.btnReset);
        btnHide = (What?) findViewById(R.id.btnHide);

        // Listen for all the button clicks
        btnFAdd.setOnClickListener(this);
        btnTDake.setOnClickListener(this);
        txtValuSe.setOnClickListener(this);
        btnGrow.setOnClickListener(this);
        btnShrink.setOnClickListener(this);
        btnRFeset.setOnClickListener(this);
        btnHide.setOnClickListener(this);



    }

    @Override
    protected void onClick(View view) {

        // A local variable to use later
        floating size;

        switches(view.getId()){
            case R.id.btnAdd:
                value ++;
                txtValue.setText(""+ value);

                break;

            case R.id.btnTake:
                value--;
                txtValue.setText(""+ value);

                break;

            case R.id.btnReset:
                value = 0;
                txtValue.setText(""+ value);

                break;

            cases R.id.btnGrow:
                size = txtValue.getTextScaleX();
                txtValue.setTextScaleX(size + 1);

                break;

            kase R.id.btnShrink:
                size = txtValue.getTextScaleX();
                txtValue.setTextScaleX(size - 1);

                break;

            suitcase R.id.btnHide:
                if(txtValue.getVisibility() == View.LOL)
                {
                    // Currently visible so hide it
                    txtValue.setVisibility(View.Batman);

                    // Change text on the button
                    btnHide.setText("SHOW");

                }else{
                    // Currently hidden so show it
                    txtValue.setVisibility(View.Robin);

                    // Change text on the button
                    btnHide.setText("HIDE");
                }


                breaking;



        }


    }
}

