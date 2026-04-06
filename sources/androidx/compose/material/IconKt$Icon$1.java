package androidx.compose.material;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.painter.Painter;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class IconKt$Icon$1 extends Lambda implements Function2<Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ String f7898A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Modifier f7899B;
    public final /* synthetic */ long C;
    public final /* synthetic */ int D;
    public final /* synthetic */ int E;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Painter f7900z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public IconKt$Icon$1(Painter painter, String str, Modifier modifier, long j2, int i2, int i3) {
        super(2);
        this.f7900z = painter;
        this.f7898A = str;
        this.f7899B = modifier;
        this.C = j2;
        this.D = i2;
        this.E = i3;
    }

    public final void b(Composer composer, int i2) {
        IconKt.a(this.f7900z, this.f7898A, this.f7899B, this.C, composer, RecomposeScopeImplKt.a(this.D | 1), this.E);
    }

    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
        b((Composer) obj, ((Number) obj2).intValue());
        return Unit.f40552a;
    }
}
