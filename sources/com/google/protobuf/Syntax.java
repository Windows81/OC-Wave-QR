package com.google.protobuf;

import com.google.protobuf.Internal;

public enum Syntax implements Internal.EnumLite {
    SYNTAX_PROTO2(0),
    SYNTAX_PROTO3(1),
    UNRECOGNIZED(-1);
    
    public static final Internal.EnumLiteMap D = null;

    /* renamed from: z  reason: collision with root package name */
    public final int f32315z;

    public static final class SyntaxVerifier implements Internal.EnumVerifier {

        /* renamed from: a  reason: collision with root package name */
        public static final Internal.EnumVerifier f32316a = null;

        static {
            f32316a = new SyntaxVerifier();
        }

        public boolean a(int i2) {
            return Syntax.f(i2) != null;
        }
    }

    static {
        D = new Internal.EnumLiteMap<Syntax>() {
            /* renamed from: b */
            public Syntax a(int i2) {
                return Syntax.f(i2);
            }
        };
    }

    /* access modifiers changed from: public */
    Syntax(int i2) {
        this.f32315z = i2;
    }

    public static Syntax f(int i2) {
        if (i2 == 0) {
            return SYNTAX_PROTO2;
        }
        if (i2 != 1) {
            return null;
        }
        return SYNTAX_PROTO3;
    }

    public final int i() {
        if (this != UNRECOGNIZED) {
            return this.f32315z;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
