package dagger.hilt.android.internal.modules;

import android.app.Activity;
import androidx.fragment.app.FragmentActivity;
import dagger.Module;

@Module
abstract class ActivityModule {
    public static FragmentActivity a(Activity activity) {
        try {
            return (FragmentActivity) activity;
        } catch (ClassCastException e2) {
            throw new IllegalStateException("Expected activity to be a FragmentActivity: " + activity, e2);
        }
    }
}
