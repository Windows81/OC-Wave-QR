package retrofit2;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Proxy;
import java.lang.reflect.Type;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import okhttp3.Call;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import retrofit2.BuiltInConverters;
import retrofit2.CallAdapter;
import retrofit2.Converter;

public final class Retrofit {

    /* renamed from: a  reason: collision with root package name */
    public final ConcurrentHashMap f44278a = new ConcurrentHashMap();

    /* renamed from: b  reason: collision with root package name */
    public final Call.Factory f44279b;

    /* renamed from: c  reason: collision with root package name */
    public final HttpUrl f44280c;

    /* renamed from: d  reason: collision with root package name */
    public final List f44281d;

    /* renamed from: e  reason: collision with root package name */
    public final int f44282e;

    /* renamed from: f  reason: collision with root package name */
    public final List f44283f;

    /* renamed from: g  reason: collision with root package name */
    public final int f44284g;

    /* renamed from: h  reason: collision with root package name */
    public final Executor f44285h;

    /* renamed from: i  reason: collision with root package name */
    public final boolean f44286i;

    public static final class Builder {

        /* renamed from: a  reason: collision with root package name */
        public Call.Factory f44290a;

        /* renamed from: b  reason: collision with root package name */
        public HttpUrl f44291b;

        /* renamed from: c  reason: collision with root package name */
        public final List f44292c = new ArrayList();

        /* renamed from: d  reason: collision with root package name */
        public final List f44293d = new ArrayList();

        /* renamed from: e  reason: collision with root package name */
        public Executor f44294e;

        /* renamed from: f  reason: collision with root package name */
        public boolean f44295f;

        public Builder a(CallAdapter.Factory factory) {
            List list = this.f44293d;
            Objects.requireNonNull(factory, "factory == null");
            list.add(factory);
            return this;
        }

        public Builder b(Converter.Factory factory) {
            List list = this.f44292c;
            Objects.requireNonNull(factory, "factory == null");
            list.add(factory);
            return this;
        }

        public Builder c(String str) {
            Objects.requireNonNull(str, "baseUrl == null");
            return d(HttpUrl.h(str));
        }

        public Builder d(HttpUrl httpUrl) {
            Objects.requireNonNull(httpUrl, "baseUrl == null");
            List n2 = httpUrl.n();
            if ("".equals(n2.get(n2.size() - 1))) {
                this.f44291b = httpUrl;
                return this;
            }
            throw new IllegalArgumentException("baseUrl must end in /: " + httpUrl);
        }

        public Retrofit e() {
            if (this.f44291b != null) {
                Call.Factory factory = this.f44290a;
                if (factory == null) {
                    factory = new OkHttpClient();
                }
                Call.Factory factory2 = factory;
                Executor executor = this.f44294e;
                if (executor == null) {
                    executor = Platform.f44219a;
                }
                Executor executor2 = executor;
                BuiltInFactories builtInFactories = Platform.f44221c;
                ArrayList arrayList = new ArrayList(this.f44293d);
                List a2 = builtInFactories.a(executor2);
                arrayList.addAll(a2);
                List b2 = builtInFactories.b();
                int size = b2.size();
                ArrayList arrayList2 = new ArrayList(this.f44292c.size() + 1 + size);
                arrayList2.add(new BuiltInConverters());
                arrayList2.addAll(this.f44292c);
                arrayList2.addAll(b2);
                return new Retrofit(factory2, this.f44291b, Collections.unmodifiableList(arrayList2), size, Collections.unmodifiableList(arrayList), a2.size(), executor2, this.f44295f);
            }
            throw new IllegalStateException("Base URL required.");
        }

        public Builder f(Call.Factory factory) {
            Objects.requireNonNull(factory, "factory == null");
            this.f44290a = factory;
            return this;
        }

        public Builder g(OkHttpClient okHttpClient) {
            Objects.requireNonNull(okHttpClient, "client == null");
            return f(okHttpClient);
        }
    }

