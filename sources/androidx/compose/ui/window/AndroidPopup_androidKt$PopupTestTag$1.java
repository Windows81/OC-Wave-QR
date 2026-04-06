package androidx.compose.ui.window;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class AndroidPopup_androidKt$PopupTestTag$1 extends Lambda implements Function2<Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function2 f19304A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ int f19305B;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ String f19306z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AndroidPopup_androidKt$PopupTestTag$1(String str, Function2 function2, int i2) {
        super(2);
        this.f19306z = str;
        this.f19304A = function2;
        this.f19305B = i2;
    }

    public final void b(Composer composer, int i2) {
        AndroidPopup_androidKt.d(this.f19306z, this.f19304A, composer, RecomposeScopeImplKt.a(this.f19305B | 1));
    }

    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
        b((Composer) obj, ((Number) obj2).intValue());
        return Unit.f40552a;
    }
}
