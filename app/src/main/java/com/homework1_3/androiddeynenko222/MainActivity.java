package com.homework1_3.androiddeynenko222;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    Intent intentNotes;
    private int id;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar myToolbar = findViewById(R.id.my_toolbar);
        setSupportActionBar(myToolbar);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        id = item.getItemId();

        if (id == R.id.action_open_notes) {
            Toast.makeText(MainActivity.this, getString(R.string.toast_notes),
                    Toast.LENGTH_LONG).show();
            intentNotes = new Intent(MainActivity.this, NotesActivity.class);
                startActivity(intentNotes);
            return true;
        }

        if (id == R.id.action_open_main) {
            Toast.makeText(MainActivity.this, getString(R.string.toast_main),
                    Toast.LENGTH_LONG).show();
            intentNotes = new Intent(MainActivity.this, MainActivity.class);
                startActivity(intentNotes);
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
