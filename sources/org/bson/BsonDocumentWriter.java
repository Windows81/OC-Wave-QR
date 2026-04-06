package org.bson;

import org.bson.AbstractBsonWriter;
import org.bson.types.Decimal128;
import org.bson.types.ObjectId;

public class BsonDocumentWriter extends AbstractBsonWriter {
    public final BsonDocument F;

    /* renamed from: org.bson.BsonDocumentWriter$1  reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f43652a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                org.bson.AbstractBsonWriter$State[] r0 = org.bson.AbstractBsonWriter.State.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f43652a = r0
                org.bson.AbstractBsonWriter$State r1 = org.bson.AbstractBsonWriter.State.INITIAL     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f43652a     // Catch:{ NoSuchFieldError -> 0x001d }
                org.bson.AbstractBsonWriter$State r1 = org.bson.AbstractBsonWriter.State.VALUE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f43652a     // Catch:{ NoSuchFieldError -> 0x0028 }
                org.bson.AbstractBsonWriter$State r1 = org.bson.AbstractBsonWriter.State.SCOPE_DOCUMENT     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: org.bson.BsonDocumentWriter.AnonymousClass1.<clinit>():void");
        }
    }

    public BsonDocumentWriter(BsonDocument bsonDocument) {
        super(new BsonWriterSettings());
        this.F = bsonDocument;
        P1(new Context());
    }

    public void E0() {
        U1(BsonNull.f43663z);
    }

    public void G0(ObjectId objectId) {
        U1(new BsonObjectId(objectId));
    }

    public void H0(BsonRegularExpression bsonRegularExpression) {
        U1(bsonRegularExpression);
    }

    public void J0() {
        P1(new Context(new BsonArray(), BsonContextType.ARRAY, j1()));
    }

    public void L0() {
        int i2 = AnonymousClass1.f43652a[E1().ordinal()];
        if (i2 == 1) {
            P1(new Context(this.F, BsonContextType.DOCUMENT, j1()));
        } else if (i2 == 2) {
            P1(new Context(new BsonDocument(), BsonContextType.DOCUMENT, j1()));
        } else if (i2 == 3) {
            P1(new Context(new BsonDocument(), BsonContextType.SCOPE_DOCUMENT, j1()));
        } else {
            throw new BsonInvalidOperationException("Unexpected state " + E1());
        }
    }

    public void S0(String str) {
        U1(new BsonString(str));
    }

    /* renamed from: T1 */
    public Context j1() {
        return (Context) super.j1();
    }

    public void U0(String str) {
        U1(new BsonSymbol(str));
    }

    public final void U1(BsonValue bsonValue) {
        j1().f(bsonValue);
    }

    public void W0(BsonTimestamp bsonTimestamp) {
        U1(bsonTimestamp);
    }

    public void b1() {
        U1(new BsonUndefined());
    }

    public void d(BsonBinary bsonBinary) {
        U1(bsonBinary);
    }

    public void f(boolean z2) {
        U1(BsonBoolean.q0(z2));
    }

    public void g(BsonDbPointer bsonDbPointer) {
        U1(bsonDbPointer);
    }

    public void j(long j2) {
        U1(new BsonDateTime(j2));
    }

    public void k(Decimal128 decimal128) {
        U1(new BsonDecimal128(decimal128));
    }

    public void l(double d2) {
        U1(new BsonDouble(d2));
    }

    public void m() {
        BsonValue e2 = j1().f43653e;
        P1(j1().d());
        U1(e2);
    }

    public void r() {
        BsonValue e2 = j1().f43653e;
        P1(j1().d());
        if (j1().c() == BsonContextType.JAVASCRIPT_WITH_SCOPE) {
            P1(j1().d());
            U1(new BsonJavaScriptWithScope(((BsonString) j1().f43653e).p0(), (BsonDocument) e2));
        } else if (j1().c() != BsonContextType.TOP_LEVEL) {
            U1(e2);
        }
    }

    public void s0(String str) {
        P1(new Context(new BsonString(str), BsonContextType.JAVASCRIPT_WITH_SCOPE, j1()));
    }

    public void t(int i2) {
        U1(new BsonInt32(i2));
    }

    public void t0() {
        U1(new BsonMaxKey());
    }

    public void w0() {
        U1(new BsonMinKey());
    }

    public void x(long j2) {
        U1(new BsonInt64(j2));
    }

    public void y(String str) {
        U1(new BsonJavaScript(str));
    }

    public class Context extends AbstractBsonWriter.Context {

        /* renamed from: e  reason: collision with root package name */
        public BsonValue f43653e;

        public Context(BsonValue bsonValue, BsonContextType bsonContextType, Context context) {
            super(context, bsonContextType);
            this.f43653e = bsonValue;
        }

        public void f(BsonValue bsonValue) {
            BsonValue bsonValue2 = this.f43653e;
            if (bsonValue2 instanceof BsonArray) {
                ((BsonArray) bsonValue2).add(bsonValue);
            } else {
                ((BsonDocument) bsonValue2).put(BsonDocumentWriter.this.q1(), bsonValue);
            }
        }

        public Context() {
            super((AbstractBsonWriter.Context) null, BsonContextType.TOP_LEVEL);
        }
    }
}
