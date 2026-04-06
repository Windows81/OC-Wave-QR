package okhttp3.internal.platform.android;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.platform.Platform;

@Metadata
public final class StandardAndroidSocketAdapter extends AndroidSocketAdapter {

    /* renamed from: j  reason: collision with root package name */
    public static final Companion f43229j = new Companion((DefaultConstructorMarker) null);

    /* renamed from: h  reason: collision with root package name */
    public final Class f43230h;

    /* renamed from: i  reason: collision with root package name */
    public final Class f43231i;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ SocketAdapter b(Companion companion, String str, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                str = "com.android.org.conscrypt";
            }
            return companion.a(str);
        }

        public final SocketAdapter a(String str) {
            Intrinsics.i(str, "packageName");
            try {
                Class<?> cls = Class.forName(str + ".OpenSSLSocketImpl");
                Intrinsics.g(cls, "null cannot be cast to non-null type java.lang.Class<in javax.net.ssl.SSLSocket>");
                Class<?> cls2 = Class.forName(str + ".OpenSSLSocketFactoryImpl");
                Intrinsics.g(cls2, "null cannot be cast to non-null type java.lang.Class<in javax.net.ssl.SSLSocketFactory>");
                Class<?> cls3 = Class.forName(str + ".SSLParametersImpl");
                Intrinsics.h(cls3, "paramsClass");
                return new StandardAndroidSocketAdapter(cls, cls2, cls3);
            } catch (Exception e2) {
                Platform.f43200a.g().k("unable to load android socket classes", 5, e2);
                return null;
            }
        }

        public Companion() {
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StandardAndroidSocketAdapter(Class cls, Class cls2, Class cls3) {
        super(cls);
        Intrinsics.i(cls, "sslSocketClass");
        Intrinsics.i(cls2, "sslSocketFactoryClass");
        Intrinsics.i(cls3, "paramClass");
        this.f43230h = cls2;
        this.f43231i = cls3;
    }
}
