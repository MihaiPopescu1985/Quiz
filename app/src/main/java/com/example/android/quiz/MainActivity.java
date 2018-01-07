package com.example.android.quiz;

import android.app.ActionBar;
import android.graphics.Point;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Display;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int state = 1;
    public int score = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        settingTexts("Appalachians",
                "Australia",
                "Italy",
                "Russia",
                "USA");

        setBackImage(R.drawable.appalachians);
    }

    public void returnToMain(View view)
    {
        state = 1;
        score = 0;

        setContentView(R.layout.activity_main);

        settingTexts("Appalachians",
                "Australia",
                "Italy",
                "Russia",
                "USA");

        setBackImage(R.drawable.appalachians);
    }

    public void getResult()
    {
        setContentView(R.layout.result);

        TextView textView = findViewById(R.id.result);
        textView.setText("You guessed " + score + " answers out of 10 !");
        return;
    }

    public void setFirstAnswer(View view)
    {
        if (state == 10)
        {
            getResult();
            return;
        }
        else if ((state == 4) || (state == 7))
        {
            score = score + 1;
        }
        state = state + 1;
        stateChange();
    }

    public void setSecondAnswer(View view)
    {
        if (state == 10)
        {
            getResult();
            return;
        }
        else if ((state == 3) || (state == 6) || (state == 8))
        {
            score = score + 1;
        }
        state = state + 1;
        stateChange();
    }

    public void setThirdAnswer(View view)
    {
        if (state == 10)
        {
            score = score + 1;
            getResult();
            return;
        }
        else if (state == 9)
        {
            score = score + 1;
        }
        state = state + 1;
        stateChange();
    }

    public void setFourthAnswer(View view)
    {
        if (state == 10)
        {
            getResult();
            return;
        }
        else if((state == 0) || (state == 1) || (state == 2) || (state == 5))
        {
            score = score + 1;
        }
        state = state + 1;
        stateChange();
    }

    private void stateChange()
    {
        if(state == 2)
        {
            settingTexts("K2",
                    "Andes",
                    "Australia",
                    "Alps",
                    "Himalayas");

            setBackImage(R.drawable.k2);
        }
        else if (state == 3)
        {
            settingTexts("Sierra Nevada",
                    "Colorado",
                    "California",
                    "Mexico",
                    "Nevada");

            setBackImage(R.drawable.sierra_nevada);
        }
        else if (state == 4)
        {
            settingTexts("Mount Olympus",
                    "Greece",
                    "Turkey",
                    "Israel",
                    "Italy");

            setBackImage(R.drawable.olympus);
        }
        else if (state == 5)
        {
            settingTexts("Hekla",
                    "Italy",
                    "Russia",
                    "Hawaii",
                    "Iceland");

            setBackImage(R.drawable.hekla);
        }
        else if (state == 6)
        {
            settingTexts("Mount Kosciuszko",
                    "Angola",
                    "Australia",
                    "Argentina",
                    "Japan");

            setBackImage(R.drawable.kosciuszko);
        }
        else if (state == 7)
        {
            settingTexts("Matterhorn",
                    "Switzerland",
                    "Germany",
                    "France",
                    "Austria");

            setBackImage(R.drawable.matterhorn);
        }
        else if (state == 8)
        {
            settingTexts("Mount Aconcagua",
                    "Peru",
                    "Argentina",
                    "Mexico",
                    "Guatemala");

            setBackImage(R.drawable.aconcagua);
        }
        else if (state == 9)
        {
            settingTexts("Denali (Mount McKinley)",
                    "Yukon",
                    "British-Colombia",
                    "Alaska",
                    "California");

            setBackImage(R.drawable.denali);
        }
        else
        {
            settingTexts("Mount Everest",
                    "Andes",
                    "Rocky-Mountains",
                    "Himalayas",
                    "Alps");

            setBackImage(R.drawable.everest);
        }
    }

    private void setBackImage(int id)
    {
        ImageView imageView;
        imageView = findViewById(R.id.background_img);
        imageView.setImageResource(id);
    }

    private void settingTexts(String mountain,
                              String firstAnswer,
                              String secondAnswer,
                              String thirdAnswer,
                              String fourthAnswer)
    {
        TextView textView;

        textView = findViewById(R.id.mountain_name);
        textView.setText(mountain);
        textView = findViewById(R.id.answer_1);
        textView.setText(firstAnswer);
        textView = findViewById(R.id.answer_2);
        textView.setText(secondAnswer);
        textView = findViewById(R.id.answer_3);
        textView.setText(thirdAnswer);
        textView = findViewById(R.id.answer_4);
        textView.setText(fourthAnswer);
    }
}