    public Retrofit(Call.Factory factory, HttpUrl httpUrl, List list, int i2, List list2, int i3, Executor executor, boolean z2) {
        this.f44279b = factory;
        this.f44280c = httpUrl;
        this.f44281d = list;
        this.f44282e = i2;
        this.f44283f = list2;
        this.f44284g = i3;
        this.f44285h = executor;
        this.f44286i = z2;
    }

    public CallAdapter a(Type type, Annotation[] annotationArr) {
        return d((CallAdapter.Factory) null, type, annotationArr);
    }

    public Object b(final Class cls) {
        j(cls);
        return Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new InvocationHandler() {

            /* renamed from: a  reason: collision with root package name */
            public final Object[] f44287a = new Object[0];

            public Object invoke(Object obj, Method method, Object[] objArr) {
                if (method.getDeclaringClass() == Object.class) {
                    return method.invoke(this, objArr);
                }
                if (objArr == null) {
                    objArr = this.f44287a;
                }
                Reflection reflection = Platform.f44220b;
                return reflection.c(method) ? reflection.b(method, cls, obj, objArr) : Retrofit.this.c(cls, method).a(obj, objArr);
            }
        });
    }

    public ServiceMethod c(Class cls, Method method) {
        while (true) {
            Object obj = this.f44278a.get(method);
            if (obj instanceof ServiceMethod) {
                return (ServiceMethod) obj;
            }
            if (obj == null) {
                Object obj2 = new Object();
                synchronized (obj2) {
                    try {
                        obj = this.f44278a.putIfAbsent(method, obj2);
                        if (obj == null) {
                            ServiceMethod b2 = ServiceMethod.b(this, cls, method);
                            this.f44278a.put(method, b2);
                            return b2;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            synchronized (obj) {
                try {
                    Object obj3 = this.f44278a.get(method);
                    if (obj3 != null) {
                        ServiceMethod serviceMethod = (ServiceMethod) obj3;
                        return serviceMethod;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public CallAdapter d(CallAdapter.Factory factory, Type type, Annotation[] annotationArr) {
        Objects.requireNonNull(type, "returnType == null");
        Objects.requireNonNull(annotationArr, "annotations == null");
        int indexOf = this.f44283f.indexOf(factory) + 1;
        int size = this.f44283f.size();
        for (int i2 = indexOf; i2 < size; i2++) {
            CallAdapter a2 = ((CallAdapter.Factory) this.f44283f.get(i2)).a(type, annotationArr, this);
            if (a2 != null) {
                return a2;
            }
        }
        StringBuilder sb = new StringBuilder("Could not locate call adapter for ");
        sb.append(type);
        sb.append(".\n");
        if (factory != null) {
            sb.append("  Skipped:");
            for (int i3 = 0; i3 < indexOf; i3++) {
                sb.append("\n   * ");
                sb.append(((CallAdapter.Factory) this.f44283f.get(i3)).getClass().getName());
            }
            sb.append(10);
        }
        sb.append("  Tried:");
        int size2 = this.f44283f.size();
        while (indexOf < size2) {
            sb.append("\n   * ");
            sb.append(((CallAdapter.Factory) this.f44283f.get(indexOf)).getClass().getName());
            indexOf++;
        }
        throw new IllegalArgumentException(sb.toString());
    }

    public Converter e(Converter.Factory factory, Type type, Annotation[] annotationArr, Annotation[] annotationArr2) {
        Objects.requireNonNull(type, "type == null");
        Objects.requireNonNull(annotationArr, "parameterAnnotations == null");
        Objects.requireNonNull(annotationArr2, "methodAnnotations == null");
        int indexOf = this.f44281d.indexOf(factory) + 1;
        int size = this.f44281d.size();
        for (int i2 = indexOf; i2 < size; i2++) {
            Converter c2 = ((Converter.Factory) this.f44281d.get(i2)).c(type, annotationArr, annotationArr2, this);
            if (c2 != null) {
                return c2;
            }
        }
        StringBuilder sb = new StringBuilder("Could not locate RequestBody converter for ");
        sb.append(type);
        sb.append(".\n");
        if (factory != null) {
            sb.append("  Skipped:");
            for (int i3 = 0; i3 < indexOf; i3++) {
                sb.append("\n   * ");
                sb.append(((Converter.Factory) this.f44281d.get(i3)).getClass().getName());
            }
            sb.append(10);
        }
        sb.append("  Tried:");
        int size2 = this.f44281d.size();
        while (indexOf < size2) {
            sb.append("\n   * ");
            sb.append(((Converter.Factory) this.f44281d.get(indexOf)).getClass().getName());
            indexOf++;
        }
        throw new IllegalArgumentException(sb.toString());
    }

    public Converter f(Converter.Factory factory, Type type, Annotation[] annotationArr) {
        Objects.requireNonNull(type, "type == null");
        Objects.requireNonNull(annotationArr, "annotations == null");
        int indexOf = this.f44281d.indexOf(factory) + 1;
        int size = this.f44281d.size();
        for (int i2 = indexOf; i2 < size; i2++) {
            Converter d2 = ((Converter.Factory) this.f44281d.get(i2)).d(type, annotationArr, this);
            if (d2 != null) {
                return d2;
            }
        }
        StringBuilder sb = new StringBuilder("Could not locate ResponseBody converter for ");
        sb.append(type);
        sb.append(".\n");
        if (factory != null) {
            sb.append("  Skipped:");
            for (int i3 = 0; i3 < indexOf; i3++) {
                sb.append("\n   * ");
                sb.append(((Converter.Factory) this.f44281d.get(i3)).getClass().getName());
            }
            sb.append(10);
        }
        sb.append("  Tried:");
        int size2 = this.f44281d.size();
        while (indexOf < size2) {
            sb.append("\n   * ");
            sb.append(((Converter.Factory) this.f44281d.get(indexOf)).getClass().getName());
            indexOf++;
        }
        throw new IllegalArgumentException(sb.toString());
    }

    public Converter g(Type type, Annotation[] annotationArr, Annotation[] annotationArr2) {
        return e((Converter.Factory) null, type, annotationArr, annotationArr2);
    }

    public Converter h(Type type, Annotation[] annotationArr) {
        return f((Converter.Factory) null, type, annotationArr);
    }

    public Converter i(Type type, Annotation[] annotationArr) {
        Objects.requireNonNull(type, "type == null");
        Objects.requireNonNull(annotationArr, "annotations == null");
        int size = this.f44281d.size();
        for (int i2 = 0; i2 < size; i2++) {
            Converter e2 = ((Converter.Factory) this.f44281d.get(i2)).e(type, annotationArr, this);
            if (e2 != null) {
                return e2;
            }
        }
        return BuiltInConverters.ToStringConverter.f44121a;
    }

    public final void j(Class cls) {
        if (cls.isInterface()) {
            ArrayDeque arrayDeque = new ArrayDeque(1);
            arrayDeque.add(cls);
            while (!arrayDeque.isEmpty()) {
                Class cls2 = (Class) arrayDeque.removeFirst();
                if (cls2.getTypeParameters().length != 0) {
                    StringBuilder sb = new StringBuilder("Type parameters are unsupported on ");
                    sb.append(cls2.getName());
                    if (cls2 != cls) {
                        sb.append(" which is an interface of ");
                        sb.append(cls.getName());
                    }
                    throw new IllegalArgumentException(sb.toString());
                }
                Collections.addAll(arrayDeque, cls2.getInterfaces());
            }
            if (this.f44286i) {
                Reflection reflection = Platform.f44220b;
                for (Method method : cls.getDeclaredMethods()) {
                    if (!reflection.c(method) && !Modifier.isStatic(method.getModifiers()) && !method.isSynthetic()) {
                        c(cls, method);
                    }
                }
                return;
            }
            return;
        }
        throw new IllegalArgumentException("API declarations must be interfaces.");
    }
}
