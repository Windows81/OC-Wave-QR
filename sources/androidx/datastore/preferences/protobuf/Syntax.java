package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.Internal;

public enum Syntax implements Internal.EnumLite {
    SYNTAX_PROTO2(0),
    SYNTAX_PROTO3(1),
    SYNTAX_EDITIONS(2),
    UNRECOGNIZED(-1);
    
    public static final Internal.EnumLiteMap E = null;

    /* renamed from: z  reason: collision with root package name */
    public final int f21161z;

    public static final class SyntaxVerifier implements Internal.EnumVerifier {

        /* renamed from: a  reason: collision with root package name */
        public static final Internal.EnumVerifier f21162a = null;

        static {
            f21162a = new SyntaxVerifier();
        }

        public boolean a(int i2) {
            return Syntax.d(i2) != null;
        }
    }

    static {
        E = new Internal.EnumLiteMap<Syntax>() {
            /* renamed from: b */
            public Syntax a(int i2) {
                return Syntax.d(i2);
            }
        };
    }

    /* access modifiers changed from: public */
    Syntax(int i2) {
        this.f21161z = i2;
    }

    public static Syntax d(int i2) {
        if (i2 == 0) {
            return SYNTAX_PROTO2;
        }
        if (i2 == 1) {
            return SYNTAX_PROTO3;
        }
        if (i2 != 2) {
            return null;
        }
        return SYNTAX_EDITIONS;
    }

    public final int i() {
        if (this != UNRECOGNIZED) {
            return this.f21161z;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
