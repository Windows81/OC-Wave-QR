package androidx.compose.ui.graphics.vector;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Lambda;

@Metadata
final class VectorPainterKt$rememberVectorPainter$2$composition$1$1 extends Lambda implements Function2<Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ long f16673A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Function4 f16674z;

    public final void b(Composer composer, int i2) {
        if (composer.E((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.P()) {
                ComposerKt.Y(2008312779, i2, -1, "androidx.compose.ui.graphics.vector.rememberVectorPainter.<anonymous>.<anonymous>.<anonymous> (VectorPainter.kt:154)");
            }
            this.f16674z.j(Float.valueOf(Float.intBitsToFloat((int) (this.f16673A >> 32))), Float.valueOf(Float.intBitsToFloat((int) (this.f16673A & 4294967295L))), composer, 0);
            if (ComposerKt.P()) {
                ComposerKt.X();
                return;
            }
            return;
        }
        composer.B();
    }

    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
        b((Composer) obj, ((Number) obj2).intValue());
        return Unit.f40552a;
    }
}
