package org.bson;

import androidx.datastore.preferences.protobuf.DescriptorProtos;
import java.io.Closeable;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Stack;
import org.bson.assertions.Assertions;
import org.bson.types.Decimal128;
import org.bson.types.ObjectId;

public abstract class AbstractBsonWriter implements BsonWriter, Closeable {

    /* renamed from: A  reason: collision with root package name */
    public final Stack f43581A;

    /* renamed from: B  reason: collision with root package name */
    public State f43582B;
    public Context C;
    public int D;
    public boolean E;

    /* renamed from: z  reason: collision with root package name */
    public final BsonWriterSettings f43583z;

    /* renamed from: org.bson.AbstractBsonWriter$1  reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f43584a;

        /* JADX WARNING: Can't wrap try/catch for region: R(42:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|35|36|37|38|39|40|(3:41|42|44)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(44:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|35|36|37|38|39|40|41|42|44) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0060 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x006c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0078 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0084 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0090 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x009c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x00a8 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x00b4 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x00c0 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:35:0x00cc */
        /* JADX WARNING: Missing exception handler attribute for start block: B:37:0x00d8 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:39:0x00e4 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:41:0x00f0 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                org.bson.BsonType[] r0 = org.bson.BsonType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f43584a = r0
                org.bson.BsonType r1 = org.bson.BsonType.DOCUMENT     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f43584a     // Catch:{ NoSuchFieldError -> 0x001d }
                org.bson.BsonType r1 = org.bson.BsonType.ARRAY     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f43584a     // Catch:{ NoSuchFieldError -> 0x0028 }
                org.bson.BsonType r1 = org.bson.BsonType.DOUBLE     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f43584a     // Catch:{ NoSuchFieldError -> 0x0033 }
                org.bson.BsonType r1 = org.bson.BsonType.STRING     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f43584a     // Catch:{ NoSuchFieldError -> 0x003e }
                org.bson.BsonType r1 = org.bson.BsonType.BINARY     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f43584a     // Catch:{ NoSuchFieldError -> 0x0049 }
                org.bson.BsonType r1 = org.bson.BsonType.UNDEFINED     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f43584a     // Catch:{ NoSuchFieldError -> 0x0054 }
                org.bson.BsonType r1 = org.bson.BsonType.OBJECT_ID     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r0 = f43584a     // Catch:{ NoSuchFieldError -> 0x0060 }
                org.bson.BsonType r1 = org.bson.BsonType.BOOLEAN     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                int[] r0 = f43584a     // Catch:{ NoSuchFieldError -> 0x006c }
                org.bson.BsonType r1 = org.bson.BsonType.DATE_TIME     // Catch:{ NoSuchFieldError -> 0x006c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006c }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006c }
            L_0x006c:
                int[] r0 = f43584a     // Catch:{ NoSuchFieldError -> 0x0078 }
                org.bson.BsonType r1 = org.bson.BsonType.NULL     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r2 = 10
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                int[] r0 = f43584a     // Catch:{ NoSuchFieldError -> 0x0084 }
                org.bson.BsonType r1 = org.bson.BsonType.REGULAR_EXPRESSION     // Catch:{ NoSuchFieldError -> 0x0084 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0084 }
                r2 = 11
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0084 }
            L_0x0084:
                int[] r0 = f43584a     // Catch:{ NoSuchFieldError -> 0x0090 }
                org.bson.BsonType r1 = org.bson.BsonType.JAVASCRIPT     // Catch:{ NoSuchFieldError -> 0x0090 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0090 }
                r2 = 12
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0090 }
            L_0x0090:
                int[] r0 = f43584a     // Catch:{ NoSuchFieldError -> 0x009c }
                org.bson.BsonType r1 = org.bson.BsonType.SYMBOL     // Catch:{ NoSuchFieldError -> 0x009c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x009c }
                r2 = 13
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x009c }
            L_0x009c:
                int[] r0 = f43584a     // Catch:{ NoSuchFieldError -> 0x00a8 }
                org.bson.BsonType r1 = org.bson.BsonType.JAVASCRIPT_WITH_SCOPE     // Catch:{ NoSuchFieldError -> 0x00a8 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00a8 }
                r2 = 14
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00a8 }
            L_0x00a8:
                int[] r0 = f43584a     // Catch:{ NoSuchFieldError -> 0x00b4 }
                org.bson.BsonType r1 = org.bson.BsonType.INT32     // Catch:{ NoSuchFieldError -> 0x00b4 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00b4 }
                r2 = 15
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00b4 }
            L_0x00b4:
                int[] r0 = f43584a     // Catch:{ NoSuchFieldError -> 0x00c0 }
                org.bson.BsonType r1 = org.bson.BsonType.TIMESTAMP     // Catch:{ NoSuchFieldError -> 0x00c0 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00c0 }
                r2 = 16
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00c0 }
            L_0x00c0:
                int[] r0 = f43584a     // Catch:{ NoSuchFieldError -> 0x00cc }
                org.bson.BsonType r1 = org.bson.BsonType.INT64     // Catch:{ NoSuchFieldError -> 0x00cc }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00cc }
                r2 = 17
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00cc }
            L_0x00cc:
                int[] r0 = f43584a     // Catch:{ NoSuchFieldError -> 0x00d8 }
                org.bson.BsonType r1 = org.bson.BsonType.DECIMAL128     // Catch:{ NoSuchFieldError -> 0x00d8 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00d8 }
                r2 = 18
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00d8 }
            L_0x00d8:
                int[] r0 = f43584a     // Catch:{ NoSuchFieldError -> 0x00e4 }
                org.bson.BsonType r1 = org.bson.BsonType.MIN_KEY     // Catch:{ NoSuchFieldError -> 0x00e4 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00e4 }
                r2 = 19
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00e4 }
            L_0x00e4:
                int[] r0 = f43584a     // Catch:{ NoSuchFieldError -> 0x00f0 }
                org.bson.BsonType r1 = org.bson.BsonType.DB_POINTER     // Catch:{ NoSuchFieldError -> 0x00f0 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00f0 }
                r2 = 20
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00f0 }
            L_0x00f0:
                int[] r0 = f43584a     // Catch:{ NoSuchFieldError -> 0x00fc }
                org.bson.BsonType r1 = org.bson.BsonType.MAX_KEY     // Catch:{ NoSuchFieldError -> 0x00fc }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00fc }
                r2 = 21
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00fc }
            L_0x00fc:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: org.bson.AbstractBsonWriter.AnonymousClass1.<clinit>():void");
        }
    }

    public class Context {

        /* renamed from: a  reason: collision with root package name */
        public final Context f43585a;

