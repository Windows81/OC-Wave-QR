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
public final class AndroidAlertDialog_androidKt$AlertDialog$2 extends Lambda implements Function2<Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function2 f7121A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Modifier f7122B;
    public final /* synthetic */ Function2 C;
    public final /* synthetic */ Function2 D;
    public final /* synthetic */ Shape E;
    public final /* synthetic */ long F;
    public final /* synthetic */ long G;
    public final /* synthetic */ DialogProperties H;
    public final /* synthetic */ int I;
    public final /* synthetic */ int J;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Function0 f7123z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AndroidAlertDialog_androidKt$AlertDialog$2(Function0 function0, Function2 function2, Modifier modifier, Function2 function22, Function2 function23, Shape shape, long j2, long j3, DialogProperties dialogProperties, int i2, int i3) {
        super(2);
        this.f7123z = function0;
        this.f7121A = function2;
        this.f7122B = modifier;
        this.C = function22;
        this.D = function23;
        this.E = shape;
        this.F = j2;
        this.G = j3;
        this.H = dialogProperties;
        this.I = i2;
        this.J = i3;
    }

    public final void b(Composer composer, int i2) {
        AndroidAlertDialog_androidKt.b(this.f7123z, this.f7121A, this.f7122B, this.C, this.D, this.E, this.F, this.G, this.H, composer, RecomposeScopeImplKt.a(this.I | 1), this.J);
    }

    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
        b((Composer) obj, ((Number) obj2).intValue());
        return Unit.f40552a;
    }
}
