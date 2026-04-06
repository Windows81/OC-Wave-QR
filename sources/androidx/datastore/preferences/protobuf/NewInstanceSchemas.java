package androidx.datastore.preferences.protobuf;

@CheckReturnValue
final class NewInstanceSchemas {

    /* renamed from: a  reason: collision with root package name */
    public static final NewInstanceSchema f21095a = c();

    /* renamed from: b  reason: collision with root package name */
    public static final NewInstanceSchema f21096b = new NewInstanceSchemaLite();

    public static NewInstanceSchema a() {
        return f21095a;
    }

    public static NewInstanceSchema b() {
        return f21096b;
    }

    public static NewInstanceSchema c() {
        if (Protobuf.f21108d) {
            return null;
        }
        try {
            return (NewInstanceSchema) Class.forName("androidx.datastore.preferences.protobuf.NewInstanceSchemaFull").getDeclaredConstructor((Class[]) null).newInstance((Object[]) null);
        } catch (Exception unused) {
            return null;
        }
    }
}
