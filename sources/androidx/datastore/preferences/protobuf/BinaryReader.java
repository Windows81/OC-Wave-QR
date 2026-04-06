package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.WireFormat;
import java.util.List;

@CheckReturnValue
abstract class BinaryReader implements Reader {

    /* renamed from: androidx.datastore.preferences.protobuf.BinaryReader$1  reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f20730a;

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
                f20730a = r0
                androidx.datastore.preferences.protobuf.WireFormat$FieldType r1 = androidx.datastore.preferences.protobuf.WireFormat.FieldType.BOOL     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f20730a     // Catch:{ NoSuchFieldError -> 0x001d }
                androidx.datastore.preferences.protobuf.WireFormat$FieldType r1 = androidx.datastore.preferences.protobuf.WireFormat.FieldType.BYTES     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f20730a     // Catch:{ NoSuchFieldError -> 0x0028 }
                androidx.datastore.preferences.protobuf.WireFormat$FieldType r1 = androidx.datastore.preferences.protobuf.WireFormat.FieldType.DOUBLE     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f20730a     // Catch:{ NoSuchFieldError -> 0x0033 }
                androidx.datastore.preferences.protobuf.WireFormat$FieldType r1 = androidx.datastore.preferences.protobuf.WireFormat.FieldType.ENUM     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f20730a     // Catch:{ NoSuchFieldError -> 0x003e }
                androidx.datastore.preferences.protobuf.WireFormat$FieldType r1 = androidx.datastore.preferences.protobuf.WireFormat.FieldType.FIXED32     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f20730a     // Catch:{ NoSuchFieldError -> 0x0049 }
                androidx.datastore.preferences.protobuf.WireFormat$FieldType r1 = androidx.datastore.preferences.protobuf.WireFormat.FieldType.FIXED64     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f20730a     // Catch:{ NoSuchFieldError -> 0x0054 }
                androidx.datastore.preferences.protobuf.WireFormat$FieldType r1 = androidx.datastore.preferences.protobuf.WireFormat.FieldType.FLOAT     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r0 = f20730a     // Catch:{ NoSuchFieldError -> 0x0060 }
                androidx.datastore.preferences.protobuf.WireFormat$FieldType r1 = androidx.datastore.preferences.protobuf.WireFormat.FieldType.INT32     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                int[] r0 = f20730a     // Catch:{ NoSuchFieldError -> 0x006c }
                androidx.datastore.preferences.protobuf.WireFormat$FieldType r1 = androidx.datastore.preferences.protobuf.WireFormat.FieldType.INT64     // Catch:{ NoSuchFieldError -> 0x006c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006c }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006c }
            L_0x006c:
                int[] r0 = f20730a     // Catch:{ NoSuchFieldError -> 0x0078 }
                androidx.datastore.preferences.protobuf.WireFormat$FieldType r1 = androidx.datastore.preferences.protobuf.WireFormat.FieldType.MESSAGE     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r2 = 10
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                int[] r0 = f20730a     // Catch:{ NoSuchFieldError -> 0x0084 }
                androidx.datastore.preferences.protobuf.WireFormat$FieldType r1 = androidx.datastore.preferences.protobuf.WireFormat.FieldType.SFIXED32     // Catch:{ NoSuchFieldError -> 0x0084 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0084 }
                r2 = 11
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0084 }
            L_0x0084:
                int[] r0 = f20730a     // Catch:{ NoSuchFieldError -> 0x0090 }
                androidx.datastore.preferences.protobuf.WireFormat$FieldType r1 = androidx.datastore.preferences.protobuf.WireFormat.FieldType.SFIXED64     // Catch:{ NoSuchFieldError -> 0x0090 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0090 }
                r2 = 12
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0090 }
            L_0x0090:
                int[] r0 = f20730a     // Catch:{ NoSuchFieldError -> 0x009c }
                androidx.datastore.preferences.protobuf.WireFormat$FieldType r1 = androidx.datastore.preferences.protobuf.WireFormat.FieldType.SINT32     // Catch:{ NoSuchFieldError -> 0x009c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x009c }
                r2 = 13
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x009c }
            L_0x009c:
                int[] r0 = f20730a     // Catch:{ NoSuchFieldError -> 0x00a8 }
                androidx.datastore.preferences.protobuf.WireFormat$FieldType r1 = androidx.datastore.preferences.protobuf.WireFormat.FieldType.SINT64     // Catch:{ NoSuchFieldError -> 0x00a8 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00a8 }
                r2 = 14
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00a8 }
            L_0x00a8:
                int[] r0 = f20730a     // Catch:{ NoSuchFieldError -> 0x00b4 }
                androidx.datastore.preferences.protobuf.WireFormat$FieldType r1 = androidx.datastore.preferences.protobuf.WireFormat.FieldType.STRING     // Catch:{ NoSuchFieldError -> 0x00b4 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00b4 }
                r2 = 15
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00b4 }
            L_0x00b4:
                int[] r0 = f20730a     // Catch:{ NoSuchFieldError -> 0x00c0 }
                androidx.datastore.preferences.protobuf.WireFormat$FieldType r1 = androidx.datastore.preferences.protobuf.WireFormat.FieldType.UINT32     // Catch:{ NoSuchFieldError -> 0x00c0 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00c0 }
                r2 = 16
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00c0 }
            L_0x00c0:
                int[] r0 = f20730a     // Catch:{ NoSuchFieldError -> 0x00cc }
                androidx.datastore.preferences.protobuf.WireFormat$FieldType r1 = androidx.datastore.preferences.protobuf.WireFormat.FieldType.UINT64     // Catch:{ NoSuchFieldError -> 0x00cc }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00cc }
                r2 = 17
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00cc }
            L_0x00cc:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.BinaryReader.AnonymousClass1.<clinit>():void");
        }
    }

    public static final class SafeHeapReader extends BinaryReader {

        /* renamed from: a  reason: collision with root package name */
        public final boolean f20731a;

