package com.shareplate.myapplicationexp_7;

import android.os.Bundle;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    ListView listView;

    String[] titles = {
            "Prince kumar",
            "Android Development",
            "Adaptive UI",
            "ListView",
            "ImageView",
            "Experiment 7"
    };

    String[] subtitles = {
            "USN: 25MCAR0112",
            "Learning Android",
            "Creating responsive layouts",
            "Displaying lists of data",
            "Showing images",
            "Mobile Application Lab"
    };

    int[] imageIds = {
            R.drawable.ic_person,
            R.drawable.ic_android,
            R.drawable.ic_layout,
            R.drawable.ic_list,
            R.drawable.ic_image,
            R.drawable.ic_experiment
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        listView = findViewById(R.id.list_view);
        CustomAdapter adapter = new CustomAdapter(this, titles, subtitles, imageIds);
        listView.setAdapter(adapter);
    }
}