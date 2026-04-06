package androidx.datastore.preferences.protobuf;

@CheckReturnValue
final class ListFieldSchemas {

    /* renamed from: a  reason: collision with root package name */
    public static final ListFieldSchema f21047a = c();

    /* renamed from: b  reason: collision with root package name */
    public static final ListFieldSchema f21048b = new ListFieldSchemaLite();

    public static ListFieldSchema a() {
        return f21047a;
    }

    public static ListFieldSchema b() {
        return f21048b;
    }

    public static ListFieldSchema c() {
        if (Protobuf.f21108d) {
            return null;
        }
        try {
            return (ListFieldSchema) Class.forName("androidx.datastore.preferences.protobuf.ListFieldSchemaFull").getDeclaredConstructor((Class[]) null).newInstance((Object[]) null);
        } catch (Exception unused) {
            return null;
        }
    }
}
