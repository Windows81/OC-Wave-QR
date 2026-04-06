package com.google.protobuf;

@CheckReturnValue
final class NewInstanceSchemas {

    /* renamed from: a  reason: collision with root package name */
    public static final NewInstanceSchema f32253a = c();

    /* renamed from: b  reason: collision with root package name */
    public static final NewInstanceSchema f32254b = new NewInstanceSchemaLite();

    public static NewInstanceSchema a() {
        return f32253a;
    }

    public static NewInstanceSchema b() {
        return f32254b;
    }

    public static NewInstanceSchema c() {
        try {
            return (NewInstanceSchema) Class.forName("com.google.protobuf.NewInstanceSchemaFull").getDeclaredConstructor((Class[]) null).newInstance((Object[]) null);
        } catch (Exception unused) {
            return null;
        }
    }
}
