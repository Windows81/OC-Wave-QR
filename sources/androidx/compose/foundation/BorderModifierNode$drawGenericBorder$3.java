package androidx.compose.foundation;

import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.ImageBitmap;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;

@Metadata
public final class BorderModifierNode$drawGenericBorder$3 extends Lambda implements Function1<ContentDrawScope, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Ref.ObjectRef f2977A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ long f2978B;
    public final /* synthetic */ ColorFilter C;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Rect f2979z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BorderModifierNode$drawGenericBorder$3(Rect rect, Ref.ObjectRef objectRef, long j2, ColorFilter colorFilter) {
        super(1);
        this.f2979z = rect;
        this.f2977A = objectRef;
        this.f2978B = j2;
        this.C = colorFilter;
    }

    public final void b(ContentDrawScope contentDrawScope) {
        contentDrawScope.q2();
        float o2 = this.f2979z.o();
        float r2 = this.f2979z.r();
        Ref.ObjectRef objectRef = this.f2977A;
        long j2 = this.f2978B;
        ColorFilter colorFilter = this.C;
        contentDrawScope.G1().e().d(o2, r2);
        try {
            DrawScope.m0(contentDrawScope, (ImageBitmap) objectRef.f40908z, 0, j2, 0, 0, 0.0f, (DrawStyle) null, colorFilter, 0, 0, 890, (Object) null);
        } finally {
            contentDrawScope.G1().e().d(-o2, -r2);
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        b((ContentDrawScope) obj);
        return Unit.f40552a;
    }
}
