package androidx.compose.ui.platform;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class AndroidCompositionLocals_androidKt$ProvideAndroidCompositionLocals$4 extends Lambda implements Function2<Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function2 f17614A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ int f17615B;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ AndroidComposeView f17616z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AndroidCompositionLocals_androidKt$ProvideAndroidCompositionLocals$4(AndroidComposeView androidComposeView, Function2 function2, int i2) {
        super(2);
        this.f17616z = androidComposeView;
        this.f17614A = function2;
        this.f17615B = i2;
    }

    public final void b(Composer composer, int i2) {
        AndroidCompositionLocals_androidKt.a(this.f17616z, this.f17614A, composer, RecomposeScopeImplKt.a(this.f17615B | 1));
    }

    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
        b((Composer) obj, ((Number) obj2).intValue());
        return Unit.f40552a;
    }
}
