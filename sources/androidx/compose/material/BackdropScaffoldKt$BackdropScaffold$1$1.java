package androidx.compose.material;

import androidx.compose.ui.unit.Density;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class BackdropScaffoldKt$BackdropScaffold$1$1 extends Lambda implements Function0<Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Density f7206A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ BackdropScaffoldState f7207z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BackdropScaffoldKt$BackdropScaffold$1$1(BackdropScaffoldState backdropScaffoldState, Density density) {
        super(0);
        this.f7207z = backdropScaffoldState;
        this.f7206A = density;
    }

    public final void invoke() {
        this.f7207z.l(this.f7206A);
    }
}
