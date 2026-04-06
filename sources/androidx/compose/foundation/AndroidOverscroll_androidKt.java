package androidx.compose.foundation;

import android.content.Context;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.runtime.CompositionLocalAccessorScope;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.input.nestedscroll.NestedScrollSource;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
public final class AndroidOverscroll_androidKt {

    /* renamed from: a  reason: collision with root package name */
    public static final long f2914a = ColorKt.d(4284900966L);

    /* renamed from: b  reason: collision with root package name */
    public static final PaddingValues f2915b = PaddingKt.c(0.0f, 0.0f, 3, (Object) null);

    public static final OverscrollFactory b(CompositionLocalAccessorScope compositionLocalAccessorScope) {
        Context context = (Context) compositionLocalAccessorScope.H(AndroidCompositionLocals_androidKt.g());
        Density density = (Density) compositionLocalAccessorScope.H(CompositionLocalsKt.g());
        OverscrollConfiguration overscrollConfiguration = (OverscrollConfiguration) compositionLocalAccessorScope.H(OverscrollConfiguration_androidKt.a());
        if (overscrollConfiguration == null) {
            return null;
        }
        return new AndroidEdgeEffectOverscrollFactory(context, density, overscrollConfiguration.b(), overscrollConfiguration.a(), (DefaultConstructorMarker) null);
    }

    public static final float c(int i2) {
        return NestedScrollSource.e(i2, NestedScrollSource.f16795b.a()) ? 4.0f : 1.0f;
    }
}
