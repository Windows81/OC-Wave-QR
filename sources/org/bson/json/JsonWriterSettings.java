package org.bson.json;

import org.bson.BsonWriterSettings;
import org.bson.assertions.Assertions;

public class JsonWriterSettings extends BsonWriterSettings {

    /* renamed from: A  reason: collision with root package name */
    public static final JsonDoubleConverter f43955A = new JsonDoubleConverter();

    /* renamed from: B  reason: collision with root package name */
    public static final ExtendedJsonDoubleConverter f43956B = new ExtendedJsonDoubleConverter();
    public static final RelaxedExtendedJsonDoubleConverter C = new RelaxedExtendedJsonDoubleConverter();
    public static final JsonInt32Converter D = new JsonInt32Converter();
    public static final ExtendedJsonInt32Converter E = new ExtendedJsonInt32Converter();
    public static final JsonSymbolConverter F = new JsonSymbolConverter();
    public static final ExtendedJsonMinKeyConverter G = new ExtendedJsonMinKeyConverter();
    public static final ShellMinKeyConverter H = new ShellMinKeyConverter();
    public static final ExtendedJsonMaxKeyConverter I = new ExtendedJsonMaxKeyConverter();
    public static final ShellMaxKeyConverter J = new ShellMaxKeyConverter();
    public static final ExtendedJsonUndefinedConverter K = new ExtendedJsonUndefinedConverter();
    public static final ShellUndefinedConverter L = new ShellUndefinedConverter();
    public static final LegacyExtendedJsonDateTimeConverter M = new LegacyExtendedJsonDateTimeConverter();
    public static final ExtendedJsonDateTimeConverter N = new ExtendedJsonDateTimeConverter();
    public static final RelaxedExtendedJsonDateTimeConverter O = new RelaxedExtendedJsonDateTimeConverter();
    public static final ShellDateTimeConverter P = new ShellDateTimeConverter();
    public static final ExtendedJsonBinaryConverter Q = new ExtendedJsonBinaryConverter();
    public static final LegacyExtendedJsonBinaryConverter R = new LegacyExtendedJsonBinaryConverter();
    public static final ShellBinaryConverter S = new ShellBinaryConverter();
    public static final ExtendedJsonInt64Converter T = new ExtendedJsonInt64Converter();
    public static final RelaxedExtendedJsonInt64Converter U = new RelaxedExtendedJsonInt64Converter();
    public static final ShellInt64Converter V = new ShellInt64Converter();
    public static final ExtendedJsonDecimal128Converter W = new ExtendedJsonDecimal128Converter();
    public static final ShellDecimal128Converter X = new ShellDecimal128Converter();
    public static final ExtendedJsonObjectIdConverter Y = new ExtendedJsonObjectIdConverter();
    public static final ShellObjectIdConverter Z = new ShellObjectIdConverter();
    public static final ExtendedJsonTimestampConverter a0 = new ExtendedJsonTimestampConverter();
    public static final ShellTimestampConverter b0 = new ShellTimestampConverter();
    public static final ExtendedJsonRegularExpressionConverter c0 = new ExtendedJsonRegularExpressionConverter();
    public static final LegacyExtendedJsonRegularExpressionConverter d0 = new LegacyExtendedJsonRegularExpressionConverter();
    public static final ShellRegularExpressionConverter e0 = new ShellRegularExpressionConverter();

    /* renamed from: x  reason: collision with root package name */
    public static final JsonNullConverter f43957x = new JsonNullConverter();

    /* renamed from: y  reason: collision with root package name */
    public static final JsonStringConverter f43958y = new JsonStringConverter();

    /* renamed from: z  reason: collision with root package name */
    public static final JsonBooleanConverter f43959z = new JsonBooleanConverter();

    /* renamed from: b  reason: collision with root package name */
    public final boolean f43960b;

    /* renamed from: c  reason: collision with root package name */
    public final String f43961c;

    /* renamed from: d  reason: collision with root package name */
    public final String f43962d;

    /* renamed from: e  reason: collision with root package name */
    public final int f43963e;

    /* renamed from: f  reason: collision with root package name */
    public final JsonMode f43964f;

    /* renamed from: g  reason: collision with root package name */
    public final Converter f43965g;

    /* renamed from: h  reason: collision with root package name */
    public final Converter f43966h;

    /* renamed from: i  reason: collision with root package name */
    public final Converter f43967i;

    /* renamed from: j  reason: collision with root package name */
    public final Converter f43968j;

    /* renamed from: k  reason: collision with root package name */
    public final Converter f43969k;

    /* renamed from: l  reason: collision with root package name */
    public final Converter f43970l;

