package com.google.firebase.crashlytics.internal.settings;

public class Settings {

    /* renamed from: a  reason: collision with root package name */
    public final SessionData f30653a;

    /* renamed from: b  reason: collision with root package name */
    public final FeatureFlagData f30654b;

    /* renamed from: c  reason: collision with root package name */
    public final long f30655c;

    /* renamed from: d  reason: collision with root package name */
    public final int f30656d;

    /* renamed from: e  reason: collision with root package name */
    public final int f30657e;

    /* renamed from: f  reason: collision with root package name */
    public final double f30658f;

    /* renamed from: g  reason: collision with root package name */
    public final double f30659g;

    /* renamed from: h  reason: collision with root package name */
    public final int f30660h;

    public static class FeatureFlagData {

        /* renamed from: a  reason: collision with root package name */
        public final boolean f30661a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f30662b;

        /* renamed from: c  reason: collision with root package name */
        public final boolean f30663c;

        public FeatureFlagData(boolean z2, boolean z3, boolean z4) {
            this.f30661a = z2;
            this.f30662b = z3;
            this.f30663c = z4;
        }
    }

    public static class SessionData {

        /* renamed from: a  reason: collision with root package name */
        public final int f30664a;

        /* renamed from: b  reason: collision with root package name */
        public final int f30665b;

        public SessionData(int i2, int i3) {
            this.f30664a = i2;
            this.f30665b = i3;
        }
    }

    public Settings(long j2, SessionData sessionData, FeatureFlagData featureFlagData, int i2, int i3, double d2, double d3, int i4) {
        this.f30655c = j2;
        this.f30653a = sessionData;
        this.f30654b = featureFlagData;
        this.f30656d = i2;
        this.f30657e = i3;
        this.f30658f = d2;
        this.f30659g = d3;
        this.f30660h = i4;
    }

    public boolean a(long j2) {
        return this.f30655c < j2;
    }
}
