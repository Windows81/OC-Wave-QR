package coil.compose;

import coil.ImageLoader;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class AsyncImageState {

    /* renamed from: a  reason: collision with root package name */
    public final Object f23295a;

    /* renamed from: b  reason: collision with root package name */
    public final EqualityDelegate f23296b;

    /* renamed from: c  reason: collision with root package name */
    public final ImageLoader f23297c;

    public AsyncImageState(Object obj, EqualityDelegate equalityDelegate, ImageLoader imageLoader) {
        this.f23295a = obj;
        this.f23296b = equalityDelegate;
        this.f23297c = imageLoader;
    }

    public final ImageLoader a() {
        return this.f23297c;
    }

    public final Object b() {
        return this.f23295a;
    }

    public final EqualityDelegate c() {
        return this.f23296b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof AsyncImageState) {
            AsyncImageState asyncImageState = (AsyncImageState) obj;
            return this.f23296b.b(this.f23295a, asyncImageState.f23295a) && Intrinsics.d(this.f23297c, asyncImageState.f23297c);
        }
    }

    public int hashCode() {
        return (this.f23296b.c(this.f23295a) * 31) + this.f23297c.hashCode();
    }
}
