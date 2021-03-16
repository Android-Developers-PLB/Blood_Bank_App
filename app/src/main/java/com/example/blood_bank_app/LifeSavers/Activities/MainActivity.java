package com.example.blood_bank_app.LifeSavers.Activities;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import com.example.blood_bank_app.R;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.MenuItem;

import androidx.appcompat.app.AppCompatActivity;

import com.example.blood_bank_app.R;
import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity {


    DrawerLayout drawerLayout;
    ActionBarDrawerToggle actionBarDrawerToggle;
    NavigationView navigationView;

    private Button login;
    private Button requests;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        login = findViewById(R.id.button_become_donor);
        requests=findViewById(R.id.button_requests);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, LoginActivity.class);
                startActivity(intent);
            }
        });
        requests.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, RequestsActivity.class);
                startActivity(intent);
            }
        });

        setUpToolbar();
        navigationView = (NavigationView) findViewById(R.id.navigation_menu);
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                switch (menuItem.getItemId())
                {
                    case R.id.aboutus:
                        Intent intent2 = new Intent(MainActivity.this, AboutUs.class);
                        startActivity(intent2);
                        break;
                    case R.id.feedback:
                        Intent intent3 = new Intent(MainActivity.this,Feedback.class);
                        startActivity(intent3);
                        break;
                    case R.id.logout:
                        Intent intent4 = new Intent(MainActivity.this,LoginActivity.class);
                        startActivity(intent4);
                        break;
                    case R.id.profile:
                        Intent intent5 = new Intent(MainActivity.this, Profile.class);
                        startActivity(intent5);
                        break;

                    case  R.id.nav_home:
                        drawerLayout = findViewById(R.id.drawerLayout);
                        drawerLayout.closeDrawers();
                        break;



                    case  R.id.nav_Policy:{

                        Intent browserIntent  = new Intent(Intent.ACTION_VIEW , Uri.parse("https://yashrajputishu.wixsite.com/bloodbank"));
                        startActivity(browserIntent);

                    }
                           break;
                    case  R.id.nav_share:{

                        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
                        sharingIntent.setType("text/plain");
                        String shareBody =  "http://play.google.com/store/apps/detail?id=" + getPackageName();
                        String shareSub = "Try now";
                        sharingIntent.putExtra(android.content.Intent.EXTRA_SUBJECT, shareSub);
                        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, shareBody);
                        startActivity(Intent.createChooser(sharingIntent, "Share using"));

                    }
                    break;
                }
                return false;
            }
        });
    }
    public void setUpToolbar() {
        drawerLayout = findViewById(R.id.drawerLayout);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        actionBarDrawerToggle = new ActionBarDrawerToggle(this, drawerLayout, toolbar, R.string.app_name, R.string.app_name);
        drawerLayout.addDrawerListener(actionBarDrawerToggle);
        getSupportActionBar().setTitle("");
        actionBarDrawerToggle.syncState();

    }
}