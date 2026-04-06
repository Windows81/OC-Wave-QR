package androidx.compose.material3;

import androidx.compose.foundation.shape.CornerBasedShape;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.text.TextStyle;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
final class MaterialThemeKt$MaterialExpressiveTheme$1 implements Function2<Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ MotionScheme f10276A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Shapes f10277B;
    public final /* synthetic */ Typography C;
    public final /* synthetic */ Function2 D;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ ColorScheme f10278z;

    public final void b(Composer composer, int i2) {
        int i3 = i2;
        if (composer.E((i3 & 3) != 2, i3 & 1)) {
            if (ComposerKt.P()) {
                ComposerKt.Y(1535649272, i3, -1, "androidx.compose.material3.MaterialExpressiveTheme.<anonymous> (MaterialTheme.kt:201)");
            }
            ColorScheme colorScheme = this.f10278z;
            if (colorScheme == null) {
                colorScheme = ColorSchemeKt.h();
            }
            ColorScheme colorScheme2 = colorScheme;
            MotionScheme motionScheme = this.f10276A;
            if (motionScheme == null) {
                motionScheme = MotionScheme.f10364a.a();
            }
            MotionScheme motionScheme2 = motionScheme;
            Shapes shapes = this.f10277B;
            if (shapes == null) {
                shapes = new Shapes((CornerBasedShape) null, (CornerBasedShape) null, (CornerBasedShape) null, (CornerBasedShape) null, (CornerBasedShape) null, 31, (DefaultConstructorMarker) null);
            }
            Shapes shapes2 = shapes;
            Typography typography = this.C;
            if (typography == null) {
                typography = new Typography((TextStyle) null, (TextStyle) null, (TextStyle) null, (TextStyle) null, (TextStyle) null, (TextStyle) null, (TextStyle) null, (TextStyle) null, (TextStyle) null, (TextStyle) null, (TextStyle) null, (TextStyle) null, (TextStyle) null, (TextStyle) null, (TextStyle) null, 32767, (DefaultConstructorMarker) null);
            }
            MaterialThemeKt.f(colorScheme2, motionScheme2, shapes2, typography, this.D, composer, 0, 0);
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
