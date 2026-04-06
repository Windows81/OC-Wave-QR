package androidx.datastore.preferences.protobuf;

@CheckReturnValue
abstract class UnknownFieldSchema<T, B> {

    /* renamed from: a  reason: collision with root package name */
    public static volatile int f21170a = 100;

    public abstract void a(Object obj, int i2, int i3);

    public abstract void b(Object obj, int i2, long j2);

    public abstract void c(Object obj, int i2, Object obj2);

    public abstract void d(Object obj, int i2, ByteString byteString);

    public abstract void e(Object obj, int i2, long j2);

    public abstract Object f(Object obj);

    public abstract Object g(Object obj);

    public abstract int h(Object obj);

    public abstract int i(Object obj);

    public abstract void j(Object obj);

    public abstract Object k(Object obj, Object obj2);

    /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP:0: B:0:0x0000->B:3:0x000d, LOOP_START, MTH_ENTER_BLOCK] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void l(java.lang.Object r3, androidx.datastore.preferences.protobuf.Reader r4, int r5) {
        /*
            r2 = this;
        L_0x0000:
            int r0 = r4.J()
            r1 = 2147483647(0x7fffffff, float:NaN)
            if (r0 == r1) goto L_0x000f
            boolean r0 = r2.m(r3, r4, r5)
            if (r0 != 0) goto L_0x0000
        L_0x000f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.UnknownFieldSchema.l(java.lang.Object, androidx.datastore.preferences.protobuf.Reader, int):void");
    }

    public final boolean m(Object obj, Reader reader, int i2) {
        int E = reader.E();
        int a2 = WireFormat.a(E);
        int b2 = WireFormat.b(E);
        if (b2 == 0) {
            e(obj, a2, reader.n());
            return true;
        } else if (b2 == 1) {
            b(obj, a2, reader.q());
            return true;
        } else if (b2 == 2) {
            d(obj, a2, reader.M());
            return true;
        } else if (b2 == 3) {
            Object n2 = n();
            int c2 = WireFormat.c(a2, 4);
            int i3 = i2 + 1;
            if (i3 < f21170a) {
                l(n2, reader, i3);
                if (c2 == reader.E()) {
                    c(obj, a2, r(n2));
                    return true;
                }
                throw InvalidProtocolBufferException.b();
            }
            throw InvalidProtocolBufferException.i();
        } else if (b2 == 4) {
            return false;
        } else {
            if (b2 == 5) {
                a(obj, a2, reader.u());
                return true;
            }
            throw InvalidProtocolBufferException.e();
        }
    }

    public abstract Object n();

    public abstract void o(Object obj, Object obj2);

    public abstract void p(Object obj, Object obj2);

    public abstract boolean q(Reader reader);

    public abstract Object r(Object obj);

    public abstract void s(Object obj, Writer writer);

    public abstract void t(Object obj, Writer writer);
}
