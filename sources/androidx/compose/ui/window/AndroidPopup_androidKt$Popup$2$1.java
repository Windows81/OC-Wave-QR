package androidx.compose.ui.window;

import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class AndroidPopup_androidKt$Popup$2$1 extends Lambda implements Function1<DisposableEffectScope, DisposableEffectResult> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function0 f19283A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ PopupProperties f19284B;
    public final /* synthetic */ String C;
    public final /* synthetic */ LayoutDirection D;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ PopupLayout f19285z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AndroidPopup_androidKt$Popup$2$1(PopupLayout popupLayout, Function0 function0, PopupProperties popupProperties, String str, LayoutDirection layoutDirection) {
        super(1);
        this.f19285z = popupLayout;
        this.f19283A = function0;
        this.f19284B = popupProperties;
        this.C = str;
        this.D = layoutDirection;
    }

    /* renamed from: b */
    public final DisposableEffectResult invoke(DisposableEffectScope disposableEffectScope) {
        this.f19285z.s();
        this.f19285z.u(this.f19283A, this.f19284B, this.C, this.D);
        return new AndroidPopup_androidKt$Popup$2$1$invoke$$inlined$onDispose$1(this.f19285z);
    }
}
