package androidx.compose.ui.graphics;

import android.graphics.RenderEffect;
import androidx.compose.ui.geometry.Offset;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class OffsetEffect extends RenderEffect {

    /* renamed from: b  reason: collision with root package name */
    public final RenderEffect f16055b;

    /* renamed from: c  reason: collision with root package name */
    public final long f16056c;

    public RenderEffect b() {
        return RenderEffectVerificationHelper.f16110a.b(this.f16055b, this.f16056c);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OffsetEffect)) {
            return false;
        }
        OffsetEffect offsetEffect = (OffsetEffect) obj;
        return Intrinsics.d(this.f16055b, offsetEffect.f16055b) && Offset.j(this.f16056c, offsetEffect.f16056c);
    }

    public int hashCode() {
        RenderEffect renderEffect = this.f16055b;
        return ((renderEffect != null ? renderEffect.hashCode() : 0) * 31) + Offset.o(this.f16056c);
    }

    public String toString() {
        return "OffsetEffect(renderEffect=" + this.f16055b + ", offset=" + Offset.s(this.f16056c) + ')';
    }
}
