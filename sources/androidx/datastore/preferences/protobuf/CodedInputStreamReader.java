package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.WireFormat;
import java.util.List;

@CheckReturnValue
final class CodedInputStreamReader implements Reader {

    /* renamed from: a  reason: collision with root package name */
    public final CodedInputStream f20835a;

    /* renamed from: b  reason: collision with root package name */
    public int f20836b;

    /* renamed from: c  reason: collision with root package name */
    public int f20837c;

    /* renamed from: d  reason: collision with root package name */
    public int f20838d = 0;

    /* renamed from: androidx.datastore.preferences.protobuf.CodedInputStreamReader$1  reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f20839a;

        /* JADX WARNING: Can't wrap try/catch for region: R(36:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|36) */
        /* JADX WARNING: Code restructure failed: missing block: B:37:?, code lost:
            return;
         */
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
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                androidx.datastore.preferences.protobuf.WireFormat$FieldType[] r0 = androidx.datastore.preferences.protobuf.WireFormat.FieldType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f20839a = r0
                androidx.datastore.preferences.protobuf.WireFormat$FieldType r1 = androidx.datastore.preferences.protobuf.WireFormat.FieldType.BOOL     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f20839a     // Catch:{ NoSuchFieldError -> 0x001d }
                androidx.datastore.preferences.protobuf.WireFormat$FieldType r1 = androidx.datastore.preferences.protobuf.WireFormat.FieldType.BYTES     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f20839a     // Catch:{ NoSuchFieldError -> 0x0028 }
                androidx.datastore.preferences.protobuf.WireFormat$FieldType r1 = androidx.datastore.preferences.protobuf.WireFormat.FieldType.DOUBLE     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f20839a     // Catch:{ NoSuchFieldError -> 0x0033 }
                androidx.datastore.preferences.protobuf.WireFormat$FieldType r1 = androidx.datastore.preferences.protobuf.WireFormat.FieldType.ENUM     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f20839a     // Catch:{ NoSuchFieldError -> 0x003e }
                androidx.datastore.preferences.protobuf.WireFormat$FieldType r1 = androidx.datastore.preferences.protobuf.WireFormat.FieldType.FIXED32     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f20839a     // Catch:{ NoSuchFieldError -> 0x0049 }
                androidx.datastore.preferences.protobuf.WireFormat$FieldType r1 = androidx.datastore.preferences.protobuf.WireFormat.FieldType.FIXED64     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f20839a     // Catch:{ NoSuchFieldError -> 0x0054 }
                androidx.datastore.preferences.protobuf.WireFormat$FieldType r1 = androidx.datastore.preferences.protobuf.WireFormat.FieldType.FLOAT     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r0 = f20839a     // Catch:{ NoSuchFieldError -> 0x0060 }
                androidx.datastore.preferences.protobuf.WireFormat$FieldType r1 = androidx.datastore.preferences.protobuf.WireFormat.FieldType.INT32     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                int[] r0 = f20839a     // Catch:{ NoSuchFieldError -> 0x006c }
                androidx.datastore.preferences.protobuf.WireFormat$FieldType r1 = androidx.datastore.preferences.protobuf.WireFormat.FieldType.INT64     // Catch:{ NoSuchFieldError -> 0x006c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006c }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006c }
            L_0x006c:
                int[] r0 = f20839a     // Catch:{ NoSuchFieldError -> 0x0078 }
                androidx.datastore.preferences.protobuf.WireFormat$FieldType r1 = androidx.datastore.preferences.protobuf.WireFormat.FieldType.MESSAGE     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r2 = 10
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                int[] r0 = f20839a     // Catch:{ NoSuchFieldError -> 0x0084 }
                androidx.datastore.preferences.protobuf.WireFormat$FieldType r1 = androidx.datastore.preferences.protobuf.WireFormat.FieldType.SFIXED32     // Catch:{ NoSuchFieldError -> 0x0084 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0084 }
                r2 = 11
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0084 }
            L_0x0084:
                int[] r0 = f20839a     // Catch:{ NoSuchFieldError -> 0x0090 }
                androidx.datastore.preferences.protobuf.WireFormat$FieldType r1 = androidx.datastore.preferences.protobuf.WireFormat.FieldType.SFIXED64     // Catch:{ NoSuchFieldError -> 0x0090 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0090 }
                r2 = 12
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0090 }
            L_0x0090:
                int[] r0 = f20839a     // Catch:{ NoSuchFieldError -> 0x009c }
                androidx.datastore.preferences.protobuf.WireFormat$FieldType r1 = androidx.datastore.preferences.protobuf.WireFormat.FieldType.SINT32     // Catch:{ NoSuchFieldError -> 0x009c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x009c }
                r2 = 13
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x009c }
            L_0x009c:
                int[] r0 = f20839a     // Catch:{ NoSuchFieldError -> 0x00a8 }
                androidx.datastore.preferences.protobuf.WireFormat$FieldType r1 = androidx.datastore.preferences.protobuf.WireFormat.FieldType.SINT64     // Catch:{ NoSuchFieldError -> 0x00a8 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00a8 }
                r2 = 14
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00a8 }
            L_0x00a8:
                int[] r0 = f20839a     // Catch:{ NoSuchFieldError -> 0x00b4 }
                androidx.datastore.preferences.protobuf.WireFormat$FieldType r1 = androidx.datastore.preferences.protobuf.WireFormat.FieldType.STRING     // Catch:{ NoSuchFieldError -> 0x00b4 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00b4 }
                r2 = 15
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00b4 }
            L_0x00b4:
                int[] r0 = f20839a     // Catch:{ NoSuchFieldError -> 0x00c0 }
                androidx.datastore.preferences.protobuf.WireFormat$FieldType r1 = androidx.datastore.preferences.protobuf.WireFormat.FieldType.UINT32     // Catch:{ NoSuchFieldError -> 0x00c0 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00c0 }
                r2 = 16
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00c0 }
            L_0x00c0:
                int[] r0 = f20839a     // Catch:{ NoSuchFieldError -> 0x00cc }
                androidx.datastore.preferences.protobuf.WireFormat$FieldType r1 = androidx.datastore.preferences.protobuf.WireFormat.FieldType.UINT64     // Catch:{ NoSuchFieldError -> 0x00cc }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00cc }
                r2 = 17
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00cc }
            L_0x00cc:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.CodedInputStreamReader.AnonymousClass1.<clinit>():void");
        }
    }

    public CodedInputStreamReader(CodedInputStream codedInputStream) {
        CodedInputStream codedInputStream2 = (CodedInputStream) Internal.b(codedInputStream, "input");
        this.f20835a = codedInputStream2;
        codedInputStream2.f20787d = this;
    }

    public static CodedInputStreamReader a(CodedInputStream codedInputStream) {
        CodedInputStreamReader codedInputStreamReader = codedInputStream.f20787d;
        return codedInputStreamReader != null ? codedInputStreamReader : new CodedInputStreamReader(codedInputStream);
    }

    private Object d(WireFormat.FieldType fieldType, Class cls, ExtensionRegistryLite extensionRegistryLite) {
        switch (AnonymousClass1.f20839a[fieldType.ordinal()]) {
            case 1:
                return Boolean.valueOf(v());
            case 2:
                return M();
            case 3:
                return Double.valueOf(readDouble());
            case 4:
                return Integer.valueOf(D());
            case 5:
                return Integer.valueOf(u());
            case 6:
                return Long.valueOf(q());
            case 7:
                return Float.valueOf(readFloat());
            case 8:
                return Integer.valueOf(i());
            case 9:
                return Long.valueOf(n());
            case 10:
                return U(cls, extensionRegistryLite);
            case 11:
                return Integer.valueOf(P());
            case 12:
                return Long.valueOf(w());
            case 13:
                return Integer.valueOf(G());
            case 14:
                return Long.valueOf(H());
            case 15:
                return S();
            case 16:
                return Integer.valueOf(y());
            case 17:
                return Long.valueOf(p());
            default:
                throw new IllegalArgumentException("unsupported field type.");
        }
    }

    private Object e(Schema schema, ExtensionRegistryLite extensionRegistryLite) {
        Object g2 = schema.g();
        b(g2, schema, extensionRegistryLite);
        schema.d(g2);
        return g2;
    }

    private Object f(Schema schema, ExtensionRegistryLite extensionRegistryLite) {
        Object g2 = schema.g();
        c(g2, schema, extensionRegistryLite);
        schema.d(g2);
        return g2;
    }

    private void j(int i2) {
        if (this.f20835a.e() != i2) {
            throw InvalidProtocolBufferException.m();
        }
    }

    private void k(int i2) {
        if (WireFormat.b(this.f20836b) != i2) {
            throw InvalidProtocolBufferException.e();
        }
    }

    private void l(int i2) {
        if ((i2 & 3) != 0) {
            throw InvalidProtocolBufferException.h();
        }
    }

    private void m(int i2) {
        if ((i2 & 7) != 0) {
            throw InvalidProtocolBufferException.h();
        }
    }

    public void A(List list) {
        int E;
        int E2;
        if (list instanceof LongArrayList) {
            LongArrayList longArrayList = (LongArrayList) list;
            int b2 = WireFormat.b(this.f20836b);
            if (b2 == 1) {
                do {
                    longArrayList.m(this.f20835a.z());
                    if (!this.f20835a.f()) {
                        E2 = this.f20835a.E();
                    } else {
                        return;
                    }
                } while (E2 == this.f20836b);
                this.f20838d = E2;
            } else if (b2 == 2) {
                int F = this.f20835a.F();
                m(F);
                int e2 = this.f20835a.e() + F;
                do {
                    longArrayList.m(this.f20835a.z());
                } while (this.f20835a.e() < e2);
            } else {
                throw InvalidProtocolBufferException.e();
            }
        } else {
            int b3 = WireFormat.b(this.f20836b);
            if (b3 == 1) {
                do {
                    list.add(Long.valueOf(this.f20835a.z()));
                    if (!this.f20835a.f()) {
                        E = this.f20835a.E();
                    } else {
                        return;
                    }
                } while (E == this.f20836b);
                this.f20838d = E;
            } else if (b3 == 2) {
                int F2 = this.f20835a.F();
                m(F2);
                int e3 = this.f20835a.e() + F2;
                do {
                    list.add(Long.valueOf(this.f20835a.z()));
                } while (this.f20835a.e() < e3);
            } else {
                throw InvalidProtocolBufferException.e();
            }
        }
    }

    public void B(List list) {
        int E;
        int E2;
        if (list instanceof IntArrayList) {
            IntArrayList intArrayList = (IntArrayList) list;
            int b2 = WireFormat.b(this.f20836b);
            if (b2 == 0) {
                do {
                    intArrayList.g0(this.f20835a.w());
                    if (!this.f20835a.f()) {
                        E2 = this.f20835a.E();
                    } else {
                        return;
                    }
                } while (E2 == this.f20836b);
                this.f20838d = E2;
            } else if (b2 == 2) {
                int e2 = this.f20835a.e() + this.f20835a.F();
                do {
                    intArrayList.g0(this.f20835a.w());
                } while (this.f20835a.e() < e2);
                j(e2);
            } else {
                throw InvalidProtocolBufferException.e();
            }
        } else {
            int b3 = WireFormat.b(this.f20836b);
            if (b3 == 0) {
                do {
                    list.add(Integer.valueOf(this.f20835a.w()));
                    if (!this.f20835a.f()) {
                        E = this.f20835a.E();
                    } else {
                        return;
                    }
                } while (E == this.f20836b);
                this.f20838d = E;
            } else if (b3 == 2) {
                int e3 = this.f20835a.e() + this.f20835a.F();
                do {
                    list.add(Integer.valueOf(this.f20835a.w()));
                } while (this.f20835a.e() < e3);
                j(e3);
            } else {
                throw InvalidProtocolBufferException.e();
            }
        }
    }

    public void C(List list) {
        int E;
        int E2;
        if (list instanceof IntArrayList) {
            IntArrayList intArrayList = (IntArrayList) list;
            int b2 = WireFormat.b(this.f20836b);
            if (b2 == 0) {
                do {
                    intArrayList.g0(this.f20835a.s());
                    if (!this.f20835a.f()) {
                        E2 = this.f20835a.E();
                    } else {
                        return;
                    }
                } while (E2 == this.f20836b);
                this.f20838d = E2;
            } else if (b2 == 2) {
                int e2 = this.f20835a.e() + this.f20835a.F();
                do {
                    intArrayList.g0(this.f20835a.s());
                } while (this.f20835a.e() < e2);
                j(e2);
            } else {
                throw InvalidProtocolBufferException.e();
            }
        } else {
            int b3 = WireFormat.b(this.f20836b);
            if (b3 == 0) {
                do {
                    list.add(Integer.valueOf(this.f20835a.s()));
                    if (!this.f20835a.f()) {
                        E = this.f20835a.E();
                    } else {
                        return;
                    }
                } while (E == this.f20836b);
                this.f20838d = E;
            } else if (b3 == 2) {
                int e3 = this.f20835a.e() + this.f20835a.F();
                do {
                    list.add(Integer.valueOf(this.f20835a.s()));
                } while (this.f20835a.e() < e3);
                j(e3);
            } else {
                throw InvalidProtocolBufferException.e();
            }
        }
    }

    public int D() {
        k(0);
        return this.f20835a.s();
    }

    public int E() {
        return this.f20836b;
    }

    public void F(List list) {
        int E;
        int E2;
        if (list instanceof IntArrayList) {
            IntArrayList intArrayList = (IntArrayList) list;
            int b2 = WireFormat.b(this.f20836b);
            if (b2 == 2) {
                int F = this.f20835a.F();
                l(F);
                int e2 = this.f20835a.e() + F;
                do {
                    intArrayList.g0(this.f20835a.t());
                } while (this.f20835a.e() < e2);
            } else if (b2 == 5) {
                do {
                    intArrayList.g0(this.f20835a.t());
                    if (!this.f20835a.f()) {
                        E2 = this.f20835a.E();
                    } else {
                        return;
                    }
                } while (E2 == this.f20836b);
                this.f20838d = E2;
            } else {
                throw InvalidProtocolBufferException.e();
            }
        } else {
            int b3 = WireFormat.b(this.f20836b);
            if (b3 == 2) {
                int F2 = this.f20835a.F();
                l(F2);
                int e3 = this.f20835a.e() + F2;
                do {
                    list.add(Integer.valueOf(this.f20835a.t()));
                } while (this.f20835a.e() < e3);
            } else if (b3 == 5) {
                do {
                    list.add(Integer.valueOf(this.f20835a.t()));
                    if (!this.f20835a.f()) {
                        E = this.f20835a.E();
                    } else {
                        return;
                    }
                } while (E == this.f20836b);
                this.f20838d = E;
            } else {
                throw InvalidProtocolBufferException.e();
            }
        }
    }

    public int G() {
        k(0);
        return this.f20835a.A();
    }

    public long H() {
        k(0);
        return this.f20835a.B();
    }

    public void I(List list) {
        int E;
        int E2;
        if (list instanceof BooleanArrayList) {
            BooleanArrayList booleanArrayList = (BooleanArrayList) list;
            int b2 = WireFormat.b(this.f20836b);
            if (b2 == 0) {
                do {
                    booleanArrayList.m(this.f20835a.p());
                    if (!this.f20835a.f()) {
                        E2 = this.f20835a.E();
                    } else {
                        return;
                    }
                } while (E2 == this.f20836b);
                this.f20838d = E2;
            } else if (b2 == 2) {
                int e2 = this.f20835a.e() + this.f20835a.F();
                do {
                    booleanArrayList.m(this.f20835a.p());
                } while (this.f20835a.e() < e2);
                j(e2);
            } else {
                throw InvalidProtocolBufferException.e();
            }
        } else {
            int b3 = WireFormat.b(this.f20836b);
            if (b3 == 0) {
                do {
                    list.add(Boolean.valueOf(this.f20835a.p()));
                    if (!this.f20835a.f()) {
                        E = this.f20835a.E();
                    } else {
                        return;
                    }
                } while (E == this.f20836b);
                this.f20838d = E;
            } else if (b3 == 2) {
                int e3 = this.f20835a.e() + this.f20835a.F();
                do {
                    list.add(Boolean.valueOf(this.f20835a.p()));
                } while (this.f20835a.e() < e3);
                j(e3);
            } else {
                throw InvalidProtocolBufferException.e();
            }
        }
    }

    public int J() {
        int i2 = this.f20838d;
        if (i2 != 0) {
            this.f20836b = i2;
            this.f20838d = 0;
        } else {
            this.f20836b = this.f20835a.E();
        }
        int i3 = this.f20836b;
        if (i3 == 0 || i3 == this.f20837c) {
            return Integer.MAX_VALUE;
        }
        return WireFormat.a(i3);
    }

    public void K(List list) {
        g(list, false);
    }

    public void L(List list) {
        g(list, true);
    }

    public ByteString M() {
        k(2);
        return this.f20835a.q();
    }

    public void N(List list) {
        int E;
        int E2;
        if (list instanceof FloatArrayList) {
            FloatArrayList floatArrayList = (FloatArrayList) list;
            int b2 = WireFormat.b(this.f20836b);
            if (b2 == 2) {
                int F = this.f20835a.F();
                l(F);
                int e2 = this.f20835a.e() + F;
                do {
                    floatArrayList.i(this.f20835a.v());
                } while (this.f20835a.e() < e2);
            } else if (b2 == 5) {
                do {
                    floatArrayList.i(this.f20835a.v());
                    if (!this.f20835a.f()) {
                        E2 = this.f20835a.E();
                    } else {
                        return;
                    }
                } while (E2 == this.f20836b);
                this.f20838d = E2;
            } else {
                throw InvalidProtocolBufferException.e();
            }
        } else {
            int b3 = WireFormat.b(this.f20836b);
            if (b3 == 2) {
                int F2 = this.f20835a.F();
                l(F2);
                int e3 = this.f20835a.e() + F2;
                do {
                    list.add(Float.valueOf(this.f20835a.v()));
                } while (this.f20835a.e() < e3);
            } else if (b3 == 5) {
                do {
                    list.add(Float.valueOf(this.f20835a.v()));
                    if (!this.f20835a.f()) {
                        E = this.f20835a.E();
                    } else {
                        return;
                    }
                } while (E == this.f20836b);
                this.f20838d = E;
            } else {
                throw InvalidProtocolBufferException.e();
            }
        }
    }

    public boolean O() {
        int i2;
        if (this.f20835a.f() || (i2 = this.f20836b) == this.f20837c) {
            return false;
        }
        return this.f20835a.H(i2);
    }

    public int P() {
        k(5);
        return this.f20835a.y();
    }

    public void Q(List list) {
        int E;
        if (WireFormat.b(this.f20836b) == 2) {
            do {
                list.add(M());
                if (!this.f20835a.f()) {
                    E = this.f20835a.E();
                } else {
                    return;
                }
            } while (E == this.f20836b);
            this.f20838d = E;
            return;
        }
        throw InvalidProtocolBufferException.e();
    }

    public void R(List list) {
        int E;
        int E2;
        if (list instanceof DoubleArrayList) {
            DoubleArrayList doubleArrayList = (DoubleArrayList) list;
            int b2 = WireFormat.b(this.f20836b);
            if (b2 == 1) {
                do {
                    doubleArrayList.i(this.f20835a.r());
                    if (!this.f20835a.f()) {
                        E2 = this.f20835a.E();
                    } else {
                        return;
                    }
                } while (E2 == this.f20836b);
                this.f20838d = E2;
            } else if (b2 == 2) {
                int F = this.f20835a.F();
                m(F);
                int e2 = this.f20835a.e() + F;
                do {
                    doubleArrayList.i(this.f20835a.r());
                } while (this.f20835a.e() < e2);
            } else {
                throw InvalidProtocolBufferException.e();
            }
        } else {
            int b3 = WireFormat.b(this.f20836b);
            if (b3 == 1) {
                do {
                    list.add(Double.valueOf(this.f20835a.r()));
                    if (!this.f20835a.f()) {
                        E = this.f20835a.E();
                    } else {
                        return;
                    }
                } while (E == this.f20836b);
                this.f20838d = E;
            } else if (b3 == 2) {
                int F2 = this.f20835a.F();
                m(F2);
                int e3 = this.f20835a.e() + F2;
                do {
                    list.add(Double.valueOf(this.f20835a.r()));
                } while (this.f20835a.e() < e3);
            } else {
                throw InvalidProtocolBufferException.e();
            }
        }
    }

    public String S() {
        k(2);
        return this.f20835a.D();
    }

    public void T(List list) {
        int E;
        int E2;
        if (list instanceof LongArrayList) {
            LongArrayList longArrayList = (LongArrayList) list;
            int b2 = WireFormat.b(this.f20836b);
            if (b2 == 1) {
                do {
                    longArrayList.m(this.f20835a.u());
                    if (!this.f20835a.f()) {
                        E2 = this.f20835a.E();
                    } else {
                        return;
                    }
                } while (E2 == this.f20836b);
                this.f20838d = E2;
            } else if (b2 == 2) {
                int F = this.f20835a.F();
                m(F);
                int e2 = this.f20835a.e() + F;
                do {
                    longArrayList.m(this.f20835a.u());
                } while (this.f20835a.e() < e2);
            } else {
                throw InvalidProtocolBufferException.e();
            }
        } else {
            int b3 = WireFormat.b(this.f20836b);
            if (b3 == 1) {
                do {
                    list.add(Long.valueOf(this.f20835a.u()));
                    if (!this.f20835a.f()) {
                        E = this.f20835a.E();
                    } else {
                        return;
                    }
                } while (E == this.f20836b);
                this.f20838d = E;
            } else if (b3 == 2) {
                int F2 = this.f20835a.F();
                m(F2);
                int e3 = this.f20835a.e() + F2;
                do {
                    list.add(Long.valueOf(this.f20835a.u()));
                } while (this.f20835a.e() < e3);
            } else {
                throw InvalidProtocolBufferException.e();
            }
        }
    }

    public Object U(Class cls, ExtensionRegistryLite extensionRegistryLite) {
        k(2);
        return f(Protobuf.a().c(cls), extensionRegistryLite);
    }

    public Object V(Class cls, ExtensionRegistryLite extensionRegistryLite) {
        k(3);
        return e(Protobuf.a().c(cls), extensionRegistryLite);
    }

    public void W(Object obj, Schema schema, ExtensionRegistryLite extensionRegistryLite) {
        k(2);
        c(obj, schema, extensionRegistryLite);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0055, code lost:
        if (O() != false) goto L_0x0057;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x005d, code lost:
        throw new androidx.datastore.preferences.protobuf.InvalidProtocolBufferException(r6);
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0051 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void X(java.util.Map r8, androidx.datastore.preferences.protobuf.MapEntryLite.Metadata r9, androidx.datastore.preferences.protobuf.ExtensionRegistryLite r10) {
        /*
            r7 = this;
            r0 = 2
            r7.k(r0)
            androidx.datastore.preferences.protobuf.CodedInputStream r1 = r7.f20835a
            int r1 = r1.F()
            androidx.datastore.preferences.protobuf.CodedInputStream r2 = r7.f20835a
            int r1 = r2.o(r1)
            java.lang.Object r2 = r9.f21061b
            java.lang.Object r3 = r9.f21063d
        L_0x0014:
            int r4 = r7.J()     // Catch:{ all -> 0x003a }
            r5 = 2147483647(0x7fffffff, float:NaN)
            if (r4 == r5) goto L_0x005e
            androidx.datastore.preferences.protobuf.CodedInputStream r5 = r7.f20835a     // Catch:{ all -> 0x003a }
            boolean r5 = r5.f()     // Catch:{ all -> 0x003a }
            if (r5 == 0) goto L_0x0026
            goto L_0x005e
        L_0x0026:
            r5 = 1
            java.lang.String r6 = "Unable to parse map entry."
            if (r4 == r5) goto L_0x0049
            if (r4 == r0) goto L_0x003c
            boolean r4 = r7.O()     // Catch:{ InvalidWireTypeException -> 0x0051 }
            if (r4 == 0) goto L_0x0034
            goto L_0x0014
        L_0x0034:
            androidx.datastore.preferences.protobuf.InvalidProtocolBufferException r4 = new androidx.datastore.preferences.protobuf.InvalidProtocolBufferException     // Catch:{ InvalidWireTypeException -> 0x0051 }
            r4.<init>((java.lang.String) r6)     // Catch:{ InvalidWireTypeException -> 0x0051 }
            throw r4     // Catch:{ InvalidWireTypeException -> 0x0051 }
        L_0x003a:
            r8 = move-exception
            goto L_0x0067
        L_0x003c:
            androidx.datastore.preferences.protobuf.WireFormat$FieldType r4 = r9.f21062c     // Catch:{ InvalidWireTypeException -> 0x0051 }
            java.lang.Object r5 = r9.f21063d     // Catch:{ InvalidWireTypeException -> 0x0051 }
            java.lang.Class r5 = r5.getClass()     // Catch:{ InvalidWireTypeException -> 0x0051 }
            java.lang.Object r3 = r7.d(r4, r5, r10)     // Catch:{ InvalidWireTypeException -> 0x0051 }
            goto L_0x0014
        L_0x0049:
            androidx.datastore.preferences.protobuf.WireFormat$FieldType r4 = r9.f21060a     // Catch:{ InvalidWireTypeException -> 0x0051 }
            r5 = 0
            java.lang.Object r2 = r7.d(r4, r5, r5)     // Catch:{ InvalidWireTypeException -> 0x0051 }
            goto L_0x0014
        L_0x0051:
            boolean r4 = r7.O()     // Catch:{ all -> 0x003a }
            if (r4 == 0) goto L_0x0058
            goto L_0x0014
        L_0x0058:
            androidx.datastore.preferences.protobuf.InvalidProtocolBufferException r8 = new androidx.datastore.preferences.protobuf.InvalidProtocolBufferException     // Catch:{ all -> 0x003a }
            r8.<init>((java.lang.String) r6)     // Catch:{ all -> 0x003a }
            throw r8     // Catch:{ all -> 0x003a }
        L_0x005e:
            r8.put(r2, r3)     // Catch:{ all -> 0x003a }
            androidx.datastore.preferences.protobuf.CodedInputStream r8 = r7.f20835a
            r8.n(r1)
            return
        L_0x0067:
            androidx.datastore.preferences.protobuf.CodedInputStream r9 = r7.f20835a
            r9.n(r1)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.CodedInputStreamReader.X(java.util.Map, androidx.datastore.preferences.protobuf.MapEntryLite$Metadata, androidx.datastore.preferences.protobuf.ExtensionRegistryLite):void");
    }

    public void Y(Object obj, Schema schema, ExtensionRegistryLite extensionRegistryLite) {
        k(3);
        b(obj, schema, extensionRegistryLite);
    }

    public void Z(List list, Schema schema, ExtensionRegistryLite extensionRegistryLite) {
        int E;
        if (WireFormat.b(this.f20836b) == 3) {
            int i2 = this.f20836b;
            do {
                list.add(e(schema, extensionRegistryLite));
                if (!this.f20835a.f() && this.f20838d == 0) {
                    E = this.f20835a.E();
                } else {
                    return;
                }
            } while (E == i2);
            this.f20838d = E;
            return;
        }
        throw InvalidProtocolBufferException.e();
    }

    public void a0(List list, Schema schema, ExtensionRegistryLite extensionRegistryLite) {
        int E;
        if (WireFormat.b(this.f20836b) == 2) {
            int i2 = this.f20836b;
            do {
                list.add(f(schema, extensionRegistryLite));
                if (!this.f20835a.f() && this.f20838d == 0) {
                    E = this.f20835a.E();
                } else {
                    return;
                }
            } while (E == i2);
            this.f20838d = E;
            return;
        }
        throw InvalidProtocolBufferException.e();
    }

    public final void b(Object obj, Schema schema, ExtensionRegistryLite extensionRegistryLite) {
        int i2 = this.f20837c;
        this.f20837c = WireFormat.c(WireFormat.a(this.f20836b), 4);
        try {
            schema.h(obj, this, extensionRegistryLite);
            if (this.f20836b != this.f20837c) {
                throw InvalidProtocolBufferException.h();
            }
        } finally {
            this.f20837c = i2;
        }
    }

    public final void c(Object obj, Schema schema, ExtensionRegistryLite extensionRegistryLite) {
        int F = this.f20835a.F();
        CodedInputStream codedInputStream = this.f20835a;
        if (codedInputStream.f20784a < codedInputStream.f20785b) {
            int o2 = codedInputStream.o(F);
            this.f20835a.f20784a++;
            schema.h(obj, this, extensionRegistryLite);
            this.f20835a.a(0);
            CodedInputStream codedInputStream2 = this.f20835a;
            codedInputStream2.f20784a--;
            codedInputStream2.n(o2);
            return;
        }
        throw InvalidProtocolBufferException.i();
    }

    public void g(List list, boolean z2) {
        int E;
        int E2;
        if (WireFormat.b(this.f20836b) != 2) {
            throw InvalidProtocolBufferException.e();
        } else if (!(list instanceof LazyStringList) || z2) {
            do {
                list.add(z2 ? S() : h());
                if (!this.f20835a.f()) {
                    E = this.f20835a.E();
                } else {
                    return;
                }
            } while (E == this.f20836b);
            this.f20838d = E;
        } else {
            LazyStringList lazyStringList = (LazyStringList) list;
            do {
                lazyStringList.s0(M());
                if (!this.f20835a.f()) {
                    E2 = this.f20835a.E();
                } else {
                    return;
                }
            } while (E2 == this.f20836b);
            this.f20838d = E2;
        }
    }

    public String h() {
        k(2);
        return this.f20835a.C();
    }

    public int i() {
        k(0);
        return this.f20835a.w();
    }

    public long n() {
        k(0);
        return this.f20835a.x();
    }

    public void o(List list) {
        int E;
        int E2;
        if (list instanceof IntArrayList) {
            IntArrayList intArrayList = (IntArrayList) list;
            int b2 = WireFormat.b(this.f20836b);
            if (b2 == 0) {
                do {
                    intArrayList.g0(this.f20835a.A());
                    if (!this.f20835a.f()) {
                        E2 = this.f20835a.E();
                    } else {
                        return;
                    }
                } while (E2 == this.f20836b);
                this.f20838d = E2;
            } else if (b2 == 2) {
                int e2 = this.f20835a.e() + this.f20835a.F();
                do {
                    intArrayList.g0(this.f20835a.A());
                } while (this.f20835a.e() < e2);
                j(e2);
            } else {
                throw InvalidProtocolBufferException.e();
            }
        } else {
            int b3 = WireFormat.b(this.f20836b);
            if (b3 == 0) {
                do {
                    list.add(Integer.valueOf(this.f20835a.A()));
                    if (!this.f20835a.f()) {
                        E = this.f20835a.E();
                    } else {
                        return;
                    }
                } while (E == this.f20836b);
                this.f20838d = E;
            } else if (b3 == 2) {
                int e3 = this.f20835a.e() + this.f20835a.F();
                do {
                    list.add(Integer.valueOf(this.f20835a.A()));
                } while (this.f20835a.e() < e3);
                j(e3);
            } else {
                throw InvalidProtocolBufferException.e();
            }
        }
    }

    public long p() {
        k(0);
        return this.f20835a.G();
    }

    public long q() {
        k(1);
        return this.f20835a.u();
    }

    public void r(List list) {
        int E;
        int E2;
        if (list instanceof IntArrayList) {
            IntArrayList intArrayList = (IntArrayList) list;
            int b2 = WireFormat.b(this.f20836b);
            if (b2 == 2) {
                int F = this.f20835a.F();
                l(F);
                int e2 = this.f20835a.e() + F;
                do {
                    intArrayList.g0(this.f20835a.y());
                } while (this.f20835a.e() < e2);
            } else if (b2 == 5) {
                do {
                    intArrayList.g0(this.f20835a.y());
                    if (!this.f20835a.f()) {
                        E2 = this.f20835a.E();
                    } else {
                        return;
                    }
                } while (E2 == this.f20836b);
                this.f20838d = E2;
            } else {
                throw InvalidProtocolBufferException.e();
            }
        } else {
            int b3 = WireFormat.b(this.f20836b);
            if (b3 == 2) {
                int F2 = this.f20835a.F();
                l(F2);
                int e3 = this.f20835a.e() + F2;
                do {
                    list.add(Integer.valueOf(this.f20835a.y()));
                } while (this.f20835a.e() < e3);
            } else if (b3 == 5) {
                do {
                    list.add(Integer.valueOf(this.f20835a.y()));
                    if (!this.f20835a.f()) {
                        E = this.f20835a.E();
                    } else {
                        return;
                    }
                } while (E == this.f20836b);
                this.f20838d = E;
            } else {
                throw InvalidProtocolBufferException.e();
            }
        }
    }

    public double readDouble() {
        k(1);
        return this.f20835a.r();
    }

    public float readFloat() {
        k(5);
        return this.f20835a.v();
    }

    public void s(List list) {
        int E;
        int E2;
        if (list instanceof LongArrayList) {
            LongArrayList longArrayList = (LongArrayList) list;
            int b2 = WireFormat.b(this.f20836b);
            if (b2 == 0) {
                do {
                    longArrayList.m(this.f20835a.B());
                    if (!this.f20835a.f()) {
                        E2 = this.f20835a.E();
                    } else {
                        return;
                    }
                } while (E2 == this.f20836b);
                this.f20838d = E2;
            } else if (b2 == 2) {
                int e2 = this.f20835a.e() + this.f20835a.F();
                do {
                    longArrayList.m(this.f20835a.B());
                } while (this.f20835a.e() < e2);
                j(e2);
            } else {
                throw InvalidProtocolBufferException.e();
            }
        } else {
            int b3 = WireFormat.b(this.f20836b);
            if (b3 == 0) {
                do {
                    list.add(Long.valueOf(this.f20835a.B()));
                    if (!this.f20835a.f()) {
                        E = this.f20835a.E();
                    } else {
                        return;
                    }
                } while (E == this.f20836b);
                this.f20838d = E;
            } else if (b3 == 2) {
                int e3 = this.f20835a.e() + this.f20835a.F();
                do {
                    list.add(Long.valueOf(this.f20835a.B()));
                } while (this.f20835a.e() < e3);
                j(e3);
            } else {
                throw InvalidProtocolBufferException.e();
            }
        }
    }

    public void t(List list) {
        int E;
        int E2;
        if (list instanceof IntArrayList) {
            IntArrayList intArrayList = (IntArrayList) list;
            int b2 = WireFormat.b(this.f20836b);
            if (b2 == 0) {
                do {
                    intArrayList.g0(this.f20835a.F());
                    if (!this.f20835a.f()) {
                        E2 = this.f20835a.E();
                    } else {
                        return;
                    }
                } while (E2 == this.f20836b);
                this.f20838d = E2;
            } else if (b2 == 2) {
                int e2 = this.f20835a.e() + this.f20835a.F();
                do {
                    intArrayList.g0(this.f20835a.F());
                } while (this.f20835a.e() < e2);
                j(e2);
            } else {
                throw InvalidProtocolBufferException.e();
            }
        } else {
            int b3 = WireFormat.b(this.f20836b);
            if (b3 == 0) {
                do {
                    list.add(Integer.valueOf(this.f20835a.F()));
                    if (!this.f20835a.f()) {
                        E = this.f20835a.E();
                    } else {
                        return;
                    }
                } while (E == this.f20836b);
                this.f20838d = E;
            } else if (b3 == 2) {
                int e3 = this.f20835a.e() + this.f20835a.F();
                do {
                    list.add(Integer.valueOf(this.f20835a.F()));
                } while (this.f20835a.e() < e3);
                j(e3);
            } else {
                throw InvalidProtocolBufferException.e();
            }
        }
    }

    public int u() {
        k(5);
        return this.f20835a.t();
    }

    public boolean v() {
        k(0);
        return this.f20835a.p();
    }

    public long w() {
        k(1);
        return this.f20835a.z();
    }

    public void x(List list) {
        int E;
        int E2;
        if (list instanceof LongArrayList) {
            LongArrayList longArrayList = (LongArrayList) list;
            int b2 = WireFormat.b(this.f20836b);
            if (b2 == 0) {
                do {
                    longArrayList.m(this.f20835a.G());
                    if (!this.f20835a.f()) {
                        E2 = this.f20835a.E();
                    } else {
                        return;
                    }
                } while (E2 == this.f20836b);
                this.f20838d = E2;
            } else if (b2 == 2) {
                int e2 = this.f20835a.e() + this.f20835a.F();
                do {
                    longArrayList.m(this.f20835a.G());
                } while (this.f20835a.e() < e2);
                j(e2);
            } else {
                throw InvalidProtocolBufferException.e();
            }
        } else {
            int b3 = WireFormat.b(this.f20836b);
            if (b3 == 0) {
                do {
                    list.add(Long.valueOf(this.f20835a.G()));
                    if (!this.f20835a.f()) {
                        E = this.f20835a.E();
                    } else {
                        return;
                    }
                } while (E == this.f20836b);
                this.f20838d = E;
            } else if (b3 == 2) {
                int e3 = this.f20835a.e() + this.f20835a.F();
                do {
                    list.add(Long.valueOf(this.f20835a.G()));
                } while (this.f20835a.e() < e3);
                j(e3);
            } else {
                throw InvalidProtocolBufferException.e();
            }
        }
    }

    public int y() {
        k(0);
        return this.f20835a.F();
    }

    public void z(List list) {
        int E;
        int E2;
        if (list instanceof LongArrayList) {
            LongArrayList longArrayList = (LongArrayList) list;
            int b2 = WireFormat.b(this.f20836b);
            if (b2 == 0) {
                do {
                    longArrayList.m(this.f20835a.x());
                    if (!this.f20835a.f()) {
                        E2 = this.f20835a.E();
                    } else {
                        return;
                    }
                } while (E2 == this.f20836b);
                this.f20838d = E2;
            } else if (b2 == 2) {
                int e2 = this.f20835a.e() + this.f20835a.F();
                do {
                    longArrayList.m(this.f20835a.x());
                } while (this.f20835a.e() < e2);
                j(e2);
            } else {
                throw InvalidProtocolBufferException.e();
            }
        } else {
            int b3 = WireFormat.b(this.f20836b);
            if (b3 == 0) {
                do {
                    list.add(Long.valueOf(this.f20835a.x()));
                    if (!this.f20835a.f()) {
                        E = this.f20835a.E();
                    } else {
                        return;
                    }
                } while (E == this.f20836b);
                this.f20838d = E;
            } else if (b3 == 2) {
                int e3 = this.f20835a.e() + this.f20835a.F();
                do {
                    list.add(Long.valueOf(this.f20835a.x()));
                } while (this.f20835a.e() < e3);
                j(e3);
            } else {
                throw InvalidProtocolBufferException.e();
            }
        }
    }
}
