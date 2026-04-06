package androidx.compose.ui.platform;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class ViewCompositionStrategy$DisposeOnDetachedFromWindow$installFor$1 extends Lambda implements Function0<Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ ViewCompositionStrategy$DisposeOnDetachedFromWindow$installFor$listener$1 f17892A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ AbstractComposeView f17893z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ViewCompositionStrategy$DisposeOnDetachedFromWindow$installFor$1(AbstractComposeView abstractComposeView, ViewCompositionStrategy$DisposeOnDetachedFromWindow$installFor$listener$1 viewCompositionStrategy$DisposeOnDetachedFromWindow$installFor$listener$1) {
        super(0);
        this.f17893z = abstractComposeView;
        this.f17892A = viewCompositionStrategy$DisposeOnDetachedFromWindow$installFor$listener$1;
    }

    public final void invoke() {
        this.f17893z.removeOnAttachStateChangeListener(this.f17892A);
    }
}
