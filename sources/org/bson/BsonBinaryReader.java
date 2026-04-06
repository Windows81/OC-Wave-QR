package org.bson;

import org.bson.AbstractBsonReader;
import org.bson.io.BsonInput;
import org.bson.io.BsonInputMark;
import org.bson.types.Decimal128;
import org.bson.types.ObjectId;

public class BsonBinaryReader extends AbstractBsonReader {
    public final BsonInput E;
    public Mark F;

    /* renamed from: org.bson.BsonBinaryReader$1  reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f43612a;

        /* renamed from: b  reason: collision with root package name */
        public static final /* synthetic */ int[] f43613b;

        /* JADX WARNING: Can't wrap try/catch for region: R(48:0|(2:1|2)|3|(2:5|6)|7|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|35|36|37|38|39|40|41|42|43|44|(2:45|46)|47|49|50|51|52|(3:53|54|56)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(50:0|(2:1|2)|3|(2:5|6)|7|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|35|36|37|38|39|40|41|42|43|44|(2:45|46)|47|49|50|51|52|53|54|56) */
        /* JADX WARNING: Can't wrap try/catch for region: R(51:0|(2:1|2)|3|5|6|7|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|35|36|37|38|39|40|41|42|43|44|(2:45|46)|47|49|50|51|52|53|54|56) */
        /* JADX WARNING: Can't wrap try/catch for region: R(52:0|(2:1|2)|3|5|6|7|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|49|50|51|52|53|54|56) */
        /* JADX WARNING: Can't wrap try/catch for region: R(53:0|1|2|3|5|6|7|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|49|50|51|52|53|54|56) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0033 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0060 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x006c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0078 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x0084 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x0090 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x009c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x00a8 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:35:0x00b4 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:37:0x00c0 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:39:0x00cc */
        /* JADX WARNING: Missing exception handler attribute for start block: B:41:0x00d8 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:43:0x00e4 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:45:0x00f0 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:51:0x010d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:53:0x0117 */
        static {
            /*
                org.bson.BsonType[] r0 = org.bson.BsonType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f43613b = r0
                r1 = 1
                org.bson.BsonType r2 = org.bson.BsonType.ARRAY     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = f43613b     // Catch:{ NoSuchFieldError -> 0x001d }
                org.bson.BsonType r3 = org.bson.BsonType.BINARY     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                r2 = 3
                int[] r3 = f43613b     // Catch:{ NoSuchFieldError -> 0x0028 }
                org.bson.BsonType r4 = org.bson.BsonType.BOOLEAN     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r3 = f43613b     // Catch:{ NoSuchFieldError -> 0x0033 }
                org.bson.BsonType r4 = org.bson.BsonType.DATE_TIME     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r5 = 4
                r3[r4] = r5     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r3 = f43613b     // Catch:{ NoSuchFieldError -> 0x003e }
                org.bson.BsonType r4 = org.bson.BsonType.DOCUMENT     // Catch:{ NoSuchFieldError -> 0x003e }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r5 = 5
                r3[r4] = r5     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r3 = f43613b     // Catch:{ NoSuchFieldError -> 0x0049 }
                org.bson.BsonType r4 = org.bson.BsonType.DOUBLE     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r5 = 6
                r3[r4] = r5     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r3 = f43613b     // Catch:{ NoSuchFieldError -> 0x0054 }
                org.bson.BsonType r4 = org.bson.BsonType.INT32     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r5 = 7
                r3[r4] = r5     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r3 = f43613b     // Catch:{ NoSuchFieldError -> 0x0060 }
                org.bson.BsonType r4 = org.bson.BsonType.INT64     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r5 = 8
                r3[r4] = r5     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                int[] r3 = f43613b     // Catch:{ NoSuchFieldError -> 0x006c }
                org.bson.BsonType r4 = org.bson.BsonType.DECIMAL128     // Catch:{ NoSuchFieldError -> 0x006c }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x006c }
                r5 = 9
                r3[r4] = r5     // Catch:{ NoSuchFieldError -> 0x006c }
            L_0x006c:
                int[] r3 = f43613b     // Catch:{ NoSuchFieldError -> 0x0078 }
                org.bson.BsonType r4 = org.bson.BsonType.JAVASCRIPT     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r5 = 10
                r3[r4] = r5     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                int[] r3 = f43613b     // Catch:{ NoSuchFieldError -> 0x0084 }
                org.bson.BsonType r4 = org.bson.BsonType.JAVASCRIPT_WITH_SCOPE     // Catch:{ NoSuchFieldError -> 0x0084 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0084 }
                r5 = 11
                r3[r4] = r5     // Catch:{ NoSuchFieldError -> 0x0084 }
            L_0x0084:
                int[] r3 = f43613b     // Catch:{ NoSuchFieldError -> 0x0090 }
                org.bson.BsonType r4 = org.bson.BsonType.MAX_KEY     // Catch:{ NoSuchFieldError -> 0x0090 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0090 }
                r5 = 12
                r3[r4] = r5     // Catch:{ NoSuchFieldError -> 0x0090 }
            L_0x0090:
                int[] r3 = f43613b     // Catch:{ NoSuchFieldError -> 0x009c }
                org.bson.BsonType r4 = org.bson.BsonType.MIN_KEY     // Catch:{ NoSuchFieldError -> 0x009c }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x009c }
                r5 = 13
                r3[r4] = r5     // Catch:{ NoSuchFieldError -> 0x009c }
            L_0x009c:
                int[] r3 = f43613b     // Catch:{ NoSuchFieldError -> 0x00a8 }
                org.bson.BsonType r4 = org.bson.BsonType.NULL     // Catch:{ NoSuchFieldError -> 0x00a8 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x00a8 }
                r5 = 14
                r3[r4] = r5     // Catch:{ NoSuchFieldError -> 0x00a8 }
            L_0x00a8:
                int[] r3 = f43613b     // Catch:{ NoSuchFieldError -> 0x00b4 }
                org.bson.BsonType r4 = org.bson.BsonType.OBJECT_ID     // Catch:{ NoSuchFieldError -> 0x00b4 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x00b4 }
                r5 = 15
                r3[r4] = r5     // Catch:{ NoSuchFieldError -> 0x00b4 }
            L_0x00b4:
                int[] r3 = f43613b     // Catch:{ NoSuchFieldError -> 0x00c0 }
                org.bson.BsonType r4 = org.bson.BsonType.REGULAR_EXPRESSION     // Catch:{ NoSuchFieldError -> 0x00c0 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x00c0 }
                r5 = 16
                r3[r4] = r5     // Catch:{ NoSuchFieldError -> 0x00c0 }
            L_0x00c0:
                int[] r3 = f43613b     // Catch:{ NoSuchFieldError -> 0x00cc }
                org.bson.BsonType r4 = org.bson.BsonType.STRING     // Catch:{ NoSuchFieldError -> 0x00cc }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x00cc }
                r5 = 17
                r3[r4] = r5     // Catch:{ NoSuchFieldError -> 0x00cc }
            L_0x00cc:
                int[] r3 = f43613b     // Catch:{ NoSuchFieldError -> 0x00d8 }
                org.bson.BsonType r4 = org.bson.BsonType.SYMBOL     // Catch:{ NoSuchFieldError -> 0x00d8 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x00d8 }
                r5 = 18
                r3[r4] = r5     // Catch:{ NoSuchFieldError -> 0x00d8 }
            L_0x00d8:
                int[] r3 = f43613b     // Catch:{ NoSuchFieldError -> 0x00e4 }
                org.bson.BsonType r4 = org.bson.BsonType.TIMESTAMP     // Catch:{ NoSuchFieldError -> 0x00e4 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x00e4 }
                r5 = 19
                r3[r4] = r5     // Catch:{ NoSuchFieldError -> 0x00e4 }
            L_0x00e4:
                int[] r3 = f43613b     // Catch:{ NoSuchFieldError -> 0x00f0 }
                org.bson.BsonType r4 = org.bson.BsonType.UNDEFINED     // Catch:{ NoSuchFieldError -> 0x00f0 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x00f0 }
                r5 = 20
                r3[r4] = r5     // Catch:{ NoSuchFieldError -> 0x00f0 }
            L_0x00f0:
                int[] r3 = f43613b     // Catch:{ NoSuchFieldError -> 0x00fc }
                org.bson.BsonType r4 = org.bson.BsonType.DB_POINTER     // Catch:{ NoSuchFieldError -> 0x00fc }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x00fc }
                r5 = 21
                r3[r4] = r5     // Catch:{ NoSuchFieldError -> 0x00fc }
            L_0x00fc:
                org.bson.BsonContextType[] r3 = org.bson.BsonContextType.values()
                int r3 = r3.length
                int[] r3 = new int[r3]
                f43612a = r3
                org.bson.BsonContextType r4 = org.bson.BsonContextType.ARRAY     // Catch:{ NoSuchFieldError -> 0x010d }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x010d }
                r3[r4] = r1     // Catch:{ NoSuchFieldError -> 0x010d }
            L_0x010d:
                int[] r1 = f43612a     // Catch:{ NoSuchFieldError -> 0x0117 }
                org.bson.BsonContextType r3 = org.bson.BsonContextType.DOCUMENT     // Catch:{ NoSuchFieldError -> 0x0117 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0117 }
                r1[r3] = r0     // Catch:{ NoSuchFieldError -> 0x0117 }
            L_0x0117:
                int[] r0 = f43612a     // Catch:{ NoSuchFieldError -> 0x0121 }
                org.bson.BsonContextType r1 = org.bson.BsonContextType.SCOPE_DOCUMENT     // Catch:{ NoSuchFieldError -> 0x0121 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0121 }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0121 }
            L_0x0121:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: org.bson.BsonBinaryReader.AnonymousClass1.<clinit>():void");
        }
    }

    public class Context extends AbstractBsonReader.Context {

        /* renamed from: d  reason: collision with root package name */
        public final int f43614d;

        /* renamed from: e  reason: collision with root package name */
        public final int f43615e;

        public Context(Context context, BsonContextType bsonContextType, int i2, int i3) {
            super(context, bsonContextType);
            this.f43614d = i2;
            this.f43615e = i3;
        }

        public Context g() {
            return (Context) super.d();
        }

        public Context h(int i2) {
            int i3 = i2 - this.f43614d;
            if (i3 == this.f43615e) {
                return g();
            }
            throw new BsonSerializationException(String.format("Expected size to be %d, not %d.", new Object[]{Integer.valueOf(this.f43615e), Integer.valueOf(i3)}));
        }
    }

