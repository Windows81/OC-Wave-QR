package retrofit2;

import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.Objects;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;

abstract class ParameterHandler<T> {

    public static final class Body<T> extends ParameterHandler<T> {

        /* renamed from: a  reason: collision with root package name */
        public final Method f44174a;

        /* renamed from: b  reason: collision with root package name */
        public final int f44175b;

        /* renamed from: c  reason: collision with root package name */
        public final Converter f44176c;

        public Body(Method method, int i2, Converter converter) {
            this.f44174a = method;
            this.f44175b = i2;
            this.f44176c = converter;
        }

        public void a(RequestBuilder requestBuilder, Object obj) {
            if (obj != null) {
                try {
                    requestBuilder.l((RequestBody) this.f44176c.a(obj));
                } catch (IOException e2) {
                    Method method = this.f44174a;
                    int i2 = this.f44175b;
                    throw Utils.q(method, e2, i2, "Unable to convert " + obj + " to RequestBody", new Object[0]);
                }
            } else {
                throw Utils.p(this.f44174a, this.f44175b, "Body parameter value must not be null.", new Object[0]);
            }
        }
    }

    public static final class Field<T> extends ParameterHandler<T> {

        /* renamed from: a  reason: collision with root package name */
        public final String f44177a;

        /* renamed from: b  reason: collision with root package name */
        public final Converter f44178b;

        /* renamed from: c  reason: collision with root package name */
        public final boolean f44179c;

        public Field(String str, Converter converter, boolean z2) {
            Objects.requireNonNull(str, "name == null");
            this.f44177a = str;
            this.f44178b = converter;
            this.f44179c = z2;
        }

        public void a(RequestBuilder requestBuilder, Object obj) {
            String str;
            if (obj != null && (str = (String) this.f44178b.a(obj)) != null) {
                requestBuilder.a(this.f44177a, str, this.f44179c);
            }
        }
    }

    public static final class FieldMap<T> extends ParameterHandler<Map<String, T>> {

        /* renamed from: a  reason: collision with root package name */
        public final Method f44180a;

        /* renamed from: b  reason: collision with root package name */
        public final int f44181b;

        /* renamed from: c  reason: collision with root package name */
        public final Converter f44182c;

        /* renamed from: d  reason: collision with root package name */
        public final boolean f44183d;

        public FieldMap(Method method, int i2, Converter converter, boolean z2) {
            this.f44180a = method;
            this.f44181b = i2;
            this.f44182c = converter;
            this.f44183d = z2;
        }

        /* renamed from: d */
        public void a(RequestBuilder requestBuilder, Map map) {
            if (map != null) {
                for (Map.Entry entry : map.entrySet()) {
                    String str = (String) entry.getKey();
                    if (str != null) {
                        Object value = entry.getValue();
                        if (value != null) {
                            String str2 = (String) this.f44182c.a(value);
                            if (str2 != null) {
                                requestBuilder.a(str, str2, this.f44183d);
                            } else {
                                Method method = this.f44180a;
                                int i2 = this.f44181b;
                                throw Utils.p(method, i2, "Field map value '" + value + "' converted to null by " + this.f44182c.getClass().getName() + " for key '" + str + "'.", new Object[0]);
                            }
                        } else {
                            Method method2 = this.f44180a;
                            int i3 = this.f44181b;
                            throw Utils.p(method2, i3, "Field map contained null value for key '" + str + "'.", new Object[0]);
                        }
                    } else {
                        throw Utils.p(this.f44180a, this.f44181b, "Field map contained null key.", new Object[0]);
                    }
                }
                return;
            }
            throw Utils.p(this.f44180a, this.f44181b, "Field map was null.", new Object[0]);
        }
    }

    public static final class Header<T> extends ParameterHandler<T> {

        /* renamed from: a  reason: collision with root package name */
        public final String f44184a;

        /* renamed from: b  reason: collision with root package name */
        public final Converter f44185b;