    /* renamed from: m  reason: collision with root package name */
    public final Converter f43971m;

    /* renamed from: n  reason: collision with root package name */
    public final Converter f43972n;

    /* renamed from: o  reason: collision with root package name */
    public final Converter f43973o;

    /* renamed from: p  reason: collision with root package name */
    public final Converter f43974p;

    /* renamed from: q  reason: collision with root package name */
    public final Converter f43975q;

    /* renamed from: r  reason: collision with root package name */
    public final Converter f43976r;

    /* renamed from: s  reason: collision with root package name */
    public final Converter f43977s;

    /* renamed from: t  reason: collision with root package name */
    public final Converter f43978t;

    /* renamed from: u  reason: collision with root package name */
    public final Converter f43979u;

    /* renamed from: v  reason: collision with root package name */
    public final Converter f43980v;

    /* renamed from: w  reason: collision with root package name */
    public final Converter f43981w;

    public static final class Builder {

        /* renamed from: a  reason: collision with root package name */
        public boolean f43982a;

        /* renamed from: b  reason: collision with root package name */
        public String f43983b;

        /* renamed from: c  reason: collision with root package name */
        public String f43984c;

        /* renamed from: d  reason: collision with root package name */
        public JsonMode f43985d;

        /* renamed from: e  reason: collision with root package name */
        public int f43986e;

        /* renamed from: f  reason: collision with root package name */
        public Converter f43987f;

        /* renamed from: g  reason: collision with root package name */
        public Converter f43988g;

        /* renamed from: h  reason: collision with root package name */
        public Converter f43989h;

        /* renamed from: i  reason: collision with root package name */
        public Converter f43990i;

        /* renamed from: j  reason: collision with root package name */
        public Converter f43991j;

        /* renamed from: k  reason: collision with root package name */
        public Converter f43992k;

        /* renamed from: l  reason: collision with root package name */
        public Converter f43993l;

        /* renamed from: m  reason: collision with root package name */
        public Converter f43994m;

        /* renamed from: n  reason: collision with root package name */
        public Converter f43995n;

        /* renamed from: o  reason: collision with root package name */
        public Converter f43996o;

        /* renamed from: p  reason: collision with root package name */
        public Converter f43997p;

        /* renamed from: q  reason: collision with root package name */
        public Converter f43998q;

        /* renamed from: r  reason: collision with root package name */
        public Converter f43999r;

        /* renamed from: s  reason: collision with root package name */
        public Converter f44000s;

        /* renamed from: t  reason: collision with root package name */
        public Converter f44001t;

        /* renamed from: u  reason: collision with root package name */
        public Converter f44002u;

        /* renamed from: v  reason: collision with root package name */
        public Converter f44003v;

        public Builder w(JsonMode jsonMode) {
            Assertions.d("outputMode", jsonMode);
            this.f43985d = jsonMode;
            return this;
        }

        public Builder() {
            this.f43983b = System.getProperty("line.separator");
            this.f43984c = "  ";
            this.f43985d = JsonMode.RELAXED;
        }
    }

    public JsonWriterSettings() {
        this(b().w(JsonMode.STRICT));
    }

    public static Builder b() {
        return new Builder();
    }

    public Converter c() {
        return this.f43968j;
    }

    public Converter d() {
        return this.f43969k;
    }

    public Converter e() {
        return this.f43967i;
    }

    public Converter f() {
        return this.f43973o;
    }

    public Converter g() {
        return this.f43970l;
    }

    public String h() {
        return this.f43962d;
    }

    public Converter i() {
        return this.f43971m;
    }

    public Converter j() {
        return this.f43972n;
    }

    public Converter k() {
        return this.f43981w;
    }

    public Converter l() {
        return this.f43980v;
    }

    public int m() {
        return this.f43963e;
    }

    public Converter n() {
        return this.f43979u;
    }

    public String o() {
        return this.f43961c;
    }

    public Converter p() {
        return this.f43965g;
    }

    public Converter q() {
        return this.f43974p;
    }

    public JsonMode r() {
        return this.f43964f;
    }

    public Converter s() {
        return this.f43976r;
    }

    public Converter t() {
        return this.f43966h;
    }

    public Converter u() {
        return this.f43977s;
    }

    public Converter v() {
        return this.f43975q;
    }

    public Converter w() {
        return this.f43978t;
    }

    public boolean x() {
        return this.f43960b;
    }

