package androidx.compose.material;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.graphics.Color;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class TextFieldImplKt$Decoration$colorAndEmphasis$1 extends Lambda implements Function2<Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Float f8792A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Function2 f8793B;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ long f8794z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TextFieldImplKt$Decoration$colorAndEmphasis$1(long j2, Float f2, Function2 function2) {
        super(2);
        this.f8794z = j2;
        this.f8792A = f2;
        this.f8793B = function2;
    }

    public final void b(Composer composer, int i2) {
        if (composer.E((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.P()) {
                ComposerKt.Y(494684590, i2, -1, "androidx.compose.material.Decoration.<anonymous> (TextFieldImpl.kt:239)");
            }
            ProvidedValue d2 = ContentColorKt.a().d(Color.h(this.f8794z));
            final Float f2 = this.f8792A;
            final Function2 function2 = this.f8793B;
            final long j2 = this.f8794z;
            CompositionLocalKt.c(d2, ComposableLambdaKt.e(-1132188434, true, new Function2<Composer, Integer, Unit>() {
                public final void b(Composer composer, int i2) {
                    if (composer.E((i2 & 3) != 2, i2 & 1)) {
                        if (ComposerKt.P()) {
                            ComposerKt.Y(-1132188434, i2, -1, "androidx.compose.material.Decoration.<anonymous>.<anonymous> (TextFieldImpl.kt:240)");
                        }
                        if (f2 != null) {
                            composer.X(-1177895124);
                            CompositionLocalKt.c(ContentAlphaKt.a().d(f2), function2, composer, ProvidedValue.f14769i);
                            composer.M();
                        } else {
                            composer.X(-1177696538);
                            CompositionLocalKt.c(ContentAlphaKt.a().d(Float.valueOf(Color.o(j2))), function2, composer, ProvidedValue.f14769i);
                            composer.M();
                        }
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
            }, composer, 54), composer, ProvidedValue.f14769i | 48);
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
