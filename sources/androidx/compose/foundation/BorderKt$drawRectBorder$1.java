package androidx.compose.foundation;

import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class BorderKt$drawRectBorder$1 extends Lambda implements Function1<ContentDrawScope, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ long f2972A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ long f2973B;
    public final /* synthetic */ DrawStyle C;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Brush f2974z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BorderKt$drawRectBorder$1(Brush brush, long j2, long j3, DrawStyle drawStyle) {
        super(1);
        this.f2974z = brush;
        this.f2972A = j2;
        this.f2973B = j3;
        this.C = drawStyle;
    }

    public final void b(ContentDrawScope contentDrawScope) {
        contentDrawScope.q2();
        DrawScope.G0(contentDrawScope, this.f2974z, this.f2972A, this.f2973B, 0.0f, this.C, (ColorFilter) null, 0, 104, (Object) null);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        b((ContentDrawScope) obj);
        return Unit.f40552a;
    }
}
