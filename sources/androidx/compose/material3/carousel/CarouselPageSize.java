package androidx.compose.material3.carousel;

import androidx.compose.foundation.pager.PageSize;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.unit.Density;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.math.MathKt;

@Metadata
public final class CarouselPageSize implements PageSize {

    /* renamed from: a  reason: collision with root package name */
    public final Function2 f11922a;

    /* renamed from: b  reason: collision with root package name */
    public final float f11923b;

    /* renamed from: c  reason: collision with root package name */
    public final float f11924c;

    /* renamed from: d  reason: collision with root package name */
    public final MutableState f11925d;

    public int a(Density density, int i2, int i3) {
        float f2 = (float) i2;
        float f3 = (float) i3;
        d(new Strategy((KeylineList) this.f11922a.m(Float.valueOf(f2), Float.valueOf(f3)), f2, f3, this.f11923b, this.f11924c));
        return b().i() ? MathKt.d(b().d()) : i2;
    }

    public final Strategy b() {
        return c();
    }

    public final Strategy c() {
        return (Strategy) this.f11925d.getValue();
    }

    public final void d(Strategy strategy) {
        this.f11925d.setValue(strategy);
    }
}
