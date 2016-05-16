
package com.android.settings.hottix;

import android.os.Bundle;

import com.android.internal.logging.MetricsLogger;
import com.android.settings.R;
import com.android.settings.SettingsPreferenceFragment;

public class HottixSettings extends SettingsPreferenceFragment {

    @Override
    protected int getMetricsCategory() {
        return MetricsLogger.DISPLAY;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        addPreferencesFromResource(R.xml.hottix_settings);
    }
}