    public class Mark extends AbstractBsonReader.Mark {

        /* renamed from: g  reason: collision with root package name */
        public final int f43617g;

        /* renamed from: h  reason: collision with root package name */
        public final int f43618h;

        /* renamed from: i  reason: collision with root package name */
        public final BsonInputMark f43619i;

        public Mark() {
            super();
            this.f43617g = BsonBinaryReader.this.s0().f43614d;
            this.f43618h = BsonBinaryReader.this.s0().f43615e;
            this.f43619i = BsonBinaryReader.this.E.d1(Integer.MAX_VALUE);
        }

        public void b() {
            super.b();
            this.f43619i.b();
            BsonBinaryReader bsonBinaryReader = BsonBinaryReader.this;
            bsonBinaryReader.A0(new Context((Context) c(), a(), this.f43617g, this.f43618h));
        }
    }

    public BsonBinaryReader(BsonInput bsonInput) {
        if (bsonInput != null) {
            this.E = bsonInput;
            A0(new Context((Context) null, BsonContextType.TOP_LEVEL, 0, 0));
            return;
        }
        throw new IllegalArgumentException("bsonInput is null");
    }

    public Decimal128 A() {
        return Decimal128.fromIEEE754BIDEncoding(this.E.n(), this.E.n());
    }

    public double C() {
        return this.E.readDouble();
    }

