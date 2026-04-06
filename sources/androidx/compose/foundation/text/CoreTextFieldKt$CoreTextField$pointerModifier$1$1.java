package androidx.compose.foundation.text;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class CoreTextFieldKt$CoreTextField$pointerModifier$1$1 extends Lambda implements Function1<Boolean, Unit> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ LegacyTextFieldState f5707z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CoreTextFieldKt$CoreTextField$pointerModifier$1$1(LegacyTextFieldState legacyTextFieldState) {
        super(1);
        this.f5707z = legacyTextFieldState;
    }

    public final void b(boolean z2) {
        this.f5707z.G(z2);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        b(((Boolean) obj).booleanValue());
        return Unit.f40552a;
    }
}
