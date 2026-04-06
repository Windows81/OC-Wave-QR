package androidx.compose.material;

import androidx.compose.runtime.RecomposeScope;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class SnackbarHostKt$FadeInFadeOutWithScale$1$1$opacity$1$1 extends Lambda implements Function0<Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ FadeInFadeOutState f8439A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ SnackbarData f8440z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SnackbarHostKt$FadeInFadeOutWithScale$1$1$opacity$1$1(SnackbarData snackbarData, FadeInFadeOutState fadeInFadeOutState) {
        super(0);
        this.f8440z = snackbarData;
        this.f8439A = fadeInFadeOutState;
    }

    public final void invoke() {
        if (!Intrinsics.d(this.f8440z, this.f8439A.a())) {
            List b2 = this.f8439A.b();
            final SnackbarData snackbarData = this.f8440z;
            CollectionsKt.H(b2, new Function1<FadeInFadeOutAnimationItem<SnackbarData>, Boolean>() {
                /* renamed from: b */
                public final Boolean invoke(FadeInFadeOutAnimationItem fadeInFadeOutAnimationItem) {
                    return Boolean.valueOf(Intrinsics.d(fadeInFadeOutAnimationItem.c(), snackbarData));
                }
            });
            RecomposeScope c2 = this.f8439A.c();
            if (c2 != null) {
                c2.invalidate();
            }
        }
    }
}
