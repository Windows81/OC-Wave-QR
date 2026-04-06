package com.google.protobuf;

@CheckReturnValue
final class RawMessageInfo implements MessageInfo {

    /* renamed from: a  reason: collision with root package name */
    public final MessageLite f32271a;

    /* renamed from: b  reason: collision with root package name */
    public final String f32272b;

    /* renamed from: c  reason: collision with root package name */
    public final Object[] f32273c;

    /* renamed from: d  reason: collision with root package name */
    public final int f32274d;

    public RawMessageInfo(MessageLite messageLite, String str, Object[] objArr) {
        this.f32271a = messageLite;
        this.f32272b = str;
        this.f32273c = objArr;
        char charAt = str.charAt(0);
        if (charAt < 55296) {
            this.f32274d = charAt;
            return;
        }
        char c2 = charAt & 8191;
        int i2 = 13;
        int i3 = 1;
        while (true) {
            int i4 = i3 + 1;
            char charAt2 = str.charAt(i3);
            if (charAt2 >= 55296) {
                c2 |= (charAt2 & 8191) << i2;
                i2 += 13;
                i3 = i4;
            } else {
                this.f32274d = c2 | (charAt2 << i2);
                return;
            }
        }
    }

    public boolean a() {
        return (this.f32274d & 2) == 2;
    }

    public MessageLite b() {
        return this.f32271a;
    }

    public ProtoSyntax c() {
        return (this.f32274d & 1) == 1 ? ProtoSyntax.PROTO2 : ProtoSyntax.PROTO3;
    }

    public Object[] d() {
        return this.f32273c;
    }

    public String e() {
        return this.f32272b;
    }
}
