package com.google.android.datatransport.runtime.scheduling.persistence;

import android.content.Context;
import com.google.android.datatransport.runtime.dagger.Module;

@Module
public abstract class EventStoreModule {
    public static String a() {
        return "com.google.android.datatransport.events";
    }

    public static String b(Context context) {
        return context.getPackageName();
    }

    public static int c() {
        return SchemaManager.C;
    }

    public static EventStoreConfig d() {
        return EventStoreConfig.f24252a;
    }
}
