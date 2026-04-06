package androidx.compose.material;

import androidx.compose.material.ripple.RippleAlpha;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class DelegatingThemeAwareRippleNode$attachNewRipple$calculateRippleAlpha$1 extends Lambda implements Function0<RippleAlpha> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ DelegatingThemeAwareRippleNode f7677z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DelegatingThemeAwareRippleNode$attachNewRipple$calculateRippleAlpha$1(DelegatingThemeAwareRippleNode delegatingThemeAwareRippleNode) {
        super(0);
        this.f7677z = delegatingThemeAwareRippleNode;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000e, code lost:
        r0 = r0.b();
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final androidx.compose.material.ripple.RippleAlpha invoke() {
        /*
            r5 = this;
            androidx.compose.material.DelegatingThemeAwareRippleNode r0 = r5.f7677z
            androidx.compose.runtime.ProvidableCompositionLocal r1 = androidx.compose.material.RippleKt.d()
            java.lang.Object r0 = androidx.compose.ui.node.CompositionLocalConsumerModifierNodeKt.a(r0, r1)
            androidx.compose.material.RippleConfiguration r0 = (androidx.compose.material.RippleConfiguration) r0
            if (r0 == 0) goto L_0x0014
            androidx.compose.material.ripple.RippleAlpha r0 = r0.b()
            if (r0 != 0) goto L_0x003a
        L_0x0014:
            androidx.compose.material.RippleDefaults r0 = androidx.compose.material.RippleDefaults.f8241a
            androidx.compose.material.DelegatingThemeAwareRippleNode r1 = r5.f7677z
            androidx.compose.runtime.ProvidableCompositionLocal r2 = androidx.compose.material.ContentColorKt.a()
            java.lang.Object r1 = androidx.compose.ui.node.CompositionLocalConsumerModifierNodeKt.a(r1, r2)
            androidx.compose.ui.graphics.Color r1 = (androidx.compose.ui.graphics.Color) r1
            long r1 = r1.v()
            androidx.compose.material.DelegatingThemeAwareRippleNode r3 = r5.f7677z
            androidx.compose.runtime.ProvidableCompositionLocal r4 = androidx.compose.material.ColorsKt.c()
            java.lang.Object r3 = androidx.compose.ui.node.CompositionLocalConsumerModifierNodeKt.a(r3, r4)
            androidx.compose.material.Colors r3 = (androidx.compose.material.Colors) r3
            boolean r3 = r3.o()
            androidx.compose.material.ripple.RippleAlpha r0 = r0.a(r1, r3)
        L_0x003a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.DelegatingThemeAwareRippleNode$attachNewRipple$calculateRippleAlpha$1.invoke():androidx.compose.material.ripple.RippleAlpha");
    }
}
