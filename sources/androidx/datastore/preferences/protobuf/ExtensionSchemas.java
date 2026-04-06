package androidx.datastore.preferences.protobuf;

@CheckReturnValue
final class ExtensionSchemas {

    /* renamed from: a  reason: collision with root package name */
    public static final ExtensionSchema f20950a = new ExtensionSchemaLite();

    /* renamed from: b  reason: collision with root package name */
    public static final ExtensionSchema f20951b = c();

    public static ExtensionSchema a() {
        ExtensionSchema extensionSchema = f20951b;
        if (extensionSchema != null) {
            return extensionSchema;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }

    public static ExtensionSchema b() {
        return f20950a;
    }

    public static ExtensionSchema c() {
        if (Protobuf.f21108d) {
            return null;
        }
        try {
            return (ExtensionSchema) Class.forName("androidx.datastore.preferences.protobuf.ExtensionSchemaFull").getDeclaredConstructor((Class[]) null).newInstance((Object[]) null);
        } catch (Exception unused) {
            return null;
        }
    }
}
