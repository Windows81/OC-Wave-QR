package com.google.firebase.sessions;

import android.util.Log;
import androidx.datastore.core.CorruptionException;
import androidx.datastore.preferences.core.Preferences;
import androidx.datastore.preferences.core.PreferencesFactory;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class SessionDatastoreImpl$Companion$dataStore$2 extends Lambda implements Function1<CorruptionException, Preferences> {

    /* renamed from: z  reason: collision with root package name */
    public static final SessionDatastoreImpl$Companion$dataStore$2 f31523z = new SessionDatastoreImpl$Companion$dataStore$2();

    public SessionDatastoreImpl$Companion$dataStore$2() {
        super(1);
    }

    /* renamed from: b */
    public final Preferences invoke(CorruptionException corruptionException) {
        Intrinsics.i(corruptionException, "ex");
        Log.w("FirebaseSessionsRepo", "CorruptionException in sessions DataStore in " + ProcessDetailsProvider.f31504a.e() + '.', corruptionException);
        return PreferencesFactory.a();
    }
}
