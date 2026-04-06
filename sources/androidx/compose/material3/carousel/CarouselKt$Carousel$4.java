package androidx.compose.material3.carousel;

import androidx.compose.foundation.pager.PagerScope;
import androidx.compose.runtime.Composer;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function4;

@Metadata
final class CarouselKt$Carousel$4 implements Function4<PagerScope, Integer, Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ CarouselPageSize f11918A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Function4 f11919B;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ CarouselState f11920z;

    /* access modifiers changed from: private */
    public static final Strategy e(CarouselPageSize carouselPageSize) {
        return carouselPageSize.b();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1, resolved type: kotlin.jvm.functions.Function0} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void c(androidx.compose.foundation.pager.PagerScope r9, int r10, androidx.compose.runtime.Composer r11, int r12) {
        /*
            r8 = this;
            boolean r9 = androidx.compose.runtime.ComposerKt.P()
            if (r9 == 0) goto L_0x000f
            r9 = -1
            java.lang.String r0 = "androidx.compose.material3.carousel.Carousel.<anonymous> (Carousel.kt:445)"
            r1 = -1042567175(0xffffffffc1dbaff9, float:-27.460924)
            androidx.compose.runtime.ComposerKt.Y(r1, r12, r9, r0)
        L_0x000f:
            java.lang.Object r9 = r11.g()
            androidx.compose.runtime.Composer$Companion r0 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r1 = r0.a()
            if (r9 != r1) goto L_0x0023
            androidx.compose.material3.carousel.CarouselItemDrawInfoImpl r9 = new androidx.compose.material3.carousel.CarouselItemDrawInfoImpl
            r9.<init>()
            r11.N(r9)
        L_0x0023:
            r5 = r9
            androidx.compose.material3.carousel.CarouselItemDrawInfoImpl r5 = (androidx.compose.material3.carousel.CarouselItemDrawInfoImpl) r5
            java.lang.Object r9 = r11.g()
            java.lang.Object r1 = r0.a()
            if (r9 != r1) goto L_0x0038
            androidx.compose.material3.carousel.CarouselItemScopeImpl r9 = new androidx.compose.material3.carousel.CarouselItemScopeImpl
            r9.<init>(r5)
            r11.N(r9)
        L_0x0038:
            androidx.compose.material3.carousel.CarouselItemScopeImpl r9 = (androidx.compose.material3.carousel.CarouselItemScopeImpl) r9
            java.lang.Object r1 = r11.g()
            java.lang.Object r2 = r0.a()
            if (r1 != r2) goto L_0x004c
            androidx.compose.material3.carousel.CarouselKt$Carousel$4$clipShape$1$1 r1 = new androidx.compose.material3.carousel.CarouselKt$Carousel$4$clipShape$1$1
            r1.<init>(r5)
            r11.N(r1)
        L_0x004c:
            r6 = r1
            androidx.compose.material3.carousel.CarouselKt$Carousel$4$clipShape$1$1 r6 = (androidx.compose.material3.carousel.CarouselKt$Carousel$4$clipShape$1$1) r6
            androidx.compose.ui.Modifier$Companion r1 = androidx.compose.ui.Modifier.f15489d
            androidx.compose.material3.carousel.CarouselState r3 = r8.f11920z
            androidx.compose.material3.carousel.CarouselPageSize r2 = r8.f11918A
            boolean r2 = r11.W(r2)
            androidx.compose.material3.carousel.CarouselPageSize r4 = r8.f11918A
            java.lang.Object r7 = r11.g()
            if (r2 != 0) goto L_0x0067
            java.lang.Object r0 = r0.a()
            if (r7 != r0) goto L_0x006f
        L_0x0067:
            androidx.compose.material3.carousel.f r7 = new androidx.compose.material3.carousel.f
            r7.<init>(r4)
            r11.N(r7)
        L_0x006f:
            r4 = r7
            kotlin.jvm.functions.Function0 r4 = (kotlin.jvm.functions.Function0) r4
            r2 = r10
            androidx.compose.ui.Modifier r0 = androidx.compose.material3.carousel.CarouselKt.g(r1, r2, r3, r4, r5, r6)
            kotlin.jvm.functions.Function4 r1 = r8.f11919B
            androidx.compose.ui.Alignment$Companion r2 = androidx.compose.ui.Alignment.f15444a
            androidx.compose.ui.Alignment r2 = r2.o()
            r3 = 0
            androidx.compose.ui.layout.MeasurePolicy r2 = androidx.compose.foundation.layout.BoxKt.g(r2, r3)
            int r3 = androidx.compose.runtime.ComposablesKt.a(r11, r3)
            androidx.compose.runtime.CompositionLocalMap r4 = r11.I()
            androidx.compose.ui.Modifier r0 = androidx.compose.ui.ComposedModifierKt.e(r11, r0)
            androidx.compose.ui.node.ComposeUiNode$Companion r5 = androidx.compose.ui.node.ComposeUiNode.f17222h
            kotlin.jvm.functions.Function0 r6 = r5.a()
            androidx.compose.runtime.Applier r7 = r11.v()
            if (r7 != 0) goto L_0x009f
            androidx.compose.runtime.ComposablesKt.d()
        L_0x009f:
            r11.s()
            boolean r7 = r11.n()
            if (r7 == 0) goto L_0x00ac
            r11.y(r6)
            goto L_0x00af
        L_0x00ac:
            r11.K()
        L_0x00af:
            androidx.compose.runtime.Composer r6 = androidx.compose.runtime.Updater.b(r11)
            kotlin.jvm.functions.Function2 r7 = r5.c()
            androidx.compose.runtime.Updater.g(r6, r2, r7)
            kotlin.jvm.functions.Function2 r2 = r5.e()
            androidx.compose.runtime.Updater.g(r6, r4, r2)
            kotlin.jvm.functions.Function2 r2 = r5.b()
            boolean r4 = r6.n()
            if (r4 != 0) goto L_0x00d9
            java.lang.Object r4 = r6.g()
            java.lang.Integer r7 = java.lang.Integer.valueOf(r3)
            boolean r4 = kotlin.jvm.internal.Intrinsics.d(r4, r7)
            if (r4 != 0) goto L_0x00e7
        L_0x00d9:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r3)
            r6.N(r4)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r6.A(r3, r2)
        L_0x00e7:
            kotlin.jvm.functions.Function2 r2 = r5.d()
            androidx.compose.runtime.Updater.g(r6, r0, r2)
            androidx.compose.foundation.layout.BoxScopeInstance r0 = androidx.compose.foundation.layout.BoxScopeInstance.f3797a
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            r12 = r12 & 112(0x70, float:1.57E-43)
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            r1.j(r9, r10, r11, r12)
            r11.T()
            boolean r9 = androidx.compose.runtime.ComposerKt.P()
            if (r9 == 0) goto L_0x0109
            androidx.compose.runtime.ComposerKt.X()
        L_0x0109:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.carousel.CarouselKt$Carousel$4.c(androidx.compose.foundation.pager.PagerScope, int, androidx.compose.runtime.Composer, int):void");
    }

    public /* bridge */ /* synthetic */ Object j(Object obj, Object obj2, Object obj3, Object obj4) {
        c((PagerScope) obj, ((Number) obj2).intValue(), (Composer) obj3, ((Number) obj4).intValue());
        return Unit.f40552a;
    }
}
