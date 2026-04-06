package com.google.gson.internal.bind;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonNull;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.MalformedJsonException;
import java.io.Reader;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;

public final class JsonTreeReader extends JsonReader {
    public static final Reader S = new Reader() {
        public void close() {
            throw new AssertionError();
        }

        public int read(char[] cArr, int i2, int i3) {
            throw new AssertionError();
        }
    };
    public static final Object T = new Object();
    public Object[] O;
    public int P;
    public String[] Q;
    public int[] R;

    /* renamed from: com.google.gson.internal.bind.JsonTreeReader$2  reason: invalid class name */
    public static /* synthetic */ class AnonymousClass2 {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f31771a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                com.google.gson.stream.JsonToken[] r0 = com.google.gson.stream.JsonToken.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f31771a = r0
                com.google.gson.stream.JsonToken r1 = com.google.gson.stream.JsonToken.NAME     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f31771a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.gson.stream.JsonToken r1 = com.google.gson.stream.JsonToken.END_ARRAY     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f31771a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.gson.stream.JsonToken r1 = com.google.gson.stream.JsonToken.END_OBJECT     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f31771a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.google.gson.stream.JsonToken r1 = com.google.gson.stream.JsonToken.END_DOCUMENT     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.gson.internal.bind.JsonTreeReader.AnonymousClass2.<clinit>():void");
        }
    }

    private String A() {
        return " at path " + l();
    }

    public final String A0(boolean z2) {
        t0(JsonToken.NAME);
        Map.Entry entry = (Map.Entry) ((Iterator) E0()).next();
        String str = (String) entry.getKey();
        this.Q[this.P - 1] = z2 ? "<skipped>" : str;
        J0(entry.getValue());
        return str;
    }

    public boolean C() {
        t0(JsonToken.BOOLEAN);
        boolean p2 = ((JsonPrimitive) G0()).p();
        int i2 = this.P;
        if (i2 > 0) {
            int[] iArr = this.R;
            int i3 = i2 - 1;
            iArr[i3] = iArr[i3] + 1;
        }
        return p2;
    }

    public double D() {
        JsonToken S2 = S();
        JsonToken jsonToken = JsonToken.NUMBER;
        if (S2 == jsonToken || S2 == JsonToken.STRING) {
            double q2 = ((JsonPrimitive) E0()).q();
            if (x() || (!Double.isNaN(q2) && !Double.isInfinite(q2))) {
                G0();
                int i2 = this.P;
                if (i2 > 0) {
                    int[] iArr = this.R;
                    int i3 = i2 - 1;
                    iArr[i3] = iArr[i3] + 1;
                }
                return q2;
            }
            throw new MalformedJsonException("JSON forbids NaN and infinities: " + q2);
        }
        throw new IllegalStateException("Expected " + jsonToken + " but was " + S2 + A());
    }

    public int E() {
        JsonToken S2 = S();
        JsonToken jsonToken = JsonToken.NUMBER;
        if (S2 == jsonToken || S2 == JsonToken.STRING) {
            int s2 = ((JsonPrimitive) E0()).s();
            G0();
            int i2 = this.P;
            if (i2 > 0) {
                int[] iArr = this.R;
                int i3 = i2 - 1;
                iArr[i3] = iArr[i3] + 1;
            }
            return s2;
        }
        throw new IllegalStateException("Expected " + jsonToken + " but was " + S2 + A());
    }

    public final Object E0() {
        return this.O[this.P - 1];
    }

    public long F() {
        JsonToken S2 = S();
        JsonToken jsonToken = JsonToken.NUMBER;
        if (S2 == jsonToken || S2 == JsonToken.STRING) {
            long u2 = ((JsonPrimitive) E0()).u();
            G0();
            int i2 = this.P;
            if (i2 > 0) {
                int[] iArr = this.R;
                int i3 = i2 - 1;
                iArr[i3] = iArr[i3] + 1;
            }
            return u2;
        }
        throw new IllegalStateException("Expected " + jsonToken + " but was " + S2 + A());
    }

    public String G() {
        return A0(false);
    }

    public final Object G0() {
        Object[] objArr = this.O;
        int i2 = this.P - 1;
        this.P = i2;
        Object obj = objArr[i2];
        objArr[i2] = null;
        return obj;
    }

    public void H0() {
        t0(JsonToken.NAME);
        Map.Entry entry = (Map.Entry) ((Iterator) E0()).next();
        J0(entry.getValue());
        J0(new JsonPrimitive((String) entry.getKey()));
    }

    public void I() {
        t0(JsonToken.NULL);
        G0();
        int i2 = this.P;
        if (i2 > 0) {
            int[] iArr = this.R;
            int i3 = i2 - 1;
            iArr[i3] = iArr[i3] + 1;
        }
    }

    public final void J0(Object obj) {
        int i2 = this.P;
        Object[] objArr = this.O;
        if (i2 == objArr.length) {
            int i3 = i2 * 2;
            this.O = Arrays.copyOf(objArr, i3);
            this.R = Arrays.copyOf(this.R, i3);
            this.Q = (String[]) Arrays.copyOf(this.Q, i3);
        }
        Object[] objArr2 = this.O;
        int i4 = this.P;
        this.P = i4 + 1;
        objArr2[i4] = obj;
    }

    public String O() {
        JsonToken S2 = S();
        JsonToken jsonToken = JsonToken.STRING;
        if (S2 == jsonToken || S2 == JsonToken.NUMBER) {
            String w2 = ((JsonPrimitive) G0()).w();
            int i2 = this.P;
            if (i2 > 0) {
                int[] iArr = this.R;
                int i3 = i2 - 1;
                iArr[i3] = iArr[i3] + 1;
            }
            return w2;
        }
        throw new IllegalStateException("Expected " + jsonToken + " but was " + S2 + A());
    }

    public JsonToken S() {
        if (this.P == 0) {
            return JsonToken.END_DOCUMENT;
        }
        Object E0 = E0();
        if (E0 instanceof Iterator) {
            boolean z2 = this.O[this.P - 2] instanceof JsonObject;
            Iterator it = (Iterator) E0;
            if (!it.hasNext()) {
                return z2 ? JsonToken.END_OBJECT : JsonToken.END_ARRAY;
            }
            if (z2) {
                return JsonToken.NAME;
            }
            J0(it.next());
            return S();
        } else if (E0 instanceof JsonObject) {
            return JsonToken.BEGIN_OBJECT;
        } else {
            if (E0 instanceof JsonArray) {
                return JsonToken.BEGIN_ARRAY;
            }
            if (E0 instanceof JsonPrimitive) {
                JsonPrimitive jsonPrimitive = (JsonPrimitive) E0;
                if (jsonPrimitive.C()) {
                    return JsonToken.STRING;
                }
                if (jsonPrimitive.z()) {
                    return JsonToken.BOOLEAN;
                }
                if (jsonPrimitive.B()) {
                    return JsonToken.NUMBER;
                }
                throw new AssertionError();
            } else if (E0 instanceof JsonNull) {
                return JsonToken.NULL;
            } else {
                if (E0 == T) {
                    throw new IllegalStateException("JsonReader is closed");
                }
                throw new MalformedJsonException("Custom JsonElement subclass " + E0.getClass().getName() + " is not supported");
            }
        }
    }

    public void Y() {
        int i2 = AnonymousClass2.f31771a[S().ordinal()];
        if (i2 == 1) {
            A0(true);
        } else if (i2 == 2) {
            g();
        } else if (i2 == 3) {
            j();
        } else if (i2 != 4) {
            G0();
            int i3 = this.P;
            if (i3 > 0) {
                int[] iArr = this.R;
                int i4 = i3 - 1;
                iArr[i4] = iArr[i4] + 1;
            }
        }
    }

    public void a() {
        t0(JsonToken.BEGIN_ARRAY);
        J0(((JsonArray) E0()).iterator());
        this.R[this.P - 1] = 0;
    }

    public void b() {
        t0(JsonToken.BEGIN_OBJECT);
        J0(((JsonObject) E0()).entrySet().iterator());
    }

    public void close() {
        this.O = new Object[]{T};
        this.P = 1;
    }

    public void g() {
        t0(JsonToken.END_ARRAY);
        G0();
        G0();
        int i2 = this.P;
        if (i2 > 0) {
            int[] iArr = this.R;
            int i3 = i2 - 1;
            iArr[i3] = iArr[i3] + 1;
        }
    }

    public void j() {
        t0(JsonToken.END_OBJECT);
        this.Q[this.P - 1] = null;
        G0();
        G0();
        int i2 = this.P;
        if (i2 > 0) {
            int[] iArr = this.R;
            int i3 = i2 - 1;
            iArr[i3] = iArr[i3] + 1;
        }
    }

    public String l() {
        return m(false);
    }

    public final String m(boolean z2) {
        StringBuilder sb = new StringBuilder();
        sb.append('$');
        int i2 = 0;
        while (true) {
            int i3 = this.P;
            if (i2 >= i3) {
                return sb.toString();
            }
            Object[] objArr = this.O;
            Object obj = objArr[i2];
            if (obj instanceof JsonArray) {
                i2++;
                if (i2 < i3 && (objArr[i2] instanceof Iterator)) {
                    int i4 = this.R[i2];
                    if (z2 && i4 > 0 && (i2 == i3 - 1 || i2 == i3 - 2)) {
                        i4--;
                    }
                    sb.append('[');
                    sb.append(i4);
                    sb.append(']');
                }
            } else if ((obj instanceof JsonObject) && (i2 = i2 + 1) < i3 && (objArr[i2] instanceof Iterator)) {
                sb.append('.');
                String str = this.Q[i2];
                if (str != null) {
                    sb.append(str);
                }
            }
            i2++;
        }
    }

    public String r() {
        return m(true);
    }

    public boolean t() {
        JsonToken S2 = S();
        return (S2 == JsonToken.END_OBJECT || S2 == JsonToken.END_ARRAY || S2 == JsonToken.END_DOCUMENT) ? false : true;
    }

    public final void t0(JsonToken jsonToken) {
        if (S() != jsonToken) {
            throw new IllegalStateException("Expected " + jsonToken + " but was " + S() + A());
        }
    }

    public String toString() {
        return JsonTreeReader.class.getSimpleName() + A();
    }

    public JsonElement w0() {
        JsonToken S2 = S();
        if (S2 == JsonToken.NAME || S2 == JsonToken.END_ARRAY || S2 == JsonToken.END_OBJECT || S2 == JsonToken.END_DOCUMENT) {
            throw new IllegalStateException("Unexpected " + S2 + " when reading a JsonElement.");
        }
        JsonElement jsonElement = (JsonElement) E0();
        Y();
        return jsonElement;
    }
}