        /* renamed from: b  reason: collision with root package name */
        public final byte[] f20732b;

        /* renamed from: c  reason: collision with root package name */
        public int f20733c;

        /* renamed from: d  reason: collision with root package name */
        public int f20734d;

        /* renamed from: e  reason: collision with root package name */
        public int f20735e;

        /* renamed from: f  reason: collision with root package name */
        public int f20736f;

        public void A(List list) {
            int i2;
            int i3;
            if (list instanceof LongArrayList) {
                LongArrayList longArrayList = (LongArrayList) list;
                int b2 = WireFormat.b(this.f20735e);
                if (b2 == 1) {
                    do {
                        longArrayList.m(w());
                        if (!a()) {
                            i3 = this.f20733c;
                        } else {
                            return;
                        }
                    } while (b0() == this.f20735e);
                    this.f20733c = i3;
                } else if (b2 == 2) {
                    int b0 = b0();
                    m0(b0);
                    int i4 = this.f20733c + b0;
                    while (this.f20733c < i4) {
                        longArrayList.m(j());
                    }
                } else {
                    throw InvalidProtocolBufferException.e();
                }
            } else {
                int b3 = WireFormat.b(this.f20735e);
                if (b3 == 1) {
                    do {
                        list.add(Long.valueOf(w()));
                        if (!a()) {
                            i2 = this.f20733c;
                        } else {
                            return;
                        }
                    } while (b0() == this.f20735e);
                    this.f20733c = i2;
                } else if (b3 == 2) {
                    int b02 = b0();
                    m0(b02);
                    int i5 = this.f20733c + b02;
                    while (this.f20733c < i5) {
                        list.add(Long.valueOf(j()));
                    }
                } else {
                    throw InvalidProtocolBufferException.e();
                }
            }
        }

        public void B(List list) {
            int i2;
            int i3;
            if (list instanceof IntArrayList) {
                IntArrayList intArrayList = (IntArrayList) list;
                int b2 = WireFormat.b(this.f20735e);
                if (b2 == 0) {
                    do {
                        intArrayList.g0(i());
                        if (!a()) {
                            i3 = this.f20733c;
                        } else {
                            return;
                        }
                    } while (b0() == this.f20735e);
                    this.f20733c = i3;
                } else if (b2 == 2) {
                    int b0 = this.f20733c + b0();
                    while (this.f20733c < b0) {
                        intArrayList.g0(b0());
                    }
                    f0(b0);
                } else {
                    throw InvalidProtocolBufferException.e();
                }
            } else {
                int b3 = WireFormat.b(this.f20735e);
                if (b3 == 0) {
                    do {
                        list.add(Integer.valueOf(i()));
                        if (!a()) {
                            i2 = this.f20733c;
                        } else {
                            return;
                        }
                    } while (b0() == this.f20735e);
                    this.f20733c = i2;
                } else if (b3 == 2) {
                    int b02 = this.f20733c + b0();
                    while (this.f20733c < b02) {
                        list.add(Integer.valueOf(b0()));
                    }
                    f0(b02);
                } else {
                    throw InvalidProtocolBufferException.e();
                }
            }
        }

        public void C(List list) {
            int i2;
            int i3;
            if (list instanceof IntArrayList) {
                IntArrayList intArrayList = (IntArrayList) list;
                int b2 = WireFormat.b(this.f20735e);
                if (b2 == 0) {
                    do {
                        intArrayList.g0(D());
                        if (!a()) {
                            i3 = this.f20733c;
                        } else {
                            return;
                        }
                    } while (b0() == this.f20735e);
                    this.f20733c = i3;
                } else if (b2 == 2) {
                    int b0 = this.f20733c + b0();
                    while (this.f20733c < b0) {
                        intArrayList.g0(b0());
                    }
                } else {
                    throw InvalidProtocolBufferException.e();
                }
            } else {
                int b3 = WireFormat.b(this.f20735e);
                if (b3 == 0) {
                    do {
                        list.add(Integer.valueOf(D()));
                        if (!a()) {
                            i2 = this.f20733c;
                        } else {
                            return;
                        }
                    } while (b0() == this.f20735e);
                    this.f20733c = i2;
                } else if (b3 == 2) {
                    int b02 = this.f20733c + b0();
                    while (this.f20733c < b02) {
                        list.add(Integer.valueOf(b0()));
                    }
                } else {
                    throw InvalidProtocolBufferException.e();
                }
            }
        }

        public int D() {
            g0(0);
            return b0();
        }

        public int E() {
            return this.f20735e;
        }

        public void F(List list) {
            int i2;
            int i3;
            if (list instanceof IntArrayList) {
                IntArrayList intArrayList = (IntArrayList) list;
                int b2 = WireFormat.b(this.f20735e);
                if (b2 == 2) {
                    int b0 = b0();
                    l0(b0);
                    int i4 = this.f20733c + b0;
                    while (this.f20733c < i4) {
                        intArrayList.g0(f());
                    }
                } else if (b2 == 5) {
                    do {
                        intArrayList.g0(u());
                        if (!a()) {
                            i3 = this.f20733c;
                        } else {
                            return;
                        }
                    } while (b0() == this.f20735e);
                    this.f20733c = i3;
                } else {
                    throw InvalidProtocolBufferException.e();
                }
            } else {
                int b3 = WireFormat.b(this.f20735e);
                if (b3 == 2) {
                    int b02 = b0();
                    l0(b02);
                    int i5 = this.f20733c + b02;
                    while (this.f20733c < i5) {
                        list.add(Integer.valueOf(f()));
                    }
                } else if (b3 == 5) {
                    do {
                        list.add(Integer.valueOf(u()));
                        if (!a()) {
                            i2 = this.f20733c;
                        } else {
                            return;
                        }
                    } while (b0() == this.f20735e);
                    this.f20733c = i2;
                } else {
                    throw InvalidProtocolBufferException.e();
                }
            }
        }

