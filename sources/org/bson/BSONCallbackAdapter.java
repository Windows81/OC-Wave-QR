package org.bson;

import org.bson.AbstractBsonWriter;
import org.bson.io.Bits;
import org.bson.types.Decimal128;
import org.bson.types.ObjectId;

class BSONCallbackAdapter extends AbstractBsonWriter {
    public BSONCallback F;

    public class Context extends AbstractBsonWriter.Context {

        /* renamed from: e  reason: collision with root package name */
        public int f43597e;

        /* renamed from: f  reason: collision with root package name */
        public BSONCallback f43598f;

        /* renamed from: g  reason: collision with root package name */
        public String f43599g;

        /* renamed from: h  reason: collision with root package name */
        public String f43600h;

        public Context(Context context, BsonContextType bsonContextType) {
            super(context, bsonContextType);
        }

        public static /* synthetic */ int k(Context context) {
            int i2 = context.f43597e;
            context.f43597e = i2 + 1;
            return i2;
        }

        /* renamed from: l */
        public Context d() {
            return (Context) super.d();
        }
    }

    public void E0() {
        this.F.a(q1());
    }

    public void G0(ObjectId objectId) {
        this.F.j(q1(), objectId);
    }

    public void H0(BsonRegularExpression bsonRegularExpression) {
        this.F.u(q1(), bsonRegularExpression.p0(), bsonRegularExpression.l0());
    }

    public void J0() {
        this.F.e(q1());
        P1(new Context(j1(), BsonContextType.ARRAY));
    }

    public void L0() {
        BsonContextType bsonContextType = E1() == AbstractBsonWriter.State.SCOPE_DOCUMENT ? BsonContextType.SCOPE_DOCUMENT : BsonContextType.DOCUMENT;
        if (j1() == null || bsonContextType == BsonContextType.SCOPE_DOCUMENT) {
            this.F.c();
        } else {
            this.F.k(q1());
        }
        P1(new Context(j1(), bsonContextType));
    }

    public void S0(String str) {
        this.F.l(q1(), str);
    }

    /* renamed from: T1 */
    public Context j1() {
        return (Context) super.j1();
    }

    public void U0(String str) {
        this.F.x(q1(), str);
    }

    public void W0(BsonTimestamp bsonTimestamp) {
        this.F.z(q1(), bsonTimestamp.q0(), bsonTimestamp.p0());
    }

    public void b1() {
        this.F.m(q1());
    }

    public void d(BsonBinary bsonBinary) {
        if (bsonBinary.q0() == BsonBinarySubType.UUID_LEGACY.d()) {
            this.F.w(q1(), Bits.a(bsonBinary.p0(), 0), Bits.a(bsonBinary.p0(), 8));
        } else {
            this.F.t(q1(), bsonBinary.q0(), bsonBinary.p0());
        }
    }

    public void f(boolean z2) {
        this.F.v(q1(), z2);
        Q1(w1());
    }

    public void g(BsonDbPointer bsonDbPointer) {
        this.F.b(q1(), bsonDbPointer.p0(), bsonDbPointer.l0());
    }

    public void j(long j2) {
        this.F.g(q1(), j2);
    }

    public void k(Decimal128 decimal128) {
        this.F.r(q1(), decimal128);
    }

    public void l(double d2) {
        this.F.s(q1(), d2);
    }

    public void m() {
        P1(j1().d());
        this.F.q();
    }

    public String q1() {
        return j1().c() == BsonContextType.ARRAY ? Integer.toString(Context.k(j1())) : super.q1();
    }

    public void r() {
        BsonContextType c2 = j1().c();
        P1(j1().d());
        this.F.p();
        if (c2 == BsonContextType.SCOPE_DOCUMENT) {
            Object obj = this.F.get();
            BSONCallback e2 = j1().f43598f;
            this.F = e2;
            e2.i(j1().f43600h, j1().f43599g, obj);
        }
    }

    public void s0(String str) {
        BSONCallback unused = j1().f43598f = this.F;
        String unused2 = j1().f43599g = str;
        String unused3 = j1().f43600h = q1();
        this.F = this.F.d();
    }

    public void t(int i2) {
        this.F.n(q1(), i2);
    }

    public void t0() {
        this.F.h(q1());
    }

    public void w0() {
        this.F.f(q1());
    }

    public void x(long j2) {
        this.F.y(q1(), j2);
    }

    public void y(String str) {
        this.F.o(q1(), str);
    }
}
