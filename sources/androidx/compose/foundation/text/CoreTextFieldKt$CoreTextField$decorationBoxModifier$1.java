package androidx.compose.foundation.text;

import androidx.compose.ui.layout.LayoutCoordinates;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class CoreTextFieldKt$CoreTextField$decorationBoxModifier$1 extends Lambda implements Function1<LayoutCoordinates, Unit> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ LegacyTextFieldState f5695z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CoreTextFieldKt$CoreTextField$decorationBoxModifier$1(LegacyTextFieldState legacyTextFieldState) {
        super(1);
        this.f5695z = legacyTextFieldState;
    }

    public final void b(LayoutCoordinates layoutCoordinates) {
        TextLayoutResultProxy l2 = this.f5695z.l();
        if (l2 != null) {
            l2.h(layoutCoordinates);
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        b((LayoutCoordinates) obj);
        return Unit.f40552a;
    }
}