        /* renamed from: c  reason: collision with root package name */
        public final boolean f44186c;

        public Header(String str, Converter converter, boolean z2) {
            Objects.requireNonNull(str, "name == null");
            this.f44184a = str;
            this.f44185b = converter;
            this.f44186c = z2;
        }

        public void a(RequestBuilder requestBuilder, Object obj) {
            String str;
            if (obj != null && (str = (String) this.f44185b.a(obj)) != null) {
                requestBuilder.b(this.f44184a, str, this.f44186c);
            }
        }
    }

    public static final class HeaderMap<T> extends ParameterHandler<Map<String, T>> {

        /* renamed from: a  reason: collision with root package name */
        public final Method f44187a;

        /* renamed from: b  reason: collision with root package name */
        public final int f44188b;

        /* renamed from: c  reason: collision with root package name */
        public final Converter f44189c;

        /* renamed from: d  reason: collision with root package name */
        public final boolean f44190d;

        public HeaderMap(Method method, int i2, Converter converter, boolean z2) {
            this.f44187a = method;
            this.f44188b = i2;
            this.f44189c = converter;
            this.f44190d = z2;
        }

        /* renamed from: d */
        public void a(RequestBuilder requestBuilder, Map map) {
            if (map != null) {
                for (Map.Entry entry : map.entrySet()) {
                    String str = (String) entry.getKey();
                    if (str != null) {
                        Object value = entry.getValue();
                        if (value != null) {
                            requestBuilder.b(str, (String) this.f44189c.a(value), this.f44190d);
                        } else {
                            Method method = this.f44187a;
                            int i2 = this.f44188b;
                            throw Utils.p(method, i2, "Header map contained null value for key '" + str + "'.", new Object[0]);
                        }
                    } else {
                        throw Utils.p(this.f44187a, this.f44188b, "Header map contained null key.", new Object[0]);
                    }
                }
                return;
            }
            throw Utils.p(this.f44187a, this.f44188b, "Header map was null.", new Object[0]);
        }
    }

    public static final class Headers extends ParameterHandler<okhttp3.Headers> {

        /* renamed from: a  reason: collision with root package name */
        public final Method f44191a;

        /* renamed from: b  reason: collision with root package name */
        public final int f44192b;

        public Headers(Method method, int i2) {
            this.f44191a = method;
            this.f44192b = i2;
        }

        /* renamed from: d */
        public void a(RequestBuilder requestBuilder, okhttp3.Headers headers) {
            if (headers != null) {
                requestBuilder.c(headers);
                return;
            }
            throw Utils.p(this.f44191a, this.f44192b, "Headers parameter must not be null.", new Object[0]);
        }
    }

    public static final class Part<T> extends ParameterHandler<T> {

        /* renamed from: a  reason: collision with root package name */
        public final Method f44193a;

        /* renamed from: b  reason: collision with root package name */
        public final int f44194b;

        /* renamed from: c  reason: collision with root package name */
        public final okhttp3.Headers f44195c;

        /* renamed from: d  reason: collision with root package name */
        public final Converter f44196d;

        public Part(Method method, int i2, okhttp3.Headers headers, Converter converter) {
            this.f44193a = method;
            this.f44194b = i2;
            this.f44195c = headers;
            this.f44196d = converter;
        }

        public void a(RequestBuilder requestBuilder, Object obj) {
            if (obj != null) {
                try {
                    requestBuilder.d(this.f44195c, (RequestBody) this.f44196d.a(obj));
                } catch (IOException e2) {
                    Method method = this.f44193a;
                    int i2 = this.f44194b;
                    throw Utils.p(method, i2, "Unable to convert " + obj + " to RequestBody", e2);
                }
            }
        }
    }

    public static final class PartMap<T> extends ParameterHandler<Map<String, T>> {

        /* renamed from: a  reason: collision with root package name */
        public final Method f44197a;

