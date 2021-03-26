package edu.ifsul.pdm.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Spinner spinner;
    private ArrayAdapter<Object> adaptadorSpinner;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spinner = findViewById(R.id.spinner);
        adaptadorSpinner = new ArrayAdapter<>(getBaseContext(), android.R.layout.simple_list_item_1);
        spinner.setAdapter(adaptadorSpinner);

        adaptadorSpinner.add("Selecione a Pessoa");
        adaptadorSpinner.add(new Pessoa("João"));
        adaptadorSpinner.add(new Pessoa("Rita"));
        adaptadorSpinner.add(new Pessoa("Bozo"));
        adaptadorSpinner.add(new Pessoa("Quiro"));
    }
    public void submit(View hugo){
        //Intent it = new Intent(getBaseContext(), TelaExibeActivity.class);

        if(){

        }
        
        Pessoa p = (Pessoa) spinner.getSelectedItem();

        Toast.makeText(getBaseContext(), nome, Toast.LENGTH_SHORT).show();
        //it.putExtra("nome", nome);
        //it.putExtra("id", id);

        //startActivity(it);
    }
}
