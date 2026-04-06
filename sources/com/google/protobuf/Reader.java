package com.google.protobuf;

import com.google.protobuf.MapEntryLite;
import java.util.List;
import java.util.Map;

@CheckReturnValue
interface Reader {
    void A(List list);

    void B(List list);

    void C(List list);

    int D();

    int E();

    void F(List list);

    int G();

    long H();

    void I(List list);

    int J();

    void K(List list);

    void L(List list);

    ByteString M();

    void N(List list);

    boolean O();

    int P();

    void Q(List list);

    void R(List list);

    String S();

    void T(List list);

    void a(List list, Schema schema, ExtensionRegistryLite extensionRegistryLite);

    Object b(Class cls, ExtensionRegistryLite extensionRegistryLite);

    void c(Object obj, Schema schema, ExtensionRegistryLite extensionRegistryLite);

    void d(List list, Schema schema, ExtensionRegistryLite extensionRegistryLite);

    Object e(Class cls, ExtensionRegistryLite extensionRegistryLite);

    void f(Object obj, Schema schema, ExtensionRegistryLite extensionRegistryLite);

    void g(Map map, MapEntryLite.Metadata metadata, ExtensionRegistryLite extensionRegistryLite);

    String h();

    int i();

    long n();

    void o(List list);

    long p();

    long q();

    void r(List list);

    double readDouble();

    float readFloat();

    void s(List list);

    void t(List list);

    int u();

    boolean v();

    long w();

    void x(List list);

    int y();

    void z(List list);
}
