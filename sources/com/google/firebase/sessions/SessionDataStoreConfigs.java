package com.google.firebase.sessions;

import android.util.Base64;
import kotlin.Metadata;
import kotlin.text.StringsKt;

@Metadata
public final class SessionDataStoreConfigs {

    /* renamed from: a  reason: collision with root package name */
    public static final SessionDataStoreConfigs f31505a = new SessionDataStoreConfigs();

    /* renamed from: b  reason: collision with root package name */
    public static final String f31506b;

    /* renamed from: c  reason: collision with root package name */
    public static final String f31507c;

    /* renamed from: d  reason: collision with root package name */
    public static final String f31508d;

    static {
        String encodeToString = Base64.encodeToString(StringsKt.y(ProcessDetailsProvider.f31504a.e()), 10);
        f31506b = encodeToString;
        f31507c = "firebase_session_" + encodeToString + "_data";
        f31508d = "firebase_session_" + encodeToString + "_settings";
    }

    public final String a() {
        return f31507c;
    }

    public final String b() {
        return f31508d;
    }
}
