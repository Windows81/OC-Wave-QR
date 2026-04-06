package androidx.datastore.preferences.protobuf;

@CheckReturnValue
final class RawMessageInfo implements MessageInfo {

    /* renamed from: a  reason: collision with root package name */
    public final MessageLite f21113a;

    /* renamed from: b  reason: collision with root package name */
    public final String f21114b;

    /* renamed from: c  reason: collision with root package name */
    public final Object[] f21115c;

    /* renamed from: d  reason: collision with root package name */
    public final int f21116d;

    public RawMessageInfo(MessageLite messageLite, String str, Object[] objArr) {
        this.f21113a = messageLite;
        this.f21114b = str;
        this.f21115c = objArr;
        char charAt = str.charAt(0);
        if (charAt < 55296) {
            this.f21116d = charAt;
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
                this.f21116d = c2 | (charAt2 << i2);
                return;
            }
        }
    }

    public boolean a() {
        return (this.f21116d & 2) == 2;
    }

    public MessageLite b() {
        return this.f21113a;
    }

    public ProtoSyntax c() {
        int i2 = this.f21116d;
        return (i2 & 1) != 0 ? ProtoSyntax.PROTO2 : (i2 & 4) == 4 ? ProtoSyntax.EDITIONS : ProtoSyntax.PROTO3;
    }

    public Object[] d() {
        return this.f21115c;
    }

    public String e() {
        return this.f21114b;
    }
}
