package com.example.android.kopiinaja;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Recycle extends AppCompatActivity {
    private final ArrayList<Kopi> list = new ArrayList<>();
    private RecyclerView rvKopi;
    private String title = "Mode List";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycle);
        setActionBarTitle(title);
        rvKopi = findViewById(R.id.rv_Kopi);
        rvKopi.setHasFixedSize(true);
        list.addAll(KopiData.getListData());
        showRecyclerList();
    }

    private void showRecyclerList() {
        rvKopi.setLayoutManager(new LinearLayoutManager(this));
        ListKopiAdapter listKopiAdapter = new ListKopiAdapter(list);
        rvKopi.setAdapter(listKopiAdapter);
        listKopiAdapter.setOnItemClickCallback(new ListKopiAdapter.OnItemClickCallback() {
            @Override
            public void onItemClicked(Kopi data) {
                showSelectKopi(data);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        setMode(item.getItemId());
        return super.onOptionsItemSelected(item);
    }

    public void setMode(int selectdMode) {
        switch (selectdMode) {
            case R.id.back_home:
                title = "Mode List";
                Intent moveIntent = new Intent(this, MoveActivity.class);
                startActivity(moveIntent);
                break;
            case R.id.action_list:
                title = "Mode List";
                showRecyclerList();
                break;
            case R.id.action_grid:
                title = "Mode Grid";
                showRecycleGrid();
                break;
            case R.id.action_cardview:
                title = "Mode CardView";
                showRecycleCardView();
                break;

        }
        setActionBarTitle(title);
    }

    private void showRecycleGrid() {
        rvKopi.setLayoutManager(new GridLayoutManager(this, 2));
        GridKopiAdapter gridKopiAdapter = new GridKopiAdapter(list);
        rvKopi.setAdapter(gridKopiAdapter);


    }

    private void showRecycleCardView() {
        rvKopi.setLayoutManager(new LinearLayoutManager(this));
        CardViewKopiAdapter cardviewkopiadapter = new CardViewKopiAdapter(list);
        rvKopi.setAdapter(cardviewkopiadapter);
    }

    private void setActionBarTitle(String title) {
        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle(title);
        }
    }

    private void showSelectKopi(Kopi kopi) {
        Toast.makeText(this, "Kamu Memilih " + kopi.getName(), Toast.LENGTH_LONG).show();
    }


    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }
}