package com.google.protobuf;

import com.google.protobuf.Internal;

public enum NullValue implements Internal.EnumLite {
    NULL_VALUE(0),
    UNRECOGNIZED(-1);
    
    public static final Internal.EnumLiteMap C = null;

    /* renamed from: z  reason: collision with root package name */
    public final int f32258z;

    public static final class NullValueVerifier implements Internal.EnumVerifier {

        /* renamed from: a  reason: collision with root package name */
        public static final Internal.EnumVerifier f32259a = null;

        static {
            f32259a = new NullValueVerifier();
        }

        public boolean a(int i2) {
            return NullValue.f(i2) != null;
        }
    }

    static {
        C = new Internal.EnumLiteMap<NullValue>() {
            /* renamed from: b */
            public NullValue a(int i2) {
                return NullValue.f(i2);
            }
        };
    }

    /* access modifiers changed from: public */
    NullValue(int i2) {
        this.f32258z = i2;
    }

    public static NullValue f(int i2) {
        if (i2 != 0) {
            return null;
        }
        return NULL_VALUE;
    }

    public final int i() {
        if (this != UNRECOGNIZED) {
            return this.f32258z;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
