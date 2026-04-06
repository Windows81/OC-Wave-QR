package androidx.compose.material;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class AlertDialogKt$AlertDialogImpl$1$1$1 extends Lambda implements Function2<Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function2 f7073A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Function2 f7074z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AlertDialogKt$AlertDialogImpl$1$1$1(Function2 function2, Function2 function22) {
        super(2);
        this.f7074z = function2;
        this.f7073A = function22;
    }

    public final void b(Composer composer, int i2) {
        boolean z2 = false;
        if ((i2 & 3) != 2) {
            z2 = true;
        }
        if (composer.E(z2, i2 & 1)) {
            if (ComposerKt.P()) {
                ComposerKt.Y(-563890224, i2, -1, "androidx.compose.material.AlertDialogImpl.<anonymous>.<anonymous>.<anonymous> (AlertDialog.kt:155)");
            }
            Function2 function2 = this.f7074z;
            if (function2 == null) {
                composer.X(-1324738946);
            } else {
                composer.X(1481287139);
                function2.m(composer, 0);
            }
            composer.M();
            this.f7073A.m(composer, 0);
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
