package okhttp3.internal.platform.android;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import javax.net.ssl.SSLSocket;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import okhttp3.internal.platform.AndroidPlatform;
import okhttp3.internal.platform.Platform;
import okhttp3.internal.platform.android.DeferredSocketAdapter;

@Metadata
public class AndroidSocketAdapter implements SocketAdapter {

    /* renamed from: f  reason: collision with root package name */
    public static final Companion f43211f;

    /* renamed from: g  reason: collision with root package name */
    public static final DeferredSocketAdapter.Factory f43212g;

    /* renamed from: a  reason: collision with root package name */
    public final Class f43213a;

    /* renamed from: b  reason: collision with root package name */
    public final Method f43214b;

    /* renamed from: c  reason: collision with root package name */
    public final Method f43215c;

    /* renamed from: d  reason: collision with root package name */
    public final Method f43216d;

    /* renamed from: e  reason: collision with root package name */
    public final Method f43217e;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final AndroidSocketAdapter b(Class cls) {
            Class cls2 = cls;
            while (cls2 != null && !Intrinsics.d(cls2.getSimpleName(), "OpenSSLSocketImpl")) {
                cls2 = cls2.getSuperclass();
                if (cls2 == null) {
                    throw new AssertionError("No OpenSSLSocketImpl superclass of socket of type " + cls);
                }
            }
            Intrinsics.f(cls2);
            return new AndroidSocketAdapter(cls2);
        }

        public final DeferredSocketAdapter.Factory c(String str) {
            Intrinsics.i(str, "packageName");
            return new AndroidSocketAdapter$Companion$factory$1(str);
        }

        public final DeferredSocketAdapter.Factory d() {
            return AndroidSocketAdapter.f43212g;
        }

        public Companion() {
        }
    }

    static {
        Companion companion = new Companion((DefaultConstructorMarker) null);
        f43211f = companion;
        f43212g = companion.c("com.google.android.gms.org.conscrypt");
    }

    public AndroidSocketAdapter(Class cls) {
        Intrinsics.i(cls, "sslSocketClass");
        this.f43213a = cls;
        Method declaredMethod = cls.getDeclaredMethod("setUseSessionTickets", new Class[]{Boolean.TYPE});
        Intrinsics.h(declaredMethod, "sslSocketClass.getDeclar…:class.javaPrimitiveType)");
        this.f43214b = declaredMethod;
        this.f43215c = cls.getMethod("setHostname", new Class[]{String.class});
        this.f43216d = cls.getMethod("getAlpnSelectedProtocol", (Class[]) null);
        this.f43217e = cls.getMethod("setAlpnProtocols", new Class[]{byte[].class});
    }

    public boolean a() {
        return AndroidPlatform.f43173f.b();
    }

    public boolean b(SSLSocket sSLSocket) {
        Intrinsics.i(sSLSocket, "sslSocket");
        return this.f43213a.isInstance(sSLSocket);
    }

    public String c(SSLSocket sSLSocket) {
        Intrinsics.i(sSLSocket, "sslSocket");
        if (!b(sSLSocket)) {
            return null;
        }
        try {
            byte[] bArr = (byte[]) this.f43216d.invoke(sSLSocket, (Object[]) null);
            if (bArr != null) {
                return new String(bArr, Charsets.f41118b);
            }
            return null;
        } catch (IllegalAccessException e2) {
            throw new AssertionError(e2);
        } catch (InvocationTargetException e3) {
            Throwable cause = e3.getCause();
            if ((cause instanceof NullPointerException) && Intrinsics.d(((NullPointerException) cause).getMessage(), "ssl == null")) {
                return null;
            }
            throw new AssertionError(e3);
        }
    }

    public void d(SSLSocket sSLSocket, String str, List list) {
        Intrinsics.i(sSLSocket, "sslSocket");
        Intrinsics.i(list, "protocols");
        if (b(sSLSocket)) {
            try {
                this.f43214b.invoke(sSLSocket, new Object[]{Boolean.TRUE});
                if (str != null) {
                    this.f43215c.invoke(sSLSocket, new Object[]{str});
                }
                this.f43217e.invoke(sSLSocket, new Object[]{Platform.f43200a.c(list)});
            } catch (IllegalAccessException e2) {
                throw new AssertionError(e2);
            } catch (InvocationTargetException e3) {
                throw new AssertionError(e3);
            }
        }
    }
}
