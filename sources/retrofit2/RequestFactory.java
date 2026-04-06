package retrofit2;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.net.URI;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.coroutines.Continuation;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.Request;
import retrofit2.ParameterHandler;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.Field;
import retrofit2.http.FieldMap;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.HEAD;
import retrofit2.http.HTTP;
import retrofit2.http.Header;
import retrofit2.http.HeaderMap;
import retrofit2.http.Multipart;
import retrofit2.http.OPTIONS;
import retrofit2.http.PATCH;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Part;
import retrofit2.http.PartMap;
import retrofit2.http.Path;
import retrofit2.http.Query;
import retrofit2.http.QueryMap;
import retrofit2.http.QueryName;
import retrofit2.http.Tag;
import retrofit2.http.Url;

final class RequestFactory {

    /* renamed from: a  reason: collision with root package name */
    public final Class f44237a;

    /* renamed from: b  reason: collision with root package name */
    public final Method f44238b;

    /* renamed from: c  reason: collision with root package name */
    public final HttpUrl f44239c;

    /* renamed from: d  reason: collision with root package name */
    public final String f44240d;

    /* renamed from: e  reason: collision with root package name */
    public final String f44241e;

    /* renamed from: f  reason: collision with root package name */
    public final Headers f44242f;

    /* renamed from: g  reason: collision with root package name */
    public final MediaType f44243g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f44244h;

    /* renamed from: i  reason: collision with root package name */
    public final boolean f44245i;

    /* renamed from: j  reason: collision with root package name */
    public final boolean f44246j;

    /* renamed from: k  reason: collision with root package name */
    public final ParameterHandler[] f44247k;

    /* renamed from: l  reason: collision with root package name */
    public final boolean f44248l;

    public static final class Builder {

        /* renamed from: y  reason: collision with root package name */
        public static final Pattern f44249y = Pattern.compile("\\{([a-zA-Z][a-zA-Z0-9_-]*)\\}");

        /* renamed from: z  reason: collision with root package name */
        public static final Pattern f44250z = Pattern.compile("[a-zA-Z][a-zA-Z0-9_-]*");

        /* renamed from: a  reason: collision with root package name */
        public final Retrofit f44251a;

        /* renamed from: b  reason: collision with root package name */
        public final Class f44252b;

        /* renamed from: c  reason: collision with root package name */
        public final Method f44253c;

        /* renamed from: d  reason: collision with root package name */
        public final Annotation[] f44254d;

        /* renamed from: e  reason: collision with root package name */
        public final Annotation[][] f44255e;

        /* renamed from: f  reason: collision with root package name */
        public final Type[] f44256f;

        /* renamed from: g  reason: collision with root package name */
        public boolean f44257g;

        /* renamed from: h  reason: collision with root package name */
        public boolean f44258h;

        /* renamed from: i  reason: collision with root package name */
        public boolean f44259i;

        /* renamed from: j  reason: collision with root package name */
        public boolean f44260j;

        /* renamed from: k  reason: collision with root package name */
        public boolean f44261k;

        /* renamed from: l  reason: collision with root package name */
        public boolean f44262l;

        /* renamed from: m  reason: collision with root package name */
        public boolean f44263m;

        /* renamed from: n  reason: collision with root package name */
        public boolean f44264n;

        /* renamed from: o  reason: collision with root package name */
        public String f44265o;

        /* renamed from: p  reason: collision with root package name */
        public boolean f44266p;

        /* renamed from: q  reason: collision with root package name */
        public boolean f44267q;

        /* renamed from: r  reason: collision with root package name */
        public boolean f44268r;

        /* renamed from: s  reason: collision with root package name */
        public String f44269s;

        /* renamed from: t  reason: collision with root package name */
        public Headers f44270t;

        /* renamed from: u  reason: collision with root package name */
        public MediaType f44271u;

        /* renamed from: v  reason: collision with root package name */
        public Set f44272v;

        /* renamed from: w  reason: collision with root package name */
        public ParameterHandler[] f44273w;

        /* renamed from: x  reason: collision with root package name */
        public boolean f44274x;

        public Builder(Retrofit retrofit, Class cls, Method method) {
            this.f44251a = retrofit;
            this.f44252b = cls;
            this.f44253c = method;
            this.f44254d = method.getAnnotations();
            this.f44256f = method.getGenericParameterTypes();
            this.f44255e = method.getParameterAnnotations();
        }

