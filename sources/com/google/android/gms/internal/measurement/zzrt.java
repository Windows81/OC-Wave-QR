package com.google.android.gms.internal.measurement;

public final class zzrt implements zzru {

    /* renamed from: a  reason: collision with root package name */
    public static final zzir f25873a;

    /* renamed from: b  reason: collision with root package name */
    public static final zzir f25874b;

    static {
        zziz e2 = new zziz(zzio.a("com.google.android.gms.measurement")).f().e();
        e2.d("measurement.client.sessions.background_sessions_enabled", true);
        f25873a = e2.d("measurement.client.sessions.enable_fix_background_engagement", false);
        e2.d("measurement.client.sessions.immediate_start_enabled_foreground", true);
        f25874b = e2.d("measurement.client.sessions.enable_pause_engagement_in_background", true);
        e2.d("measurement.client.sessions.remove_expired_session_properties_enabled", true);
        e2.d("measurement.client.sessions.session_id_enabled", true);
        e2.b("measurement.id.client.sessions.enable_fix_background_engagement", 0);
    }

    public final boolean a() {
        return ((Boolean) f25873a.f()).booleanValue();
    }

    public final boolean b() {
        return ((Boolean) f25874b.f()).booleanValue();
    }
}
