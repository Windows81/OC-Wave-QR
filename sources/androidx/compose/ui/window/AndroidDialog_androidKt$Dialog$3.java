package androidx.compose.ui.window;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class AndroidDialog_androidKt$Dialog$3 extends Lambda implements Function2<Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ DialogProperties f19266A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Function2 f19267B;
    public final /* synthetic */ int C;
    public final /* synthetic */ int D;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Function0 f19268z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AndroidDialog_androidKt$Dialog$3(Function0 function0, DialogProperties dialogProperties, Function2 function2, int i2, int i3) {
        super(2);
        this.f19268z = function0;
        this.f19266A = dialogProperties;
        this.f19267B = function2;
        this.C = i2;
        this.D = i3;
    }

    public final void b(Composer composer, int i2) {
        AndroidDialog_androidKt.a(this.f19268z, this.f19266A, this.f19267B, composer, RecomposeScopeImplKt.a(this.C | 1), this.D);
    }

    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
        b((Composer) obj, ((Number) obj2).intValue());
        return Unit.f40552a;
    }
}
