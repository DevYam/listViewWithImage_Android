package com.ncertguruji.listviewwithimage;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private final String [] chapterNames = {
            "India",
            "China",
            "Nepal",
            "Bhutan"
    };

    private final String [] chapterDescription = {
            "Delhi",
            "Beijing",
            "Kathmandu",
            "Thimphu"
    };


    private final Integer [] imageId = {
            R.drawable.me,
            R.drawable.me,
            R.drawable.sch1,
            R.drawable.sch1,

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView listView = findViewById(android.R.id.list);

        // For populating list data
        CustomChapterList customCountryList = new CustomChapterList(this, chapterNames, chapterDescription, imageId);
        listView.setAdapter(customCountryList);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                Toast.makeText(getApplicationContext(),"You Selected "+chapterNames[position]+ " as Country",Toast.LENGTH_SHORT).show();}
        });
    }
}