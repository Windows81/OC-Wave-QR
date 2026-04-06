package androidx.compose.ui.window;

import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class AndroidPopup_androidKt$Popup$4$1 extends Lambda implements Function1<DisposableEffectScope, DisposableEffectResult> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ PopupPositionProvider f19289A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ PopupLayout f19290z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AndroidPopup_androidKt$Popup$4$1(PopupLayout popupLayout, PopupPositionProvider popupPositionProvider) {
        super(1);
        this.f19290z = popupLayout;
        this.f19289A = popupPositionProvider;
    }

    /* renamed from: b */
    public final DisposableEffectResult invoke(DisposableEffectScope disposableEffectScope) {
        this.f19290z.setPositionProvider(this.f19289A);
        this.f19290z.y();
        return new AndroidPopup_androidKt$Popup$4$1$invoke$$inlined$onDispose$1();
    }
}
