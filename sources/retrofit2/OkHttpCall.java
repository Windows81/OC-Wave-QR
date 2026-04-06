package retrofit2;

import com.google.firebase.perf.network.FirebasePerfOkHttpClient;
import java.io.IOException;
import java.util.Objects;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okio.Buffer;
import okio.BufferedSource;
import okio.ForwardingSource;
import okio.Okio;

final class OkHttpCall<T> implements Call<T> {

    /* renamed from: A  reason: collision with root package name */
    public final Object f44163A;

    /* renamed from: B  reason: collision with root package name */
    public final Object[] f44164B;
    public final Call.Factory C;
    public final Converter D;
    public volatile boolean E;
    public Call F;
    public Throwable G;
    public boolean H;

    /* renamed from: z  reason: collision with root package name */
    public final RequestFactory f44165z;

    public static final class ExceptionCatchingResponseBody extends ResponseBody {

        /* renamed from: B  reason: collision with root package name */
        public final ResponseBody f44168B;
        public final BufferedSource C;
        public IOException D;

        public ExceptionCatchingResponseBody(ResponseBody responseBody) {
            this.f44168B = responseBody;
            this.C = Okio.d(new ForwardingSource(responseBody.j()) {
                public long o1(Buffer buffer, long j2) {
                    try {
                        return super.o1(buffer, j2);
                    } catch (IOException e2) {
                        ExceptionCatchingResponseBody.this.D = e2;
                        throw e2;
                    }
                }
            });
        }

        public void close() {
            this.f44168B.close();
        }

        public long d() {
            return this.f44168B.d();
        }

        public MediaType f() {
            return this.f44168B.f();
        }

        public BufferedSource j() {
            return this.C;
        }

        public void l() {
            IOException iOException = this.D;
            if (iOException != null) {
                throw iOException;
            }
        }
    }

    public static final class NoContentResponseBody extends ResponseBody {

        /* renamed from: B  reason: collision with root package name */
        public final MediaType f44170B;
        public final long C;

        public NoContentResponseBody(MediaType mediaType, long j2) {
            this.f44170B = mediaType;
            this.C = j2;
        }

        public long d() {
            return this.C;
        }

        public MediaType f() {
            return this.f44170B;
        }

        public BufferedSource j() {
            throw new IllegalStateException("Cannot read raw response body of a converted body.");
        }
    }

    public OkHttpCall(RequestFactory requestFactory, Object obj, Object[] objArr, Call.Factory factory, Converter converter) {
        this.f44165z = requestFactory;
        this.f44163A = obj;
        this.f44164B = objArr;
        this.C = factory;
        this.D = converter;
    }

    public boolean A() {
        boolean z2 = true;
        if (this.E) {
            return true;
        }
        synchronized (this) {
            try {
                Call call = this.F;
                if (call == null || !call.A()) {
                    z2 = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return z2;
    }

    public void G0(final Callback callback) {
        Call call;
        Throwable th;
        Objects.requireNonNull(callback, "callback == null");
        synchronized (this) {
            try {
                if (!this.H) {
                    this.H = true;
                    call = this.F;
                    th = this.G;
                    if (call == null && th == null) {
                        Call c2 = c();
                        this.F = c2;
                        call = c2;
                    }
                } else {
                    throw new IllegalStateException("Already executed.");
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (th != null) {
            callback.onFailure(this, th);
            return;
        }
        if (this.E) {
            call.cancel();
        }
        FirebasePerfOkHttpClient.enqueue(call, new Callback() {
            public final void a(Throwable th) {
                try {
                    callback.onFailure(OkHttpCall.this, th);
                } catch (Throwable th2) {
                    Utils.t(th2);
                    th2.printStackTrace();
                }
            }

            public void b(Call call, Response response) {
                try {
                    try {
                        callback.onResponse(OkHttpCall.this, OkHttpCall.this.f(response));
                    } catch (Throwable th) {
                        Utils.t(th);
                        th.printStackTrace();
                    }
                } catch (Throwable th2) {
                    Utils.t(th2);
                    a(th2);
                }
            }

            public void c(Call call, IOException iOException) {
                a(iOException);
            }
        });
    }

    /* renamed from: b */
    public OkHttpCall clone() {
        return new OkHttpCall(this.f44165z, this.f44163A, this.f44164B, this.C, this.D);
    }

    public final Call c() {
        Call b2 = this.C.b(this.f44165z.a(this.f44163A, this.f44164B));
        if (b2 != null) {
            return b2;
        }
        throw new NullPointerException("Call.Factory returned null.");
    }

    public void cancel() {
        Call call;
        this.E = true;
        synchronized (this) {
            call = this.F;
        }
        if (call != null) {
            call.cancel();
        }
    }

    public final Call e() {
        Call call = this.F;
        if (call != null) {
            return call;
        }
        Throwable th = this.G;
        if (th == null) {
            try {
                Call c2 = c();
                this.F = c2;
                return c2;
            } catch (IOException | Error | RuntimeException e2) {
                Utils.t(e2);
                this.G = e2;
                throw e2;
            }
        } else if (th instanceof IOException) {
            throw ((IOException) th);
        } else if (th instanceof RuntimeException) {
            throw ((RuntimeException) th);
        } else {
            throw ((Error) th);
        }
    }

    public Response f(Response response) {
        ResponseBody a2 = response.a();
        Response c2 = response.y().b(new NoContentResponseBody(a2.f(), a2.d())).c();
        int f2 = c2.f();
        if (f2 < 200 || f2 >= 300) {
            try {
                return Response.c(Utils.a(a2), c2);
            } finally {
                a2.close();
            }
        } else if (f2 == 204 || f2 == 205) {
            a2.close();
            return Response.h((Object) null, c2);
        } else {
            ExceptionCatchingResponseBody exceptionCatchingResponseBody = new ExceptionCatchingResponseBody(a2);
            try {
                return Response.h(this.D.a(exceptionCatchingResponseBody), c2);
            } catch (RuntimeException e2) {
                exceptionCatchingResponseBody.l();
                throw e2;
            }
        }
    }

    public synchronized Request m() {
        try {
        } catch (IOException e2) {
            throw new RuntimeException("Unable to create request.", e2);
        }
        return e().m();
    }
}
