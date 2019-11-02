package com.marvel.estudiante.taller2;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.SimpleTimeZone;


public class Calendario extends AppCompatActivity {

    private static final String cal="Calendario";
    private CalendarView mCalendarView;
    private Button boton;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calendario);
        boton = (Button) findViewById(R.id.botonTarea);




        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(Calendario.this, registro_tarea.class);
                startActivity(intent); }



        });

        String date = new SimpleDateFormat("yyyy/MM/dd", Locale.getDefault()).format(new Date());
        display(date);
        mCalendarView = (CalendarView)findViewById(R.id.calendar);
        mCalendarView.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
            @Override
            public void onSelectedDayChange(@NonNull CalendarView calendarView, int i, int i1, int i2) {
                String date = i + "/" +(i1+1) + "/" + i2;
                display(date);
                Log.d(cal,"fecha es" + date);
            }
        });



    }
    public void display(String text){
        TextView textView=(TextView)findViewById(R.id.text);
        textView.setText(""+text);

    }




}
