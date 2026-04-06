package com.google.logging.type;

import com.google.protobuf.Internal;

public enum LogSeverity implements Internal.EnumLite {
    DEFAULT(0),
    DEBUG(100),
    INFO(200),
    NOTICE(300),
    WARNING(400),
    ERROR(500),
    CRITICAL(600),
    ALERT(700),
    EMERGENCY(800),
    UNRECOGNIZED(-1);
    
    public static final Internal.EnumLiteMap K = null;

    /* renamed from: z  reason: collision with root package name */
    public final int f31909z;

    public static final class LogSeverityVerifier implements Internal.EnumVerifier {

        /* renamed from: a  reason: collision with root package name */
        public static final Internal.EnumVerifier f31910a = null;

        static {
            f31910a = new LogSeverityVerifier();
        }

        public boolean a(int i2) {
            return LogSeverity.d(i2) != null;
        }
    }

    static {
        K = new Internal.EnumLiteMap<LogSeverity>() {
            /* renamed from: b */
            public LogSeverity a(int i2) {
                return LogSeverity.d(i2);
            }
        };
    }

    /* access modifiers changed from: public */
    LogSeverity(int i2) {
        this.f31909z = i2;
    }

    public static LogSeverity d(int i2) {
        if (i2 == 0) {
            return DEFAULT;
        }
        if (i2 == 100) {
            return DEBUG;
        }
        if (i2 == 200) {
            return INFO;
        }
        if (i2 == 300) {
            return NOTICE;
        }
        if (i2 == 400) {
            return WARNING;
        }
        if (i2 == 500) {
            return ERROR;
        }
        if (i2 == 600) {
            return CRITICAL;
        }
        if (i2 == 700) {
            return ALERT;
        }
        if (i2 != 800) {
            return null;
        }
        return EMERGENCY;
    }

    public final int i() {
        if (this != UNRECOGNIZED) {
            return this.f31909z;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
