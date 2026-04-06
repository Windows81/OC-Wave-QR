package androidx.compose.material;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class AlertDialogKt$AlertDialogImpl$2 extends Lambda implements Function2<Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Modifier f7075A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Function2 f7076B;
    public final /* synthetic */ Function2 C;
    public final /* synthetic */ Shape D;
    public final /* synthetic */ long E;
    public final /* synthetic */ long F;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Function2 f7077z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AlertDialogKt$AlertDialogImpl$2(Function2 function2, Modifier modifier, Function2 function22, Function2 function23, Shape shape, long j2, long j3) {
        super(2);
        this.f7077z = function2;
        this.f7075A = modifier;
        this.f7076B = function22;
        this.C = function23;
        this.D = shape;
        this.E = j2;
        this.F = j3;
    }

    public final void b(Composer composer, int i2) {
        int i3 = i2;
        if (composer.E((i3 & 3) != 2, i3 & 1)) {
            if (ComposerKt.P()) {
                ComposerKt.Y(-66632952, i3, -1, "androidx.compose.material.AlertDialogImpl.<anonymous> (AlertDialog.kt:183)");
            }
            AlertDialogKt.b(this.f7077z, this.f7075A, this.f7076B, this.C, this.D, this.E, this.F, composer, 0, 0);
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
