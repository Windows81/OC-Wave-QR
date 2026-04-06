package coil.request;

import android.graphics.drawable.Drawable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class ErrorResult extends ImageResult {

    /* renamed from: a  reason: collision with root package name */
    public final Drawable f23572a;

    /* renamed from: b  reason: collision with root package name */
    public final ImageRequest f23573b;

    /* renamed from: c  reason: collision with root package name */
    public final Throwable f23574c;

    public ErrorResult(Drawable drawable, ImageRequest imageRequest, Throwable th) {
        super((DefaultConstructorMarker) null);
        this.f23572a = drawable;
        this.f23573b = imageRequest;
        this.f23574c = th;
    }

    public Drawable a() {
        return this.f23572a;
    }

    public ImageRequest b() {
        return this.f23573b;
    }

    public final Throwable c() {
        return this.f23574c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ErrorResult) {
            ErrorResult errorResult = (ErrorResult) obj;
            return Intrinsics.d(a(), errorResult.a()) && Intrinsics.d(b(), errorResult.b()) && Intrinsics.d(this.f23574c, errorResult.f23574c);
        }
    }

    public int hashCode() {
        Drawable a2 = a();
        return ((((a2 != null ? a2.hashCode() : 0) * 31) + b().hashCode()) * 31) + this.f23574c.hashCode();
    }
}
