package com.example.user.tareasemana2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class Datos extends AppCompatActivity {

    String Dia;
    String Mes;
    String Año;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_datos);

        Bundle parametros= getIntent().getExtras();
        TextView NomCompleto=(TextView) findViewById(R.id.tvCNombre);
        TextView FechaNacimiento=(TextView) findViewById(R.id.tvCFNacimiento);
        TextView Telefono=(TextView) findViewById(R.id.tvCTel);
        TextView Email=(TextView) findViewById(R.id.tvCEmail);
        TextView Descripcion=(TextView) findViewById(R.id.tvCdescripcion);

        NomCompleto.setText(parametros.getString("NombreContacto"));
        FechaNacimiento.setText("Fecha de Nacimiento " + parametros.getString("FechaNacimientoDia") + "/" + parametros.getString("FechaNacimientoMes") + "/" + parametros.getString("FechaNacimientoAño"));
        Telefono.setText("Tel: " + parametros.getString("Telefono"));
        Email.setText("Email: " + parametros.getString("Email"));
        Descripcion.setText("Descripción: " + parametros.getString("Descripcion"));

        Dia=parametros.getString("FechaNacimientoDia");
        Mes=parametros.getString("FechaNacimientoMes");
        Año=parametros.getString("FechaNacimientoAño");



        Button Editar= (Button) findViewById(R.id.btnEditar);
        Editar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ArrayList <Datoscontacto> DatosContacto;
                TextView  NombreContactoEdit=(TextView) findViewById(R.id.tvCNombre);
                TextView FechaNacEdit=(TextView) findViewById(R.id.tvCFNacimiento);
                TextView TelefonoEdit=(TextView) findViewById(R.id.tvCTel);
                TextView EmailEdit=(TextView) findViewById(R.id.tvCEmail);
                TextView DescripcioncEdit=(TextView) findViewById(R.id.tvCdescripcion);
                DatosContacto=new ArrayList<Datoscontacto>();
                DatosContacto.add(new Datoscontacto(NombreContactoEdit.getText().toString(),Dia,Mes,Año,TelefonoEdit.getText().toString(),EmailEdit.getText().toString(),DescripcioncEdit.getText().toString()));

                Intent intent=new Intent(Datos.this,MainActivity.class);
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
}