        /* renamed from: b  reason: collision with root package name */
        public final int f44198b;

        /* renamed from: c  reason: collision with root package name */
        public final Converter f44199c;

        /* renamed from: d  reason: collision with root package name */
        public final String f44200d;

        public PartMap(Method method, int i2, Converter converter, String str) {
            this.f44197a = method;
            this.f44198b = i2;
            this.f44199c = converter;
            this.f44200d = str;
        }

        /* renamed from: d */
        public void a(RequestBuilder requestBuilder, Map map) {
            if (map != null) {
                for (Map.Entry entry : map.entrySet()) {
                    String str = (String) entry.getKey();
                    if (str != null) {
                        Object value = entry.getValue();
                        if (value != null) {
                            requestBuilder.d(okhttp3.Headers.m("Content-Disposition", "form-data; name=\"" + str + "\"", "Content-Transfer-Encoding", this.f44200d), (RequestBody) this.f44199c.a(value));
                        } else {
                            Method method = this.f44197a;
                            int i2 = this.f44198b;
                            throw Utils.p(method, i2, "Part map contained null value for key '" + str + "'.", new Object[0]);
                        }
                    } else {
                        throw Utils.p(this.f44197a, this.f44198b, "Part map contained null key.", new Object[0]);
                    }
                }
                return;
            }
            throw Utils.p(this.f44197a, this.f44198b, "Part map was null.", new Object[0]);
        }
    }

    public static final class Path<T> extends ParameterHandler<T> {

        /* renamed from: a  reason: collision with root package name */
        public final Method f44201a;

        /* renamed from: b  reason: collision with root package name */
        public final int f44202b;

        /* renamed from: c  reason: collision with root package name */
        public final String f44203c;

        /* renamed from: d  reason: collision with root package name */
        public final Converter f44204d;

        /* renamed from: e  reason: collision with root package name */
        public final boolean f44205e;

        public Path(Method method, int i2, String str, Converter converter, boolean z2) {
            this.f44201a = method;
            this.f44202b = i2;
            Objects.requireNonNull(str, "name == null");
            this.f44203c = str;
            this.f44204d = converter;
            this.f44205e = z2;
        }

        public void a(RequestBuilder requestBuilder, Object obj) {
            if (obj != null) {
                requestBuilder.f(this.f44203c, (String) this.f44204d.a(obj), this.f44205e);
                return;
            }
            Method method = this.f44201a;
            int i2 = this.f44202b;
            throw Utils.p(method, i2, "Path parameter \"" + this.f44203c + "\" value must not be null.", new Object[0]);
        }
    }

    public static final class Query<T> extends ParameterHandler<T> {

        /* renamed from: a  reason: collision with root package name */
        public final String f44206a;

        /* renamed from: b  reason: collision with root package name */
        public final Converter f44207b;

        /* renamed from: c  reason: collision with root package name */
        public final boolean f44208c;

        public Query(String str, Converter converter, boolean z2) {
            Objects.requireNonNull(str, "name == null");
            this.f44206a = str;
            this.f44207b = converter;
            this.f44208c = z2;
        }

        public void a(RequestBuilder requestBuilder, Object obj) {
            String str;
            if (obj != null && (str = (String) this.f44207b.a(obj)) != null) {
                requestBuilder.g(this.f44206a, str, this.f44208c);
            }
        }
    }

    public static final class QueryMap<T> extends ParameterHandler<Map<String, T>> {

        /* renamed from: a  reason: collision with root package name */
        public final Method f44209a;

        /* renamed from: b  reason: collision with root package name */
        public final int f44210b;

        /* renamed from: c  reason: collision with root package name */
        public final Converter f44211c;

        /* renamed from: d  reason: collision with root package name */
        public final boolean f44212d;

        public QueryMap(Method method, int i2, Converter converter, boolean z2) {
            this.f44209a = method;
            this.f44210b = i2;
            this.f44211c = converter;
            this.f44212d = z2;
        }

