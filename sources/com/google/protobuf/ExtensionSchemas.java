package com.google.protobuf;

@CheckReturnValue
final class ExtensionSchemas {

    /* renamed from: a  reason: collision with root package name */
    public static final ExtensionSchema f32115a = new ExtensionSchemaLite();

    /* renamed from: b  reason: collision with root package name */
    public static final ExtensionSchema f32116b = c();

    public static ExtensionSchema a() {
        ExtensionSchema extensionSchema = f32116b;
        if (extensionSchema != null) {
            return extensionSchema;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }

    public static ExtensionSchema b() {
        return f32115a;
    }

    public static ExtensionSchema c() {
        try {
            return (ExtensionSchema) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor((Class[]) null).newInstance((Object[]) null);
        } catch (Exception unused) {
            return null;
        }
    }
}