        public int G() {
            g0(0);
            return CodedInputStream.c(b0());
        }

        public long H() {
            g0(0);
            return CodedInputStream.d(c0());
        }

        public void I(List list) {
            int i2;
            int i3;
            if (list instanceof BooleanArrayList) {
                BooleanArrayList booleanArrayList = (BooleanArrayList) list;
                int b2 = WireFormat.b(this.f20735e);
                if (b2 == 0) {
                    do {
                        booleanArrayList.m(v());
                        if (!a()) {
                            i3 = this.f20733c;
                        } else {
                            return;
                        }
                    } while (b0() == this.f20735e);
                    this.f20733c = i3;
                } else if (b2 == 2) {
                    int b0 = this.f20733c + b0();
                    while (this.f20733c < b0) {
                        booleanArrayList.m(b0() != 0);
                    }
                    f0(b0);
                } else {
                    throw InvalidProtocolBufferException.e();
                }
            } else {
                int b3 = WireFormat.b(this.f20735e);
                if (b3 == 0) {
                    do {
                        list.add(Boolean.valueOf(v()));
                        if (!a()) {
                            i2 = this.f20733c;
                        } else {
                            return;
                        }
                    } while (b0() == this.f20735e);
                    this.f20733c = i2;
                } else if (b3 == 2) {
                    int b02 = this.f20733c + b0();
                    while (this.f20733c < b02) {
                        list.add(Boolean.valueOf(b0() != 0));
                    }
                    f0(b02);
                } else {
                    throw InvalidProtocolBufferException.e();
                }
            }
        }

        public int J() {
            if (a()) {
                return Integer.MAX_VALUE;
            }
            int b0 = b0();
            this.f20735e = b0;
            if (b0 == this.f20736f) {
                return Integer.MAX_VALUE;
            }
            return WireFormat.a(b0);
        }

        public void K(List list) {
            m(list, false);
        }

        public void L(List list) {
            m(list, true);
        }

        public ByteString M() {
            g0(2);
            int b0 = b0();
            if (b0 == 0) {
                return ByteString.f20770A;
            }
            e0(b0);
            ByteString Y = this.f20731a ? ByteString.Y(this.f20732b, this.f20733c, b0) : ByteString.s(this.f20732b, this.f20733c, b0);
            this.f20733c += b0;
            return Y;
        }

        public void N(List list) {
            int i2;
            int i3;
            if (list instanceof FloatArrayList) {
                FloatArrayList floatArrayList = (FloatArrayList) list;
                int b2 = WireFormat.b(this.f20735e);
                if (b2 == 2) {
                    int b0 = b0();
                    l0(b0);
                    int i4 = this.f20733c + b0;
                    while (this.f20733c < i4) {
                        floatArrayList.i(Float.intBitsToFloat(f()));
                    }
                } else if (b2 == 5) {
                    do {
                        floatArrayList.i(readFloat());
                        if (!a()) {
                            i3 = this.f20733c;
                        } else {
                            return;
                        }
                    } while (b0() == this.f20735e);
                    this.f20733c = i3;
                } else {
                    throw InvalidProtocolBufferException.e();
                }
            } else {
                int b3 = WireFormat.b(this.f20735e);
                if (b3 == 2) {
                    int b02 = b0();
                    l0(b02);
                    int i5 = this.f20733c + b02;
                    while (this.f20733c < i5) {
                        list.add(Float.valueOf(Float.intBitsToFloat(f())));
                    }
                } else if (b3 == 5) {
                    do {
                        list.add(Float.valueOf(readFloat()));
                        if (!a()) {
                            i2 = this.f20733c;
                        } else {
                            return;
                        }
                    } while (b0() == this.f20735e);
                    this.f20733c = i2;
                } else {
                    throw InvalidProtocolBufferException.e();
                }
            }
        }

        public boolean O() {
            int i2;
            if (a() || (i2 = this.f20735e) == this.f20736f) {
                return false;
            }
            int b2 = WireFormat.b(i2);
            if (b2 == 0) {
                j0();
                return true;
            } else if (b2 == 1) {
                h0(8);
                return true;
            } else if (b2 == 2) {
                h0(b0());
                return true;
            } else if (b2 == 3) {
                i0();
                return true;
            } else if (b2 == 5) {
                h0(4);
                return true;
            } else {
                throw InvalidProtocolBufferException.e();
            }
        }

        public int P() {
            g0(5);
            return e();
        }

        public void Q(List list) {
            int i2;
            if (WireFormat.b(this.f20735e) == 2) {
                do {
                    list.add(M());
                    if (!a()) {
                        i2 = this.f20733c;
                    } else {
                        return;
                    }
                } while (b0() == this.f20735e);
                this.f20733c = i2;
                return;
            }
            throw InvalidProtocolBufferException.e();
        }

