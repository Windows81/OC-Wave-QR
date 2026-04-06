package com.google.protobuf;

@CheckReturnValue
final class MapFieldSchemas {

    /* renamed from: a  reason: collision with root package name */
    public static final MapFieldSchema f32224a = c();

    /* renamed from: b  reason: collision with root package name */
    public static final MapFieldSchema f32225b = new MapFieldSchemaLite();

    public static MapFieldSchema a() {
        return f32224a;
    }

    public static MapFieldSchema b() {
        return f32225b;
    }

    public static MapFieldSchema c() {
        try {
            return (MapFieldSchema) Class.forName("com.google.protobuf.MapFieldSchemaFull").getDeclaredConstructor((Class[]) null).newInstance((Object[]) null);
        } catch (Exception unused) {
            return null;
        }
    }
}
