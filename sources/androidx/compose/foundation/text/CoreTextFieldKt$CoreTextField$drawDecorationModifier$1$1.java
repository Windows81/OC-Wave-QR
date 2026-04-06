package androidx.compose.foundation.text;

import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class CoreTextFieldKt$CoreTextField$drawDecorationModifier$1$1 extends Lambda implements Function1<DrawScope, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ long f5696A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ LegacyTextFieldState f5697z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CoreTextFieldKt$CoreTextField$drawDecorationModifier$1$1(LegacyTextFieldState legacyTextFieldState, long j2) {
        super(1);
        this.f5697z = legacyTextFieldState;
        this.f5696A = j2;
    }

    public final void b(DrawScope drawScope) {
        if (this.f5697z.c() || this.f5697z.i()) {
            DrawScope.A1(drawScope, this.f5696A, 0, 0, 0.0f, (DrawStyle) null, (ColorFilter) null, 0, 126, (Object) null);
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        b((DrawScope) obj);
        return Unit.f40552a;
    }
}
