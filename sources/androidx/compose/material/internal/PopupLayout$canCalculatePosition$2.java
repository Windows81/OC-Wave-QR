package androidx.compose.material.internal;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class PopupLayout$canCalculatePosition$2 extends Lambda implements Function0<Boolean> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ PopupLayout f8997z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PopupLayout$canCalculatePosition$2(PopupLayout popupLayout) {
        super(0);
        this.f8997z = popupLayout;
    }

    /* renamed from: b */
    public final Boolean invoke() {
        return Boolean.valueOf((this.f8997z.n() == null || this.f8997z.m0getPopupContentSizebOM6tXw() == null) ? false : true);
    }
}