    public void D() {
        A0(s0().h(this.E.getPosition()));
    }

    public void E() {
        A0(s0().h(this.E.getPosition()));
        if (s0().c() == BsonContextType.JAVASCRIPT_WITH_SCOPE) {
            A0(s0().h(this.E.getPosition()));
        }
    }

    public final int E1() {
        int i2 = this.E.i();
        if (i2 >= 0) {
            return i2;
        }
        throw new BsonSerializationException(String.format("Size %s is not valid because it is negative.", new Object[]{Integer.valueOf(i2)}));
    }

    public int F() {
        return this.E.i();
    }

    public void F1() {
        Mark mark = this.F;
        if (mark != null) {
            mark.b();
            this.F = null;
            return;
        }
        throw new BSONException("trying to reset a mark before creating it");
    }

    public long G() {
        return this.E.n();
    }

    public String H() {
        return this.E.h();
    }

    public String I() {
        A0(new Context(s0(), BsonContextType.JAVASCRIPT_WITH_SCOPE, this.E.getPosition(), E1()));
        return this.E.h();
    }

    public void N() {
    }

    public void O() {
    }

    public void Q() {
    }

    public ObjectId S() {
        return this.E.w();
    }

    public BsonRegularExpression T() {
        return new BsonRegularExpression(this.E.k0(), this.E.k0());
    }

