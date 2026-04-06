package androidx.datastore.preferences.protobuf;

@CheckReturnValue
final class MapFieldSchemas {

    /* renamed from: a  reason: collision with root package name */
    public static final MapFieldSchema f21066a = c();

    /* renamed from: b  reason: collision with root package name */
    public static final MapFieldSchema f21067b = new MapFieldSchemaLite();

    public static MapFieldSchema a() {
        return f21066a;
    }

    public static MapFieldSchema b() {
        return f21067b;
    }

    public static MapFieldSchema c() {
        if (Protobuf.f21108d) {
            return null;
        }
        try {
            return (MapFieldSchema) Class.forName("androidx.datastore.preferences.protobuf.MapFieldSchemaFull").getDeclaredConstructor((Class[]) null).newInstance((Object[]) null);
        } catch (Exception unused) {
            return null;
        }
    }
}
