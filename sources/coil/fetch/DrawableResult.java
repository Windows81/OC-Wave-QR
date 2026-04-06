package coil.fetch;

import android.graphics.drawable.Drawable;
import coil.decode.DataSource;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class DrawableResult extends FetchResult {

    /* renamed from: a  reason: collision with root package name */
    public final Drawable f23441a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f23442b;

    /* renamed from: c  reason: collision with root package name */
    public final DataSource f23443c;

    public DrawableResult(Drawable drawable, boolean z2, DataSource dataSource) {
        super((DefaultConstructorMarker) null);
        this.f23441a = drawable;
        this.f23442b = z2;
        this.f23443c = dataSource;
    }

    public final DataSource a() {
        return this.f23443c;
    }

    public final Drawable b() {
        return this.f23441a;
    }

    public final boolean c() {
        return this.f23442b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof DrawableResult) {
            DrawableResult drawableResult = (DrawableResult) obj;
            return Intrinsics.d(this.f23441a, drawableResult.f23441a) && this.f23442b == drawableResult.f23442b && this.f23443c == drawableResult.f23443c;
        }
    }

    public int hashCode() {
        return (((this.f23441a.hashCode() * 31) + Boolean.hashCode(this.f23442b)) * 31) + this.f23443c.hashCode();
    }
}