    public void X() {
        A0(new Context(s0(), BsonContextType.ARRAY, this.E.getPosition(), E1()));
    }

    public void c0() {
        A0(new Context(s0(), w0() == AbstractBsonReader.State.SCOPE_DOCUMENT ? BsonContextType.SCOPE_DOCUMENT : BsonContextType.DOCUMENT, this.E.getPosition(), E1()));
    }

    public void close() {
        super.close();
    }

    public String e0() {
        return this.E.h();
    }

    public String f0() {
        return this.E.h();
    }

    public BsonTimestamp g0() {
        return new BsonTimestamp(this.E.n());
    }

    public BsonInput j1() {
        return this.E;
    }

    public int l() {
        w1();
        int E1 = E1();
        F1();
        return E1;
    }

    public byte m() {
        w1();
        E1();
        byte readByte = this.E.readByte();
        F1();
        return readByte;
    }

    public void m0() {
    }

    public BsonReaderMark m1() {
        return new Mark();
    }

    public void n0() {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x004f, code lost:
        r1 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x006e, code lost:
        r1 = r0 - 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x008b, code lost:
        r6.E.B(r1);
        H0(org.bson.AbstractBsonReader.State.TYPE);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0095, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void o0() {
        /*
            r6 = this;
            boolean r0 = r6.isClosed()
            if (r0 != 0) goto L_0x0096
            org.bson.AbstractBsonReader$State r0 = r6.w0()
            org.bson.AbstractBsonReader$State r1 = org.bson.AbstractBsonReader.State.VALUE
            if (r0 == r1) goto L_0x0017
            java.lang.String r0 = "skipValue"
            org.bson.AbstractBsonReader$State[] r1 = new org.bson.AbstractBsonReader.State[]{r1}
            r6.U0(r0, r1)
        L_0x0017:
            int[] r0 = org.bson.BsonBinaryReader.AnonymousClass1.f43613b
            org.bson.BsonType r1 = r6.C1()
            int r1 = r1.ordinal()
            r0 = r0[r1]
            r1 = 1
            r2 = 12
            r3 = 4
            r4 = 8
            r5 = 0
            switch(r0) {
                case 1: goto L_0x0086;
                case 2: goto L_0x0080;
                case 3: goto L_0x008b;
                case 4: goto L_0x0051;
                case 5: goto L_0x007b;
                case 6: goto L_0x0051;
                case 7: goto L_0x0079;
                case 8: goto L_0x0051;
                case 9: goto L_0x0076;
                case 10: goto L_0x0071;
                case 11: goto L_0x006a;
                case 12: goto L_0x004f;
                case 13: goto L_0x004f;
                case 14: goto L_0x004f;
                case 15: goto L_0x0068;
                case 16: goto L_0x005d;
                case 17: goto L_0x0058;
                case 18: goto L_0x0053;
                case 19: goto L_0x0051;
                case 20: goto L_0x004f;
                case 21: goto L_0x0048;
                default: goto L_0x002d;
            }
        L_0x002d:
            org.bson.BSONException r0 = new org.bson.BSONException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Unexpected BSON type: "
            r1.append(r2)
            org.bson.BsonType r2 = r6.C1()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x0048:
            int r0 = r6.E1()
            int r1 = r0 + 12
            goto L_0x008b
        L_0x004f:
            r1 = r5
            goto L_0x008b
        L_0x0051:
            r1 = r4
            goto L_0x008b
        L_0x0053:
            int r1 = r6.E1()
            goto L_0x008b
        L_0x0058:
            int r1 = r6.E1()
            goto L_0x008b
        L_0x005d:
            org.bson.io.BsonInput r0 = r6.E
            r0.O0()
            org.bson.io.BsonInput r0 = r6.E
            r0.O0()
            goto L_0x004f
        L_0x0068:
            r1 = r2
            goto L_0x008b
        L_0x006a:
            int r0 = r6.E1()
        L_0x006e:
            int r1 = r0 + -4
            goto L_0x008b
        L_0x0071:
            int r1 = r6.E1()
            goto L_0x008b
        L_0x0076:
            r1 = 16
            goto L_0x008b
        L_0x0079:
            r1 = r3
            goto L_0x008b
        L_0x007b:
            int r0 = r6.E1()
            goto L_0x006e
        L_0x0080:
            int r0 = r6.E1()
            int r1 = r1 + r0
            goto L_0x008b
        L_0x0086:
            int r0 = r6.E1()
            goto L_0x006e
        L_0x008b:
            org.bson.io.BsonInput r0 = r6.E
            r0.B(r1)
            org.bson.AbstractBsonReader$State r0 = org.bson.AbstractBsonReader.State.TYPE
            r6.H0(r0)
            return
        L_0x0096:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "BSONBinaryWriter"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bson.BsonBinaryReader.o0():void");
    }

    /* renamed from: q1 */
    public Context s0() {
        return (Context) super.s0();
    }

    public BsonBinary r() {
        int E1 = E1();
        byte readByte = this.E.readByte();
        if (readByte == BsonBinarySubType.OLD_BINARY.d()) {
            if (this.E.i() == E1 - 4) {
                E1 -= 4;
            } else {
                throw new BsonSerializationException("Binary sub type OldBinary has inconsistent sizes");
            }
        }
        byte[] bArr = new byte[E1];
        this.E.z0(bArr);
        return new BsonBinary(readByte, bArr);
    }

    public boolean t() {
        byte readByte = this.E.readByte();
        if (readByte == 0 || readByte == 1) {
            return readByte == 1;
        }
        throw new BsonSerializationException(String.format("Expected a boolean value but found %d", new Object[]{Byte.valueOf(readByte)}));
    }

    public BsonType t1() {
        if (isClosed()) {
            throw new IllegalStateException("BSONBinaryWriter");
        } else if (w0() == AbstractBsonReader.State.INITIAL || w0() == AbstractBsonReader.State.DONE || w0() == AbstractBsonReader.State.SCOPE_DOCUMENT) {
            E0(BsonType.DOCUMENT);
            H0(AbstractBsonReader.State.VALUE);
            return C1();
        } else {
            AbstractBsonReader.State w0 = w0();
            AbstractBsonReader.State state = AbstractBsonReader.State.TYPE;
            if (w0 != state) {
                U0("ReadBSONType", state);
            }
            byte readByte = this.E.readByte();
            BsonType d2 = BsonType.d(readByte);
            if (d2 != null) {
                E0(d2);
                BsonType C1 = C1();
                BsonType bsonType = BsonType.END_OF_DOCUMENT;
                if (C1 == bsonType) {
                    int i2 = AnonymousClass1.f43612a[s0().c().ordinal()];
                    if (i2 == 1) {
                        H0(AbstractBsonReader.State.END_OF_ARRAY);
                        return bsonType;
                    } else if (i2 == 2 || i2 == 3) {
                        H0(AbstractBsonReader.State.END_OF_DOCUMENT);
                        return bsonType;
                    } else {
                        throw new BsonSerializationException(String.format("BSONType EndOfDocument is not valid when ContextType is %s.", new Object[]{s0().c()}));
                    }
                } else {
                    int i3 = AnonymousClass1.f43612a[s0().c().ordinal()];
                    if (i3 == 1) {
                        this.E.O0();
                        H0(AbstractBsonReader.State.VALUE);
                    } else if (i3 == 2 || i3 == 3) {
                        G0(this.E.k0());
                        H0(AbstractBsonReader.State.NAME);
                    } else {
                        throw new BSONException("Unexpected ContextType.");
                    }
                    return C1();
                }
            } else {
                throw new BsonSerializationException(String.format("Detected unknown BSON type \"\\x%x\" for fieldname \"%s\". Are you using the latest driver version?", new Object[]{Byte.valueOf(readByte), this.E.k0()}));
            }
        }
    }

    public void w1() {
        if (this.F == null) {
            this.F = new Mark();
            return;
        }
        throw new BSONException("A mark already exists; it needs to be reset before creating a new one");
    }

    public BsonDbPointer x() {
        return new BsonDbPointer(this.E.h(), this.E.w());
    }

    public long y() {
        return this.E.n();
    }
}
