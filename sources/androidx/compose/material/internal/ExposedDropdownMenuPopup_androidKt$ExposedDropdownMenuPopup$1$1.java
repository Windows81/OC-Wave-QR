package androidx.compose.material.internal;

import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class ExposedDropdownMenuPopup_androidKt$ExposedDropdownMenuPopup$1$1 extends Lambda implements Function1<DisposableEffectScope, DisposableEffectResult> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function0 f8967A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ String f8968B;
    public final /* synthetic */ LayoutDirection C;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ PopupLayout f8969z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ExposedDropdownMenuPopup_androidKt$ExposedDropdownMenuPopup$1$1(PopupLayout popupLayout, Function0 function0, String str, LayoutDirection layoutDirection) {
        super(1);
        this.f8969z = popupLayout;
        this.f8967A = function0;
        this.f8968B = str;
        this.C = layoutDirection;
    }

    /* renamed from: b */
    public final DisposableEffectResult invoke(DisposableEffectScope disposableEffectScope) {
        this.f8969z.q();
        this.f8969z.t(this.f8967A, this.f8968B, this.C);
        return new ExposedDropdownMenuPopup_androidKt$ExposedDropdownMenuPopup$1$1$invoke$$inlined$onDispose$1(this.f8969z);
    }
}
