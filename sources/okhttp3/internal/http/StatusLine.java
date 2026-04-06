package okhttp3.internal.http;

import java.net.ProtocolException;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import okhttp3.Protocol;

@Metadata
public final class StatusLine {

    /* renamed from: d  reason: collision with root package name */
    public static final Companion f43002d = new Companion((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    public final Protocol f43003a;

    /* renamed from: b  reason: collision with root package name */
    public final int f43004b;

    /* renamed from: c  reason: collision with root package name */
    public final String f43005c;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final StatusLine a(String str) {
            int i2;
            Protocol protocol;
            String str2;
            Intrinsics.i(str, "statusLine");
            if (StringsKt.Q(str, "HTTP/1.", false, 2, (Object) null)) {
                i2 = 9;
                if (str.length() < 9 || str.charAt(8) != ' ') {
                    throw new ProtocolException("Unexpected status line: " + str);
                }
                int charAt = str.charAt(7) - '0';
                if (charAt == 0) {
                    protocol = Protocol.HTTP_1_0;
                } else if (charAt == 1) {
                    protocol = Protocol.HTTP_1_1;
                } else {
                    throw new ProtocolException("Unexpected status line: " + str);
                }
            } else if (StringsKt.Q(str, "ICY ", false, 2, (Object) null)) {
                protocol = Protocol.HTTP_1_0;
                i2 = 4;
            } else {
                throw new ProtocolException("Unexpected status line: " + str);
            }
            int i3 = i2 + 3;
            if (str.length() >= i3) {
                try {
                    String substring = str.substring(i2, i3);
                    Intrinsics.h(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                    int parseInt = Integer.parseInt(substring);
                    if (str.length() <= i3) {
                        str2 = "";
                    } else if (str.charAt(i3) == ' ') {
                        str2 = str.substring(i2 + 4);
                        Intrinsics.h(str2, "this as java.lang.String).substring(startIndex)");
                    } else {
                        throw new ProtocolException("Unexpected status line: " + str);
                    }
                    return new StatusLine(protocol, parseInt, str2);
                } catch (NumberFormatException unused) {
                    throw new ProtocolException("Unexpected status line: " + str);
                }
            } else {
                throw new ProtocolException("Unexpected status line: " + str);
            }
        }

        public Companion() {
        }
    }

    public StatusLine(Protocol protocol, int i2, String str) {
        Intrinsics.i(protocol, "protocol");
        Intrinsics.i(str, "message");
        this.f43003a = protocol;
        this.f43004b = i2;
        this.f43005c = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.f43003a == Protocol.HTTP_1_0) {
            sb.append("HTTP/1.0");
        } else {
            sb.append("HTTP/1.1");
        }
        sb.append(' ');
        sb.append(this.f43004b);
        sb.append(' ');
        sb.append(this.f43005c);
        String sb2 = sb.toString();
        Intrinsics.h(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }
}
