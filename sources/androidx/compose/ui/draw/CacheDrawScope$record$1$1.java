package androidx.compose.ui.draw;

import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawContext;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class CacheDrawScope$record$1$1 extends Lambda implements Function1<DrawScope, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ ContentDrawScope f15703A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Density f15704B;
    public final /* synthetic */ LayoutDirection C;
    public final /* synthetic */ Density D;
    public final /* synthetic */ LayoutDirection E;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Function1 f15705z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CacheDrawScope$record$1$1(Function1 function1, ContentDrawScope contentDrawScope, Density density, LayoutDirection layoutDirection, Density density2, LayoutDirection layoutDirection2) {
        super(1);
        this.f15705z = function1;
        this.f15703A = contentDrawScope;
        this.f15704B = density;
        this.C = layoutDirection;
        this.D = density2;
        this.E = layoutDirection2;
    }

    public final void b(DrawScope drawScope) {
        DrawContext G1 = drawScope.G1();
        Density density = this.f15704B;
        LayoutDirection layoutDirection = this.C;
        G1.a(density);
        G1.d(layoutDirection);
        try {
            this.f15705z.invoke(this.f15703A);
        } finally {
            DrawContext G12 = drawScope.G1();
            Density density2 = this.D;
            LayoutDirection layoutDirection2 = this.E;
            G12.a(density2);
            G12.d(layoutDirection2);
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        b((DrawScope) obj);
        return Unit.f40552a;
    }
}