    public JsonWriterSettings(Builder builder) {
        this.f43960b = builder.f43982a;
        this.f43961c = builder.f43983b != null ? builder.f43983b : System.getProperty("line.separator");
        this.f43962d = builder.f43984c;
        JsonMode q2 = builder.f43985d;
        this.f43964f = q2;
        this.f43963e = builder.f43986e;
        if (builder.f43987f != null) {
            this.f43965g = builder.f43987f;
        } else {
            this.f43965g = f43957x;
        }
        if (builder.f43988g != null) {
            this.f43966h = builder.f43988g;
        } else {
            this.f43966h = f43958y;
        }
        if (builder.f43991j != null) {
            this.f43969k = builder.f43991j;
        } else {
            this.f43969k = f43959z;
        }
        if (builder.f43992k != null) {
            this.f43970l = builder.f43992k;
        } else if (q2 == JsonMode.EXTENDED) {
            this.f43970l = f43956B;
        } else if (q2 == JsonMode.RELAXED) {
            this.f43970l = C;
        } else {
            this.f43970l = f43955A;
        }
        if (builder.f43993l != null) {
            this.f43971m = builder.f43993l;
        } else if (q2 == JsonMode.EXTENDED) {
            this.f43971m = E;
        } else {
            this.f43971m = D;
        }
        if (builder.f43999r != null) {
            this.f43977s = builder.f43999r;
        } else {
            this.f43977s = F;
        }
        if (builder.f44003v != null) {
            this.f43981w = builder.f44003v;
        } else {
            this.f43981w = new JsonJavaScriptConverter();
        }
        if (builder.f44001t != null) {
            this.f43979u = builder.f44001t;
        } else if (q2 == JsonMode.STRICT || q2 == JsonMode.EXTENDED || q2 == JsonMode.RELAXED) {
            this.f43979u = G;
        } else {
            this.f43979u = H;
        }
        if (builder.f44002u != null) {
            this.f43980v = builder.f44002u;
        } else if (q2 == JsonMode.STRICT || q2 == JsonMode.EXTENDED || q2 == JsonMode.RELAXED) {
            this.f43980v = I;
        } else {
            this.f43980v = J;
        }
        if (builder.f44000s != null) {
            this.f43978t = builder.f44000s;
        } else if (q2 == JsonMode.STRICT || q2 == JsonMode.EXTENDED || q2 == JsonMode.RELAXED) {
            this.f43978t = K;
        } else {
            this.f43978t = L;
        }
        if (builder.f43989h != null) {
            this.f43967i = builder.f43989h;
        } else if (q2 == JsonMode.STRICT) {
            this.f43967i = M;
        } else if (q2 == JsonMode.EXTENDED) {
            this.f43967i = N;
        } else if (q2 == JsonMode.RELAXED) {
            this.f43967i = O;
        } else {
            this.f43967i = P;
        }
        if (builder.f43990i != null) {
            this.f43968j = builder.f43990i;
        } else if (q2 == JsonMode.STRICT) {
            this.f43968j = R;
        } else if (q2 == JsonMode.EXTENDED || q2 == JsonMode.RELAXED) {
            this.f43968j = Q;
        } else {
            this.f43968j = S;
        }
        if (builder.f43994m != null) {
            this.f43972n = builder.f43994m;
        } else if (q2 == JsonMode.STRICT || q2 == JsonMode.EXTENDED) {
            this.f43972n = T;
        } else if (q2 == JsonMode.RELAXED) {
            this.f43972n = U;
        } else {
            this.f43972n = V;
        }
        if (builder.f43995n != null) {
            this.f43973o = builder.f43995n;
        } else if (q2 == JsonMode.STRICT || q2 == JsonMode.EXTENDED || q2 == JsonMode.RELAXED) {
            this.f43973o = W;
        } else {
            this.f43973o = X;
        }
        if (builder.f43996o != null) {
            this.f43974p = builder.f43996o;
        } else if (q2 == JsonMode.STRICT || q2 == JsonMode.EXTENDED || q2 == JsonMode.RELAXED) {
            this.f43974p = Y;
        } else {
            this.f43974p = Z;
        }
        if (builder.f43997p != null) {
            this.f43975q = builder.f43997p;
        } else if (q2 == JsonMode.STRICT || q2 == JsonMode.EXTENDED || q2 == JsonMode.RELAXED) {
            this.f43975q = a0;
        } else {
            this.f43975q = b0;
        }
        if (builder.f43998q != null) {
            this.f43976r = builder.f43998q;
        } else if (q2 == JsonMode.EXTENDED || q2 == JsonMode.RELAXED) {
            this.f43976r = c0;
        } else if (q2 == JsonMode.STRICT) {
            this.f43976r = d0;
        } else {
            this.f43976r = e0;
        }
    }
}
