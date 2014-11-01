package com.example.nutricao.sdk;

import android.app.Activity;
import android.app.AlertDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends Activity {   
	 
	 EditText num1, num2;
	 Button btn_somar;
	 @Override
	 public void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        setContentView(R.layout.activity_main);
	 
	 num1 = (EditText) findViewById(R.id.edt_num1);
	 num2 = (EditText) findViewById(R.id.edt_num2);
	 btn_somar = (Button) findViewById(R.id.btn_somar);
	 
	 btn_somar.setOnClickListener(new View.OnClickListener() {
	
	 public void onClick(View v) {
	 
	
	 double val1 = Double.parseDouble(num1.getText().toString());
	 double val2 = Double.parseDouble(num2.getText().toString());
	 

	 double soma = val1*val2/100;
	 

	 AlertDialog.Builder infoResultado = new AlertDialog.Builder(MainActivity.this);
	 infoResultado.setTitle("Resultado");
	 infoResultado.setMessage("A Soma é: "+soma);
	 infoResultado.setNeutralButton("Ok",null);
	 infoResultado.show();
	 }
	 });
	 }
	}


     

   



