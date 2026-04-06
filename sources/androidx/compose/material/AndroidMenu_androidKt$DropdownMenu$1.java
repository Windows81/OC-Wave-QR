package androidx.compose.material;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.window.PopupProperties;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class AndroidMenu_androidKt$DropdownMenu$1 extends Lambda implements Function2<Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function0 f7125A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Modifier f7126B;
    public final /* synthetic */ long C;
    public final /* synthetic */ PopupProperties D;
    public final /* synthetic */ Function3 E;
    public final /* synthetic */ int F;
    public final /* synthetic */ int G;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ boolean f7127z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AndroidMenu_androidKt$DropdownMenu$1(boolean z2, Function0 function0, Modifier modifier, long j2, PopupProperties popupProperties, Function3 function3, int i2, int i3) {
        super(2);
        this.f7127z = z2;
        this.f7125A = function0;
        this.f7126B = modifier;
        this.C = j2;
        this.D = popupProperties;
        this.E = function3;
        this.F = i2;
        this.G = i3;
    }

    public final void b(Composer composer, int i2) {
        AndroidMenu_androidKt.b(this.f7127z, this.f7125A, this.f7126B, this.C, this.D, this.E, composer, RecomposeScopeImplKt.a(this.F | 1), this.G);
    }

    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
        b((Composer) obj, ((Number) obj2).intValue());
        return Unit.f40552a;
    }
}
