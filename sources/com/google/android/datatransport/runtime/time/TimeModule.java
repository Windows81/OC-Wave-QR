package com.google.android.datatransport.runtime.time;

import com.google.android.datatransport.runtime.dagger.Module;

@Module
public abstract class TimeModule {
    public static Clock a() {
        return new WallTimeClock();
    }

    public static Clock b() {
        return new UptimeClock();
    }
}