        /* renamed from: d */
        public void a(RequestBuilder requestBuilder, Map map) {
            if (map != null) {
                for (Map.Entry entry : map.entrySet()) {
                    String str = (String) entry.getKey();
                    if (str != null) {
                        Object value = entry.getValue();
                        if (value != null) {
                            String str2 = (String) this.f44211c.a(value);
                            if (str2 != null) {
                                requestBuilder.g(str, str2, this.f44212d);
                            } else {
                                Method method = this.f44209a;
                                int i2 = this.f44210b;
                                throw Utils.p(method, i2, "Query map value '" + value + "' converted to null by " + this.f44211c.getClass().getName() + " for key '" + str + "'.", new Object[0]);
                            }
                        } else {
                            Method method2 = this.f44209a;
                            int i3 = this.f44210b;
                            throw Utils.p(method2, i3, "Query map contained null value for key '" + str + "'.", new Object[0]);
                        }
                    } else {
                        throw Utils.p(this.f44209a, this.f44210b, "Query map contained null key.", new Object[0]);
                    }
                }
                return;
            }
            throw Utils.p(this.f44209a, this.f44210b, "Query map was null", new Object[0]);
        }
    }

    public static final class QueryName<T> extends ParameterHandler<T> {

        /* renamed from: a  reason: collision with root package name */
        public final Converter f44213a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f44214b;

        public QueryName(Converter converter, boolean z2) {
            this.f44213a = converter;
            this.f44214b = z2;
        }

        public void a(RequestBuilder requestBuilder, Object obj) {
            if (obj != null) {
                requestBuilder.g((String) this.f44213a.a(obj), (String) null, this.f44214b);
            }
        }
    }

    public static final class RawPart extends ParameterHandler<MultipartBody.Part> {

        /* renamed from: a  reason: collision with root package name */
        public static final RawPart f44215a = new RawPart();

        /* renamed from: d */
        public void a(RequestBuilder requestBuilder, MultipartBody.Part part) {
            if (part != null) {
                requestBuilder.e(part);
            }
        }
    }

    public static final class RelativeUrl extends ParameterHandler<Object> {

        /* renamed from: a  reason: collision with root package name */
        public final Method f44216a;

        /* renamed from: b  reason: collision with root package name */
        public final int f44217b;

        public RelativeUrl(Method method, int i2) {
            this.f44216a = method;
            this.f44217b = i2;
        }

        public void a(RequestBuilder requestBuilder, Object obj) {
            if (obj != null) {
                requestBuilder.m(obj);
                return;
            }
            throw Utils.p(this.f44216a, this.f44217b, "@Url parameter is null.", new Object[0]);
        }
    }

    public static final class Tag<T> extends ParameterHandler<T> {

        /* renamed from: a  reason: collision with root package name */
        public final Class f44218a;

        public Tag(Class cls) {
            this.f44218a = cls;
        }

        public void a(RequestBuilder requestBuilder, Object obj) {
            requestBuilder.h(this.f44218a, obj);
        }
    }

    public abstract void a(RequestBuilder requestBuilder, Object obj);

    public final ParameterHandler b() {
        return new ParameterHandler<Object>() {
            public void a(RequestBuilder requestBuilder, Object obj) {
                if (obj != null) {
                    int length = Array.getLength(obj);
                    for (int i2 = 0; i2 < length; i2++) {
                        ParameterHandler.this.a(requestBuilder, Array.get(obj, i2));
                    }
                }
            }
        };
    }

    public final ParameterHandler c() {
        return new ParameterHandler<Iterable<T>>() {
            /* renamed from: d */
            public void a(RequestBuilder requestBuilder, Iterable iterable) {
                if (iterable != null) {
                    for (Object a2 : iterable) {
                        ParameterHandler.this.a(requestBuilder, a2);
                    }
                }
            }
        };
    }
}
