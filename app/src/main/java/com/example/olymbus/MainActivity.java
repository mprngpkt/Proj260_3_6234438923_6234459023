package com.example.olymbus;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BottomNavigationView bottomNav = findViewById(R.id.bottom_navigaton);

        bottomNav.setOnNavigationItemSelectedListener(navListener);

        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                new HomeFragment()).commit();

        if(findViewById(R.id.displayList)!=null){
            ListFragment listFragment = new ListFragment();
            listFragment.setArguments(getIntent().getExtras());
            getSupportFragmentManager().beginTransaction().add(R.id.displayList,
                    listFragment).commit();
        }

        if(findViewById(R.id.displayDetail)!=null){
            getFragmentManager().popBackStack();
            DetailFragment detailFragment = new DetailFragment();
            detailFragment.setArguments(getIntent().getExtras());
            getSupportFragmentManager().beginTransaction().add(R.id.displayDetail,
                    detailFragment).commit();
        }
/*
        //let's pd try sth

        SeatingPlan seatingPlanFragment = new SeatingPlan();
        FragmentManager fm = getSupportFragmentManager();

        fm.beginTransaction().add(R.id.btnBack,seatingPlanFragment).commit();
*/
    }

    private BottomNavigationView.OnNavigationItemSelectedListener navListener =
            new BottomNavigationView.OnNavigationItemSelectedListener() {
                @Override
                public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                    Fragment selectedFragment = null;

                    switch (menuItem.getItemId()){

                        case R.id.nav_home : selectedFragment = new HomeFragment(); break;
                        case R.id.nav_booking : selectedFragment = new BookingFragment(); break;
                        case R.id.nav_profile : selectedFragment = new ProfileFragment(); break;
                    }
                    getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                            selectedFragment).commit();
                    return  true;
                }

            };


/*    public void onMobileSelected(String Model, int position){
        DetailFragment detailFragment = (DetailFragment)
                getFragmentManager().findFragmentById(R.id.displayDetail);
    }*/
}