        public void R(List list) {
            int i2;
            int i3;
            if (list instanceof DoubleArrayList) {
                DoubleArrayList doubleArrayList = (DoubleArrayList) list;
                int b2 = WireFormat.b(this.f20735e);
                if (b2 == 1) {
                    do {
                        doubleArrayList.i(readDouble());
                        if (!a()) {
                            i3 = this.f20733c;
                        } else {
                            return;
                        }
                    } while (b0() == this.f20735e);
                    this.f20733c = i3;
                } else if (b2 == 2) {
                    int b0 = b0();
                    m0(b0);
                    int i4 = this.f20733c + b0;
                    while (this.f20733c < i4) {
                        doubleArrayList.i(Double.longBitsToDouble(j()));
                    }
                } else {
                    throw InvalidProtocolBufferException.e();
                }
            } else {
                int b3 = WireFormat.b(this.f20735e);
                if (b3 == 1) {
                    do {
                        list.add(Double.valueOf(readDouble()));
                        if (!a()) {
                            i2 = this.f20733c;
                        } else {
                            return;
                        }
                    } while (b0() == this.f20735e);
                    this.f20733c = i2;
                } else if (b3 == 2) {
                    int b02 = b0();
                    m0(b02);
                    int i5 = this.f20733c + b02;
                    while (this.f20733c < i5) {
                        list.add(Double.valueOf(Double.longBitsToDouble(j())));
                    }
                } else {
                    throw InvalidProtocolBufferException.e();
                }
            }
        }

        public String S() {
            return l(true);
        }

        public void T(List list) {
            int i2;
            int i3;
            if (list instanceof LongArrayList) {
                LongArrayList longArrayList = (LongArrayList) list;
                int b2 = WireFormat.b(this.f20735e);
                if (b2 == 1) {
                    do {
                        longArrayList.m(q());
                        if (!a()) {
                            i3 = this.f20733c;
                        } else {
                            return;
                        }
                    } while (b0() == this.f20735e);
                    this.f20733c = i3;
                } else if (b2 == 2) {
                    int b0 = b0();
                    m0(b0);
                    int i4 = this.f20733c + b0;
                    while (this.f20733c < i4) {
                        longArrayList.m(j());
                    }
                } else {
                    throw InvalidProtocolBufferException.e();
                }
            } else {
                int b3 = WireFormat.b(this.f20735e);
                if (b3 == 1) {
                    do {
                        list.add(Long.valueOf(q()));
                        if (!a()) {
                            i2 = this.f20733c;
                        } else {
                            return;
                        }
                    } while (b0() == this.f20735e);
                    this.f20733c = i2;
                } else if (b3 == 2) {
                    int b02 = b0();
                    m0(b02);
                    int i5 = this.f20733c + b02;
                    while (this.f20733c < i5) {
                        list.add(Long.valueOf(j()));
                    }
                } else {
                    throw InvalidProtocolBufferException.e();
                }
            }
        }

        public Object U(Class cls, ExtensionRegistryLite extensionRegistryLite) {
            g0(2);
            return k(Protobuf.a().c(cls), extensionRegistryLite);
        }

        public Object V(Class cls, ExtensionRegistryLite extensionRegistryLite) {
            g0(3);
            return d(Protobuf.a().c(cls), extensionRegistryLite);
        }

        public void W(Object obj, Schema schema, ExtensionRegistryLite extensionRegistryLite) {
            int b0 = b0();
            e0(b0);
            int i2 = this.f20734d;
            int i3 = this.f20733c + b0;
            this.f20734d = i3;
            try {
                schema.h(obj, this, extensionRegistryLite);
                if (this.f20733c != i3) {
                    throw InvalidProtocolBufferException.h();
                }
            } finally {
                this.f20734d = i2;
            }
        }

