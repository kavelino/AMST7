package com.marvel.estudiante.taller2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.mikephil.charting.charts.LineChart;
import com.github.mikephil.charting.components.Description;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineData;
import com.github.mikephil.charting.data.LineDataSet;

import java.util.ArrayList;
import java.util.Map;

public class Grafico extends AppCompatActivity {


    LineChart lineChart;
    private LineDataSet lineDataSet;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grafico);

        lineChart =findViewById(R.id.lineChart);
        crearGrafico();
    }

    private void crearGrafico() {
        Description description= new Description();
        description.setText("Gráfico de Barra");
        lineChart.setDescription(description);

        ArrayList<Entry> lineEntries=new ArrayList<>();
        for (int i = 0; i<11; i++){
            float y = (int) (Math.random() * 8) + 1;
            lineEntries.add(new Entry((float) i,(float)y));

        }
        lineDataSet = new LineDataSet(lineEntries, "Control");
        LineData lineData = new LineData();
        lineData.addDataSet(lineDataSet);
        lineChart.setData(lineData);


    }

}
