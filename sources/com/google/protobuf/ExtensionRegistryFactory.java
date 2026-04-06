package com.google.protobuf;

final class ExtensionRegistryFactory {

    /* renamed from: a  reason: collision with root package name */
    public static final Class f32106a = c();

    public static ExtensionRegistryLite a() {
        ExtensionRegistryLite b2 = b("getEmptyRegistry");
        return b2 != null ? b2 : ExtensionRegistryLite.f32109d;
    }

    public static final ExtensionRegistryLite b(String str) {
        Class cls = f32106a;
        if (cls == null) {
            return null;
        }
        try {
            return (ExtensionRegistryLite) cls.getDeclaredMethod(str, (Class[]) null).invoke((Object) null, (Object[]) null);
        } catch (Exception unused) {
            return null;
        }
    }

    public static Class c() {
        try {
            return Class.forName("com.google.protobuf.ExtensionRegistry");
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }
}
