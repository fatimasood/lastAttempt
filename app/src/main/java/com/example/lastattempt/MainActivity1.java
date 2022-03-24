package com.example.lastattempt;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import java.util.ArrayList;

public class MainActivity1 extends AppCompatActivity {
    ArrayList<ContactModel> arrContacts=new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        getSupportActionBar().hide();
        setContentView(R.layout.activity_main1);
        RecyclerView
                recyclerView=findViewById(R.id.recyclerContact);
        recyclerView.setLayoutManager(new
                LinearLayoutManager(this));
        arrContacts.add(new ContactModel(R.drawable.img_1,"Name: A short history of Newly Everything","Author: Bill Bryson"));
        arrContacts.add(new ContactModel(R.drawable.img_2,"Name: The Book Theift", "Author: Markus Zusak"));
        arrContacts.add(new ContactModel(R.drawable.img_4,"Name: Think and Grow Rich", "Author: Napoleon Hill"));
        arrContacts.add(new ContactModel(R.drawable.img_5,"Name: Magic of thinking big", "Author: David Schwartz"));
        arrContacts.add(new ContactModel(R.drawable.img_6,"Name: The Lord of the Rings", "Author: J. R. R. Tolkien"));
        arrContacts.add(new ContactModel(R.drawable.img_7,"Name: The Hobbit", "Author: J. R. R. Tolkien"));
        arrContacts.add(new ContactModel(R.drawable.img_8,"Name: Friend and Foe", "Author: Adam Galinsky"));
         arrContacts.add(new  ContactModel(R.drawable.img_9,"Name: The Other Black Girl", "Author: Zakiya Dalila Harris"));
        arrContacts.add(new ContactModel(R.drawable.img_3,"Name: The Alchemist", "Author: Paulo Coelho"));
        arrContacts.add(new ContactModel(R.drawable.img_10,"Name: War and Peace", "Author: Leo Tolstoy"));

        RecyclerContactAdapter adapter= new RecyclerContactAdapter(this,arrContacts);
        recyclerView.setAdapter(adapter);
    }
}