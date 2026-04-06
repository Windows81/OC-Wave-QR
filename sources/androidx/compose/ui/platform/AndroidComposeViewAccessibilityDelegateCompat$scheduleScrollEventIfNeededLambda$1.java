package androidx.compose.ui.platform;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class AndroidComposeViewAccessibilityDelegateCompat$scheduleScrollEventIfNeededLambda$1 extends Lambda implements Function1<ScrollObservationScope, Unit> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ AndroidComposeViewAccessibilityDelegateCompat f17568z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AndroidComposeViewAccessibilityDelegateCompat$scheduleScrollEventIfNeededLambda$1(AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat) {
        super(1);
        this.f17568z = androidComposeViewAccessibilityDelegateCompat;
    }

    public final void b(ScrollObservationScope scrollObservationScope) {
        this.f17568z.z0(scrollObservationScope);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        b((ScrollObservationScope) obj);
        return Unit.f40552a;
    }
}
