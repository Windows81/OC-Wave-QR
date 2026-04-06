package com.google.firebase.sessions.settings;

import android.util.Log;
import androidx.datastore.core.CorruptionException;
import androidx.datastore.preferences.core.Preferences;
import androidx.datastore.preferences.core.PreferencesFactory;
import com.google.firebase.sessions.ProcessDetailsProvider;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class SessionsSettings$Companion$dataStore$2 extends Lambda implements Function1<CorruptionException, Preferences> {

    /* renamed from: z  reason: collision with root package name */
    public static final SessionsSettings$Companion$dataStore$2 f31610z = new SessionsSettings$Companion$dataStore$2();

    public SessionsSettings$Companion$dataStore$2() {
        super(1);
    }

    /* renamed from: b */
    public final Preferences invoke(CorruptionException corruptionException) {
        Intrinsics.i(corruptionException, "ex");
        Log.w("SessionsSettings", "CorruptionException in settings DataStore in " + ProcessDetailsProvider.f31504a.e() + '.', corruptionException);
        return PreferencesFactory.a();
    }
}
