package com.coursera.adrian.tarea6fragments;

import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import java.util.ArrayList;
import android.content.Intent;
import android.net.Uri;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import com.coursera.adrian.tarea6fragments.adapter.PageAdapter;
import com.coursera.adrian.tarea6fragments.fragment.PerfilFragment;
import com.coursera.adrian.tarea6fragments.fragment.RecyclerViewFragment;

public class MainActivity extends AppCompatActivity {

    private Toolbar toolbar;
    private TabLayout tabLayout;
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar = (Toolbar) findViewById(R.id.toolbar);
        tabLayout = (TabLayout) findViewById(R.id.tabLayout);
        viewPager = (ViewPager) findViewById(R.id.viewPager);

        if (toolbar != null){
            setSupportActionBar(toolbar);
            getSupportActionBar().setIcon(R.drawable.huella);
        }

        setUpViewPager();



    }

    private ArrayList<Fragment> agregarFragment(){

        ArrayList<Fragment> fragments = new ArrayList<>();

        fragments.add(new RecyclerViewFragment());
        fragments.add(new PerfilFragment());

        return fragments;

    }

    private void setUpViewPager(){

        viewPager.setAdapter(new PageAdapter(getSupportFragmentManager(), agregarFragment()));
        tabLayout.setupWithViewPager(viewPager);

        tabLayout.getTabAt(0).setIcon(R.drawable.contacts_48);
        tabLayout.getTabAt(1).setIcon(R.drawable.contact_card_48);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.action_star:
                Intent intent = new Intent(this, RankingMascota.class);
                startActivity(intent);
                break;

            case R.id.m_about:
                Intent fb = new Intent(Intent.ACTION_VIEW);
                fb.setData(Uri.parse("https://www.facebook.com/LegendSwordOfficial"));
                startActivity(fb);
                break;

            case R.id.m_contact:
                Intent intentContact = new Intent(MainActivity.this, Datos.class);
                this.startActivity(intentContact);
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}
