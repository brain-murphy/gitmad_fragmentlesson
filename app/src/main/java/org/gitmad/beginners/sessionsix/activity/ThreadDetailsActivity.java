package org.gitmad.beginners.sessionsix.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import org.gitmad.beginners.sessionsix.R;
import org.gitmad.beginners.sessionsix.fragment.ThreadDetailsFragment;

public class ThreadDetailsActivity extends AppCompatActivity {

    public static String KEY_THREAD_INDEX = "thread index asdf";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thread_details);

        if (savedInstanceState == null) {

            int threadIndex = getIntent().getIntExtra(KEY_THREAD_INDEX, -1);

            ThreadDetailsFragment detailsFragment = ThreadDetailsFragment.newInstance(threadIndex);

            getSupportFragmentManager().beginTransaction()
                    .add(R.id.detailsFragmentFrame, detailsFragment)
                    .commit();
        }
    }
}
