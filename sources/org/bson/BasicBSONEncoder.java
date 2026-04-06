package org.bson;

import java.lang.reflect.Array;
import java.util.Date;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.regex.Pattern;
import org.bson.AbstractBsonWriter;
import org.bson.io.BasicOutputBuffer;
import org.bson.io.OutputBuffer;
import org.bson.types.BSONTimestamp;
import org.bson.types.Binary;
import org.bson.types.Code;
import org.bson.types.CodeWScope;
import org.bson.types.Decimal128;
import org.bson.types.MaxKey;
import org.bson.types.MinKey;
import org.bson.types.ObjectId;
import org.bson.types.Symbol;

public class BasicBSONEncoder implements BSONEncoder {

    /* renamed from: a  reason: collision with root package name */
    public BsonBinaryWriter f43606a;

    /* renamed from: b  reason: collision with root package name */
    public OutputBuffer f43607b;

    public static void E(byte[] bArr, int i2, long j2) {
        bArr[i2] = (byte) ((int) (j2 & 255));
        bArr[i2 + 1] = (byte) ((int) ((j2 >> 8) & 255));
        bArr[i2 + 2] = (byte) ((int) ((j2 >> 16) & 255));
        bArr[i2 + 3] = (byte) ((int) ((j2 >> 24) & 255));
        bArr[i2 + 4] = (byte) ((int) ((j2 >> 32) & 255));
        bArr[i2 + 5] = (byte) ((int) ((j2 >> 40) & 255));
        bArr[i2 + 6] = (byte) ((int) ((j2 >> 48) & 255));
        bArr[i2 + 7] = (byte) ((int) ((j2 >> 56) & 255));
    }

    public void A(String str, Symbol symbol) {
        r(str);
        this.f43606a.I(symbol.a());
    }

    public void B(String str, BSONTimestamp bSONTimestamp) {
        r(str);
        this.f43606a.S(new BsonTimestamp(bSONTimestamp.h(), bSONTimestamp.f()));
    }

    public void C(String str, UUID uuid) {
        r(str);
        byte[] bArr = new byte[16];
        E(bArr, 0, uuid.getMostSignificantBits());
        E(bArr, 8, uuid.getLeastSignificantBits());
        this.f43606a.F(new BsonBinary(BsonBinarySubType.UUID_LEGACY, bArr));
    }

    public void D(OutputBuffer outputBuffer) {
        if (this.f43606a == null) {
            this.f43607b = outputBuffer;
            this.f43606a = new BsonBinaryWriter(outputBuffer);
            return;
        }
        throw new IllegalStateException("Performing another operation at this moment");
    }

    public byte[] a(BSONObject bSONObject) {
        BasicOutputBuffer basicOutputBuffer = new BasicOutputBuffer();
        D(basicOutputBuffer);
        v(bSONObject);
        c();
        return basicOutputBuffer.c();
    }

    public void b(String str, Object obj) {
        if (!"_transientFields".equals(str)) {
            if (!str.contains("\u0000")) {
                if ("$where".equals(str) && (obj instanceof String)) {
                    j(str, new Code((String) obj));
                }
                Object b2 = BSON.b(obj);
                if (b2 == null) {
                    s(str);
                } else if (b2 instanceof Date) {
                    l(str, (Date) b2);
                } else if (b2 instanceof Decimal128) {
                    m(str, (Decimal128) b2);
                } else if (b2 instanceof Number) {
                    t(str, (Number) b2);
                } else if (b2 instanceof Character) {
                    z(str, b2.toString());
                } else if (b2 instanceof String) {
                    z(str, b2.toString());
                } else if (b2 instanceof ObjectId) {
                    w(str, (ObjectId) b2);
                } else if (b2 instanceof Boolean) {
                    i(str, (Boolean) b2);
                } else if (b2 instanceof Pattern) {
                    x(str, (Pattern) b2);
                } else if (b2 instanceof Iterable) {
                    n(str, (Iterable) b2);
                } else if (b2 instanceof BSONObject) {
                    u(str, (BSONObject) b2);
                } else if (b2 instanceof Map) {
                    o(str, (Map) b2);
                } else if (b2 instanceof byte[]) {
                    h(str, (byte[]) b2);
                } else if (b2 instanceof Binary) {
                    g(str, (Binary) b2);
                } else if (b2 instanceof UUID) {
                    C(str, (UUID) b2);
                } else if (b2.getClass().isArray()) {
                    f(str, b2);
                } else if (b2 instanceof Symbol) {
                    A(str, (Symbol) b2);
                } else if (b2 instanceof BSONTimestamp) {
                    B(str, (BSONTimestamp) b2);
                } else if (b2 instanceof CodeWScope) {
                    k(str, (CodeWScope) b2);
                } else if (b2 instanceof Code) {
                    j(str, (Code) b2);
                } else if (b2 instanceof MinKey) {
                    q(str);
                } else if (b2 instanceof MaxKey) {
                    p(str);
                } else if (!y(str, b2)) {
                    throw new IllegalArgumentException("Can't serialize " + b2.getClass());
                }
            } else {
                throw new IllegalArgumentException("Document field names can't have a NULL character. (Bad Key: '" + str + "')");
            }
        }
    }

    public void c() {
        this.f43606a.close();
        this.f43606a = null;
    }

    public OutputBuffer d() {
        return this.f43607b;
    }

