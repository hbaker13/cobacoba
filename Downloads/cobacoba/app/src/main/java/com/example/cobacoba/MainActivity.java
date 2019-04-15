package com.example.cobacoba;
import android.media.session.PlaybackState;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<Music> arrayList;
    private KustomMusik adapter;
    private ListView songlist;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        songlist = (ListView)findViewById(R.id.songlist);
        arrayList = new ArrayList<>();
        arrayList.add(new Music("Ambient", R.raw.ambient));

        adapter = new KustomMusik(this, R.layout.custom_music, arrayList);
        songlist.setAdapter(adapter);

    }
}
       /* audio= MediaPlayer.create(MainActivity.this, R.raw.ambient);
        audio.setLooping(true);
        audio.setVolume(1, 1);
        audio.start();

    }

    public void onToggleClicked(View view) {


        boolean on = ((ToggleButton) view).isChecked();

        if (on) {
            audio.setVolume(1,1);
        } else {
            audio.setVolume(0,0);
        }
    }

    public void toggleclicked(View view) {
        boolean on = ((ToggleButton) view).isChecked();

        if (on) {
            audio.setVolume(1,1);
        }else{
            audio.setVolume(0,0);
        }
    }

    public void onToggleClicked2(View view) {
        boolean on = ((ToggleButton) view).isChecked();

        if (on) {
            audio.setVolume(1,1);
        }else{
            audio.setVolume(0,0);
        }
    }

    public void onToggleClicked3(View view) {
        boolean on = ((ToggleButton) view).isChecked();

        if (on) {
            audio.setVolume(1,1);
        }else{
            audio.setVolume(0,0);
        }
    }

    public void onToggleClicked4(View view) {
        boolean on = ((ToggleButton) view).isChecked();

        if (on) {
            audio.setVolume(1,1);
        }else{
            audio.setVolume(0,0);
        }
    }

    public void onToggleClicked5(View view) {
        boolean on = ((ToggleButton) view).isChecked();

        if (on) {
            audio.setVolume(1,1);
        }else{
            audio.setVolume(0,0);
        }
    }

    public void onBackPressed() {
        audio.stop();
        MainActivity.this.finish();
    }
     }

        /*mediaPlayer = MediaPlayer.create(this, audiofile[index]);
        Button play_button = (Button) this.findViewById(R.id.button1);
        play_button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (audiofile[index] == 0){
                mediaPlayer.start();
                }else if (audiofile[index] == 1){
                    mediaPlayer.start();
                }
        }
        });
    }
}*/

     /*   audioFiles = new int [] {R.raw.soft_piano-1,R.raw.singing_bowl-2};
        Spinner spinner = (Spinner) findViewById(R.id.spinner1);
        bt=(Button)findViewById(R.id.button1);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.soundEntries, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        bt.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                switch (soundselection) {
                    case 1:
                        if (mp != null && mp.isPlaying())

                            mp = MediaPlayer.create(MainActivity.this, R.raw.singing_bowl);
                        mp.start();
                        mp.setVolume(100,100);
                        mp.setLooping(true);
                        Toast t = Toast.makeText(MainActivity.this,"singing bowl",Toast.LENGTH_LONG);
                        t.show();
                        break;
                    case 2:
                        // if(mp.isPlaying())

                        mp = MediaPlayer.create(getApplicationContext(), R.raw.soft_piano);
                        mp.start();
                        Toast th = Toast.makeText(getApplicationContext(), "soft piano", Toast.LENGTH_LONG);
                        th.show();
                        break;

                }
            }
        });
    }






    /*Spinner Functions*/
   /* public void onItemSelected(AdapterView<?> parent, View view, int pos, long id) {
        soundselection = pos;
    }
    public void onNothingSelected(AdapterView<?> parent) {
        // Do nothing.
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }*/
