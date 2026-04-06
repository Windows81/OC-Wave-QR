package org.bson;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.bson.AbstractBsonReader;
import org.bson.types.Decimal128;
import org.bson.types.ObjectId;

public class BsonDocumentReader extends AbstractBsonReader {
    public BsonValue E;

    /* renamed from: org.bson.BsonDocumentReader$1  reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f43640a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                org.bson.BsonContextType[] r0 = org.bson.BsonContextType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f43640a = r0
                org.bson.BsonContextType r1 = org.bson.BsonContextType.ARRAY     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f43640a     // Catch:{ NoSuchFieldError -> 0x001d }
                org.bson.BsonContextType r1 = org.bson.BsonContextType.DOCUMENT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f43640a     // Catch:{ NoSuchFieldError -> 0x0028 }
                org.bson.BsonContextType r1 = org.bson.BsonContextType.TOP_LEVEL     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: org.bson.BsonDocumentReader.AnonymousClass1.<clinit>():void");
        }
    }

    public static class BsonDocumentMarkableIterator<T> implements Iterator<T> {

        /* renamed from: A  reason: collision with root package name */
        public List f43641A = new ArrayList();

        /* renamed from: B  reason: collision with root package name */
        public int f43642B;
        public boolean C;

        /* renamed from: z  reason: collision with root package name */
        public Iterator f43643z;

        public BsonDocumentMarkableIterator(Iterator it) {
            this.f43643z = it;
            this.f43642B = 0;
            this.C = false;
        }

        public void b() {
            this.C = true;
        }

        public void c() {
            this.f43642B = 0;
            this.C = false;
        }

        public boolean hasNext() {
            return this.f43643z.hasNext() || this.f43642B < this.f43641A.size();
        }

        public Object next() {
            Object obj;
            if (this.f43642B < this.f43641A.size()) {
                obj = this.f43641A.get(this.f43642B);
                if (this.C) {
                    this.f43642B++;
                } else {
                    this.f43641A.remove(0);
                }
            } else {
                obj = this.f43643z.next();
                if (this.C) {
                    this.f43641A.add(obj);
                    this.f43642B++;
                }
            }
            return obj;
        }

