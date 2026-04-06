package com.google.firebase.sessions.settings;

import android.content.Context;
import android.os.Bundle;
import com.google.firebase.sessions.settings.SettingsProvider;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;

@Metadata
public final class LocalOverrideSettings implements SettingsProvider {

    /* renamed from: b  reason: collision with root package name */
    public static final Companion f31586b = new Companion((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    public final Bundle f31587a;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    public LocalOverrideSettings(Context context) {
        Intrinsics.i(context, "context");
        Bundle bundle = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
        this.f31587a = bundle == null ? Bundle.EMPTY : bundle;
    }

    public Boolean a() {
        if (this.f31587a.containsKey("firebase_sessions_enabled")) {
            return Boolean.valueOf(this.f31587a.getBoolean("firebase_sessions_enabled"));
        }
        return null;
    }

    public Duration b() {
        if (this.f31587a.containsKey("firebase_sessions_sessions_restart_timeout")) {
            return Duration.l(DurationKt.s(this.f31587a.getInt("firebase_sessions_sessions_restart_timeout"), DurationUnit.SECONDS));
        }
        return null;
    }

    public Double c() {
        if (this.f31587a.containsKey("firebase_sessions_sampling_rate")) {
            return Double.valueOf(this.f31587a.getDouble("firebase_sessions_sampling_rate"));
        }
        return null;
    }

    public Object d(Continuation continuation) {
        return SettingsProvider.DefaultImpls.a(this, continuation);
    }
}
