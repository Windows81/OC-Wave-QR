package androidx.compose.material3;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

@Metadata
public final class DatePickerDialog_androidKt$DatePickerDialog$1$1$1$2$1 implements Function2<Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function2 f9696A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Function2 f9697z;

    public DatePickerDialog_androidKt$DatePickerDialog$1$1$1$2$1(Function2 function2, Function2 function22) {
        this.f9697z = function2;
        this.f9696A = function22;
    }

    public final void b(Composer composer, int i2) {
        if (composer.E((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.P()) {
                ComposerKt.Y(-1103927529, i2, -1, "androidx.compose.material3.DatePickerDialog.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (DatePickerDialog.android.kt:101)");
            }
            float b2 = DatePickerDialog_androidKt.f9688b;
            float a2 = DatePickerDialog_androidKt.f9689c;
            final Function2 function2 = this.f9697z;
            final Function2 function22 = this.f9696A;
            AlertDialogKt.h(b2, a2, ComposableLambdaKt.e(-1980163584, true, new Function2<Composer, Integer, Unit>() {
                public final void b(Composer composer, int i2) {
                    boolean z2 = false;
                    if ((i2 & 3) != 2) {
                        z2 = true;
                    }
                    if (composer.E(z2, i2 & 1)) {
                        if (ComposerKt.P()) {
                            ComposerKt.Y(-1980163584, i2, -1, "androidx.compose.material3.DatePickerDialog.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (DatePickerDialog.android.kt:105)");
                        }
                        Function2 function2 = function2;
                        if (function2 == null) {
                            composer.X(322524505);
                        } else {
                            composer.X(-266690648);
                            function2.m(composer, 0);
                        }
                        composer.M();
                        function22.m(composer, 0);
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
            }, composer, 54), composer, 438);
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
