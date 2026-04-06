package okhttp3.internal.http2;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okio.ByteString;

@Metadata
public final class Header {

    /* renamed from: d  reason: collision with root package name */
    public static final Companion f43029d = new Companion((DefaultConstructorMarker) null);

    /* renamed from: e  reason: collision with root package name */
    public static final ByteString f43030e;

    /* renamed from: f  reason: collision with root package name */
    public static final ByteString f43031f;

    /* renamed from: g  reason: collision with root package name */
    public static final ByteString f43032g;

    /* renamed from: h  reason: collision with root package name */
    public static final ByteString f43033h;

    /* renamed from: i  reason: collision with root package name */
    public static final ByteString f43034i;

    /* renamed from: j  reason: collision with root package name */
    public static final ByteString f43035j;

    /* renamed from: a  reason: collision with root package name */
    public final ByteString f43036a;

    /* renamed from: b  reason: collision with root package name */
    public final ByteString f43037b;

    /* renamed from: c  reason: collision with root package name */
    public final int f43038c;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    static {
        ByteString.Companion companion = ByteString.C;
        f43030e = companion.d(":");
        f43031f = companion.d(":status");
        f43032g = companion.d(":method");
        f43033h = companion.d(":path");
        f43034i = companion.d(":scheme");
        f43035j = companion.d(":authority");
    }

    public Header(ByteString byteString, ByteString byteString2) {
        Intrinsics.i(byteString, "name");
        Intrinsics.i(byteString2, "value");
        this.f43036a = byteString;
        this.f43037b = byteString2;
        this.f43038c = byteString.N() + 32 + byteString2.N();
    }

    public final ByteString a() {
        return this.f43036a;
    }

    public final ByteString b() {
        return this.f43037b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Header)) {
            return false;
        }
        Header header = (Header) obj;
        return Intrinsics.d(this.f43036a, header.f43036a) && Intrinsics.d(this.f43037b, header.f43037b);
    }

    public int hashCode() {
        return (this.f43036a.hashCode() * 31) + this.f43037b.hashCode();
    }

    public String toString() {
        return this.f43036a.U() + ": " + this.f43037b.U();
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public Header(java.lang.String r2, java.lang.String r3) {
        /*
            r1 = this;
            java.lang.String r0 = "name"
            kotlin.jvm.internal.Intrinsics.i(r2, r0)
            java.lang.String r0 = "value"
            kotlin.jvm.internal.Intrinsics.i(r3, r0)
            okio.ByteString$Companion r0 = okio.ByteString.C
            okio.ByteString r2 = r0.d(r2)
            okio.ByteString r3 = r0.d(r3)
            r1.<init>((okio.ByteString) r2, (okio.ByteString) r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http2.Header.<init>(java.lang.String, java.lang.String):void");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public Header(ByteString byteString, String str) {
        this(byteString, ByteString.C.d(str));
        Intrinsics.i(byteString, "name");
        Intrinsics.i(str, "value");
    }
}
