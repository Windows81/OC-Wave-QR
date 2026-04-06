package androidx.compose.material;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.PathEffect;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class TextFieldKt$drawIndicatorLine$1 extends Lambda implements Function1<ContentDrawScope, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ BorderStroke f8838A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ float f8839z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TextFieldKt$drawIndicatorLine$1(float f2, BorderStroke borderStroke) {
        super(1);
        this.f8839z = f2;
        this.f8838A = borderStroke;
    }

    public final void b(ContentDrawScope contentDrawScope) {
        contentDrawScope.q2();
        if (!Dp.o(this.f8839z, Dp.f19144A.a())) {
            float density = this.f8839z * contentDrawScope.getDensity();
            float g2 = Size.g(contentDrawScope.c()) - (density / ((float) 2));
            DrawScope.p2(contentDrawScope, this.f8838A.a(), OffsetKt.a(0.0f, g2), OffsetKt.a(Size.i(contentDrawScope.c()), g2), density, 0, (PathEffect) null, 0.0f, (ColorFilter) null, 0, 496, (Object) null);
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        b((ContentDrawScope) obj);
        return Unit.f40552a;
    }
}
