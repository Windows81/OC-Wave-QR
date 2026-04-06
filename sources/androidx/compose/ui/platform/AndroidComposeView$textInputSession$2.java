package androidx.compose.ui.platform;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineScope;

@Metadata
public final class AndroidComposeView$textInputSession$2 extends Lambda implements Function1<CoroutineScope, AndroidPlatformTextInputSession> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ AndroidComposeView f17528z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AndroidComposeView$textInputSession$2(AndroidComposeView androidComposeView) {
        super(1);
        this.f17528z = androidComposeView;
    }

    /* renamed from: b */
    public final AndroidPlatformTextInputSession invoke(CoroutineScope coroutineScope) {
        AndroidComposeView androidComposeView = this.f17528z;
        return new AndroidPlatformTextInputSession(androidComposeView, androidComposeView.getTextInputService(), coroutineScope);
    }
}
