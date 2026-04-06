package com.google.api;

import com.google.protobuf.Internal;

public enum LaunchStage implements Internal.EnumLite {
    LAUNCH_STAGE_UNSPECIFIED(0),
    EARLY_ACCESS(1),
    ALPHA(2),
    BETA(3),
    GA(4),
    DEPRECATED(5),
    UNRECOGNIZED(-1);
    
    public static final Internal.EnumLiteMap H = null;

    /* renamed from: z  reason: collision with root package name */
    public final int f27584z;

    public static final class LaunchStageVerifier implements Internal.EnumVerifier {

        /* renamed from: a  reason: collision with root package name */
        public static final Internal.EnumVerifier f27585a = null;

        static {
            f27585a = new LaunchStageVerifier();
        }

        public boolean a(int i2) {
            return LaunchStage.d(i2) != null;
        }
    }

    static {
        H = new Internal.EnumLiteMap<LaunchStage>() {
            /* renamed from: b */
            public LaunchStage a(int i2) {
                return LaunchStage.d(i2);
            }
        };
    }

    /* access modifiers changed from: public */
    LaunchStage(int i2) {
        this.f27584z = i2;
    }

    public static LaunchStage d(int i2) {
        if (i2 == 0) {
            return LAUNCH_STAGE_UNSPECIFIED;
        }
        if (i2 == 1) {
            return EARLY_ACCESS;
        }
        if (i2 == 2) {
            return ALPHA;
        }
        if (i2 == 3) {
            return BETA;
        }
        if (i2 == 4) {
            return GA;
        }
        if (i2 != 5) {
            return null;
        }
        return DEPRECATED;
    }

    public final int i() {
        if (this != UNRECOGNIZED) {
            return this.f27584z;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
