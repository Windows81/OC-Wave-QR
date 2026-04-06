package com.google.rpc;

import com.google.protobuf.Internal;

public enum Code implements Internal.EnumLite {
    OK(0),
    CANCELLED(1),
    UNKNOWN(2),
    INVALID_ARGUMENT(3),
    DEADLINE_EXCEEDED(4),
    NOT_FOUND(5),
    ALREADY_EXISTS(6),
    PERMISSION_DENIED(7),
    UNAUTHENTICATED(16),
    RESOURCE_EXHAUSTED(8),
    FAILED_PRECONDITION(9),
    ABORTED(10),
    OUT_OF_RANGE(11),
    UNIMPLEMENTED(12),
    INTERNAL(13),
    UNAVAILABLE(14),
    DATA_LOSS(15),
    UNRECOGNIZED(-1);
    
    public static final Internal.EnumLiteMap S = null;

    /* renamed from: z  reason: collision with root package name */
    public final int f32385z;

    public static final class CodeVerifier implements Internal.EnumVerifier {

        /* renamed from: a  reason: collision with root package name */
        public static final Internal.EnumVerifier f32386a = null;

        static {
            f32386a = new CodeVerifier();
        }

        public boolean a(int i2) {
            return Code.d(i2) != null;
        }
    }

    static {
        S = new Internal.EnumLiteMap<Code>() {
            /* renamed from: b */
            public Code a(int i2) {
                return Code.d(i2);
            }
        };
    }

    /* access modifiers changed from: public */
    Code(int i2) {
        this.f32385z = i2;
    }

    public static Code d(int i2) {
        switch (i2) {
            case 0:
                return OK;
            case 1:
                return CANCELLED;
            case 2:
                return UNKNOWN;
            case 3:
                return INVALID_ARGUMENT;
            case 4:
                return DEADLINE_EXCEEDED;
            case 5:
                return NOT_FOUND;
            case 6:
                return ALREADY_EXISTS;
            case 7:
                return PERMISSION_DENIED;
            case 8:
                return RESOURCE_EXHAUSTED;
            case 9:
                return FAILED_PRECONDITION;
            case 10:
                return ABORTED;
            case 11:
                return OUT_OF_RANGE;
            case 12:
                return UNIMPLEMENTED;
            case 13:
                return INTERNAL;
            case 14:
                return UNAVAILABLE;
            case 15:
                return DATA_LOSS;
            case 16:
                return UNAUTHENTICATED;
            default:
                return null;
        }
    }

    public final int i() {
        if (this != UNRECOGNIZED) {
            return this.f32385z;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