        public static Class a(Class cls) {
            return Boolean.TYPE == cls ? Boolean.class : Byte.TYPE == cls ? Byte.class : Character.TYPE == cls ? Character.class : Double.TYPE == cls ? Double.class : Float.TYPE == cls ? Float.class : Integer.TYPE == cls ? Integer.class : Long.TYPE == cls ? Long.class : Short.TYPE == cls ? Short.class : cls;
        }

        public static Set h(String str) {
            Matcher matcher = f44249y.matcher(str);
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            while (matcher.find()) {
                linkedHashSet.add(matcher.group(1));
            }
            return linkedHashSet;
        }

        public RequestFactory b() {
            for (Annotation e2 : this.f44254d) {
                e(e2);
            }
            if (this.f44265o != null) {
                if (!this.f44266p) {
                    if (this.f44268r) {
                        throw Utils.n(this.f44253c, "Multipart can only be specified on HTTP methods with request body (e.g., @POST).", new Object[0]);
                    } else if (this.f44267q) {
                        throw Utils.n(this.f44253c, "FormUrlEncoded can only be specified on HTTP methods with request body (e.g., @POST).", new Object[0]);
                    }
                }
                int length = this.f44255e.length;
                this.f44273w = new ParameterHandler[length];
                int i2 = length - 1;
                int i3 = 0;
                while (i3 < length) {
                    this.f44273w[i3] = f(i3, this.f44256f[i3], this.f44255e[i3], i3 == i2);
                    i3++;
                }
                if (this.f44269s != null || this.f44264n) {
                    boolean z2 = this.f44267q;
                    if (!z2 && !this.f44268r && !this.f44266p && this.f44259i) {
                        throw Utils.n(this.f44253c, "Non-body HTTP method cannot contain @Body.", new Object[0]);
                    } else if (z2 && !this.f44257g) {
                        throw Utils.n(this.f44253c, "Form-encoded method must contain at least one @Field.", new Object[0]);
                    } else if (!this.f44268r || this.f44258h) {
                        return new RequestFactory(this);
                    } else {
                        throw Utils.n(this.f44253c, "Multipart method must contain at least one @Part.", new Object[0]);
                    }
                } else {
                    throw Utils.n(this.f44253c, "Missing either @%s URL or @Url parameter.", this.f44265o);
                }
            } else {
                throw Utils.n(this.f44253c, "HTTP method annotation is required (e.g., @GET, @POST, etc.).", new Object[0]);
            }
        }

        public final Headers c(String[] strArr, boolean z2) {
            Headers.Builder builder = new Headers.Builder();
            for (String str : strArr) {
                int indexOf = str.indexOf(58);
                if (indexOf == -1 || indexOf == 0 || indexOf == str.length() - 1) {
                    throw Utils.n(this.f44253c, "@Headers value must be in the form \"Name: Value\". Found: \"%s\"", str);
                }
                String substring = str.substring(0, indexOf);
                String trim = str.substring(indexOf + 1).trim();
                if ("Content-Type".equalsIgnoreCase(substring)) {
                    try {
                        this.f44271u = MediaType.e(trim);
                    } catch (IllegalArgumentException e2) {
                        throw Utils.o(this.f44253c, e2, "Malformed content type: %s", trim);
                    }
                } else if (z2) {
                    builder.e(substring, trim);
                } else {
                    builder.a(substring, trim);
                }
            }
            return builder.f();
        }

        public final void d(String str, String str2, boolean z2) {
            String str3 = this.f44265o;
            if (str3 == null) {
                this.f44265o = str;
                this.f44266p = z2;
                if (!str2.isEmpty()) {
                    int indexOf = str2.indexOf(63);
                    if (indexOf != -1 && indexOf < str2.length() - 1) {
                        String substring = str2.substring(indexOf + 1);
                        if (f44249y.matcher(substring).find()) {
                            throw Utils.n(this.f44253c, "URL query string \"%s\" must not have replace block. For dynamic query parameters use @Query.", substring);
                        }
                    }
                    this.f44269s = str2;
                    this.f44272v = h(str2);
                    return;
                }
                return;
            }
            throw Utils.n(this.f44253c, "Only one HTTP method is allowed. Found: %s and %s.", str3, str);
        }

