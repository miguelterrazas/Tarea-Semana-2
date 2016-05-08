package com.example.user.tareasemana2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.Toast;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Calendar;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button Siguiente=(Button) findViewById(R.id.btnSiguiente);
        Siguiente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DatePicker FechaNacimientoContacto = (DatePicker) findViewById(R.id.dpFechaNacimiento);

                String mYear =Integer.toString( FechaNacimientoContacto.getYear());
                String mMonth =Integer.toString( FechaNacimientoContacto.getMonth()+1);
                String mDay = Integer.toString( FechaNacimientoContacto.getDayOfMonth());
                if (FechaNacimientoContacto.getDayOfMonth()<10) {
                    mDay="0" + mDay;
                }
                if (FechaNacimientoContacto.getMonth()<10) {
                    mMonth="0" + mMonth;
                }

                ArrayList <Datoscontacto> DatosContacto;
                EditText NombreContacto=(EditText) findViewById(R.id.etNombre);
                EditText TelefonoContacto=(EditText) findViewById(R.id.etTelefono);
                EditText EmailContacto=(EditText) findViewById(R.id.etEmail);
                EditText DescripcionContacto=(EditText) findViewById(R.id.etdescripcion);

                DatosContacto=new ArrayList<Datoscontacto>();
                DatosContacto.add(new Datoscontacto(NombreContacto.getText().toString(), mDay, mMonth , mYear,TelefonoContacto.getText().toString(),EmailContacto.getText().toString(),DescripcionContacto.getText().toString()));

                Intent intent = new Intent (MainActivity.this,Datos.class);
                intent.putExtra("NombreContacto",DatosContacto.get(0).getNombreContacto());
                intent.putExtra("FechaNacimientoDia",DatosContacto.get(0).getFechaNacimientoDia());
                intent.putExtra("FechaNacimientoMes",DatosContacto.get(0).getFechaNacimientoMes());
                intent.putExtra("FechaNacimientoAño",DatosContacto.get(0).getFechaNacimientoAño());
                intent.putExtra("Telefono",DatosContacto.get(0).getTelefono());
                intent.putExtra("Email",DatosContacto.get(0).getEmail());
                intent.putExtra("Descripcion",DatosContacto.get(0).getDescripcion());

                startActivity(intent);
            }
        });


    }

    @Override
    protected void onStart() {
        super.onStart();
        EditText NomContact =(EditText) findViewById(R.id.etNombre);
        EditText TelContact =(EditText) findViewById(R.id.etTelefono);
        EditText EmailContact =(EditText) findViewById(R.id.etEmail);
        EditText DescripcionContact =(EditText) findViewById(R.id.etdescripcion);
        DatePicker FechaNacContact=(DatePicker) findViewById(R.id.dpFechaNacimiento);


        Bundle parametros= getIntent().getExtras();
        try {
            NomContact.setText(parametros.getString("NombreContacto"));
            FechaNacContact.updateDate(Integer.parseInt(parametros.getString("FechaNacimientoAño")),Integer.parseInt(parametros.getString("FechaNacimientoMes"))-1,Integer.parseInt(parametros.getString("FechaNacimientoDia")));
            TelContact.setText(parametros.getString("Telefono"));
            EmailContact.setText(parametros.getString("Email"));
            DescripcionContact.setText(parametros.getString("Descripcion"));
        }catch (Exception e){

        };

    }
}


