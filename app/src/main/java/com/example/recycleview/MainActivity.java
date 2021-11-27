package com.example.recycleview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView contactsRV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        contactsRV = findViewById(R.id.contactsRV);

        ArrayList<Contact> contacts = new ArrayList<>();
        contacts.add(new Contact("Lee", "lee@gmail.com", "https://www.google.com/chrome/static/images/homepage/lpo-chrome_desktop.png"));
        contacts.add(new Contact("Lee1", "lee1@gmail.com", "https://www.google.com/chrome/static/images/homepage/lpo-chrome_desktop.png"));
        contacts.add(new Contact("Lee2", "lee2@gmail.com", "https://www.google.com/chrome/static/images/homepage/lpo-chrome_desktop.png"));
        contacts.add(new Contact("Lee3", "lee3@gmail.com", "https://www.google.com/chrome/static/images/homepage/lpo-chrome_desktop.png"));
        contacts.add(new Contact("Lee4", "lee4@gmail.com", "https://www.google.com/chrome/static/images/homepage/lpo-chrome_desktop.png"));

        ContactsRecViewAdapter adapter = new ContactsRecViewAdapter(this);
        adapter.setContacts(contacts);
        
        contactsRV.setAdapter(adapter);
//        contactsRV.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));
//        contactsRV.setLayoutManager(new GridLayoutManager(this, 2));
        contactsRV.setLayoutManager(new LinearLayoutManager(this));
    }
}