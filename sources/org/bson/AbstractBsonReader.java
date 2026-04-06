package org.bson;

import java.util.Arrays;
import org.bson.types.Decimal128;
import org.bson.types.ObjectId;

public abstract class AbstractBsonReader implements BsonReader {

    /* renamed from: A  reason: collision with root package name */
    public Context f43565A;

    /* renamed from: B  reason: collision with root package name */
    public BsonType f43566B;
    public String C;
    public boolean D;

    /* renamed from: z  reason: collision with root package name */
    public State f43567z = State.INITIAL;

    /* renamed from: org.bson.AbstractBsonReader$1  reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f43568a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                org.bson.BsonContextType[] r0 = org.bson.BsonContextType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f43568a = r0
                org.bson.BsonContextType r1 = org.bson.BsonContextType.ARRAY     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f43568a     // Catch:{ NoSuchFieldError -> 0x001d }
                org.bson.BsonContextType r1 = org.bson.BsonContextType.DOCUMENT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f43568a     // Catch:{ NoSuchFieldError -> 0x0028 }
                org.bson.BsonContextType r1 = org.bson.BsonContextType.SCOPE_DOCUMENT     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f43568a     // Catch:{ NoSuchFieldError -> 0x0033 }
                org.bson.BsonContextType r1 = org.bson.BsonContextType.TOP_LEVEL     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: org.bson.AbstractBsonReader.AnonymousClass1.<clinit>():void");
        }
    }

    public abstract class Context {

        /* renamed from: a  reason: collision with root package name */
        public final Context f43569a;

        /* renamed from: b  reason: collision with root package name */
        public final BsonContextType f43570b;

        public Context(Context context, BsonContextType bsonContextType) {
            this.f43569a = context;
            this.f43570b = bsonContextType;
        }

        public BsonContextType c() {
            return this.f43570b;
        }

