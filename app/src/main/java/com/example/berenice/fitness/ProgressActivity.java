package com.example.berenice.fitness;

import android.app.Activity;
import android.os.Bundle;

import com.example.berenice.fitness.adapter.ProgressAdapter;
import com.example.berenice.fitness.domain.CurrentState;
import com.example.berenice.fitness.domain.TrainingHelper;

import se.emilsjolander.stickylistheaders.ExpandableStickyListHeadersListView;
import se.emilsjolander.stickylistheaders.StickyListHeadersAdapter;
/**
 * Created by Berenice on 08/03/2017.
 */

public class ProgressActivity extends Activity {

    ExpandableStickyListHeadersListView workoutList;
    //Spinner levelSpinner;
    StickyListHeadersAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_progress);

        //levelSpinner = (Spinner)findViewById(R.id.p_level_selector);
        workoutList = (ExpandableStickyListHeadersListView) findViewById(R.id.workouts_list);

        CurrentState currentState = TrainingHelper.getCurrentState(this);

        adapter = new ProgressAdapter(this, currentState.historyRecords);
        workoutList.setAdapter(adapter);
    }
}
