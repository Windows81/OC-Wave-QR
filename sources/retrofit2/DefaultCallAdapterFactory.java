package retrofit2;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Objects;
import java.util.concurrent.Executor;
import okhttp3.Request;
import retrofit2.CallAdapter;

final class DefaultCallAdapterFactory extends CallAdapter.Factory {

    /* renamed from: a  reason: collision with root package name */
    public final Executor f44131a;

    public static final class ExecutorCallbackCall<T> implements Call<T> {

        /* renamed from: A  reason: collision with root package name */
        public final Call f44135A;

        /* renamed from: z  reason: collision with root package name */
        public final Executor f44136z;

        public ExecutorCallbackCall(Executor executor, Call call) {
            this.f44136z = executor;
            this.f44135A = call;
        }

        public boolean A() {
            return this.f44135A.A();
        }

        public void G0(final Callback callback) {
            Objects.requireNonNull(callback, "callback == null");
            this.f44135A.G0(new Callback<T>() {
                public final /* synthetic */ void c(Callback callback, Throwable th) {
                    callback.onFailure(ExecutorCallbackCall.this, th);
                }

                public final /* synthetic */ void d(Callback callback, Response response) {
                    if (ExecutorCallbackCall.this.f44135A.A()) {
                        callback.onFailure(ExecutorCallbackCall.this, new IOException("Canceled"));
                    } else {
                        callback.onResponse(ExecutorCallbackCall.this, response);
                    }
                }

                public void onFailure(Call call, Throwable th) {
                    ExecutorCallbackCall.this.f44136z.execute(new b(this, callback, th));
                }

                public void onResponse(Call call, Response response) {
                    ExecutorCallbackCall.this.f44136z.execute(new a(this, callback, response));
                }
            });
        }

        public void cancel() {
            this.f44135A.cancel();
        }

        public Request m() {
            return this.f44135A.m();
        }

        public Call clone() {
            return new ExecutorCallbackCall(this.f44136z, this.f44135A.clone());
        }
    }

    public DefaultCallAdapterFactory(Executor executor) {
        this.f44131a = executor;
    }

    public CallAdapter a(Type type, Annotation[] annotationArr, Retrofit retrofit) {
        final Executor executor = null;
        if (CallAdapter.Factory.c(type) != Call.class) {
            return null;
        }
        if (type instanceof ParameterizedType) {
            final Type g2 = Utils.g(0, (ParameterizedType) type);
            if (!Utils.l(annotationArr, SkipCallbackExecutor.class)) {
                executor = this.f44131a;
            }
            return new CallAdapter<Object, Call<?>>() {
                public Type a() {
                    return g2;
                }

                /* renamed from: c */
                public Call b(Call call) {
                    Executor executor = executor;
                    return executor == null ? call : new ExecutorCallbackCall(executor, call);
                }
            };
        }
        throw new IllegalArgumentException("Call return type must be parameterized as Call<Foo> or Call<? extends Foo>");
    }
}
