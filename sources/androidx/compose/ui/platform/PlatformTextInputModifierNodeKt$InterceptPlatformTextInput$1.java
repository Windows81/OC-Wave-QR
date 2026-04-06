package androidx.compose.ui.platform;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class PlatformTextInputModifierNodeKt$InterceptPlatformTextInput$1 extends Lambda implements Function2<Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function2 f17840A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ int f17841B;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ PlatformTextInputInterceptor f17842z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PlatformTextInputModifierNodeKt$InterceptPlatformTextInput$1(PlatformTextInputInterceptor platformTextInputInterceptor, Function2 function2, int i2) {
        super(2);
        this.f17842z = platformTextInputInterceptor;
        this.f17840A = function2;
        this.f17841B = i2;
    }

    public final void b(Composer composer, int i2) {
        PlatformTextInputModifierNodeKt.a(this.f17842z, this.f17840A, composer, RecomposeScopeImplKt.a(this.f17841B | 1));
    }

    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
        b((Composer) obj, ((Number) obj2).intValue());
        return Unit.f40552a;
    }
}
