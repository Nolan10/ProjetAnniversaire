package com.example.anniversaire;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class VueAnniversaire extends AppCompatActivity {

    protected ListView vueAnniversaireListeAnniversairee;
    protected List<HashMap<String, String>> listeAnniversaires;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.vue_anniversaire);
        vueAnniversaireListeAnniversairee = (ListView)findViewById(R.id.vueAnniversaireListeLivre);

        listeAnniversaires = preparerListeLivres();

        SimpleAdapter adapteur = new SimpleAdapter(
                this,
                listeAnniversaires,
                android.R.layout.two_line_list_item,
                new String[] {"Nom", "Date"},
                new int[] {android.R.id.text1, android.R.id.text2});

        vueAnniversaireListeAnniversairee.setAdapter(adapteur);
    }

    private List<HashMap<String, String>> preparerListeLivres() {
        List<HashMap<String, String>> listeAnniversaire = new ArrayList<HashMap<String,String>>();
        HashMap<String, String> anniversaire;

        anniversaire = new HashMap<String, String>();
        anniversaire.put("Nom", "Loris Hourrière");
        anniversaire.put("Date", "19 sptembre 2003");
        listeAnniversaire.add(anniversaire);

        anniversaire = new HashMap<String, String>();
        anniversaire.put("Nom", "Mathilde Burgevin");
        anniversaire.put("Date", "02 janvier 2003");
        listeAnniversaire.add(anniversaire);

        anniversaire = new HashMap<String, String>();
        anniversaire.put("Nom", "Nolan Tessier");
        anniversaire.put("Date", "10 février 2003");
        listeAnniversaire.add(anniversaire);

        anniversaire = new HashMap<String, String>();
        anniversaire.put("Nom", "Elsa Tessier");
        anniversaire.put("Date", "02 mai 2012");
        listeAnniversaire.add(anniversaire);

        anniversaire = new HashMap<String, String>();
        anniversaire.put("Nom", "Mathis Tessier");
        anniversaire.put("Date", "21 novembre 2005");
        listeAnniversaire.add(anniversaire);

        return listeAnniversaire;
    }
}