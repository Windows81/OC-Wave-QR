package com.google.protobuf;

import com.google.protobuf.WireFormat;
import java.util.List;

@CheckReturnValue
final class CodedInputStreamReader implements Reader {

    /* renamed from: a  reason: collision with root package name */
    public final CodedInputStream f32047a;

    /* renamed from: b  reason: collision with root package name */
    public int f32048b;

    /* renamed from: c  reason: collision with root package name */
    public int f32049c;

    /* renamed from: d  reason: collision with root package name */
    public int f32050d = 0;

    /* renamed from: com.google.protobuf.CodedInputStreamReader$1  reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f32051a;

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
                com.google.protobuf.WireFormat$FieldType[] r0 = com.google.protobuf.WireFormat.FieldType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f32051a = r0
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.BOOL     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f32051a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.BYTES     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f32051a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.DOUBLE     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f32051a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.ENUM     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f32051a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.FIXED32     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f32051a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.FIXED64     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f32051a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.FLOAT     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r0 = f32051a     // Catch:{ NoSuchFieldError -> 0x0060 }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.INT32     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                int[] r0 = f32051a     // Catch:{ NoSuchFieldError -> 0x006c }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.INT64     // Catch:{ NoSuchFieldError -> 0x006c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006c }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006c }
            L_0x006c:
                int[] r0 = f32051a     // Catch:{ NoSuchFieldError -> 0x0078 }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.MESSAGE     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r2 = 10
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                int[] r0 = f32051a     // Catch:{ NoSuchFieldError -> 0x0084 }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.SFIXED32     // Catch:{ NoSuchFieldError -> 0x0084 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0084 }
                r2 = 11
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0084 }
            L_0x0084:
                int[] r0 = f32051a     // Catch:{ NoSuchFieldError -> 0x0090 }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.SFIXED64     // Catch:{ NoSuchFieldError -> 0x0090 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0090 }
                r2 = 12
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0090 }
            L_0x0090:
                int[] r0 = f32051a     // Catch:{ NoSuchFieldError -> 0x009c }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.SINT32     // Catch:{ NoSuchFieldError -> 0x009c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x009c }
                r2 = 13
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x009c }
            L_0x009c:
                int[] r0 = f32051a     // Catch:{ NoSuchFieldError -> 0x00a8 }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.SINT64     // Catch:{ NoSuchFieldError -> 0x00a8 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00a8 }
                r2 = 14
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00a8 }
            L_0x00a8:
                int[] r0 = f32051a     // Catch:{ NoSuchFieldError -> 0x00b4 }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.STRING     // Catch:{ NoSuchFieldError -> 0x00b4 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00b4 }
                r2 = 15
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00b4 }
            L_0x00b4:
                int[] r0 = f32051a     // Catch:{ NoSuchFieldError -> 0x00c0 }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.UINT32     // Catch:{ NoSuchFieldError -> 0x00c0 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00c0 }
                r2 = 16
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00c0 }
            L_0x00c0:
                int[] r0 = f32051a     // Catch:{ NoSuchFieldError -> 0x00cc }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.UINT64     // Catch:{ NoSuchFieldError -> 0x00cc }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00cc }
                r2 = 17
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00cc }
            L_0x00cc:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.CodedInputStreamReader.AnonymousClass1.<clinit>():void");
        }
    }

    public CodedInputStreamReader(CodedInputStream codedInputStream) {
        CodedInputStream codedInputStream2 = (CodedInputStream) Internal.b(codedInputStream, "input");
        this.f32047a = codedInputStream2;
        codedInputStream2.f31999d = this;
    }

    private Object U(Schema schema, ExtensionRegistryLite extensionRegistryLite) {
        Object g2 = schema.g();
        k(g2, schema, extensionRegistryLite);
        schema.d(g2);
        return g2;
    }

    private Object V(Schema schema, ExtensionRegistryLite extensionRegistryLite) {
        Object g2 = schema.g();
        l(g2, schema, extensionRegistryLite);
        schema.d(g2);
        return g2;
    }

    private void X(int i2) {
        if (this.f32047a.d() != i2) {
            throw InvalidProtocolBufferException.m();
        }
    }

    private void Y(int i2) {
        if (WireFormat.b(this.f32048b) != i2) {
            throw InvalidProtocolBufferException.e();
        }
    }

    private void Z(int i2) {
        if ((i2 & 3) != 0) {
            throw InvalidProtocolBufferException.h();
        }
    }

    private void a0(int i2) {
        if ((i2 & 7) != 0) {
            throw InvalidProtocolBufferException.h();
        }
    }

    public static CodedInputStreamReader j(CodedInputStream codedInputStream) {
        CodedInputStreamReader codedInputStreamReader = codedInputStream.f31999d;
        return codedInputStreamReader != null ? codedInputStreamReader : new CodedInputStreamReader(codedInputStream);
    }

    private Object m(WireFormat.FieldType fieldType, Class cls, ExtensionRegistryLite extensionRegistryLite) {
        switch (AnonymousClass1.f32051a[fieldType.ordinal()]) {
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
                return b(cls, extensionRegistryLite);
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

    public void A(List list) {
        int D;
        int D2;
        if (list instanceof LongArrayList) {
            LongArrayList longArrayList = (LongArrayList) list;
            int b2 = WireFormat.b(this.f32048b);
            if (b2 == 1) {
                do {
                    longArrayList.m(this.f32047a.y());
                    if (!this.f32047a.e()) {
                        D2 = this.f32047a.D();
                    } else {
                        return;
                    }
                } while (D2 == this.f32048b);
                this.f32050d = D2;
            } else if (b2 == 2) {
                int E = this.f32047a.E();
                a0(E);
                int d2 = this.f32047a.d() + E;
                do {
                    longArrayList.m(this.f32047a.y());
                } while (this.f32047a.d() < d2);
            } else {
                throw InvalidProtocolBufferException.e();
            }
        } else {
            int b3 = WireFormat.b(this.f32048b);
            if (b3 == 1) {
                do {
                    list.add(Long.valueOf(this.f32047a.y()));
                    if (!this.f32047a.e()) {
                        D = this.f32047a.D();
                    } else {
                        return;
                    }
                } while (D == this.f32048b);
                this.f32050d = D;
            } else if (b3 == 2) {
                int E2 = this.f32047a.E();
                a0(E2);
                int d3 = this.f32047a.d() + E2;
                do {
                    list.add(Long.valueOf(this.f32047a.y()));
                } while (this.f32047a.d() < d3);
            } else {
                throw InvalidProtocolBufferException.e();
            }
        }
    }

    public void B(List list) {
        int D;
        int D2;
        if (list instanceof IntArrayList) {
            IntArrayList intArrayList = (IntArrayList) list;
            int b2 = WireFormat.b(this.f32048b);
            if (b2 == 0) {
                do {
                    intArrayList.g0(this.f32047a.v());
                    if (!this.f32047a.e()) {
                        D2 = this.f32047a.D();
                    } else {
                        return;
                    }
                } while (D2 == this.f32048b);
                this.f32050d = D2;
            } else if (b2 == 2) {
                int d2 = this.f32047a.d() + this.f32047a.E();
                do {
                    intArrayList.g0(this.f32047a.v());
                } while (this.f32047a.d() < d2);
                X(d2);
            } else {
                throw InvalidProtocolBufferException.e();
            }
        } else {
            int b3 = WireFormat.b(this.f32048b);
            if (b3 == 0) {
                do {
                    list.add(Integer.valueOf(this.f32047a.v()));
                    if (!this.f32047a.e()) {
                        D = this.f32047a.D();
                    } else {
                        return;
                    }
                } while (D == this.f32048b);
                this.f32050d = D;
            } else if (b3 == 2) {
                int d3 = this.f32047a.d() + this.f32047a.E();
                do {
                    list.add(Integer.valueOf(this.f32047a.v()));
                } while (this.f32047a.d() < d3);
                X(d3);
            } else {
                throw InvalidProtocolBufferException.e();
            }
        }
    }

    public void C(List list) {
        int D;
        int D2;
        if (list instanceof IntArrayList) {
            IntArrayList intArrayList = (IntArrayList) list;
            int b2 = WireFormat.b(this.f32048b);
            if (b2 == 0) {
                do {
                    intArrayList.g0(this.f32047a.r());
                    if (!this.f32047a.e()) {
                        D2 = this.f32047a.D();
                    } else {
                        return;
                    }
                } while (D2 == this.f32048b);
                this.f32050d = D2;
            } else if (b2 == 2) {
                int d2 = this.f32047a.d() + this.f32047a.E();
                do {
                    intArrayList.g0(this.f32047a.r());
                } while (this.f32047a.d() < d2);
                X(d2);
            } else {
                throw InvalidProtocolBufferException.e();
            }
        } else {
            int b3 = WireFormat.b(this.f32048b);
            if (b3 == 0) {
                do {
                    list.add(Integer.valueOf(this.f32047a.r()));
                    if (!this.f32047a.e()) {
                        D = this.f32047a.D();
                    } else {
                        return;
                    }
                } while (D == this.f32048b);
                this.f32050d = D;
            } else if (b3 == 2) {
                int d3 = this.f32047a.d() + this.f32047a.E();
                do {
                    list.add(Integer.valueOf(this.f32047a.r()));
                } while (this.f32047a.d() < d3);
                X(d3);
            } else {
                throw InvalidProtocolBufferException.e();
            }
        }
    }

    public int D() {
        Y(0);
        return this.f32047a.r();
    }

    public int E() {
        return this.f32048b;
    }

    public void F(List list) {
        int D;
        int D2;
        if (list instanceof IntArrayList) {
            IntArrayList intArrayList = (IntArrayList) list;
            int b2 = WireFormat.b(this.f32048b);
            if (b2 == 2) {
                int E = this.f32047a.E();
                Z(E);
                int d2 = this.f32047a.d() + E;
                do {
                    intArrayList.g0(this.f32047a.s());
                } while (this.f32047a.d() < d2);
            } else if (b2 == 5) {
                do {
                    intArrayList.g0(this.f32047a.s());
                    if (!this.f32047a.e()) {
                        D2 = this.f32047a.D();
                    } else {
                        return;
                    }
                } while (D2 == this.f32048b);
                this.f32050d = D2;
            } else {
                throw InvalidProtocolBufferException.e();
            }
        } else {
            int b3 = WireFormat.b(this.f32048b);
            if (b3 == 2) {
                int E2 = this.f32047a.E();
                Z(E2);
                int d3 = this.f32047a.d() + E2;
                do {
                    list.add(Integer.valueOf(this.f32047a.s()));
                } while (this.f32047a.d() < d3);
            } else if (b3 == 5) {
                do {
                    list.add(Integer.valueOf(this.f32047a.s()));
                    if (!this.f32047a.e()) {
                        D = this.f32047a.D();
                    } else {
                        return;
                    }
                } while (D == this.f32048b);
                this.f32050d = D;
            } else {
                throw InvalidProtocolBufferException.e();
            }
        }
    }

    public int G() {
        Y(0);
        return this.f32047a.z();
    }

    public long H() {
        Y(0);
        return this.f32047a.A();
    }

    public void I(List list) {
        int D;
        int D2;
        if (list instanceof BooleanArrayList) {
            BooleanArrayList booleanArrayList = (BooleanArrayList) list;
            int b2 = WireFormat.b(this.f32048b);
            if (b2 == 0) {
                do {
                    booleanArrayList.m(this.f32047a.o());
                    if (!this.f32047a.e()) {
                        D2 = this.f32047a.D();
                    } else {
                        return;
                    }
                } while (D2 == this.f32048b);
                this.f32050d = D2;
            } else if (b2 == 2) {
                int d2 = this.f32047a.d() + this.f32047a.E();
                do {
                    booleanArrayList.m(this.f32047a.o());
                } while (this.f32047a.d() < d2);
                X(d2);
            } else {
                throw InvalidProtocolBufferException.e();
            }
        } else {
            int b3 = WireFormat.b(this.f32048b);
            if (b3 == 0) {
                do {
                    list.add(Boolean.valueOf(this.f32047a.o()));
                    if (!this.f32047a.e()) {
                        D = this.f32047a.D();
                    } else {
                        return;
                    }
                } while (D == this.f32048b);
                this.f32050d = D;
            } else if (b3 == 2) {
                int d3 = this.f32047a.d() + this.f32047a.E();
                do {
                    list.add(Boolean.valueOf(this.f32047a.o()));
                } while (this.f32047a.d() < d3);
                X(d3);
            } else {
                throw InvalidProtocolBufferException.e();
            }
        }
    }

    public int J() {
        int i2 = this.f32050d;
        if (i2 != 0) {
            this.f32048b = i2;
            this.f32050d = 0;
        } else {
            this.f32048b = this.f32047a.D();
        }
        int i3 = this.f32048b;
        if (i3 == 0 || i3 == this.f32049c) {
            return Integer.MAX_VALUE;
        }
        return WireFormat.a(i3);
    }

    public void K(List list) {
        W(list, false);
    }

    public void L(List list) {
        W(list, true);
    }

    public ByteString M() {
        Y(2);
        return this.f32047a.p();
    }

    public void N(List list) {
        int D;
        int D2;
        if (list instanceof FloatArrayList) {
            FloatArrayList floatArrayList = (FloatArrayList) list;
            int b2 = WireFormat.b(this.f32048b);
            if (b2 == 2) {
                int E = this.f32047a.E();
                Z(E);
                int d2 = this.f32047a.d() + E;
                do {
                    floatArrayList.i(this.f32047a.u());
                } while (this.f32047a.d() < d2);
            } else if (b2 == 5) {
                do {
                    floatArrayList.i(this.f32047a.u());
                    if (!this.f32047a.e()) {
                        D2 = this.f32047a.D();
                    } else {
                        return;
                    }
                } while (D2 == this.f32048b);
                this.f32050d = D2;
            } else {
                throw InvalidProtocolBufferException.e();
            }
        } else {
            int b3 = WireFormat.b(this.f32048b);
            if (b3 == 2) {
                int E2 = this.f32047a.E();
                Z(E2);
                int d3 = this.f32047a.d() + E2;
                do {
                    list.add(Float.valueOf(this.f32047a.u()));
                } while (this.f32047a.d() < d3);
            } else if (b3 == 5) {
                do {
                    list.add(Float.valueOf(this.f32047a.u()));
                    if (!this.f32047a.e()) {
                        D = this.f32047a.D();
                    } else {
                        return;
                    }
                } while (D == this.f32048b);
                this.f32050d = D;
            } else {
                throw InvalidProtocolBufferException.e();
            }
        }
    }

    public boolean O() {
        int i2;
        if (this.f32047a.e() || (i2 = this.f32048b) == this.f32049c) {
            return false;
        }
        return this.f32047a.G(i2);
    }

    public int P() {
        Y(5);
        return this.f32047a.x();
    }

    public void Q(List list) {
        int D;
        if (WireFormat.b(this.f32048b) == 2) {
            do {
                list.add(M());
                if (!this.f32047a.e()) {
                    D = this.f32047a.D();
                } else {
                    return;
                }
            } while (D == this.f32048b);
            this.f32050d = D;
            return;
        }
        throw InvalidProtocolBufferException.e();
    }

    public void R(List list) {
        int D;
        int D2;
        if (list instanceof DoubleArrayList) {
            DoubleArrayList doubleArrayList = (DoubleArrayList) list;
            int b2 = WireFormat.b(this.f32048b);
            if (b2 == 1) {
                do {
                    doubleArrayList.i(this.f32047a.q());
                    if (!this.f32047a.e()) {
                        D2 = this.f32047a.D();
                    } else {
                        return;
                    }
                } while (D2 == this.f32048b);
                this.f32050d = D2;
            } else if (b2 == 2) {
                int E = this.f32047a.E();
                a0(E);
                int d2 = this.f32047a.d() + E;
                do {
                    doubleArrayList.i(this.f32047a.q());
                } while (this.f32047a.d() < d2);
            } else {
                throw InvalidProtocolBufferException.e();
            }
        } else {
            int b3 = WireFormat.b(this.f32048b);
            if (b3 == 1) {
                do {
                    list.add(Double.valueOf(this.f32047a.q()));
                    if (!this.f32047a.e()) {
                        D = this.f32047a.D();
                    } else {
                        return;
                    }
                } while (D == this.f32048b);
                this.f32050d = D;
            } else if (b3 == 2) {
                int E2 = this.f32047a.E();
                a0(E2);
                int d3 = this.f32047a.d() + E2;
                do {
                    list.add(Double.valueOf(this.f32047a.q()));
                } while (this.f32047a.d() < d3);
            } else {
                throw InvalidProtocolBufferException.e();
            }
        }
    }

    public String S() {
        Y(2);
        return this.f32047a.C();
    }

    public void T(List list) {
        int D;
        int D2;
        if (list instanceof LongArrayList) {
            LongArrayList longArrayList = (LongArrayList) list;
            int b2 = WireFormat.b(this.f32048b);
            if (b2 == 1) {
                do {
                    longArrayList.m(this.f32047a.t());
                    if (!this.f32047a.e()) {
                        D2 = this.f32047a.D();
                    } else {
                        return;
                    }
                } while (D2 == this.f32048b);
                this.f32050d = D2;
            } else if (b2 == 2) {
                int E = this.f32047a.E();
                a0(E);
                int d2 = this.f32047a.d() + E;
                do {
                    longArrayList.m(this.f32047a.t());
                } while (this.f32047a.d() < d2);
            } else {
                throw InvalidProtocolBufferException.e();
            }
        } else {
            int b3 = WireFormat.b(this.f32048b);
            if (b3 == 1) {
                do {
                    list.add(Long.valueOf(this.f32047a.t()));
                    if (!this.f32047a.e()) {
                        D = this.f32047a.D();
                    } else {
                        return;
                    }
                } while (D == this.f32048b);
                this.f32050d = D;
            } else if (b3 == 2) {
                int E2 = this.f32047a.E();
                a0(E2);
                int d3 = this.f32047a.d() + E2;
                do {
                    list.add(Long.valueOf(this.f32047a.t()));
                } while (this.f32047a.d() < d3);
            } else {
                throw InvalidProtocolBufferException.e();
            }
        }
    }

    public void W(List list, boolean z2) {
        int D;
        int D2;
        if (WireFormat.b(this.f32048b) != 2) {
            throw InvalidProtocolBufferException.e();
        } else if (!(list instanceof LazyStringList) || z2) {
            do {
                list.add(z2 ? S() : h());
                if (!this.f32047a.e()) {
                    D = this.f32047a.D();
                } else {
                    return;
                }
            } while (D == this.f32048b);
            this.f32050d = D;
        } else {
            LazyStringList lazyStringList = (LazyStringList) list;
            do {
                lazyStringList.c0(M());
                if (!this.f32047a.e()) {
                    D2 = this.f32047a.D();
                } else {
                    return;
                }
            } while (D2 == this.f32048b);
            this.f32050d = D2;
        }
    }

    public void a(List list, Schema schema, ExtensionRegistryLite extensionRegistryLite) {
        int D;
        if (WireFormat.b(this.f32048b) == 3) {
            int i2 = this.f32048b;
            do {
                list.add(U(schema, extensionRegistryLite));
                if (!this.f32047a.e() && this.f32050d == 0) {
                    D = this.f32047a.D();
                } else {
                    return;
                }
            } while (D == i2);
            this.f32050d = D;
            return;
        }
        throw InvalidProtocolBufferException.e();
    }

    public Object b(Class cls, ExtensionRegistryLite extensionRegistryLite) {
        Y(2);
        return V(Protobuf.a().c(cls), extensionRegistryLite);
    }

    public void c(Object obj, Schema schema, ExtensionRegistryLite extensionRegistryLite) {
        Y(3);
        k(obj, schema, extensionRegistryLite);
    }

    public void d(List list, Schema schema, ExtensionRegistryLite extensionRegistryLite) {
        int D;
        if (WireFormat.b(this.f32048b) == 2) {
            int i2 = this.f32048b;
            do {
                list.add(V(schema, extensionRegistryLite));
                if (!this.f32047a.e() && this.f32050d == 0) {
                    D = this.f32047a.D();
                } else {
                    return;
                }
            } while (D == i2);
            this.f32050d = D;
            return;
        }
        throw InvalidProtocolBufferException.e();
    }

    public Object e(Class cls, ExtensionRegistryLite extensionRegistryLite) {
        Y(3);
        return U(Protobuf.a().c(cls), extensionRegistryLite);
    }

    public void f(Object obj, Schema schema, ExtensionRegistryLite extensionRegistryLite) {
        Y(2);
        l(obj, schema, extensionRegistryLite);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0055, code lost:
        if (O() != false) goto L_0x0057;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x005d, code lost:
        throw new com.google.protobuf.InvalidProtocolBufferException(r6);
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0051 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void g(java.util.Map r8, com.google.protobuf.MapEntryLite.Metadata r9, com.google.protobuf.ExtensionRegistryLite r10) {
        /*
            r7 = this;
            r0 = 2
            r7.Y(r0)
            com.google.protobuf.CodedInputStream r1 = r7.f32047a
            int r1 = r1.E()
            com.google.protobuf.CodedInputStream r2 = r7.f32047a
            int r1 = r2.n(r1)
            java.lang.Object r2 = r9.f32219b
            java.lang.Object r3 = r9.f32221d
        L_0x0014:
            int r4 = r7.J()     // Catch:{ all -> 0x003a }
            r5 = 2147483647(0x7fffffff, float:NaN)
            if (r4 == r5) goto L_0x005e
            com.google.protobuf.CodedInputStream r5 = r7.f32047a     // Catch:{ all -> 0x003a }
            boolean r5 = r5.e()     // Catch:{ all -> 0x003a }
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
            com.google.protobuf.InvalidProtocolBufferException r4 = new com.google.protobuf.InvalidProtocolBufferException     // Catch:{ InvalidWireTypeException -> 0x0051 }
            r4.<init>((java.lang.String) r6)     // Catch:{ InvalidWireTypeException -> 0x0051 }
            throw r4     // Catch:{ InvalidWireTypeException -> 0x0051 }
        L_0x003a:
            r8 = move-exception
            goto L_0x0067
        L_0x003c:
            com.google.protobuf.WireFormat$FieldType r4 = r9.f32220c     // Catch:{ InvalidWireTypeException -> 0x0051 }
            java.lang.Object r5 = r9.f32221d     // Catch:{ InvalidWireTypeException -> 0x0051 }
            java.lang.Class r5 = r5.getClass()     // Catch:{ InvalidWireTypeException -> 0x0051 }
            java.lang.Object r3 = r7.m(r4, r5, r10)     // Catch:{ InvalidWireTypeException -> 0x0051 }
            goto L_0x0014
        L_0x0049:
            com.google.protobuf.WireFormat$FieldType r4 = r9.f32218a     // Catch:{ InvalidWireTypeException -> 0x0051 }
            r5 = 0
            java.lang.Object r2 = r7.m(r4, r5, r5)     // Catch:{ InvalidWireTypeException -> 0x0051 }
            goto L_0x0014
        L_0x0051:
            boolean r4 = r7.O()     // Catch:{ all -> 0x003a }
            if (r4 == 0) goto L_0x0058
            goto L_0x0014
        L_0x0058:
            com.google.protobuf.InvalidProtocolBufferException r8 = new com.google.protobuf.InvalidProtocolBufferException     // Catch:{ all -> 0x003a }
            r8.<init>((java.lang.String) r6)     // Catch:{ all -> 0x003a }
            throw r8     // Catch:{ all -> 0x003a }
        L_0x005e:
            r8.put(r2, r3)     // Catch:{ all -> 0x003a }
            com.google.protobuf.CodedInputStream r8 = r7.f32047a
            r8.m(r1)
            return
        L_0x0067:
            com.google.protobuf.CodedInputStream r9 = r7.f32047a
            r9.m(r1)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.CodedInputStreamReader.g(java.util.Map, com.google.protobuf.MapEntryLite$Metadata, com.google.protobuf.ExtensionRegistryLite):void");
    }

    public String h() {
        Y(2);
        return this.f32047a.B();
    }

    public int i() {
        Y(0);
        return this.f32047a.v();
    }

    public final void k(Object obj, Schema schema, ExtensionRegistryLite extensionRegistryLite) {
        int i2 = this.f32049c;
        this.f32049c = WireFormat.c(WireFormat.a(this.f32048b), 4);
        try {
            schema.i(obj, this, extensionRegistryLite);
            if (this.f32048b != this.f32049c) {
                throw InvalidProtocolBufferException.h();
            }
        } finally {
            this.f32049c = i2;
        }
    }

    public final void l(Object obj, Schema schema, ExtensionRegistryLite extensionRegistryLite) {
        int E = this.f32047a.E();
        CodedInputStream codedInputStream = this.f32047a;
        if (codedInputStream.f31996a < codedInputStream.f31997b) {
            int n2 = codedInputStream.n(E);
            this.f32047a.f31996a++;
            schema.i(obj, this, extensionRegistryLite);
            this.f32047a.a(0);
            CodedInputStream codedInputStream2 = this.f32047a;
            codedInputStream2.f31996a--;
            codedInputStream2.m(n2);
            return;
        }
        throw InvalidProtocolBufferException.i();
    }

    public long n() {
        Y(0);
        return this.f32047a.w();
    }

    public void o(List list) {
        int D;
        int D2;
        if (list instanceof IntArrayList) {
            IntArrayList intArrayList = (IntArrayList) list;
            int b2 = WireFormat.b(this.f32048b);
            if (b2 == 0) {
                do {
                    intArrayList.g0(this.f32047a.z());
                    if (!this.f32047a.e()) {
                        D2 = this.f32047a.D();
                    } else {
                        return;
                    }
                } while (D2 == this.f32048b);
                this.f32050d = D2;
            } else if (b2 == 2) {
                int d2 = this.f32047a.d() + this.f32047a.E();
                do {
                    intArrayList.g0(this.f32047a.z());
                } while (this.f32047a.d() < d2);
                X(d2);
            } else {
                throw InvalidProtocolBufferException.e();
            }
        } else {
            int b3 = WireFormat.b(this.f32048b);
            if (b3 == 0) {
                do {
                    list.add(Integer.valueOf(this.f32047a.z()));
                    if (!this.f32047a.e()) {
                        D = this.f32047a.D();
                    } else {
                        return;
                    }
                } while (D == this.f32048b);
                this.f32050d = D;
            } else if (b3 == 2) {
                int d3 = this.f32047a.d() + this.f32047a.E();
                do {
                    list.add(Integer.valueOf(this.f32047a.z()));
                } while (this.f32047a.d() < d3);
                X(d3);
            } else {
                throw InvalidProtocolBufferException.e();
            }
        }
    }

    public long p() {
        Y(0);
        return this.f32047a.F();
    }

    public long q() {
        Y(1);
        return this.f32047a.t();
    }

    public void r(List list) {
        int D;
        int D2;
        if (list instanceof IntArrayList) {
            IntArrayList intArrayList = (IntArrayList) list;
            int b2 = WireFormat.b(this.f32048b);
            if (b2 == 2) {
                int E = this.f32047a.E();
                Z(E);
                int d2 = this.f32047a.d() + E;
                do {
                    intArrayList.g0(this.f32047a.x());
                } while (this.f32047a.d() < d2);
            } else if (b2 == 5) {
                do {
                    intArrayList.g0(this.f32047a.x());
                    if (!this.f32047a.e()) {
                        D2 = this.f32047a.D();
                    } else {
                        return;
                    }
                } while (D2 == this.f32048b);
                this.f32050d = D2;
            } else {
                throw InvalidProtocolBufferException.e();
            }
        } else {
            int b3 = WireFormat.b(this.f32048b);
            if (b3 == 2) {
                int E2 = this.f32047a.E();
                Z(E2);
                int d3 = this.f32047a.d() + E2;
                do {
                    list.add(Integer.valueOf(this.f32047a.x()));
                } while (this.f32047a.d() < d3);
            } else if (b3 == 5) {
                do {
                    list.add(Integer.valueOf(this.f32047a.x()));
                    if (!this.f32047a.e()) {
                        D = this.f32047a.D();
                    } else {
                        return;
                    }
                } while (D == this.f32048b);
                this.f32050d = D;
            } else {
                throw InvalidProtocolBufferException.e();
            }
        }
    }

    public double readDouble() {
        Y(1);
        return this.f32047a.q();
    }

    public float readFloat() {
        Y(5);
        return this.f32047a.u();
    }

    public void s(List list) {
        int D;
        int D2;
        if (list instanceof LongArrayList) {
            LongArrayList longArrayList = (LongArrayList) list;
            int b2 = WireFormat.b(this.f32048b);
            if (b2 == 0) {
                do {
                    longArrayList.m(this.f32047a.A());
                    if (!this.f32047a.e()) {
                        D2 = this.f32047a.D();
                    } else {
                        return;
                    }
                } while (D2 == this.f32048b);
                this.f32050d = D2;
            } else if (b2 == 2) {
                int d2 = this.f32047a.d() + this.f32047a.E();
                do {
                    longArrayList.m(this.f32047a.A());
                } while (this.f32047a.d() < d2);
                X(d2);
            } else {
                throw InvalidProtocolBufferException.e();
            }
        } else {
            int b3 = WireFormat.b(this.f32048b);
            if (b3 == 0) {
                do {
                    list.add(Long.valueOf(this.f32047a.A()));
                    if (!this.f32047a.e()) {
                        D = this.f32047a.D();
                    } else {
                        return;
                    }
                } while (D == this.f32048b);
                this.f32050d = D;
            } else if (b3 == 2) {
                int d3 = this.f32047a.d() + this.f32047a.E();
                do {
                    list.add(Long.valueOf(this.f32047a.A()));
                } while (this.f32047a.d() < d3);
                X(d3);
            } else {
                throw InvalidProtocolBufferException.e();
            }
        }
    }

    public void t(List list) {
        int D;
        int D2;
        if (list instanceof IntArrayList) {
            IntArrayList intArrayList = (IntArrayList) list;
            int b2 = WireFormat.b(this.f32048b);
            if (b2 == 0) {
                do {
                    intArrayList.g0(this.f32047a.E());
                    if (!this.f32047a.e()) {
                        D2 = this.f32047a.D();
                    } else {
                        return;
                    }
                } while (D2 == this.f32048b);
                this.f32050d = D2;
            } else if (b2 == 2) {
                int d2 = this.f32047a.d() + this.f32047a.E();
                do {
                    intArrayList.g0(this.f32047a.E());
                } while (this.f32047a.d() < d2);
                X(d2);
            } else {
                throw InvalidProtocolBufferException.e();
            }
        } else {
            int b3 = WireFormat.b(this.f32048b);
            if (b3 == 0) {
                do {
                    list.add(Integer.valueOf(this.f32047a.E()));
                    if (!this.f32047a.e()) {
                        D = this.f32047a.D();
                    } else {
                        return;
                    }
                } while (D == this.f32048b);
                this.f32050d = D;
            } else if (b3 == 2) {
                int d3 = this.f32047a.d() + this.f32047a.E();
                do {
                    list.add(Integer.valueOf(this.f32047a.E()));
                } while (this.f32047a.d() < d3);
                X(d3);
            } else {
                throw InvalidProtocolBufferException.e();
            }
        }
    }

    public int u() {
        Y(5);
        return this.f32047a.s();
    }

    public boolean v() {
        Y(0);
        return this.f32047a.o();
    }

    public long w() {
        Y(1);
        return this.f32047a.y();
    }

    public void x(List list) {
        int D;
        int D2;
        if (list instanceof LongArrayList) {
            LongArrayList longArrayList = (LongArrayList) list;
            int b2 = WireFormat.b(this.f32048b);
            if (b2 == 0) {
                do {
                    longArrayList.m(this.f32047a.F());
                    if (!this.f32047a.e()) {
                        D2 = this.f32047a.D();
                    } else {
                        return;
                    }
                } while (D2 == this.f32048b);
                this.f32050d = D2;
            } else if (b2 == 2) {
                int d2 = this.f32047a.d() + this.f32047a.E();
                do {
                    longArrayList.m(this.f32047a.F());
                } while (this.f32047a.d() < d2);
                X(d2);
            } else {
                throw InvalidProtocolBufferException.e();
            }
        } else {
            int b3 = WireFormat.b(this.f32048b);
            if (b3 == 0) {
                do {
                    list.add(Long.valueOf(this.f32047a.F()));
                    if (!this.f32047a.e()) {
                        D = this.f32047a.D();
                    } else {
                        return;
                    }
                } while (D == this.f32048b);
                this.f32050d = D;
            } else if (b3 == 2) {
                int d3 = this.f32047a.d() + this.f32047a.E();
                do {
                    list.add(Long.valueOf(this.f32047a.F()));
                } while (this.f32047a.d() < d3);
                X(d3);
            } else {
                throw InvalidProtocolBufferException.e();
            }
        }
    }

    public int y() {
        Y(0);
        return this.f32047a.E();
    }

    public void z(List list) {
        int D;
        int D2;
        if (list instanceof LongArrayList) {
            LongArrayList longArrayList = (LongArrayList) list;
            int b2 = WireFormat.b(this.f32048b);
            if (b2 == 0) {
                do {
                    longArrayList.m(this.f32047a.w());
                    if (!this.f32047a.e()) {
                        D2 = this.f32047a.D();
                    } else {
                        return;
                    }
                } while (D2 == this.f32048b);
                this.f32050d = D2;
            } else if (b2 == 2) {
                int d2 = this.f32047a.d() + this.f32047a.E();
                do {
                    longArrayList.m(this.f32047a.w());
                } while (this.f32047a.d() < d2);
                X(d2);
            } else {
                throw InvalidProtocolBufferException.e();
            }
        } else {
            int b3 = WireFormat.b(this.f32048b);
            if (b3 == 0) {
                do {
                    list.add(Long.valueOf(this.f32047a.w()));
                    if (!this.f32047a.e()) {
                        D = this.f32047a.D();
                    } else {
                        return;
                    }
                } while (D == this.f32048b);
                this.f32050d = D;
            } else if (b3 == 2) {
                int d3 = this.f32047a.d() + this.f32047a.E();
                do {
                    list.add(Long.valueOf(this.f32047a.w()));
                } while (this.f32047a.d() < d3);
                X(d3);
            } else {
                throw InvalidProtocolBufferException.e();
            }
        }
    }
}