        public final void e(Annotation annotation) {
            if (annotation instanceof DELETE) {
                d("DELETE", ((DELETE) annotation).value(), false);
            } else if (annotation instanceof GET) {
                d("GET", ((GET) annotation).value(), false);
            } else if (annotation instanceof HEAD) {
                d("HEAD", ((HEAD) annotation).value(), false);
            } else if (annotation instanceof PATCH) {
                d("PATCH", ((PATCH) annotation).value(), true);
            } else if (annotation instanceof POST) {
                d("POST", ((POST) annotation).value(), true);
            } else if (annotation instanceof PUT) {
                d("PUT", ((PUT) annotation).value(), true);
            } else if (annotation instanceof OPTIONS) {
                d("OPTIONS", ((OPTIONS) annotation).value(), false);
            } else if (annotation instanceof HTTP) {
                HTTP http = (HTTP) annotation;
                d(http.method(), http.path(), http.hasBody());
            } else if (annotation instanceof retrofit2.http.Headers) {
                retrofit2.http.Headers headers = (retrofit2.http.Headers) annotation;
                String[] value = headers.value();
                if (value.length != 0) {
                    this.f44270t = c(value, headers.allowUnsafeNonAsciiValues());
                    return;
                }
                throw Utils.n(this.f44253c, "@Headers annotation is empty.", new Object[0]);
            } else if (annotation instanceof Multipart) {
                if (!this.f44267q) {
                    this.f44268r = true;
                    return;
                }
                throw Utils.n(this.f44253c, "Only one encoding annotation is allowed.", new Object[0]);
            } else if (!(annotation instanceof FormUrlEncoded)) {
            } else {
                if (!this.f44268r) {
                    this.f44267q = true;
                    return;
                }
                throw Utils.n(this.f44253c, "Only one encoding annotation is allowed.", new Object[0]);
            }
        }

        public final ParameterHandler f(int i2, Type type, Annotation[] annotationArr, boolean z2) {
            ParameterHandler parameterHandler;
            if (annotationArr != null) {
                parameterHandler = null;
                for (Annotation g2 : annotationArr) {
                    ParameterHandler g3 = g(i2, type, annotationArr, g2);
                    if (g3 != null) {
                        if (parameterHandler == null) {
                            parameterHandler = g3;
                        } else {
                            throw Utils.p(this.f44253c, i2, "Multiple Retrofit annotations found, only one allowed.", new Object[0]);
                        }
                    }
                }
            } else {
                parameterHandler = null;
            }
            if (parameterHandler != null) {
                return parameterHandler;
            }
            if (z2) {
                try {
                    if (Utils.h(type) == Continuation.class) {
                        this.f44274x = true;
                        return null;
                    }
                } catch (NoClassDefFoundError unused) {
                }
            }
            throw Utils.p(this.f44253c, i2, "No Retrofit annotation found.", new Object[0]);
        }

