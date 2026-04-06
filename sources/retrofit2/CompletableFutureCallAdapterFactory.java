package retrofit2;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.concurrent.CompletableFuture;
import retrofit2.CallAdapter;

final class CompletableFutureCallAdapterFactory extends CallAdapter.Factory {

    public static final class BodyCallAdapter<R> implements CallAdapter<R, CompletableFuture<R>> {

        /* renamed from: a  reason: collision with root package name */
        public final Type f44124a;

        public class BodyCallback implements Callback<R> {

            /* renamed from: a  reason: collision with root package name */
            public final CompletableFuture f44125a;

            public BodyCallback(CompletableFuture completableFuture) {
                this.f44125a = completableFuture;
            }

            public void onFailure(Call call, Throwable th) {
                this.f44125a.completeExceptionally(th);
            }

            public void onResponse(Call call, Response response) {
                if (response.e()) {
                    this.f44125a.complete(response.a());
                } else {
                    this.f44125a.completeExceptionally(new HttpException(response));
                }
            }
        }

        public BodyCallAdapter(Type type) {
            this.f44124a = type;
        }

        public Type a() {
            return this.f44124a;
        }

        /* renamed from: c */
        public CompletableFuture b(Call call) {
            CallCancelCompletableFuture callCancelCompletableFuture = new CallCancelCompletableFuture(call);
            call.G0(new BodyCallback(callCancelCompletableFuture));
            return callCancelCompletableFuture;
        }
    }

    public static final class CallCancelCompletableFuture<T> extends CompletableFuture<T> {

        /* renamed from: z  reason: collision with root package name */
        public final Call f44127z;

        public CallCancelCompletableFuture(Call call) {
            this.f44127z = call;
        }

        public boolean cancel(boolean z2) {
            if (z2) {
                this.f44127z.cancel();
            }
            return super.cancel(z2);
        }
    }

    public static final class ResponseCallAdapter<R> implements CallAdapter<R, CompletableFuture<Response<R>>> {

        /* renamed from: a  reason: collision with root package name */
        public final Type f44128a;

        public class ResponseCallback implements Callback<R> {

            /* renamed from: a  reason: collision with root package name */
            public final CompletableFuture f44129a;

            public ResponseCallback(CompletableFuture completableFuture) {
                this.f44129a = completableFuture;
            }

            public void onFailure(Call call, Throwable th) {
                this.f44129a.completeExceptionally(th);
            }

            public void onResponse(Call call, Response response) {
                this.f44129a.complete(response);
            }
        }

        public ResponseCallAdapter(Type type) {
            this.f44128a = type;
        }

        public Type a() {
            return this.f44128a;
        }

        /* renamed from: c */
        public CompletableFuture b(Call call) {
            CallCancelCompletableFuture callCancelCompletableFuture = new CallCancelCompletableFuture(call);
            call.G0(new ResponseCallback(callCancelCompletableFuture));
            return callCancelCompletableFuture;
        }
    }

    public CallAdapter a(Type type, Annotation[] annotationArr, Retrofit retrofit) {
        if (CallAdapter.Factory.c(type) != CompletableFuture.class) {
            return null;
        }
        if (type instanceof ParameterizedType) {
            Type b2 = CallAdapter.Factory.b(0, (ParameterizedType) type);
            if (CallAdapter.Factory.c(b2) != Response.class) {
                return new BodyCallAdapter(b2);
            }
            if (b2 instanceof ParameterizedType) {
                return new ResponseCallAdapter(CallAdapter.Factory.b(0, (ParameterizedType) b2));
            }
            throw new IllegalStateException("Response must be parameterized as Response<Foo> or Response<? extends Foo>");
        }
        throw new IllegalStateException("CompletableFuture return type must be parameterized as CompletableFuture<Foo> or CompletableFuture<? extends Foo>");
    }
}
