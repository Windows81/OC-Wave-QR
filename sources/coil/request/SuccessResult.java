package coil.request;

import android.graphics.drawable.Drawable;
import coil.decode.DataSource;
import coil.memory.MemoryCache;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class SuccessResult extends ImageResult {

    /* renamed from: a  reason: collision with root package name */
    public final Drawable f23673a;

    /* renamed from: b  reason: collision with root package name */
    public final ImageRequest f23674b;

    /* renamed from: c  reason: collision with root package name */
    public final DataSource f23675c;

    /* renamed from: d  reason: collision with root package name */
    public final MemoryCache.Key f23676d;

    /* renamed from: e  reason: collision with root package name */
    public final String f23677e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f23678f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f23679g;

    public SuccessResult(Drawable drawable, ImageRequest imageRequest, DataSource dataSource, MemoryCache.Key key, String str, boolean z2, boolean z3) {
        super((DefaultConstructorMarker) null);
        this.f23673a = drawable;
        this.f23674b = imageRequest;
        this.f23675c = dataSource;
        this.f23676d = key;
        this.f23677e = str;
        this.f23678f = z2;
        this.f23679g = z3;
    }

    public Drawable a() {
        return this.f23673a;
    }

    public ImageRequest b() {
        return this.f23674b;
    }

    public final DataSource c() {
        return this.f23675c;
    }

    public final boolean d() {
        return this.f23679g;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SuccessResult) {
            SuccessResult successResult = (SuccessResult) obj;
            return Intrinsics.d(a(), successResult.a()) && Intrinsics.d(b(), successResult.b()) && this.f23675c == successResult.f23675c && Intrinsics.d(this.f23676d, successResult.f23676d) && Intrinsics.d(this.f23677e, successResult.f23677e) && this.f23678f == successResult.f23678f && this.f23679g == successResult.f23679g;
        }
    }

    public int hashCode() {
        int hashCode = ((((a().hashCode() * 31) + b().hashCode()) * 31) + this.f23675c.hashCode()) * 31;
        MemoryCache.Key key = this.f23676d;
        int i2 = 0;
        int hashCode2 = (hashCode + (key != null ? key.hashCode() : 0)) * 31;
        String str = this.f23677e;
        if (str != null) {
            i2 = str.hashCode();
        }
        return ((((hashCode2 + i2) * 31) + Boolean.hashCode(this.f23678f)) * 31) + Boolean.hashCode(this.f23679g);
    }
}
