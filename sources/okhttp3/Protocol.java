package okhttp3;

import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public enum Protocol {
    HTTP_1_0("http/1.0"),
    HTTP_1_1("http/1.1"),
    SPDY_3("spdy/3.1"),
    HTTP_2("h2"),
    H2_PRIOR_KNOWLEDGE("h2_prior_knowledge"),
    QUIC("quic");
    

    /* renamed from: A  reason: collision with root package name */
    public static final Companion f42747A = null;

    /* renamed from: z  reason: collision with root package name */
    public final String f42749z;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Protocol a(String str) {
            Intrinsics.i(str, "protocol");
            Protocol protocol = Protocol.HTTP_1_0;
            if (!Intrinsics.d(str, protocol.f42749z)) {
                protocol = Protocol.HTTP_1_1;
                if (!Intrinsics.d(str, protocol.f42749z)) {
                    protocol = Protocol.H2_PRIOR_KNOWLEDGE;
                    if (!Intrinsics.d(str, protocol.f42749z)) {
                        protocol = Protocol.HTTP_2;
                        if (!Intrinsics.d(str, protocol.f42749z)) {
                            protocol = Protocol.SPDY_3;
                            if (!Intrinsics.d(str, protocol.f42749z)) {
                                protocol = Protocol.QUIC;
                                if (!Intrinsics.d(str, protocol.f42749z)) {
                                    throw new IOException("Unexpected protocol: " + str);
                                }
                            }
                        }
                    }
                }
            }
            return protocol;
        }

        public Companion() {
        }
    }

    static {
        f42747A = new Companion((DefaultConstructorMarker) null);
    }

    /* access modifiers changed from: public */
    Protocol(String str) {
        this.f42749z = str;
    }

    public String toString() {
        return this.f42749z;
    }
}
