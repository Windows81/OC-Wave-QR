package androidx.compose.material;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;

@Metadata
public final class BackdropScaffoldKt$BackdropScaffold$2$1$1$newAnchors$1 extends Lambda implements Function1<DraggableAnchorsConfig<BackdropValue>, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ float f7218A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ float f7219B;
    public final /* synthetic */ Ref.FloatRef C;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ float f7220z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BackdropScaffoldKt$BackdropScaffold$2$1$1$newAnchors$1(float f2, float f3, float f4, Ref.FloatRef floatRef) {
        super(1);
        this.f7220z = f2;
        this.f7218A = f3;
        this.f7219B = f4;
        this.C = floatRef;
    }

    public final void b(DraggableAnchorsConfig draggableAnchorsConfig) {
        float f2 = this.f7220z;
        if (f2 != 0.0f) {
            float f3 = this.f7218A;
            if (f2 != f3) {
                draggableAnchorsConfig.a(BackdropValue.Concealed, f3);
                draggableAnchorsConfig.a(BackdropValue.Revealed, this.C.f40905z);
                return;
            }
        }
        draggableAnchorsConfig.a(BackdropValue.Concealed, this.f7219B);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        b((DraggableAnchorsConfig) obj);
        return Unit.f40552a;
    }
}
