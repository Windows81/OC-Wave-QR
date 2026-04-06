package androidx.compose.material;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function6;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class TextFieldTransitionScope$Transition$1 extends Lambda implements Function2<Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ InputPhase f8851A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ long f8852B;
    public final /* synthetic */ long C;
    public final /* synthetic */ Function3 D;
    public final /* synthetic */ boolean E;
    public final /* synthetic */ Function6 F;
    public final /* synthetic */ int G;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ TextFieldTransitionScope f8853z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TextFieldTransitionScope$Transition$1(TextFieldTransitionScope textFieldTransitionScope, InputPhase inputPhase, long j2, long j3, Function3 function3, boolean z2, Function6 function6, int i2) {
        super(2);
        this.f8853z = textFieldTransitionScope;
        this.f8851A = inputPhase;
        this.f8852B = j2;
        this.C = j3;
        this.D = function3;
        this.E = z2;
        this.F = function6;
        this.G = i2;
    }

    public final void b(Composer composer, int i2) {
        this.f8853z.a(this.f8851A, this.f8852B, this.C, this.D, this.E, this.F, composer, RecomposeScopeImplKt.a(this.G | 1));
    }

    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
        b((Composer) obj, ((Number) obj2).intValue());
        return Unit.f40552a;
    }
}
