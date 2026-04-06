package okhttp3.internal.ws;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import okhttp3.Headers;
import okhttp3.internal.Util;

@Metadata
public final class WebSocketExtensions {

    /* renamed from: g  reason: collision with root package name */
    public static final Companion f43293g = new Companion((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    public final boolean f43294a;

    /* renamed from: b  reason: collision with root package name */
    public final Integer f43295b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f43296c;

    /* renamed from: d  reason: collision with root package name */
    public final Integer f43297d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f43298e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f43299f;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final WebSocketExtensions a(Headers headers) {
            Headers headers2 = headers;
            Intrinsics.i(headers2, "responseHeaders");
            int size = headers.size();
            boolean z2 = false;
            Integer num = null;
            boolean z3 = false;
            Integer num2 = null;
            boolean z4 = false;
            boolean z5 = false;
            for (int i2 = 0; i2 < size; i2++) {
                if (StringsKt.B(headers2.h(i2), "Sec-WebSocket-Extensions", true)) {
                    String o2 = headers2.o(i2);
                    int i3 = 0;
                    while (i3 < o2.length()) {
                        int r2 = Util.r(o2, ',', i3, 0, 4, (Object) null);
                        int p2 = Util.p(o2, ';', i3, r2);
                        String Z = Util.Z(o2, i3, p2);
                        int i4 = p2 + 1;
                        if (StringsKt.B(Z, "permessage-deflate", true)) {
                            if (z2) {
                                z5 = true;
                            }
                            i3 = i4;
                            while (i3 < r2) {
                                int p3 = Util.p(o2, ';', i3, r2);
                                int p4 = Util.p(o2, '=', i3, p3);
                                String Z2 = Util.Z(o2, i3, p4);
                                String F0 = p4 < p3 ? StringsKt.F0(Util.Z(o2, p4 + 1, p3), "\"") : null;
                                i3 = p3 + 1;
                                if (StringsKt.B(Z2, "client_max_window_bits", true)) {
                                    if (num != null) {
                                        z5 = true;
                                    }
                                    num = F0 != null ? StringsKt.q(F0) : null;
                                    if (num != null) {
                                    }
                                } else if (StringsKt.B(Z2, "client_no_context_takeover", true)) {
                                    if (z3) {
                                        z5 = true;
                                    }
                                    if (F0 != null) {
                                        z5 = true;
                                    }
                                    z3 = true;
                                } else if (StringsKt.B(Z2, "server_max_window_bits", true)) {
                                    if (num2 != null) {
                                        z5 = true;
                                    }
                                    num2 = F0 != null ? StringsKt.q(F0) : null;
                                    if (num2 != null) {
                                    }
                                } else if (StringsKt.B(Z2, "server_no_context_takeover", true)) {
                                    if (z4) {
                                        z5 = true;
                                    }
                                    if (F0 != null) {
                                        z5 = true;
                                    }
                                    z4 = true;
                                }
                                z5 = true;
                            }
                            z2 = true;
                        } else {
                            i3 = i4;
                            z5 = true;
                        }
                    }
                }
            }
            return new WebSocketExtensions(z2, num, z3, num2, z4, z5);
        }

        public Companion() {
        }
    }

    public WebSocketExtensions(boolean z2, Integer num, boolean z3, Integer num2, boolean z4, boolean z5) {
        this.f43294a = z2;
        this.f43295b = num;
        this.f43296c = z3;
        this.f43297d = num2;
        this.f43298e = z4;
        this.f43299f = z5;
    }

    public final boolean a(boolean z2) {
        return z2 ? this.f43296c : this.f43298e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WebSocketExtensions)) {
            return false;
        }
        WebSocketExtensions webSocketExtensions = (WebSocketExtensions) obj;
        return this.f43294a == webSocketExtensions.f43294a && Intrinsics.d(this.f43295b, webSocketExtensions.f43295b) && this.f43296c == webSocketExtensions.f43296c && Intrinsics.d(this.f43297d, webSocketExtensions.f43297d) && this.f43298e == webSocketExtensions.f43298e && this.f43299f == webSocketExtensions.f43299f;
    }

    public int hashCode() {
        boolean z2 = this.f43294a;
        boolean z3 = true;
        if (z2) {
            z2 = true;
        }
        int i2 = (z2 ? 1 : 0) * true;
        Integer num = this.f43295b;
        int i3 = 0;
        int hashCode = (i2 + (num == null ? 0 : num.hashCode())) * 31;
        boolean z4 = this.f43296c;
        if (z4) {
            z4 = true;
        }
        int i4 = (hashCode + (z4 ? 1 : 0)) * 31;
        Integer num2 = this.f43297d;
        if (num2 != null) {
            i3 = num2.hashCode();
        }
        int i5 = (i4 + i3) * 31;
        boolean z5 = this.f43298e;
        if (z5) {
            z5 = true;
        }
        int i6 = (i5 + (z5 ? 1 : 0)) * 31;
        boolean z6 = this.f43299f;
        if (!z6) {
            z3 = z6;
        }
        return i6 + (z3 ? 1 : 0);
    }

    public String toString() {
        return "WebSocketExtensions(perMessageDeflate=" + this.f43294a + ", clientMaxWindowBits=" + this.f43295b + ", clientNoContextTakeover=" + this.f43296c + ", serverMaxWindowBits=" + this.f43297d + ", serverNoContextTakeover=" + this.f43298e + ", unknownValues=" + this.f43299f + ')';
    }
}
