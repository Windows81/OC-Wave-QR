package androidx.compose.foundation;

import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class BorderModifierNode$drawRoundRectBorder$2 extends Lambda implements Function1<ContentDrawScope, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Brush f2983A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Path f2984z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BorderModifierNode$drawRoundRectBorder$2(Path path, Brush brush) {
        super(1);
        this.f2984z = path;
        this.f2983A = brush;
    }

    public final void b(ContentDrawScope contentDrawScope) {
        contentDrawScope.q2();
        DrawScope.n1(contentDrawScope, this.f2984z, this.f2983A, 0.0f, (DrawStyle) null, (ColorFilter) null, 0, 60, (Object) null);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        b((ContentDrawScope) obj);
        return Unit.f40552a;
    }
}
