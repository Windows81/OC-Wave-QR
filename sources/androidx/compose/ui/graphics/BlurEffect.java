package androidx.compose.ui.graphics;

import android.graphics.RenderEffect;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class BlurEffect extends RenderEffect {

    /* renamed from: b  reason: collision with root package name */
    public final RenderEffect f15958b;

    /* renamed from: c  reason: collision with root package name */
    public final float f15959c;

    /* renamed from: d  reason: collision with root package name */
    public final float f15960d;

    /* renamed from: e  reason: collision with root package name */
    public final int f15961e;

    public /* synthetic */ BlurEffect(RenderEffect renderEffect, float f2, float f3, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(renderEffect, f2, f3, i2);
    }

    public RenderEffect b() {
        return RenderEffectVerificationHelper.f16110a.a(this.f15958b, this.f15959c, this.f15960d, this.f15961e);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BlurEffect)) {
            return false;
        }
        BlurEffect blurEffect = (BlurEffect) obj;
        return this.f15959c == blurEffect.f15959c && this.f15960d == blurEffect.f15960d && TileMode.g(this.f15961e, blurEffect.f15961e) && Intrinsics.d(this.f15958b, blurEffect.f15958b);
    }

    public int hashCode() {
        RenderEffect renderEffect = this.f15958b;
        return ((((((renderEffect != null ? renderEffect.hashCode() : 0) * 31) + Float.hashCode(this.f15959c)) * 31) + Float.hashCode(this.f15960d)) * 31) + TileMode.h(this.f15961e);
    }

    public String toString() {
        return "BlurEffect(renderEffect=" + this.f15958b + ", radiusX=" + this.f15959c + ", radiusY=" + this.f15960d + ", edgeTreatment=" + TileMode.i(this.f15961e) + ')';
    }

    public BlurEffect(RenderEffect renderEffect, float f2, float f3, int i2) {
        super((DefaultConstructorMarker) null);
        this.f15958b = renderEffect;
        this.f15959c = f2;
        this.f15960d = f3;
        this.f15961e = i2;
    }
}