        public final ParameterHandler g(int i2, Type type, Annotation[] annotationArr, Annotation annotation) {
            Class<String> cls = String.class;
            if (annotation instanceof Url) {
                j(i2, type);
                if (this.f44264n) {
                    throw Utils.p(this.f44253c, i2, "Multiple @Url method annotations found.", new Object[0]);
                } else if (this.f44260j) {
                    throw Utils.p(this.f44253c, i2, "@Path parameters may not be used with @Url.", new Object[0]);
                } else if (this.f44261k) {
                    throw Utils.p(this.f44253c, i2, "A @Url parameter must not come after a @Query.", new Object[0]);
                } else if (this.f44262l) {
                    throw Utils.p(this.f44253c, i2, "A @Url parameter must not come after a @QueryName.", new Object[0]);
                } else if (this.f44263m) {
                    throw Utils.p(this.f44253c, i2, "A @Url parameter must not come after a @QueryMap.", new Object[0]);
                } else if (this.f44269s == null) {
                    this.f44264n = true;
                    if (type == HttpUrl.class || type == cls || type == URI.class || ((type instanceof Class) && "android.net.Uri".equals(((Class) type).getName()))) {
                        return new ParameterHandler.RelativeUrl(this.f44253c, i2);
                    }
                    throw Utils.p(this.f44253c, i2, "@Url must be okhttp3.HttpUrl, String, java.net.URI, or android.net.Uri type.", new Object[0]);
                } else {
                    throw Utils.p(this.f44253c, i2, "@Url cannot be used with @%s URL", this.f44265o);
                }
            } else if (annotation instanceof Path) {
                j(i2, type);
                if (this.f44261k) {
                    throw Utils.p(this.f44253c, i2, "A @Path parameter must not come after a @Query.", new Object[0]);
                } else if (this.f44262l) {
                    throw Utils.p(this.f44253c, i2, "A @Path parameter must not come after a @QueryName.", new Object[0]);
                } else if (this.f44263m) {
                    throw Utils.p(this.f44253c, i2, "A @Path parameter must not come after a @QueryMap.", new Object[0]);
                } else if (this.f44264n) {
                    throw Utils.p(this.f44253c, i2, "@Path parameters may not be used with @Url.", new Object[0]);
                } else if (this.f44269s != null) {
                    this.f44260j = true;
                    Path path = (Path) annotation;
                    String value = path.value();
                    i(i2, value);
                    return new ParameterHandler.Path(this.f44253c, i2, value, this.f44251a.i(type, annotationArr), path.encoded());
                } else {
                    throw Utils.p(this.f44253c, i2, "@Path can only be used with relative url on @%s", this.f44265o);
                }
            } else {
                Class<Iterable> cls2 = Iterable.class;
                if (annotation instanceof Query) {
                    j(i2, type);
                    Query query = (Query) annotation;
                    String value2 = query.value();
                    boolean encoded = query.encoded();
                    Class h2 = Utils.h(type);
                    this.f44261k = true;
                    if (cls2.isAssignableFrom(h2)) {
                        if (type instanceof ParameterizedType) {
                            return new ParameterHandler.Query(value2, this.f44251a.i(Utils.g(0, (ParameterizedType) type), annotationArr), encoded).c();
                        }
                        throw Utils.p(this.f44253c, i2, h2.getSimpleName() + " must include generic type (e.g., " + h2.getSimpleName() + "<String>)", new Object[0]);
                    } else if (!h2.isArray()) {
                        return new ParameterHandler.Query(value2, this.f44251a.i(type, annotationArr), encoded);
                    } else {
                        return new ParameterHandler.Query(value2, this.f44251a.i(a(h2.getComponentType()), annotationArr), encoded).b();
                    }
                } else if (annotation instanceof QueryName) {
                    j(i2, type);
                    boolean encoded2 = ((QueryName) annotation).encoded();
                    Class h3 = Utils.h(type);
                    this.f44262l = true;
                    if (cls2.isAssignableFrom(h3)) {
                        if (type instanceof ParameterizedType) {
                            return new ParameterHandler.QueryName(this.f44251a.i(Utils.g(0, (ParameterizedType) type), annotationArr), encoded2).c();
                        }
                        throw Utils.p(this.f44253c, i2, h3.getSimpleName() + " must include generic type (e.g., " + h3.getSimpleName() + "<String>)", new Object[0]);
                    } else if (!h3.isArray()) {
                        return new ParameterHandler.QueryName(this.f44251a.i(type, annotationArr), encoded2);
                    } else {
                        return new ParameterHandler.QueryName(this.f44251a.i(a(h3.getComponentType()), annotationArr), encoded2).b();
                    }
                } else {
                    Class<Map> cls3 = Map.class;
                    if (annotation instanceof QueryMap) {
                        j(i2, type);
                        Class h4 = Utils.h(type);
                        this.f44263m = true;
                        if (cls3.isAssignableFrom(h4)) {
                            Type i3 = Utils.i(type, h4, cls3);
                            if (i3 instanceof ParameterizedType) {
                                ParameterizedType parameterizedType = (ParameterizedType) i3;
                                Type g2 = Utils.g(0, parameterizedType);
                                if (cls == g2) {
                                    return new ParameterHandler.QueryMap(this.f44253c, i2, this.f44251a.i(Utils.g(1, parameterizedType), annotationArr), ((QueryMap) annotation).encoded());
                                }
                                throw Utils.p(this.f44253c, i2, "@QueryMap keys must be of type String: " + g2, new Object[0]);
                            }
                            throw Utils.p(this.f44253c, i2, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                        }
                        throw Utils.p(this.f44253c, i2, "@QueryMap parameter type must be Map.", new Object[0]);
                    } else if (annotation instanceof Header) {
                        j(i2, type);
                        Header header = (Header) annotation;
                        String value3 = header.value();
                        Class h5 = Utils.h(type);
                        if (cls2.isAssignableFrom(h5)) {
                            if (type instanceof ParameterizedType) {
                                return new ParameterHandler.Header(value3, this.f44251a.i(Utils.g(0, (ParameterizedType) type), annotationArr), header.allowUnsafeNonAsciiValues()).c();
                            }
                            throw Utils.p(this.f44253c, i2, h5.getSimpleName() + " must include generic type (e.g., " + h5.getSimpleName() + "<String>)", new Object[0]);
                        } else if (!h5.isArray()) {
                            return new ParameterHandler.Header(value3, this.f44251a.i(type, annotationArr), header.allowUnsafeNonAsciiValues());
                        } else {
                            return new ParameterHandler.Header(value3, this.f44251a.i(a(h5.getComponentType()), annotationArr), header.allowUnsafeNonAsciiValues()).b();
                        }
                    } else if (annotation instanceof HeaderMap) {
                        if (type == Headers.class) {
                            return new ParameterHandler.Headers(this.f44253c, i2);
                        }
                        j(i2, type);
                        Class h6 = Utils.h(type);
                        if (cls3.isAssignableFrom(h6)) {
                            Type i4 = Utils.i(type, h6, cls3);
                            if (i4 instanceof ParameterizedType) {
                                ParameterizedType parameterizedType2 = (ParameterizedType) i4;
                                Type g3 = Utils.g(0, parameterizedType2);
                                if (cls == g3) {
                                    return new ParameterHandler.HeaderMap(this.f44253c, i2, this.f44251a.i(Utils.g(1, parameterizedType2), annotationArr), ((HeaderMap) annotation).allowUnsafeNonAsciiValues());
                                }
                                throw Utils.p(this.f44253c, i2, "@HeaderMap keys must be of type String: " + g3, new Object[0]);
                            }
                            throw Utils.p(this.f44253c, i2, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                        }
                        throw Utils.p(this.f44253c, i2, "@HeaderMap parameter type must be Map or Headers.", new Object[0]);
                    } else if (annotation instanceof Field) {
                        j(i2, type);
                        if (this.f44267q) {
                            Field field = (Field) annotation;
                            String value4 = field.value();
                            boolean encoded3 = field.encoded();
                            this.f44257g = true;
                            Class h7 = Utils.h(type);
                            if (cls2.isAssignableFrom(h7)) {
                                if (type instanceof ParameterizedType) {
                                    return new ParameterHandler.Field(value4, this.f44251a.i(Utils.g(0, (ParameterizedType) type), annotationArr), encoded3).c();
                                }
                                throw Utils.p(this.f44253c, i2, h7.getSimpleName() + " must include generic type (e.g., " + h7.getSimpleName() + "<String>)", new Object[0]);
                            } else if (!h7.isArray()) {
                                return new ParameterHandler.Field(value4, this.f44251a.i(type, annotationArr), encoded3);
                            } else {
                                return new ParameterHandler.Field(value4, this.f44251a.i(a(h7.getComponentType()), annotationArr), encoded3).b();
                            }
                        } else {
                            throw Utils.p(this.f44253c, i2, "@Field parameters can only be used with form encoding.", new Object[0]);
                        }
                    } else if (annotation instanceof FieldMap) {
                        j(i2, type);
                        if (this.f44267q) {
                            Class h8 = Utils.h(type);
                            if (cls3.isAssignableFrom(h8)) {
                                Type i5 = Utils.i(type, h8, cls3);
                                if (i5 instanceof ParameterizedType) {
                                    ParameterizedType parameterizedType3 = (ParameterizedType) i5;
                                    Type g4 = Utils.g(0, parameterizedType3);
                                    if (cls == g4) {
                                        Converter i6 = this.f44251a.i(Utils.g(1, parameterizedType3), annotationArr);
                                        this.f44257g = true;
                                        return new ParameterHandler.FieldMap(this.f44253c, i2, i6, ((FieldMap) annotation).encoded());
                                    }
                                    throw Utils.p(this.f44253c, i2, "@FieldMap keys must be of type String: " + g4, new Object[0]);
                                }
                                throw Utils.p(this.f44253c, i2, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                            }
                            throw Utils.p(this.f44253c, i2, "@FieldMap parameter type must be Map.", new Object[0]);
                        }
                        throw Utils.p(this.f44253c, i2, "@FieldMap parameters can only be used with form encoding.", new Object[0]);
                    } else {
                        Class<MultipartBody.Part> cls4 = MultipartBody.Part.class;
                        if (annotation instanceof Part) {
                            j(i2, type);
                            if (this.f44268r) {
                                Part part = (Part) annotation;
                                this.f44258h = true;
                                String value5 = part.value();
                                Class h9 = Utils.h(type);
                                if (!value5.isEmpty()) {
                                    Headers m2 = Headers.m("Content-Disposition", "form-data; name=\"" + value5 + "\"", "Content-Transfer-Encoding", part.encoding());
                                    if (cls2.isAssignableFrom(h9)) {
                                        if (type instanceof ParameterizedType) {
                                            Type g5 = Utils.g(0, (ParameterizedType) type);
                                            if (!cls4.isAssignableFrom(Utils.h(g5))) {
                                                return new ParameterHandler.Part(this.f44253c, i2, m2, this.f44251a.g(g5, annotationArr, this.f44254d)).c();
                                            }
                                            throw Utils.p(this.f44253c, i2, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new Object[0]);
                                        }
                                        throw Utils.p(this.f44253c, i2, h9.getSimpleName() + " must include generic type (e.g., " + h9.getSimpleName() + "<String>)", new Object[0]);
                                    } else if (h9.isArray()) {
                                        Class a2 = a(h9.getComponentType());
                                        if (!cls4.isAssignableFrom(a2)) {
                                            return new ParameterHandler.Part(this.f44253c, i2, m2, this.f44251a.g(a2, annotationArr, this.f44254d)).b();
                                        }
                                        throw Utils.p(this.f44253c, i2, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new Object[0]);
                                    } else if (!cls4.isAssignableFrom(h9)) {
                                        return new ParameterHandler.Part(this.f44253c, i2, m2, this.f44251a.g(type, annotationArr, this.f44254d));
                                    } else {
                                        throw Utils.p(this.f44253c, i2, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new Object[0]);
                                    }
                                } else if (cls2.isAssignableFrom(h9)) {
                                    if (!(type instanceof ParameterizedType)) {
                                        throw Utils.p(this.f44253c, i2, h9.getSimpleName() + " must include generic type (e.g., " + h9.getSimpleName() + "<String>)", new Object[0]);
                                    } else if (cls4.isAssignableFrom(Utils.h(Utils.g(0, (ParameterizedType) type)))) {
                                        return ParameterHandler.RawPart.f44215a.c();
                                    } else {
                                        throw Utils.p(this.f44253c, i2, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new Object[0]);
                                    }
                                } else if (h9.isArray()) {
                                    if (cls4.isAssignableFrom(h9.getComponentType())) {
                                        return ParameterHandler.RawPart.f44215a.b();
                                    }
                                    throw Utils.p(this.f44253c, i2, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new Object[0]);
                                } else if (cls4.isAssignableFrom(h9)) {
                                    return ParameterHandler.RawPart.f44215a;
                                } else {
                                    throw Utils.p(this.f44253c, i2, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new Object[0]);
                                }
                            } else {
                                throw Utils.p(this.f44253c, i2, "@Part parameters can only be used with multipart encoding.", new Object[0]);
                            }
                        } else if (annotation instanceof PartMap) {
                            j(i2, type);
                            if (this.f44268r) {
                                this.f44258h = true;
                                Class h10 = Utils.h(type);
                                if (cls3.isAssignableFrom(h10)) {
                                    Type i7 = Utils.i(type, h10, cls3);
                                    if (i7 instanceof ParameterizedType) {
                                        ParameterizedType parameterizedType4 = (ParameterizedType) i7;
                                        Type g6 = Utils.g(0, parameterizedType4);
                                        if (cls == g6) {
                                            Type g7 = Utils.g(1, parameterizedType4);
                                            if (!cls4.isAssignableFrom(Utils.h(g7))) {
                                                return new ParameterHandler.PartMap(this.f44253c, i2, this.f44251a.g(g7, annotationArr, this.f44254d), ((PartMap) annotation).encoding());
                                            }
                                            throw Utils.p(this.f44253c, i2, "@PartMap values cannot be MultipartBody.Part. Use @Part List<Part> or a different value type instead.", new Object[0]);
                                        }
                                        throw Utils.p(this.f44253c, i2, "@PartMap keys must be of type String: " + g6, new Object[0]);
                                    }
                                    throw Utils.p(this.f44253c, i2, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                                }
                                throw Utils.p(this.f44253c, i2, "@PartMap parameter type must be Map.", new Object[0]);
                            }
                            throw Utils.p(this.f44253c, i2, "@PartMap parameters can only be used with multipart encoding.", new Object[0]);
                        } else if (annotation instanceof Body) {
                            j(i2, type);
                            if (this.f44267q || this.f44268r) {
                                throw Utils.p(this.f44253c, i2, "@Body parameters cannot be used with form or multi-part encoding.", new Object[0]);
                            } else if (!this.f44259i) {
                                try {
                                    Converter g8 = this.f44251a.g(type, annotationArr, this.f44254d);
                                    this.f44259i = true;
                                    return new ParameterHandler.Body(this.f44253c, i2, g8);
                                } catch (RuntimeException e2) {
                                    throw Utils.q(this.f44253c, e2, i2, "Unable to create @Body converter for %s", type);
                                }
                            } else {
                                throw Utils.p(this.f44253c, i2, "Multiple @Body method annotations found.", new Object[0]);
                            }
                        } else if (!(annotation instanceof Tag)) {
                            return null;
                        } else {
                            j(i2, type);
                            Class h11 = Utils.h(type);
                            int i8 = i2 - 1;
                            while (i8 >= 0) {
                                ParameterHandler parameterHandler = this.f44273w[i8];
                                if (!(parameterHandler instanceof ParameterHandler.Tag) || !((ParameterHandler.Tag) parameterHandler).f44218a.equals(h11)) {
                                    i8--;
                                } else {
                                    throw Utils.p(this.f44253c, i2, "@Tag type " + h11.getName() + " is duplicate of " + Platform.f44220b.a(this.f44253c, i8) + " and would always overwrite its value.", new Object[0]);
                                }
                            }
                            return new ParameterHandler.Tag(h11);
                        }
                    }
                }
            }
        }

        public final void i(int i2, String str) {
            if (!f44250z.matcher(str).matches()) {
                throw Utils.p(this.f44253c, i2, "@Path parameter name must match %s. Found: %s", f44249y.pattern(), str);
            } else if (!this.f44272v.contains(str)) {
                throw Utils.p(this.f44253c, i2, "URL \"%s\" does not contain \"{%s}\".", this.f44269s, str);
            }
        }

        public final void j(int i2, Type type) {
            if (Utils.j(type)) {
                throw Utils.p(this.f44253c, i2, "Parameter type must not include a type variable or wildcard: %s", type);
            }
        }
    }

    public RequestFactory(Builder builder) {
        this.f44237a = builder.f44252b;
        this.f44238b = builder.f44253c;
        this.f44239c = builder.f44251a.f44280c;
        this.f44240d = builder.f44265o;
        this.f44241e = builder.f44269s;
        this.f44242f = builder.f44270t;
        this.f44243g = builder.f44271u;
        this.f44244h = builder.f44266p;
        this.f44245i = builder.f44267q;
        this.f44246j = builder.f44268r;
        this.f44247k = builder.f44273w;
        this.f44248l = builder.f44274x;
    }

    public static RequestFactory b(Retrofit retrofit, Class cls, Method method) {
        return new Builder(retrofit, cls, method).b();
    }

    public Request a(Object obj, Object[] objArr) {
        ParameterHandler[] parameterHandlerArr = this.f44247k;
        int length = objArr.length;
        if (length == parameterHandlerArr.length) {
            RequestBuilder requestBuilder = new RequestBuilder(this.f44240d, this.f44239c, this.f44241e, this.f44242f, this.f44243g, this.f44244h, this.f44245i, this.f44246j);
            if (this.f44248l) {
                length--;
            }
            ArrayList arrayList = new ArrayList(length);
            for (int i2 = 0; i2 < length; i2++) {
                arrayList.add(objArr[i2]);
                parameterHandlerArr[i2].a(requestBuilder, objArr[i2]);
            }
            return requestBuilder.k().h(Invocation.class, new Invocation(this.f44237a, obj, this.f44238b, arrayList)).b();
        }
        throw new IllegalArgumentException("Argument count (" + length + ") doesn't match expected count (" + parameterHandlerArr.length + ")");
    }
}
