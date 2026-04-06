package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.Internal;

public enum NullValue implements Internal.EnumLite {
    NULL_VALUE(0),
    UNRECOGNIZED(-1);
    
    public static final Internal.EnumLiteMap C = null;

    /* renamed from: z  reason: collision with root package name */
    public final int f21099z;

    public static final class NullValueVerifier implements Internal.EnumVerifier {

        /* renamed from: a  reason: collision with root package name */
        public static final Internal.EnumVerifier f21100a = null;

        static {
            f21100a = new NullValueVerifier();
        }

        public boolean a(int i2) {
            return NullValue.d(i2) != null;
        }
    }

    static {
        C = new Internal.EnumLiteMap<NullValue>() {
            /* renamed from: b */
            public NullValue a(int i2) {
                return NullValue.d(i2);
            }
        };
    }

    /* access modifiers changed from: public */
    NullValue(int i2) {
        this.f21099z = i2;
    }

    public static NullValue d(int i2) {
        if (i2 != 0) {
            return null;
        }
        return NULL_VALUE;
    }

    public final int i() {
        if (this != UNRECOGNIZED) {
            return this.f21099z;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
