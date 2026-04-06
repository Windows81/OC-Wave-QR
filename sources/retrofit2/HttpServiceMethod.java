package retrofit2;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import kotlin.coroutines.Continuation;
import okhttp3.Call;
import okhttp3.Response;
import retrofit2.Utils;

abstract class HttpServiceMethod<ResponseT, ReturnT> extends ServiceMethod<ReturnT> {

    /* renamed from: a  reason: collision with root package name */
    public final RequestFactory f44143a;

    /* renamed from: b  reason: collision with root package name */
    public final Call.Factory f44144b;

    /* renamed from: c  reason: collision with root package name */
    public final Converter f44145c;

    public static final class CallAdapted<ResponseT, ReturnT> extends HttpServiceMethod<ResponseT, ReturnT> {

        /* renamed from: d  reason: collision with root package name */
        public final CallAdapter f44146d;

        public CallAdapted(RequestFactory requestFactory, Call.Factory factory, Converter converter, CallAdapter callAdapter) {
            super(requestFactory, factory, converter);
            this.f44146d = callAdapter;
        }

        public Object c(Call call, Object[] objArr) {
            return this.f44146d.b(call);
        }
    }

    public static final class SuspendForBody<ResponseT> extends HttpServiceMethod<ResponseT, Object> {

        /* renamed from: d  reason: collision with root package name */
        public final CallAdapter f44147d;

        /* renamed from: e  reason: collision with root package name */
        public final boolean f44148e;

        /* renamed from: f  reason: collision with root package name */
        public final boolean f44149f;

        public SuspendForBody(RequestFactory requestFactory, Call.Factory factory, Converter converter, CallAdapter callAdapter, boolean z2, boolean z3) {
            super(requestFactory, factory, converter);
            this.f44147d = callAdapter;
            this.f44148e = z2;
            this.f44149f = z3;
        }

        public Object c(Call call, Object[] objArr) {
            Call call2 = (Call) this.f44147d.b(call);
            Continuation continuation = objArr[objArr.length - 1];
            try {
                return this.f44149f ? KotlinExtensions.d(call2, continuation) : this.f44148e ? KotlinExtensions.b(call2, continuation) : KotlinExtensions.a(call2, continuation);
            } catch (VirtualMachineError e2) {
                e = e2;
                throw e;
            } catch (ThreadDeath e3) {
                e = e3;
                throw e;
            } catch (LinkageError e4) {
                e = e4;
                throw e;
            } catch (Throwable th) {
                return KotlinExtensions.e(th, continuation);
            }
        }
    }

    public static final class SuspendForResponse<ResponseT> extends HttpServiceMethod<ResponseT, Object> {

        /* renamed from: d  reason: collision with root package name */
        public final CallAdapter f44150d;

        public SuspendForResponse(RequestFactory requestFactory, Call.Factory factory, Converter converter, CallAdapter callAdapter) {
            super(requestFactory, factory, converter);
            this.f44150d = callAdapter;
        }

        public Object c(Call call, Object[] objArr) {
            Call call2 = (Call) this.f44150d.b(call);
            Continuation continuation = objArr[objArr.length - 1];
            try {
                return KotlinExtensions.c(call2, continuation);
            } catch (Exception e2) {
                return KotlinExtensions.e(e2, continuation);
            }
        }
    }

    public HttpServiceMethod(RequestFactory requestFactory, Call.Factory factory, Converter converter) {
        this.f44143a = requestFactory;
        this.f44144b = factory;
        this.f44145c = converter;
    }

    public static CallAdapter d(Retrofit retrofit, Method method, Type type, Annotation[] annotationArr) {
        try {
            return retrofit.a(type, annotationArr);
        } catch (RuntimeException e2) {
            throw Utils.o(method, e2, "Unable to create call adapter for %s", type);
        }
    }

    public static Converter e(Retrofit retrofit, Method method, Type type) {
        try {
            return retrofit.h(type, method.getAnnotations());
        } catch (RuntimeException e2) {
            throw Utils.o(method, e2, "Unable to create converter for %s", type);
        }
    }

    public static HttpServiceMethod f(Retrofit retrofit, Method method, RequestFactory requestFactory) {
        boolean z2;
        Type type;
        boolean z3;
        boolean z4;
        boolean z5 = requestFactory.f44248l;
        Annotation[] annotations = method.getAnnotations();
        Class<Response> cls = Response.class;
        if (z5) {
            Type[] genericParameterTypes = method.getGenericParameterTypes();
            Type f2 = Utils.f(0, (ParameterizedType) genericParameterTypes[genericParameterTypes.length - 1]);
            Class<Call> cls2 = Call.class;
            if (Utils.h(f2) == cls && (f2 instanceof ParameterizedType)) {
                f2 = Utils.g(0, (ParameterizedType) f2);
                z3 = true;
                z4 = false;
            } else if (Utils.h(f2) != cls2) {
                z4 = Utils.m(f2);
                z3 = false;
            } else {
                throw Utils.n(method, "Suspend functions should not return Call, as they already execute asynchronously.\nChange its return type to %s", Utils.g(0, (ParameterizedType) f2));
            }
            type = new Utils.ParameterizedTypeImpl((Type) null, cls2, f2);
            annotations = SkipCallbackExecutorImpl.a(annotations);
            z2 = z4;
        } else {
            type = method.getGenericReturnType();
            z3 = false;
            z2 = false;
        }
        CallAdapter d2 = d(retrofit, method, type, annotations);
        Type a2 = d2.a();
        if (a2 == Response.class) {
            throw Utils.n(method, "'" + Utils.h(a2).getName() + "' is not a valid response body type. Did you mean ResponseBody?", new Object[0]);
        } else if (a2 == cls) {
            throw Utils.n(method, "Response must include generic type (e.g., Response<String>)", new Object[0]);
        } else if (!requestFactory.f44240d.equals("HEAD") || Void.class.equals(a2) || Utils.m(a2)) {
            Converter e2 = e(retrofit, method, a2);
            Call.Factory factory = retrofit.f44279b;
            return !z5 ? new CallAdapted(requestFactory, factory, e2, d2) : z3 ? new SuspendForResponse(requestFactory, factory, e2, d2) : new SuspendForBody(requestFactory, factory, e2, d2, false, z2);
        } else {
            throw Utils.n(method, "HEAD method must use Void or Unit as response type.", new Object[0]);
        }
    }

    public final Object a(Object obj, Object[] objArr) {
        return c(new OkHttpCall(this.f44143a, obj, objArr, this.f44144b, this.f44145c), objArr);
    }

    public abstract Object c(Call call, Object[] objArr);
}
