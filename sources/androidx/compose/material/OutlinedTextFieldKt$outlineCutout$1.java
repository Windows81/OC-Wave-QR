package androidx.compose.material;

import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.ClipOp;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawContext;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.RangesKt;

@Metadata
public final class OutlinedTextFieldKt$outlineCutout$1 extends Lambda implements Function1<ContentDrawScope, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ PaddingValues f8147A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ long f8148z;

    @Metadata
    public /* synthetic */ class WhenMappings {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f8149a;

        static {
            int[] iArr = new int[LayoutDirection.values().length];
            try {
                iArr[LayoutDirection.Rtl.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f8149a = iArr;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public OutlinedTextFieldKt$outlineCutout$1(long j2, PaddingValues paddingValues) {
        super(1);
        this.f8148z = j2;
        this.f8147A = paddingValues;
    }

    public final void b(ContentDrawScope contentDrawScope) {
        float i2 = Size.i(this.f8148z);
        if (i2 > 0.0f) {
            float B1 = contentDrawScope.B1(OutlinedTextFieldKt.f8097a);
            float B12 = contentDrawScope.B1(this.f8147A.b(contentDrawScope.getLayoutDirection())) - B1;
            float f2 = (float) 2;
            float f3 = i2 + B12 + (B1 * f2);
            LayoutDirection layoutDirection = contentDrawScope.getLayoutDirection();
            int[] iArr = WhenMappings.f8149a;
            float i3 = iArr[layoutDirection.ordinal()] == 1 ? Size.i(contentDrawScope.c()) - f3 : RangesKt.d(B12, 0.0f);
            if (iArr[contentDrawScope.getLayoutDirection().ordinal()] == 1) {
                f3 = Size.i(contentDrawScope.c()) - RangesKt.d(B12, 0.0f);
            }
            float f4 = f3;
            float g2 = Size.g(this.f8148z);
            float f5 = (-g2) / f2;
            float f6 = g2 / f2;
            int a2 = ClipOp.f15971b.a();
            DrawContext G1 = contentDrawScope.G1();
            long c2 = G1.c();
            G1.j().o();
            try {
                G1.e().b(i3, f5, f4, f6, a2);
                contentDrawScope.q2();
            } finally {
                G1.j().t();
                G1.f(c2);
            }
        } else {
            contentDrawScope.q2();
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        b((ContentDrawScope) obj);
        return Unit.f40552a;
    }
}
