package coil.request;

import android.graphics.Bitmap;
import androidx.lifecycle.Lifecycle;
import coil.size.Precision;
import coil.size.Scale;
import coil.size.SizeResolver;
import coil.transition.Transition;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;

@Metadata
public final class DefinedRequestOptions {

    /* renamed from: a  reason: collision with root package name */
    public final Lifecycle f23557a;

    /* renamed from: b  reason: collision with root package name */
    public final SizeResolver f23558b;

    /* renamed from: c  reason: collision with root package name */
    public final Scale f23559c;

    /* renamed from: d  reason: collision with root package name */
    public final CoroutineDispatcher f23560d;

    /* renamed from: e  reason: collision with root package name */
    public final CoroutineDispatcher f23561e;

    /* renamed from: f  reason: collision with root package name */
    public final CoroutineDispatcher f23562f;

    /* renamed from: g  reason: collision with root package name */
    public final CoroutineDispatcher f23563g;

    /* renamed from: h  reason: collision with root package name */
    public final Transition.Factory f23564h;

    /* renamed from: i  reason: collision with root package name */
    public final Precision f23565i;

    /* renamed from: j  reason: collision with root package name */
    public final Bitmap.Config f23566j;

    /* renamed from: k  reason: collision with root package name */
    public final Boolean f23567k;

    /* renamed from: l  reason: collision with root package name */
    public final Boolean f23568l;

    /* renamed from: m  reason: collision with root package name */
    public final CachePolicy f23569m;

    /* renamed from: n  reason: collision with root package name */
    public final CachePolicy f23570n;

    /* renamed from: o  reason: collision with root package name */
    public final CachePolicy f23571o;

    public DefinedRequestOptions(Lifecycle lifecycle, SizeResolver sizeResolver, Scale scale, CoroutineDispatcher coroutineDispatcher, CoroutineDispatcher coroutineDispatcher2, CoroutineDispatcher coroutineDispatcher3, CoroutineDispatcher coroutineDispatcher4, Transition.Factory factory, Precision precision, Bitmap.Config config, Boolean bool, Boolean bool2, CachePolicy cachePolicy, CachePolicy cachePolicy2, CachePolicy cachePolicy3) {
        this.f23557a = lifecycle;
        this.f23558b = sizeResolver;
        this.f23559c = scale;
        this.f23560d = coroutineDispatcher;
        this.f23561e = coroutineDispatcher2;
        this.f23562f = coroutineDispatcher3;
        this.f23563g = coroutineDispatcher4;
        this.f23564h = factory;
        this.f23565i = precision;
        this.f23566j = config;
        this.f23567k = bool;
        this.f23568l = bool2;
        this.f23569m = cachePolicy;
        this.f23570n = cachePolicy2;
        this.f23571o = cachePolicy3;
    }

    public final Boolean a() {
        return this.f23567k;
    }

    public final Boolean b() {
        return this.f23568l;
    }

    public final Bitmap.Config c() {
        return this.f23566j;
    }

    public final CoroutineDispatcher d() {
        return this.f23562f;
    }

    public final CachePolicy e() {
        return this.f23570n;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof DefinedRequestOptions) {
            DefinedRequestOptions definedRequestOptions = (DefinedRequestOptions) obj;
            return Intrinsics.d(this.f23557a, definedRequestOptions.f23557a) && Intrinsics.d(this.f23558b, definedRequestOptions.f23558b) && this.f23559c == definedRequestOptions.f23559c && Intrinsics.d(this.f23560d, definedRequestOptions.f23560d) && Intrinsics.d(this.f23561e, definedRequestOptions.f23561e) && Intrinsics.d(this.f23562f, definedRequestOptions.f23562f) && Intrinsics.d(this.f23563g, definedRequestOptions.f23563g) && Intrinsics.d(this.f23564h, definedRequestOptions.f23564h) && this.f23565i == definedRequestOptions.f23565i && this.f23566j == definedRequestOptions.f23566j && Intrinsics.d(this.f23567k, definedRequestOptions.f23567k) && Intrinsics.d(this.f23568l, definedRequestOptions.f23568l) && this.f23569m == definedRequestOptions.f23569m && this.f23570n == definedRequestOptions.f23570n && this.f23571o == definedRequestOptions.f23571o;
        }
    }

    public final CoroutineDispatcher f() {
        return this.f23561e;
    }

    public final CoroutineDispatcher g() {
        return this.f23560d;
    }

    public final Lifecycle h() {
        return this.f23557a;
    }

    public int hashCode() {
        Lifecycle lifecycle = this.f23557a;
        int i2 = 0;
        int hashCode = (lifecycle != null ? lifecycle.hashCode() : 0) * 31;
        SizeResolver sizeResolver = this.f23558b;
        int hashCode2 = (hashCode + (sizeResolver != null ? sizeResolver.hashCode() : 0)) * 31;
        Scale scale = this.f23559c;
        int hashCode3 = (hashCode2 + (scale != null ? scale.hashCode() : 0)) * 31;
        CoroutineDispatcher coroutineDispatcher = this.f23560d;
        int hashCode4 = (hashCode3 + (coroutineDispatcher != null ? coroutineDispatcher.hashCode() : 0)) * 31;
        CoroutineDispatcher coroutineDispatcher2 = this.f23561e;
        int hashCode5 = (hashCode4 + (coroutineDispatcher2 != null ? coroutineDispatcher2.hashCode() : 0)) * 31;
        CoroutineDispatcher coroutineDispatcher3 = this.f23562f;
        int hashCode6 = (hashCode5 + (coroutineDispatcher3 != null ? coroutineDispatcher3.hashCode() : 0)) * 31;
        CoroutineDispatcher coroutineDispatcher4 = this.f23563g;
        int hashCode7 = (hashCode6 + (coroutineDispatcher4 != null ? coroutineDispatcher4.hashCode() : 0)) * 31;
        Transition.Factory factory = this.f23564h;
        int hashCode8 = (hashCode7 + (factory != null ? factory.hashCode() : 0)) * 31;
        Precision precision = this.f23565i;
        int hashCode9 = (hashCode8 + (precision != null ? precision.hashCode() : 0)) * 31;
        Bitmap.Config config = this.f23566j;
        int hashCode10 = (hashCode9 + (config != null ? config.hashCode() : 0)) * 31;
        Boolean bool = this.f23567k;
        int hashCode11 = (hashCode10 + (bool != null ? bool.hashCode() : 0)) * 31;
        Boolean bool2 = this.f23568l;
        int hashCode12 = (hashCode11 + (bool2 != null ? bool2.hashCode() : 0)) * 31;
        CachePolicy cachePolicy = this.f23569m;
        int hashCode13 = (hashCode12 + (cachePolicy != null ? cachePolicy.hashCode() : 0)) * 31;
        CachePolicy cachePolicy2 = this.f23570n;
        int hashCode14 = (hashCode13 + (cachePolicy2 != null ? cachePolicy2.hashCode() : 0)) * 31;
        CachePolicy cachePolicy3 = this.f23571o;
        if (cachePolicy3 != null) {
            i2 = cachePolicy3.hashCode();
        }
        return hashCode14 + i2;
    }

    public final CachePolicy i() {
        return this.f23569m;
    }

    public final CachePolicy j() {
        return this.f23571o;
    }

    public final Precision k() {
        return this.f23565i;
    }

    public final Scale l() {
        return this.f23559c;
    }

    public final SizeResolver m() {
        return this.f23558b;
    }

    public final CoroutineDispatcher n() {
        return this.f23563g;
    }

    public final Transition.Factory o() {
        return this.f23564h;
    }
}
