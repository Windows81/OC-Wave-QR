package androidx.compose.material;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class BackdropScaffoldState$anchoredDraggableState$1 extends Lambda implements Function1<Float, Float> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ BackdropScaffoldState f7275z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BackdropScaffoldState$anchoredDraggableState$1(BackdropScaffoldState backdropScaffoldState) {
        super(1);
        this.f7275z = backdropScaffoldState;
    }

    public final Float b(float f2) {
        return Float.valueOf(this.f7275z.j().B1(BackdropScaffoldKt.f7192c));
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return b(((Number) obj).floatValue());
    }
}
