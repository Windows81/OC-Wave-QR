package androidx.compose.ui.platform;

import androidx.compose.ui.unit.IntSize;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class AndroidComposeView$onAttachedToWindow$1 extends Lambda implements Function0<IntSize> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ AndroidComposeView f17514z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AndroidComposeView$onAttachedToWindow$1(AndroidComposeView androidComposeView) {
        super(0);
        this.f17514z = androidComposeView;
    }

    public final long b() {
        return AndroidWindowInfo_androidKt.d(this.f17514z);
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        return IntSize.b(b());
    }
}