    public final boolean e() {
        return this.f43606a.j1().d() == null;
    }

    public void f(String str, Object obj) {
        r(str);
        this.f43606a.m0();
        int i2 = 0;
        if (obj instanceof int[]) {
            int[] iArr = (int[]) obj;
            int length = iArr.length;
            while (i2 < length) {
                this.f43606a.q(iArr[i2]);
                i2++;
            }
        } else if (obj instanceof long[]) {
            long[] jArr = (long[]) obj;
            int length2 = jArr.length;
            while (i2 < length2) {
                this.f43606a.z(jArr[i2]);
                i2++;
            }
        } else if (obj instanceof float[]) {
            float[] fArr = (float[]) obj;
            int length3 = fArr.length;
            while (i2 < length3) {
                this.f43606a.writeDouble((double) fArr[i2]);
                i2++;
            }
        } else if (obj instanceof short[]) {
            short[] sArr = (short[]) obj;
            int length4 = sArr.length;
            while (i2 < length4) {
                this.f43606a.q(sArr[i2]);
                i2++;
            }
        } else if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            int length5 = bArr.length;
            while (i2 < length5) {
                this.f43606a.q(bArr[i2]);
                i2++;
            }
        } else if (obj instanceof double[]) {
            double[] dArr = (double[]) obj;
            int length6 = dArr.length;
            while (i2 < length6) {
                this.f43606a.writeDouble(dArr[i2]);
                i2++;
            }
        } else if (obj instanceof boolean[]) {
            boolean[] zArr = (boolean[]) obj;
            int length7 = zArr.length;
            while (i2 < length7) {
                this.f43606a.writeBoolean(zArr[i2]);
                i2++;
            }
        } else if (obj instanceof String[]) {
            String[] strArr = (String[]) obj;
            int length8 = strArr.length;
            while (i2 < length8) {
                this.f43606a.p(strArr[i2]);
                i2++;
            }
        } else {
            int length9 = Array.getLength(obj);
            while (i2 < length9) {
                b(String.valueOf(i2), Array.get(obj, i2));
                i2++;
            }
        }
        this.f43606a.H();
    }

    public void g(String str, Binary binary) {
        r(str);
        this.f43606a.F(new BsonBinary(binary.b(), binary.a()));
    }

    public void h(String str, byte[] bArr) {
        r(str);
        this.f43606a.F(new BsonBinary(bArr));
    }

    public void i(String str, Boolean bool) {
        r(str);
        this.f43606a.writeBoolean(bool.booleanValue());
    }

    public void j(String str, Code code) {
        r(str);
        this.f43606a.X(code.a());
    }

    public void k(String str, CodeWScope codeWScope) {
        r(str);
        this.f43606a.g0(codeWScope.a());
        v(codeWScope.b());
    }

    public void l(String str, Date date) {
        r(str);
        this.f43606a.c0(date.getTime());
    }

    public void m(String str, Decimal128 decimal128) {
        r(str);
        this.f43606a.o0(decimal128);
    }

    public void n(String str, Iterable iterable) {
        r(str);
        this.f43606a.m0();
        for (Object b2 : iterable) {
            b(String.valueOf(0), b2);
        }
        this.f43606a.H();
    }

    public void o(String str, Map map) {
        r(str);
        this.f43606a.T();
        for (Map.Entry entry : map.entrySet()) {
            b((String) entry.getKey(), entry.getValue());
        }
        this.f43606a.f0();
    }

    public void p(String str) {
        r(str);
        this.f43606a.E();
    }

    public void q(String str) {
        r(str);
        this.f43606a.Q();
    }

    public void r(String str) {
        if (this.f43606a.E1() == AbstractBsonWriter.State.NAME) {
            this.f43606a.A(str);
        }
    }

    public void s(String str) {
        r(str);
        this.f43606a.D();
    }

    public void t(String str, Number number) {
        r(str);
        if ((number instanceof Integer) || (number instanceof Short) || (number instanceof Byte) || (number instanceof AtomicInteger)) {
            this.f43606a.q(number.intValue());
        } else if ((number instanceof Long) || (number instanceof AtomicLong)) {
            this.f43606a.z(number.longValue());
        } else if ((number instanceof Float) || (number instanceof Double)) {
            this.f43606a.writeDouble(number.doubleValue());
        } else {
            throw new IllegalArgumentException("Can't serialize " + number.getClass());
        }
    }

    public int u(String str, BSONObject bSONObject) {
        r(str);
        return v(bSONObject);
    }

    public int v(BSONObject bSONObject) {
        int position = d().getPosition();
        this.f43606a.T();
        if (e() && bSONObject.h("_id")) {
            b("_id", bSONObject.e("_id"));
        }
        for (String str : bSONObject.keySet()) {
            if (!e() || !str.equals("_id")) {
                b(str, bSONObject.e(str));
            }
        }
        this.f43606a.f0();
        return d().getPosition() - position;
    }

    public void w(String str, ObjectId objectId) {
        r(str);
        this.f43606a.N(objectId);
    }

    public void x(String str, Pattern pattern) {
        r(str);
        this.f43606a.G(new BsonRegularExpression(pattern.pattern(), BSON.g(pattern.flags())));
    }

    public boolean y(String str, Object obj) {
        return false;
    }

    public void z(String str, String str2) {
        r(str);
        this.f43606a.p(str2);
    }
}
