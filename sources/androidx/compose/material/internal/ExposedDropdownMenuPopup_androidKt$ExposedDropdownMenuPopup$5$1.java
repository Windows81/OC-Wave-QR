package androidx.compose.material.internal;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.IntRectKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.math.MathKt;

@Metadata
public final class ExposedDropdownMenuPopup_androidKt$ExposedDropdownMenuPopup$5$1 extends Lambda implements Function1<LayoutCoordinates, Unit> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ PopupLayout f8975z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ExposedDropdownMenuPopup_androidKt$ExposedDropdownMenuPopup$5$1(PopupLayout popupLayout) {
        super(1);
        this.f8975z = popupLayout;
    }

    public final void b(LayoutCoordinates layoutCoordinates) {
        LayoutCoordinates g0 = layoutCoordinates.g0();
        Intrinsics.f(g0);
        long a2 = g0.a();
        long g2 = LayoutCoordinatesKt.g(g0);
        this.f8975z.p(IntRectKt.a(IntOffsetKt.a(MathKt.d(Offset.m(g2)), MathKt.d(Offset.n(g2))), a2));
        this.f8975z.u();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        b((LayoutCoordinates) obj);
        return Unit.f40552a;
    }
}