        public void remove() {
        }
    }

    public class Mark extends AbstractBsonReader.Mark {

        /* renamed from: g  reason: collision with root package name */
        public final BsonValue f43647g;

        /* renamed from: h  reason: collision with root package name */
        public final Context f43648h;

        public Mark() {
            super();
            this.f43647g = BsonDocumentReader.this.E;
            Context q1 = BsonDocumentReader.this.s0();
            this.f43648h = q1;
            q1.g();
        }

        public void b() {
            super.b();
            BsonValue unused = BsonDocumentReader.this.E = this.f43647g;
            BsonDocumentReader.this.A0(this.f43648h);
            this.f43648h.h();
        }
    }

    public Decimal128 A() {
        return this.E.M().l0();
    }

    public double C() {
        return this.E.U().q0();
    }

    public void D() {
        A0(s0().d());
    }

    public void E() {
        A0(s0().d());
        int i2 = AnonymousClass1.f43640a[s0().c().ordinal()];
        if (i2 == 1 || i2 == 2) {
            H0(AbstractBsonReader.State.TYPE);
        } else if (i2 == 3) {
            H0(AbstractBsonReader.State.DONE);
        } else {
            throw new BSONException("Unexpected ContextType.");
        }
    }

    public int F() {
        return this.E.V().p0();
    }

    public long G() {
        return this.E.W().p0();
    }

    public String H() {
        return this.E.Y().l0();
    }

    public String I() {
        return this.E.Z().p0();
    }

    public void N() {
    }

    public void O() {
    }

    public void Q() {
    }

    public ObjectId S() {
        return this.E.a0().p0();
    }

    public BsonRegularExpression T() {
        return this.E.b0();
    }

    public void X() {
        A0(new Context(s0(), BsonContextType.ARRAY, this.E.n()));
    }

    public void c0() {
        A0(new Context(s0(), BsonContextType.DOCUMENT, this.E.j0() == BsonType.JAVASCRIPT_WITH_SCOPE ? this.E.Z().q0() : this.E.R()));
    }

    public String e0() {
        return this.E.d0().p0();
    }

    public String f0() {
        return this.E.h0().l0();
    }

    public BsonTimestamp g0() {
        return this.E.i0();
    }

    public int l() {
        return this.E.o().p0().length;
    }

    public byte m() {
        return this.E.o().q0();
    }

    public void m0() {
    }

    public BsonReaderMark m1() {
        return new Mark();
    }

    public void n0() {
    }

    public void o0() {
    }

    /* renamed from: q1 */
    public Context s0() {
        return (Context) super.s0();
    }

    public BsonBinary r() {
        return this.E.o();
    }

    public boolean t() {
        return this.E.p().p0();
    }

    public BsonType t1() {
        if (w0() == AbstractBsonReader.State.INITIAL || w0() == AbstractBsonReader.State.SCOPE_DOCUMENT) {
            E0(BsonType.DOCUMENT);
            H0(AbstractBsonReader.State.VALUE);
            return C1();
        }
        AbstractBsonReader.State w0 = w0();
        AbstractBsonReader.State state = AbstractBsonReader.State.TYPE;
        if (w0 != state) {
            U0("ReadBSONType", state);
        }
        int i2 = AnonymousClass1.f43640a[s0().c().ordinal()];
        if (i2 == 1) {
            BsonValue f2 = s0().f();
            this.E = f2;
            if (f2 == null) {
                H0(AbstractBsonReader.State.END_OF_ARRAY);
                return BsonType.END_OF_DOCUMENT;
            }
            H0(AbstractBsonReader.State.VALUE);
        } else if (i2 == 2) {
            Map.Entry e2 = s0().e();
            if (e2 == null) {
                H0(AbstractBsonReader.State.END_OF_DOCUMENT);
                return BsonType.END_OF_DOCUMENT;
            }
            G0((String) e2.getKey());
            this.E = (BsonValue) e2.getValue();
            H0(AbstractBsonReader.State.NAME);
        } else {
            throw new BSONException("Invalid ContextType.");
        }
        E0(this.E.j0());
        return C1();
    }

    public BsonDbPointer x() {
        return this.E.z();
    }

    public long y() {
        return this.E.B().p0();
    }

    public class Context extends AbstractBsonReader.Context {

        /* renamed from: d  reason: collision with root package name */
        public BsonDocumentMarkableIterator f43644d;

        /* renamed from: e  reason: collision with root package name */
        public BsonDocumentMarkableIterator f43645e;

        public Context(Context context, BsonContextType bsonContextType, BsonArray bsonArray) {
            super(context, bsonContextType);
            this.f43645e = new BsonDocumentMarkableIterator(bsonArray.iterator());
        }

        public Map.Entry e() {
            if (this.f43644d.hasNext()) {
                return (Map.Entry) this.f43644d.next();
            }
            return null;
        }

        public BsonValue f() {
            if (this.f43645e.hasNext()) {
                return (BsonValue) this.f43645e.next();
            }
            return null;
        }

        public void g() {
            BsonDocumentMarkableIterator bsonDocumentMarkableIterator = this.f43644d;
            if (bsonDocumentMarkableIterator != null) {
                bsonDocumentMarkableIterator.b();
            } else {
                this.f43645e.b();
            }
            if (d() != null) {
                ((Context) d()).g();
            }
        }

        public void h() {
            BsonDocumentMarkableIterator bsonDocumentMarkableIterator = this.f43644d;
            if (bsonDocumentMarkableIterator != null) {
                bsonDocumentMarkableIterator.c();
            } else {
                this.f43645e.c();
            }
            if (d() != null) {
                ((Context) d()).h();
            }
        }

        public Context(Context context, BsonContextType bsonContextType, BsonDocument bsonDocument) {
            super(context, bsonContextType);
            this.f43644d = new BsonDocumentMarkableIterator(bsonDocument.entrySet().iterator());
        }
    }
}