        public Context d() {
            return this.f43569a;
        }
    }

    public class Mark implements BsonReaderMark {

        /* renamed from: a  reason: collision with root package name */
        public final State f43572a;

        /* renamed from: b  reason: collision with root package name */
        public final Context f43573b;

        /* renamed from: c  reason: collision with root package name */
        public final BsonContextType f43574c;

        /* renamed from: d  reason: collision with root package name */
        public final BsonType f43575d;

        /* renamed from: e  reason: collision with root package name */
        public final String f43576e;

        public Mark() {
            this.f43572a = AbstractBsonReader.this.f43567z;
            this.f43573b = AbstractBsonReader.this.f43565A.f43569a;
            this.f43574c = AbstractBsonReader.this.f43565A.f43570b;
            this.f43575d = AbstractBsonReader.this.f43566B;
            this.f43576e = AbstractBsonReader.this.C;
        }

        public BsonContextType a() {
            return this.f43574c;
        }

        public void b() {
            State unused = AbstractBsonReader.this.f43567z = this.f43572a;
            BsonType unused2 = AbstractBsonReader.this.f43566B = this.f43575d;
            String unused3 = AbstractBsonReader.this.C = this.f43576e;
        }

        public Context c() {
            return this.f43573b;
        }
    }

    public enum State {
        INITIAL,
        TYPE,
        NAME,
        VALUE,
        SCOPE_DOCUMENT,
        END_OF_DOCUMENT,
        END_OF_ARRAY,
        DONE,
        CLOSED
    }

    public abstract Decimal128 A();

    public void A0(Context context) {
        this.f43565A = context;
    }

    public abstract double C();

    public String C0() {
        k("readJavaScriptWithScope", BsonType.JAVASCRIPT_WITH_SCOPE);
        H0(State.SCOPE_DOCUMENT);
        return I();
    }

    public BsonType C1() {
        return this.f43566B;
    }

    public abstract void D();

    public void D0() {
        k("readMaxKey", BsonType.MAX_KEY);
        H0(t0());
        N();
    }

    public abstract void E();

    public void E0(BsonType bsonType) {
        this.f43566B = bsonType;
    }

    public abstract int F();

    public abstract long G();

    public void G0(String str) {
        this.C = str;
    }

    public abstract String H();

    public void H0(State state) {
        this.f43567z = state;
    }

    public abstract String I();

    public void I0() {
        if (!isClosed()) {
            BsonContextType c2 = s0().c();
            BsonContextType bsonContextType = BsonContextType.ARRAY;
            if (c2 != bsonContextType) {
                S0("readEndArray", s0().c(), bsonContextType);
            }
            if (w0() == State.TYPE) {
                t1();
            }
            State w0 = w0();
            State state = State.END_OF_ARRAY;
            if (w0 != state) {
                U0("ReadEndArray", state);
            }
            D();
            J0();
            return;
        }
        throw new IllegalStateException("BSONBinaryWriter");
    }

    public BsonBinary J() {
        k("readBinaryData", BsonType.BINARY);
        H0(t0());
        return r();
    }

    public final void J0() {
        int i2 = AnonymousClass1.f43568a[s0().c().ordinal()];
        if (i2 == 1 || i2 == 2) {
            H0(State.TYPE);
        } else if (i2 == 4) {
            H0(State.DONE);
        } else {
            throw new BSONException(String.format("Unexpected ContextType %s.", new Object[]{s0().c()}));
        }
    }

    public Decimal128 K() {
        k("readDecimal", BsonType.DECIMAL128);
        H0(t0());
        return A();
    }

    public void L0() {
        if (!isClosed()) {
            State w0 = w0();
            State state = State.NAME;
            if (w0 != state) {
                U0("skipName", state);
            }
            H0(State.VALUE);
            n0();
            return;
        }
        throw new IllegalStateException("This instance has been closed");
    }

    public abstract void N();

    public abstract void O();

    public abstract void Q();

    public String R0() {
        k("readJavaScript", BsonType.JAVASCRIPT);
        H0(t0());
        return H();
    }

    public abstract ObjectId S();

    public void S0(String str, BsonContextType bsonContextType, BsonContextType... bsonContextTypeArr) {
        throw new BsonInvalidOperationException(String.format("%s can only be called when ContextType is %s, not when ContextType is %s.", new Object[]{str, StringUtils.a(" or ", Arrays.asList(bsonContextTypeArr)), bsonContextType}));
    }

    public abstract BsonRegularExpression T();

    public void T0() {
        BsonContextType bsonContextType;
        if (!isClosed()) {
            BsonContextType c2 = s0().c();
            BsonContextType bsonContextType2 = BsonContextType.DOCUMENT;
            if (!(c2 == bsonContextType2 || s0().c() == (bsonContextType = BsonContextType.SCOPE_DOCUMENT))) {
                S0("readEndDocument", s0().c(), bsonContextType2, bsonContextType);
            }
            if (w0() == State.TYPE) {
                t1();
            }
            State w0 = w0();
            State state = State.END_OF_DOCUMENT;
            if (w0 != state) {
                U0("readEndDocument", state);
            }
            E();
            J0();
            return;
        }
        throw new IllegalStateException("BSONBinaryWriter");
    }

    public BsonDbPointer U() {
        k("readDBPointer", BsonType.DB_POINTER);
        H0(t0());
        return x();
    }

    public void U0(String str, State... stateArr) {
        throw new BsonInvalidOperationException(String.format("%s can only be called when State is %s, not when State is %s.", new Object[]{str, StringUtils.a(" or ", Arrays.asList(stateArr)), this.f43567z}));
    }

    public BsonTimestamp W() {
        k("readTimestamp", BsonType.TIMESTAMP);
        H0(t0());
        return g0();
    }

    public void W0(String str, BsonType bsonType) {
        State state = this.f43567z;
        if (state == State.INITIAL || state == State.SCOPE_DOCUMENT || state == State.TYPE) {
            t1();
        }
        if (this.f43567z == State.NAME) {
            L0();
        }
        State state2 = this.f43567z;
        State state3 = State.VALUE;
        if (state2 != state3) {
            U0(str, state3);
        }
        if (this.f43566B != bsonType) {
            throw new BsonInvalidOperationException(String.format("%s can only be called when CurrentBSONType is %s, not when CurrentBSONType is %s.", new Object[]{str, bsonType, this.f43566B}));
        }
    }

    public abstract void X();

    public void X0() {
        k("readUndefined", BsonType.UNDEFINED);
        H0(t0());
        m0();
    }

    public void Y() {
        if (!isClosed()) {
            State w0 = w0();
            State state = State.VALUE;
            if (w0 != state) {
                U0("skipValue", state);
            }
            o0();
            H0(State.TYPE);
            return;
        }
        throw new IllegalStateException("BSONBinaryWriter");
    }

    public byte Y0() {
        k("readBinaryData", BsonType.BINARY);
        return m();
    }

    public void Z() {
        k("readMinKey", BsonType.MIN_KEY);
        H0(t0());
        O();
    }

    public void Z0() {
        k("readStartDocument", BsonType.DOCUMENT);
        c0();
        H0(State.TYPE);
    }

    public String b0() {
        k("readSymbol", BsonType.SYMBOL);
        H0(t0());
        return f0();
    }

    public abstract void c0();

    public void close() {
        this.D = true;
    }

    public abstract String e0();

    public abstract String f0();

    public BsonRegularExpression f1() {
        k("readRegularExpression", BsonType.REGULAR_EXPRESSION);
        H0(t0());
        return T();
    }

    public abstract BsonTimestamp g0();

    public String h() {
        k("readString", BsonType.STRING);
        H0(t0());
        return e0();
    }

    public String h1() {
        if (this.f43567z == State.TYPE) {
            t1();
        }
        State state = this.f43567z;
        State state2 = State.NAME;
        if (state != state2) {
            U0("readName", state2);
        }
        this.f43567z = State.VALUE;
        return this.C;
    }

    public int i() {
        k("readInt32", BsonType.INT32);
        H0(t0());
        return F();
    }

    public void i1() {
        k("readNull", BsonType.NULL);
        H0(t0());
        Q();
    }

    public boolean isClosed() {
        return this.D;
    }

    public void k(String str, BsonType bsonType) {
        if (!isClosed()) {
            W0(str, bsonType);
            return;
        }
        throw new IllegalStateException("BsonWriter is closed");
    }

    public abstract int l();

    public abstract byte m();

    public abstract void m0();

    public long n() {
        k("readInt64", BsonType.INT64);
        H0(t0());
        return G();
    }

    public abstract void n0();

    public abstract void o0();

    public abstract BsonBinary r();

    public long r0() {
        k("readDateTime", BsonType.DATE_TIME);
        H0(t0());
        return y();
    }

    public boolean readBoolean() {
        k("readBoolean", BsonType.BOOLEAN);
        H0(t0());
        return t();
    }

    public double readDouble() {
        k("readDouble", BsonType.DOUBLE);
        H0(t0());
        return C();
    }

    public Context s0() {
        return this.f43565A;
    }

    public abstract boolean t();

    public State t0() {
        int i2 = AnonymousClass1.f43568a[this.f43565A.c().ordinal()];
        if (i2 == 1 || i2 == 2 || i2 == 3) {
            return State.TYPE;
        }
        if (i2 == 4) {
            return State.DONE;
        }
        throw new BSONException(String.format("Unexpected ContextType %s.", new Object[]{this.f43565A.c()}));
    }

    public abstract BsonType t1();

    public ObjectId w() {
        k("readObjectId", BsonType.OBJECT_ID);
        H0(t0());
        return S();
    }

    public State w0() {
        return this.f43567z;
    }

    public abstract BsonDbPointer x();

    public abstract long y();

    public void y0() {
        k("readStartArray", BsonType.ARRAY);
        X();
        H0(State.TYPE);
    }

    public int z1() {
        k("readBinaryData", BsonType.BINARY);
        return l();
    }
}
