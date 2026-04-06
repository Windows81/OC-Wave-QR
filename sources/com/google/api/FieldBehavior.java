package com.google.api;

import com.google.protobuf.Internal;

public enum FieldBehavior implements Internal.EnumLite {
    FIELD_BEHAVIOR_UNSPECIFIED(0),
    OPTIONAL(1),
    REQUIRED(2),
    OUTPUT_ONLY(3),
    INPUT_ONLY(4),
    IMMUTABLE(5),
    UNRECOGNIZED(-1);
    
    public static final Internal.EnumLiteMap H = null;

    /* renamed from: z  reason: collision with root package name */
    public final int f27564z;

    public static final class FieldBehaviorVerifier implements Internal.EnumVerifier {

        /* renamed from: a  reason: collision with root package name */
        public static final Internal.EnumVerifier f27565a = null;

        static {
            f27565a = new FieldBehaviorVerifier();
        }

        public boolean a(int i2) {
            return FieldBehavior.d(i2) != null;
        }
    }

    static {
        H = new Internal.EnumLiteMap<FieldBehavior>() {
            /* renamed from: b */
            public FieldBehavior a(int i2) {
                return FieldBehavior.d(i2);
            }
        };
    }

    /* access modifiers changed from: public */
    FieldBehavior(int i2) {
        this.f27564z = i2;
    }

    public static FieldBehavior d(int i2) {
        if (i2 == 0) {
            return FIELD_BEHAVIOR_UNSPECIFIED;
        }
        if (i2 == 1) {
            return OPTIONAL;
        }
        if (i2 == 2) {
            return REQUIRED;
        }
        if (i2 == 3) {
            return OUTPUT_ONLY;
        }
        if (i2 == 4) {
            return INPUT_ONLY;
        }
        if (i2 != 5) {
            return null;
        }
        return IMMUTABLE;
    }

    public static Internal.EnumLiteMap f() {
        return H;
    }

    public final int i() {
        if (this != UNRECOGNIZED) {
            return this.f27564z;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
