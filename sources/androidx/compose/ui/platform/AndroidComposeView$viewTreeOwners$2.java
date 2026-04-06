package androidx.compose.ui.platform;

import androidx.compose.ui.platform.AndroidComposeView;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class AndroidComposeView$viewTreeOwners$2 extends Lambda implements Function0<AndroidComposeView.ViewTreeOwners> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ AndroidComposeView f17529z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AndroidComposeView$viewTreeOwners$2(AndroidComposeView androidComposeView) {
        super(0);
        this.f17529z = androidComposeView;
    }

    /* renamed from: b */
    public final AndroidComposeView.ViewTreeOwners invoke() {
        return this.f17529z.get_viewTreeOwners();
    }
}
