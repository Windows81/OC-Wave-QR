package coil.decode;

import android.graphics.drawable.Drawable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class DecodeResult {

    /* renamed from: a  reason: collision with root package name */
    public final Drawable f23362a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f23363b;

    public DecodeResult(Drawable drawable, boolean z2) {
        this.f23362a = drawable;
        this.f23363b = z2;
    }

    public final Drawable a() {
        return this.f23362a;
    }

    public final boolean b() {
        return this.f23363b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof DecodeResult) {
            DecodeResult decodeResult = (DecodeResult) obj;
            return Intrinsics.d(this.f23362a, decodeResult.f23362a) && this.f23363b == decodeResult.f23363b;
        }
    }

    public int hashCode() {
        return (this.f23362a.hashCode() * 31) + Boolean.hashCode(this.f23363b);
    }
}
