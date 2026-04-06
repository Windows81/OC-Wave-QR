package androidx.compose.material;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.window.DialogProperties;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class AndroidAlertDialog_androidKt$AlertDialog$1 extends Lambda implements Function2<Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function2 f7118A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Modifier f7119B;
    public final /* synthetic */ Function2 C;
    public final /* synthetic */ Function2 D;
    public final /* synthetic */ Function2 E;
    public final /* synthetic */ Shape F;
    public final /* synthetic */ long G;
    public final /* synthetic */ long H;
    public final /* synthetic */ DialogProperties I;
    public final /* synthetic */ int J;
    public final /* synthetic */ int K;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Function0 f7120z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AndroidAlertDialog_androidKt$AlertDialog$1(Function0 function0, Function2 function2, Modifier modifier, Function2 function22, Function2 function23, Function2 function24, Shape shape, long j2, long j3, DialogProperties dialogProperties, int i2, int i3) {
        super(2);
        this.f7120z = function0;
        this.f7118A = function2;
        this.f7119B = modifier;
        this.C = function22;
        this.D = function23;
        this.E = function24;
        this.F = shape;
        this.G = j2;
        this.H = j3;
        this.I = dialogProperties;
        this.J = i2;
        this.K = i3;
    }

    public final void b(Composer composer, int i2) {
        AndroidAlertDialog_androidKt.a(this.f7120z, this.f7118A, this.f7119B, this.C, this.D, this.E, this.F, this.G, this.H, this.I, composer, RecomposeScopeImplKt.a(this.J | 1), this.K);
    }

    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
        b((Composer) obj, ((Number) obj2).intValue());
        return Unit.f40552a;
    }
}
