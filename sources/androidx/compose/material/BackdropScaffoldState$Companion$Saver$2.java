package androidx.compose.material;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.ui.unit.Density;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class BackdropScaffoldState$Companion$Saver$2 extends Lambda implements Function1<BackdropValue, BackdropScaffoldState> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ AnimationSpec f7272A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Function1 f7273B;
    public final /* synthetic */ SnackbarHostState C;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Density f7274z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BackdropScaffoldState$Companion$Saver$2(Density density, AnimationSpec animationSpec, Function1 function1, SnackbarHostState snackbarHostState) {
        super(1);
        this.f7274z = density;
        this.f7272A = animationSpec;
        this.f7273B = function1;
        this.C = snackbarHostState;
    }

    /* renamed from: b */
    public final BackdropScaffoldState invoke(BackdropValue backdropValue) {
        return BackdropScaffoldKt.d(backdropValue, this.f7274z, this.f7272A, this.f7273B, this.C);
    }
}
