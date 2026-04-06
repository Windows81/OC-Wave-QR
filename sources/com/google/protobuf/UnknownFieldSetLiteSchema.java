package com.google.protobuf;

@CheckReturnValue
class UnknownFieldSetLiteSchema extends UnknownFieldSchema<UnknownFieldSetLite, UnknownFieldSetLite> {
    /* renamed from: A */
    public UnknownFieldSetLite g(Object obj) {
        return ((GeneratedMessageLite) obj).unknownFields;
    }

    /* renamed from: B */
    public int h(UnknownFieldSetLite unknownFieldSetLite) {
        return unknownFieldSetLite.d();
    }

    /* renamed from: C */
    public int i(UnknownFieldSetLite unknownFieldSetLite) {
        return unknownFieldSetLite.e();
    }

    /* renamed from: D */
    public UnknownFieldSetLite k(UnknownFieldSetLite unknownFieldSetLite, UnknownFieldSetLite unknownFieldSetLite2) {
        return UnknownFieldSetLite.c().equals(unknownFieldSetLite2) ? unknownFieldSetLite : UnknownFieldSetLite.c().equals(unknownFieldSetLite) ? UnknownFieldSetLite.j(unknownFieldSetLite, unknownFieldSetLite2) : unknownFieldSetLite.i(unknownFieldSetLite2);
    }

    /* renamed from: E */
    public UnknownFieldSetLite n() {
        return UnknownFieldSetLite.k();
    }

    /* renamed from: F */
    public void o(Object obj, UnknownFieldSetLite unknownFieldSetLite) {
        p(obj, unknownFieldSetLite);
    }

    /* renamed from: G */
    public void p(Object obj, UnknownFieldSetLite unknownFieldSetLite) {
        ((GeneratedMessageLite) obj).unknownFields = unknownFieldSetLite;
    }

    /* renamed from: H */
    public UnknownFieldSetLite r(UnknownFieldSetLite unknownFieldSetLite) {
        unknownFieldSetLite.h();
        return unknownFieldSetLite;
    }

    /* renamed from: I */
    public void s(UnknownFieldSetLite unknownFieldSetLite, Writer writer) {
        unknownFieldSetLite.p(writer);
    }

    /* renamed from: J */
    public void t(UnknownFieldSetLite unknownFieldSetLite, Writer writer) {
        unknownFieldSetLite.r(writer);
    }

    public void j(Object obj) {
        g(obj).h();
    }

    public boolean q(Reader reader) {
        return false;
    }

    /* renamed from: u */
    public void a(UnknownFieldSetLite unknownFieldSetLite, int i2, int i3) {
        unknownFieldSetLite.n(WireFormat.c(i2, 5), Integer.valueOf(i3));
    }

    /* renamed from: v */
    public void b(UnknownFieldSetLite unknownFieldSetLite, int i2, long j2) {
        unknownFieldSetLite.n(WireFormat.c(i2, 1), Long.valueOf(j2));
    }

    /* renamed from: w */
    public void c(UnknownFieldSetLite unknownFieldSetLite, int i2, UnknownFieldSetLite unknownFieldSetLite2) {
        unknownFieldSetLite.n(WireFormat.c(i2, 3), unknownFieldSetLite2);
    }

    /* renamed from: x */
    public void d(UnknownFieldSetLite unknownFieldSetLite, int i2, ByteString byteString) {
        unknownFieldSetLite.n(WireFormat.c(i2, 2), byteString);
    }

    /* renamed from: y */
    public void e(UnknownFieldSetLite unknownFieldSetLite, int i2, long j2) {
        unknownFieldSetLite.n(WireFormat.c(i2, 0), Long.valueOf(j2));
    }

    /* renamed from: z */
    public UnknownFieldSetLite f(Object obj) {
        UnknownFieldSetLite A2 = g(obj);
        if (A2 != UnknownFieldSetLite.c()) {
            return A2;
        }
        UnknownFieldSetLite k2 = UnknownFieldSetLite.k();
        p(obj, k2);
        return k2;
    }
}
