package androidx.compose.material3;

import androidx.compose.ui.graphics.AndroidPath_androidKt;
import androidx.compose.ui.graphics.Outline;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DpSize;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
public final class DefaultTooltipCaretShape implements Shape {

    /* renamed from: a  reason: collision with root package name */
    public final long f9848a;

    public /* synthetic */ DefaultTooltipCaretShape(long j2, DefaultConstructorMarker defaultConstructorMarker) {
        this(j2);
    }

    public Outline a(long j2, LayoutDirection layoutDirection, Density density) {
        Path a2 = AndroidPath_androidKt.a();
        float B1 = density.B1(DpSize.j(this.f9848a));
        float B12 = density.B1(DpSize.i(this.f9848a));
        a2.q(0.0f, 0.0f);
        float f2 = (float) 2;
        a2.z(B1 / f2, 0.0f);
        a2.z(0.0f, B12);
        a2.z((-B1) / f2, 0.0f);
        a2.close();
        return new Outline.Generic(a2);
    }

    public DefaultTooltipCaretShape(long j2) {
        this.f9848a = j2;
    }
}
