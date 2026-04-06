package coil.network;

import coil.util.Utils;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import okhttp3.CacheControl;
import okhttp3.Headers;
import okhttp3.MediaType;
import okhttp3.Response;
import okio.BufferedSink;
import okio.BufferedSource;

@Metadata
public final class CacheResponse {

    /* renamed from: a  reason: collision with root package name */
    public final Lazy f23510a;

    /* renamed from: b  reason: collision with root package name */
    public final Lazy f23511b;

    /* renamed from: c  reason: collision with root package name */
    public final long f23512c;

    /* renamed from: d  reason: collision with root package name */
    public final long f23513d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f23514e;

    /* renamed from: f  reason: collision with root package name */
    public final Headers f23515f;

    public CacheResponse(BufferedSource bufferedSource) {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.f23510a = LazyKt.a(lazyThreadSafetyMode, new CacheResponse$cacheControl$2(this));
        this.f23511b = LazyKt.a(lazyThreadSafetyMode, new CacheResponse$contentType$2(this));
        this.f23512c = Long.parseLong(bufferedSource.a1());
        this.f23513d = Long.parseLong(bufferedSource.a1());
        this.f23514e = Integer.parseInt(bufferedSource.a1()) > 0;
        int parseInt = Integer.parseInt(bufferedSource.a1());
        Headers.Builder builder = new Headers.Builder();
        for (int i2 = 0; i2 < parseInt; i2++) {
            Utils.b(builder, bufferedSource.a1());
        }
        this.f23515f = builder.f();
    }

    public final CacheControl a() {
        return (CacheControl) this.f23510a.getValue();
    }

    public final MediaType b() {
        return (MediaType) this.f23511b.getValue();
    }

    public final long c() {
        return this.f23513d;
    }

    public final Headers d() {
        return this.f23515f;
    }

    public final long e() {
        return this.f23512c;
    }

    public final boolean f() {
        return this.f23514e;
    }

    public final void g(BufferedSink bufferedSink) {
        bufferedSink.x1(this.f23512c).writeByte(10);
        bufferedSink.x1(this.f23513d).writeByte(10);
        bufferedSink.x1(this.f23514e ? 1 : 0).writeByte(10);
        bufferedSink.x1((long) this.f23515f.size()).writeByte(10);
        int size = this.f23515f.size();
        for (int i2 = 0; i2 < size; i2++) {
            bufferedSink.K0(this.f23515f.h(i2)).K0(": ").K0(this.f23515f.o(i2)).writeByte(10);
        }
    }

    public CacheResponse(Response response) {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.f23510a = LazyKt.a(lazyThreadSafetyMode, new CacheResponse$cacheControl$2(this));
        this.f23511b = LazyKt.a(lazyThreadSafetyMode, new CacheResponse$contentType$2(this));
        this.f23512c = response.F();
        this.f23513d = response.D();
        this.f23514e = response.j() != null;
        this.f23515f = response.m();
    }
}
