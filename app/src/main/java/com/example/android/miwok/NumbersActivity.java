package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        /*USING <ARRAYLIST> NOW WE WILL DO */

        ArrayList<Word> words = new ArrayList<Word>();
        //words.add("one");

        words.add(new Word("one", "lutti"));
        words.add(new Word("two", "oti"));
        words.add(new Word("three", "latti"));
        words.add(new Word("four", "mmutti"));
        words.add(new Word("five", "laatti"));
        words.add(new Word("six", "luqwi"));
        words.add(new Word("seven", "luzctti"));
        words.add(new Word("eight", "luttaai"));
        words.add(new Word("nine", "luasdfi"));
//OR
        Word w = new Word("ten", "lutti");
        words.add(w);


        WordAdapter Adapter = new WordAdapter(this, words);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(Adapter);



    }


}



/*
         ArrayList<String> words = new ArrayList<String>();

        words.add("one");
        words.add("two");
        words.add("three");
        words.add("four");
        words.add("five");
        words.add("six");
        words.add("seven");
        words.add("eight");
        words.add("nine");

        ArrayAdapter<String> itemsAdapter =  new ArrayAdapter<String>(this , R.layout.list_item, words);        // android.R.layout.simple_list_item1 is replaced
        ListView listView = (ListView)findViewById(R.id.list);
        listView.setAdapter(itemsAdapter);
*/
/*

         ArrayList<String> words = new ArrayList<String>();

        words.add("one");
        words.add("two");
        words.add("three");
        words.add("four");
        words.add("five");
        words.add("six");
        words.add("seven");
        words.add("eight");
        words.add("nine");

            LinearLayout rootView = (LinearLayout) findViewById(R.id.rootView);
            for (int index = 0 ; index<words.size() ; index++){
                TextView wordsView = new TextView(this);
                wordsView.setText(words.get(index));
                rootView.addView(wordsView);

            } */


/*          int index = 0;
            while (index < words.size()) {
            TextView wordsView = new TextView(this);
            wordsView.setText(words.get(index));
            rootView.addView(wordsView);                 // addView is used show text
            index++;
        }   */





/*  NOW WE DON'T HAVE TO USE THIS AS WE HAVE USED THE WHILE LOOPS:
        LinearLayout rootView = (LinearLayout) findViewById(R.id.rootView);
        TextView wordsView2 = new TextView(this);
        wordsView2.setText(words.get(1));
        rootView.addView(wordsView2);

        TextView wordsView3 = new TextView(this);
        wordsView3.setText(words.get(2));
        rootView.addView(wordsView3);*/


/*  THIS WER HAVE DONE USING ARRAY*/
/*
        String[] words =  new String[10] ;
        words[0] = "one";
        words[1] = "two";
        words[2] = "three";
        words[3] = "four";
        words[4] = "five";
        words[5] = "six";
        words[6] = "seven";
        words[7] = "seven";
        words[8] = "seven";
        words[9] = "seven";
*/
/* ArrayList we don't have to give size  inside object we can give anything */

        /* to create arrayList
        ArrayList<String> musicLibrary=new ArrayList<String> ();

         TO PERFORM THE FOLLOWING FUNCTION WE USE ::
         ADD TO ADD ELEMENT :: GET TO DISPLAY ELEMENT :: REMOVE TO REMOVE ELEMENT FROM THE ARRAYlIST

        add elements in an arrayList:    musicLibrary.add("yellow");
        add element in specific index:  musicLibrary.add( 0 , "blue");

        access elements in an arrayList:    musicLibrary.get(0);
                                        :   musicLibrary.get(1);

        remove elements from arrayList:     musicLibrary.remove(2);

        size of ArrayList : musicLibrary.size();
       */


        /*   DIFFERENCE BETWEEN ARRAY AND ARRAYLIST
        TO CREATE ::
        in array:       String[] names = new String[2];
        in ArrayList:   ArrayList<String> names =  new ArrayList<String>();

        TO MODIFY ELEMENTS ::
        in array:       names[0] = "king";
        in ArrayList:   names.add("king");

        TO ACESSS ELEMENTS ::
        in array:       names[0];
        in ArrayList:   names.get(0);

        TO FIND SIZE ::
        in array:       names.length;
        in ArrayList:   names.size();
*/