        /* JADX WARNING: Can't wrap try/catch for region: R(3:20|21|(2:23|35)(3:30|24|25)) */
        /* JADX WARNING: Code restructure failed: missing block: B:22:0x0054, code lost:
            if (O() != false) goto L_0x0056;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:25:0x005c, code lost:
            throw new androidx.datastore.preferences.protobuf.InvalidProtocolBufferException("Unable to parse map entry.");
         */
        /* JADX WARNING: Missing exception handler attribute for start block: B:20:0x0050 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void X(java.util.Map r8, androidx.datastore.preferences.protobuf.MapEntryLite.Metadata r9, androidx.datastore.preferences.protobuf.ExtensionRegistryLite r10) {
            /*
                r7 = this;
                r0 = 2
                r7.g0(r0)
                int r1 = r7.b0()
                r7.e0(r1)
                int r2 = r7.f20734d
                int r3 = r7.f20733c
                int r3 = r3 + r1
                r7.f20734d = r3
                java.lang.Object r1 = r9.f21061b     // Catch:{ all -> 0x0025 }
                java.lang.Object r3 = r9.f21063d     // Catch:{ all -> 0x0025 }
            L_0x0016:
                int r4 = r7.J()     // Catch:{ all -> 0x0025 }
                r5 = 2147483647(0x7fffffff, float:NaN)
                if (r4 != r5) goto L_0x0027
                r8.put(r1, r3)     // Catch:{ all -> 0x0025 }
                r7.f20734d = r2
                return
            L_0x0025:
                r8 = move-exception
                goto L_0x005d
            L_0x0027:
                r5 = 1
                java.lang.String r6 = "Unable to parse map entry."
                if (r4 == r5) goto L_0x0048
                if (r4 == r0) goto L_0x003b
                boolean r4 = r7.O()     // Catch:{ InvalidWireTypeException -> 0x0050 }
                if (r4 == 0) goto L_0x0035
                goto L_0x0016
            L_0x0035:
                androidx.datastore.preferences.protobuf.InvalidProtocolBufferException r4 = new androidx.datastore.preferences.protobuf.InvalidProtocolBufferException     // Catch:{ InvalidWireTypeException -> 0x0050 }
                r4.<init>((java.lang.String) r6)     // Catch:{ InvalidWireTypeException -> 0x0050 }
                throw r4     // Catch:{ InvalidWireTypeException -> 0x0050 }
            L_0x003b:
                androidx.datastore.preferences.protobuf.WireFormat$FieldType r4 = r9.f21062c     // Catch:{ InvalidWireTypeException -> 0x0050 }
                java.lang.Object r5 = r9.f21063d     // Catch:{ InvalidWireTypeException -> 0x0050 }
                java.lang.Class r5 = r5.getClass()     // Catch:{ InvalidWireTypeException -> 0x0050 }
                java.lang.Object r3 = r7.c(r4, r5, r10)     // Catch:{ InvalidWireTypeException -> 0x0050 }
                goto L_0x0016
            L_0x0048:
                androidx.datastore.preferences.protobuf.WireFormat$FieldType r4 = r9.f21060a     // Catch:{ InvalidWireTypeException -> 0x0050 }
                r5 = 0
                java.lang.Object r1 = r7.c(r4, r5, r5)     // Catch:{ InvalidWireTypeException -> 0x0050 }
                goto L_0x0016
            L_0x0050:
                boolean r4 = r7.O()     // Catch:{ all -> 0x0025 }
                if (r4 == 0) goto L_0x0057
                goto L_0x0016
            L_0x0057:
                androidx.datastore.preferences.protobuf.InvalidProtocolBufferException r8 = new androidx.datastore.preferences.protobuf.InvalidProtocolBufferException     // Catch:{ all -> 0x0025 }
                r8.<init>((java.lang.String) r6)     // Catch:{ all -> 0x0025 }
                throw r8     // Catch:{ all -> 0x0025 }
            L_0x005d:
                r7.f20734d = r2
                throw r8
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.BinaryReader.SafeHeapReader.X(java.util.Map, androidx.datastore.preferences.protobuf.MapEntryLite$Metadata, androidx.datastore.preferences.protobuf.ExtensionRegistryLite):void");
        }

        public void Y(Object obj, Schema schema, ExtensionRegistryLite extensionRegistryLite) {
            int i2 = this.f20736f;
            this.f20736f = WireFormat.c(WireFormat.a(this.f20735e), 4);
            try {
                schema.h(obj, this, extensionRegistryLite);
                if (this.f20735e != this.f20736f) {
                    throw InvalidProtocolBufferException.h();
                }
            } finally {
                this.f20736f = i2;
            }
        }

        public void Z(List list, Schema schema, ExtensionRegistryLite extensionRegistryLite) {
            int i2;
            if (WireFormat.b(this.f20735e) == 3) {
                int i3 = this.f20735e;
                do {
                    list.add(d(schema, extensionRegistryLite));
                    if (!a()) {
                        i2 = this.f20733c;
                    } else {
                        return;
                    }
                } while (b0() == i3);
                this.f20733c = i2;
                return;
            }
            throw InvalidProtocolBufferException.e();
        }

        public final boolean a() {
            return this.f20733c == this.f20734d;
        }

        public void a0(List list, Schema schema, ExtensionRegistryLite extensionRegistryLite) {
            int i2;
            if (WireFormat.b(this.f20735e) == 2) {
                int i3 = this.f20735e;
                do {
                    list.add(k(schema, extensionRegistryLite));
                    if (!a()) {
                        i2 = this.f20733c;
                    } else {
                        return;
                    }
                } while (b0() == i3);
                this.f20733c = i2;
                return;
            }
            throw InvalidProtocolBufferException.e();
        }

        public final byte b() {
            int i2 = this.f20733c;
            if (i2 != this.f20734d) {
                byte[] bArr = this.f20732b;
                this.f20733c = i2 + 1;
                return bArr[i2];
            }
            throw InvalidProtocolBufferException.m();
        }

        public final int b0() {
            byte b2;
            byte b3;
            int i2 = this.f20733c;
            int i3 = this.f20734d;
            if (i3 != i2) {
                byte[] bArr = this.f20732b;
                int i4 = i2 + 1;
                byte b4 = bArr[i2];
                if (b4 >= 0) {
                    this.f20733c = i4;
                    return b4;
                } else if (i3 - i4 < 9) {
                    return (int) d0();
                } else {
                    int i5 = i2 + 2;
                    byte b5 = (bArr[i4] << 7) ^ b4;
                    if (b5 < 0) {
                        b2 = b5 ^ Byte.MIN_VALUE;
                    } else {
                        int i6 = i2 + 3;
                        byte b6 = (bArr[i5] << 14) ^ b5;
                        if (b6 >= 0) {
                            b3 = b6 ^ 16256;
                        } else {
                            int i7 = i2 + 4;
                            byte b7 = b6 ^ (bArr[i6] << 21);
                            if (b7 < 0) {
                                b2 = -2080896 ^ b7;
                            } else {
                                i6 = i2 + 5;
                                byte b8 = bArr[i7];
                                byte b9 = (b7 ^ (b8 << 28)) ^ 266354560;
                                if (b8 < 0) {
                                    i7 = i2 + 6;
                                    if (bArr[i6] < 0) {
                                        i6 = i2 + 7;
                                        if (bArr[i7] < 0) {
                                            i7 = i2 + 8;
                                            if (bArr[i6] < 0) {
                                                i6 = i2 + 9;
                                                if (bArr[i7] < 0) {
                                                    int i8 = i2 + 10;
                                                    if (bArr[i6] >= 0) {
                                                        byte b10 = b9;
                                                        i5 = i8;
                                                        b2 = b10;
                                                    } else {
                                                        throw InvalidProtocolBufferException.f();
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    b2 = b9;
                                }
                                b3 = b9;
                            }
                            i5 = i7;
                        }
                        i5 = i6;
                    }
                    this.f20733c = i5;
                    return b2;
                }
            } else {
                throw InvalidProtocolBufferException.m();
            }
        }

        public final Object c(WireFormat.FieldType fieldType, Class cls, ExtensionRegistryLite extensionRegistryLite) {
            switch (AnonymousClass1.f20730a[fieldType.ordinal()]) {
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
                    throw new RuntimeException("unsupported field type.");
            }
        }

        public long c0() {
            long j2;
            long j3;
            long j4;
            int i2 = this.f20733c;
            int i3 = this.f20734d;
            if (i3 != i2) {
                byte[] bArr = this.f20732b;
                int i4 = i2 + 1;
                byte b2 = bArr[i2];
                if (b2 >= 0) {
                    this.f20733c = i4;
                    return (long) b2;
                } else if (i3 - i4 < 9) {
                    return d0();
                } else {
                    int i5 = i2 + 2;
                    byte b3 = (bArr[i4] << 7) ^ b2;
                    if (b3 < 0) {
                        j2 = (long) (b3 ^ Byte.MIN_VALUE);
                    } else {
                        int i6 = i2 + 3;
                        byte b4 = (bArr[i5] << 14) ^ b3;
                        if (b4 >= 0) {
                            j2 = (long) (b4 ^ 16256);
                            i5 = i6;
                        } else {
                            int i7 = i2 + 4;
                            byte b5 = b4 ^ (bArr[i6] << 21);
                            if (b5 < 0) {
                                i5 = i7;
                                j2 = (long) (-2080896 ^ b5);
                            } else {
                                long j5 = (long) b5;
                                int i8 = i2 + 5;
                                long j6 = j5 ^ (((long) bArr[i7]) << 28);
                                if (j6 >= 0) {
                                    j4 = 266354560;
                                } else {
                                    int i9 = i2 + 6;
                                    long j7 = j6 ^ (((long) bArr[i8]) << 35);
                                    if (j7 < 0) {
                                        j3 = -34093383808L;
                                    } else {
                                        i8 = i2 + 7;
                                        j6 = j7 ^ (((long) bArr[i9]) << 42);
                                        if (j6 >= 0) {
                                            j4 = 4363953127296L;
                                        } else {
                                            i9 = i2 + 8;
                                            j7 = j6 ^ (((long) bArr[i8]) << 49);
                                            if (j7 < 0) {
                                                j3 = -558586000294016L;
                                            } else {
                                                i5 = i2 + 9;
                                                long j8 = (j7 ^ (((long) bArr[i9]) << 56)) ^ 71499008037633920L;
                                                if (j8 < 0) {
                                                    int i10 = i2 + 10;
                                                    if (((long) bArr[i5]) >= 0) {
                                                        i5 = i10;
                                                    } else {
                                                        throw InvalidProtocolBufferException.f();
                                                    }
                                                }
                                                j2 = j8;
                                            }
                                        }
                                    }
                                    j2 = j7 ^ j3;
                                    i5 = i9;
                                }
                                j2 = j6 ^ j4;
                            }
                        }
                    }
                    this.f20733c = i5;
                    return j2;
                }
            } else {
                throw InvalidProtocolBufferException.m();
            }
        }

        public final Object d(Schema schema, ExtensionRegistryLite extensionRegistryLite) {
            Object g2 = schema.g();
            Y(g2, schema, extensionRegistryLite);
            schema.d(g2);
            return g2;
        }

        public final long d0() {
            long j2 = 0;
            for (int i2 = 0; i2 < 64; i2 += 7) {
                byte b2 = b();
                j2 |= ((long) (b2 & Byte.MAX_VALUE)) << i2;
                if ((b2 & 128) == 0) {
                    return j2;
                }
            }
            throw InvalidProtocolBufferException.f();
        }

        public final int e() {
            e0(4);
            return f();
        }

        public final void e0(int i2) {
            if (i2 < 0 || i2 > this.f20734d - this.f20733c) {
                throw InvalidProtocolBufferException.m();
            }
        }

        public final int f() {
            int i2 = this.f20733c;
            byte[] bArr = this.f20732b;
            this.f20733c = i2 + 4;
            return ((bArr[i2 + 3] & 255) << 24) | (bArr[i2] & 255) | ((bArr[i2 + 1] & 255) << 8) | ((bArr[i2 + 2] & 255) << 16);
        }

        public final void f0(int i2) {
            if (this.f20733c != i2) {
                throw InvalidProtocolBufferException.m();
            }
        }

        public final long g() {
            e0(8);
            return j();
        }

        public final void g0(int i2) {
            if (WireFormat.b(this.f20735e) != i2) {
                throw InvalidProtocolBufferException.e();
            }
        }

        public String h() {
            return l(false);
        }

        public final void h0(int i2) {
            e0(i2);
            this.f20733c += i2;
        }

        public int i() {
            g0(0);
            return b0();
        }

        /* JADX WARNING: Removed duplicated region for block: B:1:0x000f A[LOOP:0: B:1:0x000f->B:4:0x001c, LOOP_START] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void i0() {
            /*
                r3 = this;
                int r0 = r3.f20736f
                int r1 = r3.f20735e
                int r1 = androidx.datastore.preferences.protobuf.WireFormat.a(r1)
                r2 = 4
                int r1 = androidx.datastore.preferences.protobuf.WireFormat.c(r1, r2)
                r3.f20736f = r1
            L_0x000f:
                int r1 = r3.J()
                r2 = 2147483647(0x7fffffff, float:NaN)
                if (r1 == r2) goto L_0x001e
                boolean r1 = r3.O()
                if (r1 != 0) goto L_0x000f
            L_0x001e:
                int r1 = r3.f20735e
                int r2 = r3.f20736f
                if (r1 != r2) goto L_0x0027
                r3.f20736f = r0
                return
            L_0x0027:
                androidx.datastore.preferences.protobuf.InvalidProtocolBufferException r0 = androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.h()
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.BinaryReader.SafeHeapReader.i0():void");
        }

        public final long j() {
            int i2 = this.f20733c;
            byte[] bArr = this.f20732b;
            this.f20733c = i2 + 8;
            return ((((long) bArr[i2 + 7]) & 255) << 56) | (((long) bArr[i2]) & 255) | ((((long) bArr[i2 + 1]) & 255) << 8) | ((((long) bArr[i2 + 2]) & 255) << 16) | ((((long) bArr[i2 + 3]) & 255) << 24) | ((((long) bArr[i2 + 4]) & 255) << 32) | ((((long) bArr[i2 + 5]) & 255) << 40) | ((((long) bArr[i2 + 6]) & 255) << 48);
        }

        public final void j0() {
            int i2 = this.f20734d;
            int i3 = this.f20733c;
            if (i2 - i3 >= 10) {
                byte[] bArr = this.f20732b;
                int i4 = 0;
                while (i4 < 10) {
                    int i5 = i3 + 1;
                    if (bArr[i3] >= 0) {
                        this.f20733c = i5;
                        return;
                    } else {
                        i4++;
                        i3 = i5;
                    }
                }
            }
            k0();
        }

        public final Object k(Schema schema, ExtensionRegistryLite extensionRegistryLite) {
            Object g2 = schema.g();
            W(g2, schema, extensionRegistryLite);
            schema.d(g2);
            return g2;
        }

        public final void k0() {
            int i2 = 0;
            while (i2 < 10) {
                if (b() < 0) {
                    i2++;
                } else {
                    return;
                }
            }
            throw InvalidProtocolBufferException.f();
        }

        public String l(boolean z2) {
            g0(2);
            int b0 = b0();
            if (b0 == 0) {
                return "";
            }
            e0(b0);
            if (z2) {
                byte[] bArr = this.f20732b;
                int i2 = this.f20733c;
                if (!Utf8.u(bArr, i2, i2 + b0)) {
                    throw InvalidProtocolBufferException.d();
                }
            }
            String str = new String(this.f20732b, this.f20733c, b0, Internal.f21003b);
            this.f20733c += b0;
            return str;
        }

        public final void l0(int i2) {
            e0(i2);
            if ((i2 & 3) != 0) {
                throw InvalidProtocolBufferException.h();
            }
        }

        public void m(List list, boolean z2) {
            int i2;
            int i3;
            if (WireFormat.b(this.f20735e) != 2) {
                throw InvalidProtocolBufferException.e();
            } else if (!(list instanceof LazyStringList) || z2) {
                do {
                    list.add(l(z2));
                    if (!a()) {
                        i2 = this.f20733c;
                    } else {
                        return;
                    }
                } while (b0() == this.f20735e);
                this.f20733c = i2;
            } else {
                LazyStringList lazyStringList = (LazyStringList) list;
                do {
                    lazyStringList.s0(M());
                    if (!a()) {
                        i3 = this.f20733c;
                    } else {
                        return;
                    }
                } while (b0() == this.f20735e);
                this.f20733c = i3;
            }
        }

        public final void m0(int i2) {
            e0(i2);
            if ((i2 & 7) != 0) {
                throw InvalidProtocolBufferException.h();
            }
        }

        public long n() {
            g0(0);
            return c0();
        }

        public void o(List list) {
            int i2;
            int i3;
            if (list instanceof IntArrayList) {
                IntArrayList intArrayList = (IntArrayList) list;
                int b2 = WireFormat.b(this.f20735e);
                if (b2 == 0) {
                    do {
                        intArrayList.g0(G());
                        if (!a()) {
                            i3 = this.f20733c;
                        } else {
                            return;
                        }
                    } while (b0() == this.f20735e);
                    this.f20733c = i3;
                } else if (b2 == 2) {
                    int b0 = this.f20733c + b0();
                    while (this.f20733c < b0) {
                        intArrayList.g0(CodedInputStream.c(b0()));
                    }
                } else {
                    throw InvalidProtocolBufferException.e();
                }
            } else {
                int b3 = WireFormat.b(this.f20735e);
                if (b3 == 0) {
                    do {
                        list.add(Integer.valueOf(G()));
                        if (!a()) {
                            i2 = this.f20733c;
                        } else {
                            return;
                        }
                    } while (b0() == this.f20735e);
                    this.f20733c = i2;
                } else if (b3 == 2) {
                    int b02 = this.f20733c + b0();
                    while (this.f20733c < b02) {
                        list.add(Integer.valueOf(CodedInputStream.c(b0())));
                    }
                } else {
                    throw InvalidProtocolBufferException.e();
                }
            }
        }

        public long p() {
            g0(0);
            return c0();
        }

        public long q() {
            g0(1);
            return g();
        }

        public void r(List list) {
            int i2;
            int i3;
            if (list instanceof IntArrayList) {
                IntArrayList intArrayList = (IntArrayList) list;
                int b2 = WireFormat.b(this.f20735e);
                if (b2 == 2) {
                    int b0 = b0();
                    l0(b0);
                    int i4 = this.f20733c + b0;
                    while (this.f20733c < i4) {
                        intArrayList.g0(f());
                    }
                } else if (b2 == 5) {
                    do {
                        intArrayList.g0(P());
                        if (!a()) {
                            i3 = this.f20733c;
                        } else {
                            return;
                        }
                    } while (b0() == this.f20735e);
                    this.f20733c = i3;
                } else {
                    throw InvalidProtocolBufferException.e();
                }
            } else {
                int b3 = WireFormat.b(this.f20735e);
                if (b3 == 2) {
                    int b02 = b0();
                    l0(b02);
                    int i5 = this.f20733c + b02;
                    while (this.f20733c < i5) {
                        list.add(Integer.valueOf(f()));
                    }
                } else if (b3 == 5) {
                    do {
                        list.add(Integer.valueOf(P()));
                        if (!a()) {
                            i2 = this.f20733c;
                        } else {
                            return;
                        }
                    } while (b0() == this.f20735e);
                    this.f20733c = i2;
                } else {
                    throw InvalidProtocolBufferException.e();
                }
            }
        }

        public double readDouble() {
            g0(1);
            return Double.longBitsToDouble(g());
        }

        public float readFloat() {
            g0(5);
            return Float.intBitsToFloat(e());
        }

        public void s(List list) {
            int i2;
            int i3;
            if (list instanceof LongArrayList) {
                LongArrayList longArrayList = (LongArrayList) list;
                int b2 = WireFormat.b(this.f20735e);
                if (b2 == 0) {
                    do {
                        longArrayList.m(H());
                        if (!a()) {
                            i3 = this.f20733c;
                        } else {
                            return;
                        }
                    } while (b0() == this.f20735e);
                    this.f20733c = i3;
                } else if (b2 == 2) {
                    int b0 = this.f20733c + b0();
                    while (this.f20733c < b0) {
                        longArrayList.m(CodedInputStream.d(c0()));
                    }
                } else {
                    throw InvalidProtocolBufferException.e();
                }
            } else {
                int b3 = WireFormat.b(this.f20735e);
                if (b3 == 0) {
                    do {
                        list.add(Long.valueOf(H()));
                        if (!a()) {
                            i2 = this.f20733c;
                        } else {
                            return;
                        }
                    } while (b0() == this.f20735e);
                    this.f20733c = i2;
                } else if (b3 == 2) {
                    int b02 = this.f20733c + b0();
                    while (this.f20733c < b02) {
                        list.add(Long.valueOf(CodedInputStream.d(c0())));
                    }
                } else {
                    throw InvalidProtocolBufferException.e();
                }
            }
        }

        public void t(List list) {
            int i2;
            int i3;
            if (list instanceof IntArrayList) {
                IntArrayList intArrayList = (IntArrayList) list;
                int b2 = WireFormat.b(this.f20735e);
                if (b2 == 0) {
                    do {
                        intArrayList.g0(y());
                        if (!a()) {
                            i3 = this.f20733c;
                        } else {
                            return;
                        }
                    } while (b0() == this.f20735e);
                    this.f20733c = i3;
                } else if (b2 == 2) {
                    int b0 = this.f20733c + b0();
                    while (this.f20733c < b0) {
                        intArrayList.g0(b0());
                    }
                } else {
                    throw InvalidProtocolBufferException.e();
                }
            } else {
                int b3 = WireFormat.b(this.f20735e);
                if (b3 == 0) {
                    do {
                        list.add(Integer.valueOf(y()));
                        if (!a()) {
                            i2 = this.f20733c;
                        } else {
                            return;
                        }
                    } while (b0() == this.f20735e);
                    this.f20733c = i2;
                } else if (b3 == 2) {
                    int b02 = this.f20733c + b0();
                    while (this.f20733c < b02) {
                        list.add(Integer.valueOf(b0()));
                    }
                } else {
                    throw InvalidProtocolBufferException.e();
                }
            }
        }

        public int u() {
            g0(5);
            return e();
        }

        public boolean v() {
            g0(0);
            return b0() != 0;
        }

        public long w() {
            g0(1);
            return g();
        }

        public void x(List list) {
            int i2;
            int i3;
            if (list instanceof LongArrayList) {
                LongArrayList longArrayList = (LongArrayList) list;
                int b2 = WireFormat.b(this.f20735e);
                if (b2 == 0) {
                    do {
                        longArrayList.m(p());
                        if (!a()) {
                            i3 = this.f20733c;
                        } else {
                            return;
                        }
                    } while (b0() == this.f20735e);
                    this.f20733c = i3;
                } else if (b2 == 2) {
                    int b0 = this.f20733c + b0();
                    while (this.f20733c < b0) {
                        longArrayList.m(c0());
                    }
                    f0(b0);
                } else {
                    throw InvalidProtocolBufferException.e();
                }
            } else {
                int b3 = WireFormat.b(this.f20735e);
                if (b3 == 0) {
                    do {
                        list.add(Long.valueOf(p()));
                        if (!a()) {
                            i2 = this.f20733c;
                        } else {
                            return;
                        }
                    } while (b0() == this.f20735e);
                    this.f20733c = i2;
                } else if (b3 == 2) {
                    int b02 = this.f20733c + b0();
                    while (this.f20733c < b02) {
                        list.add(Long.valueOf(c0()));
                    }
                    f0(b02);
                } else {
                    throw InvalidProtocolBufferException.e();
                }
            }
        }

        public int y() {
            g0(0);
            return b0();
        }

        public void z(List list) {
            int i2;
            int i3;
            if (list instanceof LongArrayList) {
                LongArrayList longArrayList = (LongArrayList) list;
                int b2 = WireFormat.b(this.f20735e);
                if (b2 == 0) {
                    do {
                        longArrayList.m(n());
                        if (!a()) {
                            i3 = this.f20733c;
                        } else {
                            return;
                        }
                    } while (b0() == this.f20735e);
                    this.f20733c = i3;
                } else if (b2 == 2) {
                    int b0 = this.f20733c + b0();
                    while (this.f20733c < b0) {
                        longArrayList.m(c0());
                    }
                    f0(b0);
                } else {
                    throw InvalidProtocolBufferException.e();
                }
            } else {
                int b3 = WireFormat.b(this.f20735e);
                if (b3 == 0) {
                    do {
                        list.add(Long.valueOf(n()));
                        if (!a()) {
                            i2 = this.f20733c;
                        } else {
                            return;
                        }
                    } while (b0() == this.f20735e);
                    this.f20733c = i2;
                } else if (b3 == 2) {
                    int b02 = this.f20733c + b0();
                    while (this.f20733c < b02) {
                        list.add(Long.valueOf(c0()));
                    }
                    f0(b02);
                } else {
                    throw InvalidProtocolBufferException.e();
                }
            }
        }
    }
}
