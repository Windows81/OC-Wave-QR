package com.google.protobuf;

import com.google.protobuf.MapEntryLite;
import java.util.List;
import java.util.Map;

@CheckReturnValue
interface Writer {

    public enum FieldOrder {
        ASCENDING,
        DESCENDING
    }

    void A(int i2, long j2);

    void B(int i2, Object obj);

    void C(int i2, List list, boolean z2);

    void D(int i2, long j2);

    void E(int i2, boolean z2);

    void F(int i2, int i3);

    void G(int i2);

    void H(int i2, List list, boolean z2);

    void I(int i2, List list, boolean z2);

    void J(int i2, long j2);

    void K(int i2, List list, boolean z2);

    void L(int i2, List list, boolean z2);

    void M(int i2, List list, boolean z2);

    void N(int i2, List list, boolean z2);

    void O(int i2, long j2);

    void P(int i2, float f2);

    void Q(int i2);

    void R(int i2, List list, boolean z2);

    void S(int i2, int i3);

    void T(int i2, List list, boolean z2);

    void U(int i2, List list, boolean z2);

    void V(int i2, List list, boolean z2);

    void W(int i2, int i3);

    void X(int i2, List list);

    void a(int i2, List list, Schema schema);

    void b(int i2, List list, Schema schema);

    void c(int i2, Object obj, Schema schema);

    void d(int i2, Object obj, Schema schema);

    void e(int i2, ByteString byteString);

    void f(int i2, MapEntryLite.Metadata metadata, Map map);

    void o(int i2, int i3);

    void p(int i2, List list, boolean z2);

    void q(int i2, int i3);

    void r(int i2, Object obj);

    void s(int i2, int i3);

    void t(int i2, double d2);

    void u(int i2, List list, boolean z2);

    void v(int i2, List list, boolean z2);

    void w(int i2, long j2);

    FieldOrder x();

    void y(int i2, List list);

    void z(int i2, String str);
}
