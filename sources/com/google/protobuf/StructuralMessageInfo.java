package com.google.protobuf;

@CheckReturnValue
final class StructuralMessageInfo implements MessageInfo {

    /* renamed from: a  reason: collision with root package name */
    public final ProtoSyntax f32308a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f32309b;

    /* renamed from: c  reason: collision with root package name */
    public final int[] f32310c;

    /* renamed from: d  reason: collision with root package name */
    public final FieldInfo[] f32311d;

    /* renamed from: e  reason: collision with root package name */
    public final MessageLite f32312e;

    public static final class Builder {
    }

    public boolean a() {
        return this.f32309b;
    }

    public MessageLite b() {
        return this.f32312e;
    }

    public ProtoSyntax c() {
        return this.f32308a;
    }

    public int[] d() {
        return this.f32310c;
    }

    public FieldInfo[] e() {
        return this.f32311d;
    }
}
