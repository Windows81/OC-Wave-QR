package okhttp3.internal.platform;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLSocket;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class Jdk8WithJettyBootPlatform extends Platform {

    /* renamed from: i  reason: collision with root package name */
    public static final Companion f43186i = new Companion((DefaultConstructorMarker) null);

    /* renamed from: d  reason: collision with root package name */
    public final Method f43187d;

    /* renamed from: e  reason: collision with root package name */
    public final Method f43188e;

    /* renamed from: f  reason: collision with root package name */
    public final Method f43189f;

    /* renamed from: g  reason: collision with root package name */
    public final Class f43190g;

    /* renamed from: h  reason: collision with root package name */
    public final Class f43191h;

    @Metadata
    public static final class AlpnProvider implements InvocationHandler {

        /* renamed from: a  reason: collision with root package name */
        public final List f43192a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f43193b;

        /* renamed from: c  reason: collision with root package name */
        public String f43194c;

        public AlpnProvider(List list) {
            Intrinsics.i(list, "protocols");
            this.f43192a = list;
        }

        public final String a() {
            return this.f43194c;
        }

        public final boolean b() {
            return this.f43193b;
        }

        public Object invoke(Object obj, Method method, Object[] objArr) {
            Intrinsics.i(obj, "proxy");
            Intrinsics.i(method, "method");
            if (objArr == null) {
                objArr = new Object[0];
            }
            String name = method.getName();
            Class<?> returnType = method.getReturnType();
            if (Intrinsics.d(name, "supports") && Intrinsics.d(Boolean.TYPE, returnType)) {
                return Boolean.TRUE;
            }
            if (Intrinsics.d(name, "unsupported") && Intrinsics.d(Void.TYPE, returnType)) {
                this.f43193b = true;
                return null;
            } else if (Intrinsics.d(name, "protocols") && objArr.length == 0) {
                return this.f43192a;
            } else {
                if ((Intrinsics.d(name, "selectProtocol") || Intrinsics.d(name, "select")) && Intrinsics.d(String.class, returnType) && objArr.length == 1) {
                    Object obj2 = objArr[0];
                    if (obj2 instanceof List) {
                        Intrinsics.g(obj2, "null cannot be cast to non-null type kotlin.collections.List<*>");
                        List list = (List) obj2;
                        int size = list.size();
                        if (size >= 0) {
                            int i2 = 0;
                            while (true) {
                                Object obj3 = list.get(i2);
                                Intrinsics.g(obj3, "null cannot be cast to non-null type kotlin.String");
                                String str = (String) obj3;
                                if (!this.f43192a.contains(str)) {
                                    if (i2 == size) {
                                        break;
                                    }
                                    i2++;
                                } else {
                                    this.f43194c = str;
                                    return str;
                                }
                            }
                        }
                        String str2 = (String) this.f43192a.get(0);
                        this.f43194c = str2;
                        return str2;
                    }
                }
                if ((!Intrinsics.d(name, "protocolSelected") && !Intrinsics.d(name, "selected")) || objArr.length != 1) {
                    return method.invoke(this, Arrays.copyOf(objArr, objArr.length));
                }
                Object obj4 = objArr[0];
                Intrinsics.g(obj4, "null cannot be cast to non-null type kotlin.String");
                this.f43194c = (String) obj4;
                return null;
            }
        }
    }

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Platform a() {
            Class<SSLSocket> cls = SSLSocket.class;
            String property = System.getProperty("java.specification.version", "unknown");
            try {
                Intrinsics.h(property, "jvmVersion");
                if (Integer.parseInt(property) >= 9) {
                    return null;
                }
            } catch (NumberFormatException unused) {
            }
            try {
                Class<?> cls2 = Class.forName("org.eclipse.jetty.alpn.ALPN", true, (ClassLoader) null);
                Class<?> cls3 = Class.forName("org.eclipse.jetty.alpn.ALPN" + "$Provider", true, (ClassLoader) null);
                Class<?> cls4 = Class.forName("org.eclipse.jetty.alpn.ALPN" + "$ClientProvider", true, (ClassLoader) null);
                Class<?> cls5 = Class.forName("org.eclipse.jetty.alpn.ALPN" + "$ServerProvider", true, (ClassLoader) null);
                Method method = cls2.getMethod("put", new Class[]{cls, cls3});
                Method method2 = cls2.getMethod("get", new Class[]{cls});
                Method method3 = cls2.getMethod("remove", new Class[]{cls});
                Intrinsics.h(method, "putMethod");
                Intrinsics.h(method2, "getMethod");
                Intrinsics.h(method3, "removeMethod");
                Intrinsics.h(cls4, "clientProviderClass");
                Intrinsics.h(cls5, "serverProviderClass");
                return new Jdk8WithJettyBootPlatform(method, method2, method3, cls4, cls5);
            } catch (ClassNotFoundException | NoSuchMethodException unused2) {
                return null;
            }
        }

        public Companion() {
        }
    }

    public Jdk8WithJettyBootPlatform(Method method, Method method2, Method method3, Class cls, Class cls2) {
        Intrinsics.i(method, "putMethod");
        Intrinsics.i(method2, "getMethod");
        Intrinsics.i(method3, "removeMethod");
        Intrinsics.i(cls, "clientProviderClass");
        Intrinsics.i(cls2, "serverProviderClass");
        this.f43187d = method;
        this.f43188e = method2;
        this.f43189f = method3;
        this.f43190g = cls;
        this.f43191h = cls2;
    }

    public void b(SSLSocket sSLSocket) {
        Intrinsics.i(sSLSocket, "sslSocket");
        try {
            this.f43189f.invoke((Object) null, new Object[]{sSLSocket});
        } catch (IllegalAccessException e2) {
            throw new AssertionError("failed to remove ALPN", e2);
        } catch (InvocationTargetException e3) {
            throw new AssertionError("failed to remove ALPN", e3);
        }
    }

    public void e(SSLSocket sSLSocket, String str, List list) {
        Intrinsics.i(sSLSocket, "sslSocket");
        Intrinsics.i(list, "protocols");
        try {
            this.f43187d.invoke((Object) null, new Object[]{sSLSocket, Proxy.newProxyInstance(Platform.class.getClassLoader(), new Class[]{this.f43190g, this.f43191h}, new AlpnProvider(Platform.f43200a.b(list)))});
        } catch (InvocationTargetException e2) {
            throw new AssertionError("failed to set ALPN", e2);
        } catch (IllegalAccessException e3) {
            throw new AssertionError("failed to set ALPN", e3);
        }
    }

    public String h(SSLSocket sSLSocket) {
        Intrinsics.i(sSLSocket, "sslSocket");
        try {
            InvocationHandler invocationHandler = Proxy.getInvocationHandler(this.f43188e.invoke((Object) null, new Object[]{sSLSocket}));
            Intrinsics.g(invocationHandler, "null cannot be cast to non-null type okhttp3.internal.platform.Jdk8WithJettyBootPlatform.AlpnProvider");
            AlpnProvider alpnProvider = (AlpnProvider) invocationHandler;
            if (!alpnProvider.b() && alpnProvider.a() == null) {
                Platform.l(this, "ALPN callback dropped: HTTP/2 is disabled. Is alpn-boot on the boot class path?", 0, (Throwable) null, 6, (Object) null);
                return null;
            } else if (alpnProvider.b()) {
                return null;
            } else {
                return alpnProvider.a();
            }
        } catch (InvocationTargetException e2) {
            throw new AssertionError("failed to get ALPN selected protocol", e2);
        } catch (IllegalAccessException e3) {
            throw new AssertionError("failed to get ALPN selected protocol", e3);
        }
    }
}
