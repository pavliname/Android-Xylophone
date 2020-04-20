package com.londonappbrewery.xylophonepm;

import android.media.AudioManager;
import android.media.SoundPool;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

import static android.media.AudioManager.STREAM_MUSIC;

public class MainActivity extends AppCompatActivity {

    // Helpful Constants
    private final int NR_OF_SIMULTANEOUS_SOUNDS = 7;
    private final float LEFT_VOLUME = 1.0f;
    private final float RIGHT_VOLUME = 1.0f;
    private final int NO_LOOP = 0;
    private final int PRIORITY = 0;
    private final float NORMAL_PLAY_RATE = 1.0f;

    // TODO: Add member variables here
    private int mCSoundId;
    private int mDSoundId;
    private int mESoundId;
    private int mFSoundId;
    private int mGSoundId;
    private int mASoundId;
    private int mBSoundId;
    private SoundPool mSoundPool;
    private int AudioManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // TODO: Create a new SoundPool
        mSoundPool = new SoundPool(NR_OF_SIMULTANEOUS_SOUNDS, AudioManager, STREAM_MUSIC);

        // TODO: Load and get the IDs to identify the sounds
//        public void playC (android view View){
//            Log.d("Xylophone", "Red Button Clicked!");
//            mSoundPool.play(mCSoundId, LEFT_VOLUME, RIGHT_VOLUME, PRIORITY, NO_LOOP, NORMAL_PLAY_RATE);
//        }
//        ;
//
//        public void playD (android view View){
//            Log.d("Xylophone", "D Button Clicked!");
//            mSoundPool.play(mDSoundId, LEFT_VOLUME, RIGHT_VOLUME, PRIORITY, NO_LOOP, NORMAL_PLAY_RATE);
//        }
//        ;
//
//        public void playE (android view View){
//            Log.d("Xylophone", "E Button Clicked!");
//            mSoundPool.play(mESoundId, LEFT_VOLUME, RIGHT_VOLUME, PRIORITY, NO_LOOP, NORMAL_PLAY_RATE);
//        }
//        ;
//
//        public void playF (android view View){
//            Log.d("Xylophone", "F Button Clicked!");
//            mSoundPool.play(mFSoundId, LEFT_VOLUME, RIGHT_VOLUME, PRIORITY, NO_LOOP, NORMAL_PLAY_RATE);
//        }
//        ;
//
//        public void playG (android view View){
//            Log.d("Xylophone", "G Button Clicked!");
//            mSoundPool.play(mGSoundId, LEFT_VOLUME, RIGHT_VOLUME, PRIORITY, NO_LOOP, NORMAL_PLAY_RATE);
//        }
//        ;
//
//        public void playA (android view View){
//            Log.d("Xylophone", "A Button Clicked!");
//            mSoundPool.play(mASoundId, LEFT_VOLUME, RIGHT_VOLUME, PRIORITY, NO_LOOP, NORMAL_PLAY_RATE);
//        }
//        ;
//
//        public void playB (View view){
//            Log.d("Xylophone", "B Button Clicked!");
//            mSoundPool.play(mBSoundId, LEFT_VOLUME, RIGHT_VOLUME, PRIORITY, NO_LOOP, NORMAL_PLAY_RATE);
//        }
//        ;
//
//        public void playB(View view) {
//            Log.d("Xylophone", "B Button Clicked!");
//            mSoundPool.play(mBSoundId,LEFT_VOLUME,RIGHT_VOLUME, PRIORITY, NO_LOOP, NORMAL_PLAY_RATE);
//        }

    // TODO: Add the play methods triggered by the buttons
    mCSoundId=mSoundPool.load(getApplicationContext(), R.raw.note1_c,1);
    mDSoundId=mSoundPool.load(getApplicationContext(), R.raw.note2_d,1);
    mESoundId=mSoundPool.load(getApplicationContext(), R.raw.note3_e,1);
    mFSoundId=mSoundPool.load(getApplicationContext(), R.raw.note4_f,1);
    mGSoundId=mSoundPool.load(getApplicationContext(), R.raw.note5_g,1);
    mASoundId=mSoundPool.load(getApplicationContext(), R.raw.note6_a,1);
    mBSoundId=mSoundPool.load(getApplicationContext(), R.raw.note7_b,1);
}

    public void playC(View view) {
        Log.d("Xylophone", "C Button Clicked!");
        mSoundPool.play(mCSoundId,LEFT_VOLUME,RIGHT_VOLUME, PRIORITY, NO_LOOP, NORMAL_PLAY_RATE);
    }
    public void playD(View view) {
        Log.d("Xylophone", "D Button Clicked!");
        mSoundPool.play(mDSoundId,LEFT_VOLUME,RIGHT_VOLUME, PRIORITY, NO_LOOP, NORMAL_PLAY_RATE);
    }
    public void playE(View view) {
        Log.d("Xylophone", "E Button Clicked!");
        mSoundPool.play(mESoundId,LEFT_VOLUME,RIGHT_VOLUME, PRIORITY, NO_LOOP, NORMAL_PLAY_RATE);
    }
    public void playF(View view) {
        Log.d("Xylophone", "F Button Clicked!");
        mSoundPool.play(mFSoundId,LEFT_VOLUME,RIGHT_VOLUME, PRIORITY, NO_LOOP, NORMAL_PLAY_RATE);
    }
    public void playG(View view) {
        Log.d("Xylophone", "G Button Clicked!");
        mSoundPool.play(mGSoundId,LEFT_VOLUME,RIGHT_VOLUME, PRIORITY, NO_LOOP, NORMAL_PLAY_RATE);
    }
    public void playA(View view) {
        Log.d("Xylophone", "A Button Clicked!");
        mSoundPool.play(mASoundId,LEFT_VOLUME,RIGHT_VOLUME, PRIORITY, NO_LOOP, NORMAL_PLAY_RATE);
    }
    public void playB(View view) {
        Log.d("Xylophone", "B Button Clicked!");
        mSoundPool.play(mBSoundId,LEFT_VOLUME,RIGHT_VOLUME, PRIORITY, NO_LOOP, NORMAL_PLAY_RATE);
    }

    }

