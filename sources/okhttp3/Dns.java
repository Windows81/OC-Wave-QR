package okhttp3;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public interface Dns {

    /* renamed from: a  reason: collision with root package name */
    public static final Companion f42634a = Companion.f42636a;

    /* renamed from: b  reason: collision with root package name */
    public static final Dns f42635b = new Companion.DnsSystem();

    @Metadata
    public static final class Companion {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ Companion f42636a = new Companion();

        @Metadata
        public static final class DnsSystem implements Dns {
            public List a(String str) {
                Intrinsics.i(str, "hostname");
                try {
                    InetAddress[] allByName = InetAddress.getAllByName(str);
                    Intrinsics.h(allByName, "getAllByName(hostname)");
                    return ArraysKt.a1(allByName);
                } catch (NullPointerException e2) {
                    UnknownHostException unknownHostException = new UnknownHostException("Broken system behaviour for dns lookup of " + str);
                    unknownHostException.initCause(e2);
                    throw unknownHostException;
                }
            }
        }
    }

    List a(String str);
}
