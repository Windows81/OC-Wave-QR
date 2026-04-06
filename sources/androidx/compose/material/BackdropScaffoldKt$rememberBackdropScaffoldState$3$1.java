package androidx.compose.material;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.ui.unit.Density;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class BackdropScaffoldKt$rememberBackdropScaffoldState$3$1 extends Lambda implements Function0<BackdropScaffoldState> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Density f7261A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ AnimationSpec f7262B;
    public final /* synthetic */ Function1 C;
    public final /* synthetic */ SnackbarHostState D;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ BackdropValue f7263z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BackdropScaffoldKt$rememberBackdropScaffoldState$3$1(BackdropValue backdropValue, Density density, AnimationSpec animationSpec, Function1 function1, SnackbarHostState snackbarHostState) {
        super(0);
        this.f7263z = backdropValue;
        this.f7261A = density;
        this.f7262B = animationSpec;
        this.C = function1;
        this.D = snackbarHostState;
    }

    /* renamed from: b */
    public final BackdropScaffoldState invoke() {
        return BackdropScaffoldKt.d(this.f7263z, this.f7261A, this.f7262B, this.C, this.D);
    }
}
