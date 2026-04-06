package androidx.compose.foundation.text;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;

@Metadata
/* renamed from: androidx.compose.foundation.text.ComposableSingletons$CoreTextFieldKt$lambda-1$1  reason: invalid class name */
public final class ComposableSingletons$CoreTextFieldKt$lambda1$1 extends Lambda implements Function3<Function2<? super Composer, ? super Integer, ? extends Unit>, Composer, Integer, Unit> {

    /* renamed from: z  reason: collision with root package name */
    public static final ComposableSingletons$CoreTextFieldKt$lambda1$1 f5641z = new ComposableSingletons$CoreTextFieldKt$lambda1$1();

    public ComposableSingletons$CoreTextFieldKt$lambda1$1() {
        super(3);
    }

    public final void b(Function2 function2, Composer composer, int i2) {
        if ((i2 & 6) == 0) {
            i2 |= composer.l(function2) ? 4 : 2;
        }
        if (composer.E((i2 & 19) != 18, i2 & 1)) {
            if (ComposerKt.P()) {
                ComposerKt.Y(-813639903, i2, -1, "androidx.compose.foundation.text.ComposableSingletons$CoreTextFieldKt.lambda-1.<anonymous> (CoreTextField.kt:202)");
            }
            function2.m(composer, Integer.valueOf(i2 & 14));
            if (ComposerKt.P()) {
                ComposerKt.X();
                return;
            }
            return;
        }
        composer.B();
    }

    public /* bridge */ /* synthetic */ Object d(Object obj, Object obj2, Object obj3) {
        b((Function2) obj, (Composer) obj2, ((Number) obj3).intValue());
        return Unit.f40552a;
    }
}
