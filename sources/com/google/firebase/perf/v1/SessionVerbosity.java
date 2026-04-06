package com.google.firebase.perf.v1;

import com.google.protobuf.Internal;

public enum SessionVerbosity implements Internal.EnumLite {
    SESSION_VERBOSITY_NONE(0),
    GAUGES_AND_SYSTEM_EVENTS(1);
    
    public static final Internal.EnumLiteMap C = null;

    /* renamed from: z  reason: collision with root package name */
    public final int f31175z;

    public static final class SessionVerbosityVerifier implements Internal.EnumVerifier {

        /* renamed from: a  reason: collision with root package name */
        public static final Internal.EnumVerifier f31176a = null;

        static {
            f31176a = new SessionVerbosityVerifier();
        }

        public boolean a(int i2) {
            return SessionVerbosity.f(i2) != null;
        }
    }

    static {
        C = new Internal.EnumLiteMap<SessionVerbosity>() {
            /* renamed from: b */
            public SessionVerbosity a(int i2) {
                return SessionVerbosity.f(i2);
            }
        };
    }

    /* access modifiers changed from: public */
    SessionVerbosity(int i2) {
        this.f31175z = i2;
    }

    public static SessionVerbosity f(int i2) {
        if (i2 == 0) {
            return SESSION_VERBOSITY_NONE;
        }
        if (i2 != 1) {
            return null;
        }
        return GAUGES_AND_SYSTEM_EVENTS;
    }

    public static Internal.EnumVerifier h() {
        return SessionVerbosityVerifier.f31176a;
    }

    public final int i() {
        return this.f31175z;
    }
}
