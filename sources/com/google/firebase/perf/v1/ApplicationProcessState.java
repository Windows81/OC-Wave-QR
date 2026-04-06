package com.google.firebase.perf.v1;

import com.google.protobuf.Internal;

public enum ApplicationProcessState implements Internal.EnumLite {
    APPLICATION_PROCESS_STATE_UNKNOWN(0),
    FOREGROUND(1),
    BACKGROUND(2),
    FOREGROUND_BACKGROUND(3);
    
    public static final Internal.EnumLiteMap E = null;

    /* renamed from: z  reason: collision with root package name */
    public final int f31147z;

    public static final class ApplicationProcessStateVerifier implements Internal.EnumVerifier {

        /* renamed from: a  reason: collision with root package name */
        public static final Internal.EnumVerifier f31148a = null;

        static {
            f31148a = new ApplicationProcessStateVerifier();
        }

        public boolean a(int i2) {
            return ApplicationProcessState.f(i2) != null;
        }
    }

    static {
        E = new Internal.EnumLiteMap<ApplicationProcessState>() {
            /* renamed from: b */
            public ApplicationProcessState a(int i2) {
                return ApplicationProcessState.f(i2);
            }
        };
    }

    /* access modifiers changed from: public */
    ApplicationProcessState(int i2) {
        this.f31147z = i2;
    }

    public static ApplicationProcessState f(int i2) {
        if (i2 == 0) {
            return APPLICATION_PROCESS_STATE_UNKNOWN;
        }
        if (i2 == 1) {
            return FOREGROUND;
        }
        if (i2 == 2) {
            return BACKGROUND;
        }
        if (i2 != 3) {
            return null;
        }
        return FOREGROUND_BACKGROUND;
    }

    public static Internal.EnumVerifier h() {
        return ApplicationProcessStateVerifier.f31148a;
    }

    public final int i() {
        return this.f31147z;
    }
}