        /* renamed from: b  reason: collision with root package name */
        public final BsonContextType f43586b;

        /* renamed from: c  reason: collision with root package name */
        public String f43587c;

        public Context(Context context, BsonContextType bsonContextType) {
            this.f43585a = context;
            this.f43586b = bsonContextType;
        }

        public BsonContextType c() {
            return this.f43586b;
        }

        public Context d() {
            return this.f43585a;
        }
    }

    public class Mark {
    }

    public enum State {
        INITIAL,
        NAME,
        VALUE,
        SCOPE_DOCUMENT,
        DONE,
        CLOSED
    }

    public AbstractBsonWriter(BsonWriterSettings bsonWriterSettings) {
        this(bsonWriterSettings, new NoOpFieldNameValidator());
    }

    private void J1(BsonReader bsonReader, List list) {
        bsonReader.Z0();
        T();
        while (bsonReader.t1() != BsonType.END_OF_DOCUMENT) {
            A(bsonReader.h1());
            N1(bsonReader);
            if (a()) {
                return;
            }
        }
        bsonReader.T0();
        if (list != null) {
            K1(list);
        }
        f0();
    }

    public void A(String str) {
        Assertions.d("name", str);
        State state = this.f43582B;
        State state2 = State.NAME;
        if (state != state2) {
            S1("WriteName", state2);
        }
        if (((FieldNameValidator) this.f43581A.peek()).b(str)) {
            A0(str);
            String unused = this.C.f43587c = str;
            this.f43582B = State.VALUE;
            return;
        }
        throw new IllegalArgumentException(String.format("Invalid BSON field name %s", new Object[]{str}));
    }

    public void A0(String str) {
    }

    public void C(String str, String str2) {
        Assertions.d("name", str);
        Assertions.d("value", str2);
        A(str);
        p(str2);
    }

    public void D() {
        b("writeNull", State.VALUE);
        E0();
        Q1(w1());
    }

    public void E() {
        b("writeMaxKey", State.VALUE);
        t0();
        Q1(w1());
    }

    public abstract void E0();

    public State E1() {
        return this.f43582B;
    }

    public void F(BsonBinary bsonBinary) {
        Assertions.d("value", bsonBinary);
        b("writeBinaryData", State.VALUE, State.INITIAL);
        d(bsonBinary);
        Q1(w1());
    }

    public void F1(BsonReader bsonReader, List list) {
        Assertions.d("reader", bsonReader);
        Assertions.d("extraElements", list);
        J1(bsonReader, list);
    }

    public void G(BsonRegularExpression bsonRegularExpression) {
        Assertions.d("value", bsonRegularExpression);
        b("writeRegularExpression", State.VALUE);
        H0(bsonRegularExpression);
        Q1(w1());
    }

    public abstract void G0(ObjectId objectId);

    public final void G1(BsonArray bsonArray) {
        m0();
        Iterator it = bsonArray.iterator();
        while (it.hasNext()) {
            O1((BsonValue) it.next());
        }
        H();
    }

    public void H() {
        b("writeEndArray", State.VALUE);
        BsonContextType c2 = j1().c();
        BsonContextType bsonContextType = BsonContextType.ARRAY;
        if (c2 != bsonContextType) {
            R1("WriteEndArray", j1().c(), bsonContextType);
        }
        if (!(this.C.d() == null || this.C.d().f43587c == null)) {
            this.f43581A.pop();
        }
        this.D--;
        m();
        Q1(w1());
    }

    public abstract void H0(BsonRegularExpression bsonRegularExpression);

    public final void H1(BsonReader bsonReader) {
        bsonReader.y0();
        m0();
        while (bsonReader.t1() != BsonType.END_OF_DOCUMENT) {
            N1(bsonReader);
            if (a()) {
                return;
            }
        }
        bsonReader.I0();
        H();
    }

    public void I(String str) {
        Assertions.d("value", str);
        b("writeSymbol", State.VALUE);
        U0(str);
        Q1(w1());
    }

    public final void I1(BsonDocument bsonDocument) {
        T();
        for (Map.Entry entry : bsonDocument.entrySet()) {
            A((String) entry.getKey());
            O1((BsonValue) entry.getValue());
        }
        f0();
    }

    public abstract void J0();

    public void K1(List list) {
        Assertions.d("extraElements", list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            BsonElement bsonElement = (BsonElement) it.next();
            A(bsonElement.a());
            O1(bsonElement.b());
        }
    }

    public abstract void L0();

    public final void L1(BsonJavaScriptWithScope bsonJavaScriptWithScope) {
        g0(bsonJavaScriptWithScope.p0());
        I1(bsonJavaScriptWithScope.q0());
    }

    public final void M1(BsonReader bsonReader) {
        g0(bsonReader.C0());
        J1(bsonReader, (List) null);
    }

    public void N(ObjectId objectId) {
        Assertions.d("value", objectId);
        b("writeObjectId", State.VALUE);
        G0(objectId);
        Q1(w1());
    }

    public final void N1(BsonReader bsonReader) {
        switch (AnonymousClass1.f43584a[bsonReader.C1().ordinal()]) {
            case 1:
                J1(bsonReader, (List) null);
                return;
            case 2:
                H1(bsonReader);
                return;
            case 3:
                writeDouble(bsonReader.readDouble());
                return;
            case 4:
                p(bsonReader.h());
                return;
            case 5:
                F(bsonReader.J());
                return;
            case 6:
                bsonReader.X0();
                n0();
                return;
            case 7:
                N(bsonReader.w());
                return;
            case 8:
                writeBoolean(bsonReader.readBoolean());
                return;
            case 9:
                c0(bsonReader.r0());
                return;
            case 10:
                bsonReader.i1();
                D();
                return;
            case 11:
                G(bsonReader.f1());
                return;
            case 12:
                X(bsonReader.R0());
                return;
            case 13:
                I(bsonReader.b0());
                return;
            case 14:
                M1(bsonReader);
                return;
            case 15:
                q(bsonReader.i());
                return;
            case 16:
                S(bsonReader.W());
                return;
            case 17:
                z(bsonReader.n());
                return;
            case 18:
                o0(bsonReader.K());
                return;
            case DescriptorProtos.FieldOptions.TARGETS_FIELD_NUMBER:
                bsonReader.Z();
                Q();
                return;
            case 20:
                O(bsonReader.U());
                return;
            case 21:
                bsonReader.D0();
                E();
                return;
            default:
                throw new IllegalArgumentException("unhandled BSON type: " + bsonReader.C1());
        }
    }

    public void O(BsonDbPointer bsonDbPointer) {
        Assertions.d("value", bsonDbPointer);
        b("writeDBPointer", State.VALUE, State.INITIAL);
        g(bsonDbPointer);
        Q1(w1());
    }

    public final void O1(BsonValue bsonValue) {
        switch (AnonymousClass1.f43584a[bsonValue.j0().ordinal()]) {
            case 1:
                I1(bsonValue.R());
                return;
            case 2:
                G1(bsonValue.n());
                return;
            case 3:
                writeDouble(bsonValue.U().q0());
                return;
            case 4:
                p(bsonValue.d0().p0());
                return;
            case 5:
                F(bsonValue.o());
                return;
            case 6:
                n0();
                return;
            case 7:
                N(bsonValue.a0().p0());
                return;
            case 8:
                writeBoolean(bsonValue.p().p0());
                return;
            case 9:
                c0(bsonValue.B().p0());
                return;
            case 10:
                D();
                return;
            case 11:
                G(bsonValue.b0());
                return;
            case 12:
                X(bsonValue.Y().l0());
                return;
            case 13:
                I(bsonValue.h0().l0());
                return;
            case 14:
                L1(bsonValue.Z());
                return;
            case 15:
                q(bsonValue.V().p0());
                return;
            case 16:
                S(bsonValue.i0());
                return;
            case 17:
                z(bsonValue.W().p0());
                return;
            case 18:
                o0(bsonValue.M().l0());
                return;
            case DescriptorProtos.FieldOptions.TARGETS_FIELD_NUMBER:
                Q();
                return;
            case 20:
                O(bsonValue.z());
                return;
            case 21:
                E();
                return;
            default:
                throw new IllegalArgumentException("unhandled BSON type: " + bsonValue.j0());
        }
    }

    public void P1(Context context) {
        this.C = context;
    }

    public void Q() {
        b("writeMinKey", State.VALUE);
        w0();
        Q1(w1());
    }

    public void Q1(State state) {
        this.f43582B = state;
    }

    public void R1(String str, BsonContextType bsonContextType, BsonContextType... bsonContextTypeArr) {
        throw new BsonInvalidOperationException(String.format("%s can only be called when ContextType is %s, not when ContextType is %s.", new Object[]{str, StringUtils.a(" or ", Arrays.asList(bsonContextTypeArr)), bsonContextType}));
    }

    public void S(BsonTimestamp bsonTimestamp) {
        Assertions.d("value", bsonTimestamp);
        b("writeTimestamp", State.VALUE);
        W0(bsonTimestamp);
        Q1(w1());
    }

    public abstract void S0(String str);

    public void S1(String str, State... stateArr) {
        State state = this.f43582B;
        if ((state == State.INITIAL || state == State.SCOPE_DOCUMENT || state == State.DONE) && !str.startsWith("end") && !str.equals("writeName")) {
            String substring = str.substring(5);
            if (substring.startsWith("start")) {
                substring = substring.substring(5);
            }
            throw new BsonInvalidOperationException(String.format("%s %s value cannot be written to the root level of a BSON document.", new Object[]{Arrays.asList(new Character[]{'A', 'E', 'I', 'O', 'U'}).contains(Character.valueOf(substring.charAt(0))) ? "An" : "A", substring}));
        }
        throw new BsonInvalidOperationException(String.format("%s can only be called when State is %s, not when State is %s", new Object[]{str, StringUtils.a(" or ", Arrays.asList(stateArr)), this.f43582B}));
    }

    public void T() {
        b("writeStartDocument", State.INITIAL, State.VALUE, State.SCOPE_DOCUMENT, State.DONE);
        Context context = this.C;
        if (!(context == null || context.f43587c == null)) {
            Stack stack = this.f43581A;
            stack.push(((FieldNameValidator) stack.peek()).a(q1()));
        }
        int i2 = this.D + 1;
        this.D = i2;
        if (i2 <= this.f43583z.a()) {
            L0();
            Q1(State.NAME);
            return;
        }
        throw new BsonSerializationException("Maximum serialization depth exceeded (does the object being serialized have a circular reference?).");
    }

    public abstract void U0(String str);

    public abstract void W0(BsonTimestamp bsonTimestamp);

    public void X(String str) {
        Assertions.d("value", str);
        b("writeJavaScript", State.VALUE);
        y(str);
        Q1(w1());
    }

    public boolean a() {
        return false;
    }

    public void b(String str, State... stateArr) {
        if (isClosed()) {
            throw new IllegalStateException("BsonWriter is closed");
        } else if (!c(stateArr)) {
            S1(str, stateArr);
        }
    }

    public abstract void b1();

    public boolean c(State[] stateArr) {
        for (State state : stateArr) {
            if (state == E1()) {
                return true;
            }
        }
        return false;
    }

    public void c0(long j2) {
        b("writeDateTime", State.VALUE, State.INITIAL);
        j(j2);
        Q1(w1());
    }

    public void close() {
        this.E = true;
    }

    public abstract void d(BsonBinary bsonBinary);

    public void e0(BsonReader bsonReader) {
        Assertions.d("reader", bsonReader);
        J1(bsonReader, (List) null);
    }

    public abstract void f(boolean z2);

    public void f0() {
        BsonContextType bsonContextType;
        b("writeEndDocument", State.NAME);
        BsonContextType c2 = j1().c();
        BsonContextType bsonContextType2 = BsonContextType.DOCUMENT;
        if (!(c2 == bsonContextType2 || c2 == (bsonContextType = BsonContextType.SCOPE_DOCUMENT))) {
            R1("WriteEndDocument", c2, bsonContextType2, bsonContextType);
        }
        if (!(this.C.d() == null || this.C.d().f43587c == null)) {
            this.f43581A.pop();
        }
        this.D--;
        r();
        if (j1() == null || j1().c() == BsonContextType.TOP_LEVEL) {
            Q1(State.DONE);
        } else {
            Q1(w1());
        }
    }

    public abstract void g(BsonDbPointer bsonDbPointer);

    public void g0(String str) {
        Assertions.d("value", str);
        b("writeJavaScriptWithScope", State.VALUE);
        s0(str);
        Q1(State.SCOPE_DOCUMENT);
    }

    public boolean isClosed() {
        return this.E;
    }

    public abstract void j(long j2);

    public Context j1() {
        return this.C;
    }

    public abstract void k(Decimal128 decimal128);

    public abstract void l(double d2);

    public abstract void m();

    public void m0() {
        State state = State.VALUE;
        b("writeStartArray", state);
        Context context = this.C;
        if (!(context == null || context.f43587c == null)) {
            Stack stack = this.f43581A;
            stack.push(((FieldNameValidator) stack.peek()).a(q1()));
        }
        int i2 = this.D + 1;
        this.D = i2;
        if (i2 <= this.f43583z.a()) {
            J0();
            Q1(state);
            return;
        }
        throw new BsonSerializationException("Maximum serialization depth exceeded (does the object being serialized have a circular reference?).");
    }

    public void n0() {
        b("writeUndefined", State.VALUE);
        b1();
        Q1(w1());
    }

    public void o0(Decimal128 decimal128) {
        Assertions.d("value", decimal128);
        b("writeInt64", State.VALUE);
        k(decimal128);
        Q1(w1());
    }

    public void p(String str) {
        Assertions.d("value", str);
        b("writeString", State.VALUE);
        S0(str);
        Q1(w1());
    }

    public void q(int i2) {
        b("writeInt32", State.VALUE);
        t(i2);
        Q1(w1());
    }

    public String q1() {
        return this.C.f43587c;
    }

    public abstract void r();

    public abstract void s0(String str);

    public abstract void t(int i2);

    public abstract void t0();

    public abstract void w0();

    public State w1() {
        return j1().c() == BsonContextType.ARRAY ? State.VALUE : State.NAME;
    }

    public void writeBoolean(boolean z2) {
        b("writeBoolean", State.VALUE, State.INITIAL);
        f(z2);
        Q1(w1());
    }

    public void writeDouble(double d2) {
        b("writeDBPointer", State.VALUE, State.INITIAL);
        l(d2);
        Q1(w1());
    }

    public abstract void x(long j2);

    public abstract void y(String str);

    public void z(long j2) {
        b("writeInt64", State.VALUE);
        x(j2);
        Q1(w1());
    }

    public AbstractBsonWriter(BsonWriterSettings bsonWriterSettings, FieldNameValidator fieldNameValidator) {
        Stack stack = new Stack();
        this.f43581A = stack;
        if (fieldNameValidator != null) {
            this.f43583z = bsonWriterSettings;
            stack.push(fieldNameValidator);
            this.f43582B = State.INITIAL;
            return;
        }
        throw new IllegalArgumentException("Validator can not be null");
    }
}
