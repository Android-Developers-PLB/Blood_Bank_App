package com.example.blood_bank_app.LifeSavers.Activities;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;

import com.example.blood_bank_app.R;
import com.google.android.material.navigation.NavigationView;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.MenuItem;

public class AboutUs extends AppCompatActivity {

    DrawerLayout drawerLayout;
    ActionBarDrawerToggle actionBarDrawerToggle;
    NavigationView navigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_us);

        setUpToolbar();
        navigationView = (NavigationView) findViewById(R.id.navigation_menu);
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                switch (menuItem.getItemId())
                {
                    case R.id.aboutus:
                        drawerLayout = findViewById(R.id.drawerLayout);
                        drawerLayout.closeDrawers();
                        break;

                    case  R.id.nav_home:
                        Intent intent2 = new Intent(AboutUs.this, MainActivity.class);
                        startActivity(intent2);
                        break;
                    case R.id.feedback:
                        Intent intent21 = new Intent(AboutUs.this, Feedback.class);
                        startActivity(intent21);
                        break;
                    case R.id.logout:
                        Intent intent34= new Intent(AboutUs.this, LoginActivity.class);
                        startActivity(intent34);
                        break;
                    case R.id.profile:
                        Intent intent3 = new Intent(AboutUs.this, Profile.class);
                        startActivity(intent3);
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

