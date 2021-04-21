package com.polytech.ihm.activities.demand;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import com.polytech.ihm.R;

public class Favorite extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_favorite);
        //Récupération de la liste de pizzas (peuplée)
        ListPizza pizzas = new ListPizza();

        //Création et initialisation de l'Adapter pour les diplomes
        PizzasAdapter adapter = new PizzasAdapter(getApplicationContext(), pizzas);

        //Récupération du composant ListView
        ListView list = findViewById(R.id.listView);

        //Initialisation de la liste avec les données
        list.setAdapter(adapter);

        //écouter si on clique
        adapter.addListner(this);
    }

}