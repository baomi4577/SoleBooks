package com.blanke.solebook.core.settings;


import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import com.blanke.solebook.R;
import com.blanke.solebook.utils.ResUtils;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.ViewById;

/**
 * Created by blanke on 16-4-25.
 */
@EActivity(R.layout.activity_settings)
public class SettingsActivity extends AppCompatActivity {
    @ViewById(R.id.activity_settings_toolbar)
    Toolbar toolbar;

    @AfterViews
    public void init() {
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(true);
        setTitle(ResUtils.getResString(this, R.string.navigation_setting));
        getFragmentManager().beginTransaction().
                replace(R.id.activity_settings_layout, new SettingsFragment())
                .commit();
    }
}