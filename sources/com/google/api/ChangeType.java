package com.google.api;

import com.google.protobuf.Internal;

public enum ChangeType implements Internal.EnumLite {
    CHANGE_TYPE_UNSPECIFIED(0),
    ADDED(1),
    REMOVED(2),
    MODIFIED(3),
    UNRECOGNIZED(-1);
    
    public static final Internal.EnumLiteMap F = null;

    /* renamed from: z  reason: collision with root package name */
    public final int f27545z;

    public static final class ChangeTypeVerifier implements Internal.EnumVerifier {

        /* renamed from: a  reason: collision with root package name */
        public static final Internal.EnumVerifier f27546a = null;

        static {
            f27546a = new ChangeTypeVerifier();
        }

        public boolean a(int i2) {
            return ChangeType.d(i2) != null;
        }
    }

    static {
        F = new Internal.EnumLiteMap<ChangeType>() {
            /* renamed from: b */
            public ChangeType a(int i2) {
                return ChangeType.d(i2);
            }
        };
    }

    /* access modifiers changed from: public */
    ChangeType(int i2) {
        this.f27545z = i2;
    }

    public static ChangeType d(int i2) {
        if (i2 == 0) {
            return CHANGE_TYPE_UNSPECIFIED;
        }
        if (i2 == 1) {
            return ADDED;
        }
        if (i2 == 2) {
            return REMOVED;
        }
        if (i2 != 3) {
            return null;
        }
        return MODIFIED;
    }

    public final int i() {
        if (this != UNRECOGNIZED) {
            return this.f27545z;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
