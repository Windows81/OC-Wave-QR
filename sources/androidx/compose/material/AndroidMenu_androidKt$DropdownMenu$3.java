package androidx.compose.material;

import androidx.compose.foundation.ScrollState;
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
public final class AndroidMenu_androidKt$DropdownMenu$3 extends Lambda implements Function2<Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function0 f7131A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Modifier f7132B;
    public final /* synthetic */ long C;
    public final /* synthetic */ ScrollState D;
    public final /* synthetic */ PopupProperties E;
    public final /* synthetic */ Function3 F;
    public final /* synthetic */ int G;
    public final /* synthetic */ int H;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ boolean f7133z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AndroidMenu_androidKt$DropdownMenu$3(boolean z2, Function0 function0, Modifier modifier, long j2, ScrollState scrollState, PopupProperties popupProperties, Function3 function3, int i2, int i3) {
        super(2);
        this.f7133z = z2;
        this.f7131A = function0;
        this.f7132B = modifier;
        this.C = j2;
        this.D = scrollState;
        this.E = popupProperties;
        this.F = function3;
        this.G = i2;
        this.H = i3;
    }

    public final void b(Composer composer, int i2) {
        AndroidMenu_androidKt.a(this.f7133z, this.f7131A, this.f7132B, this.C, this.D, this.E, this.F, composer, RecomposeScopeImplKt.a(this.G | 1), this.H);
    }

    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
        b((Composer) obj, ((Number) obj2).intValue());
        return Unit.f40552a;
    }
}
