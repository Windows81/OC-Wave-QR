package androidx.compose.ui.node;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class LookaheadCapablePlaceable$captureRulers$3 extends Lambda implements Function0<Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ LookaheadCapablePlaceable f17325A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ PlaceableResult f17326z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LookaheadCapablePlaceable$captureRulers$3(PlaceableResult placeableResult, LookaheadCapablePlaceable lookaheadCapablePlaceable) {
        super(0);
        this.f17326z = placeableResult;
        this.f17325A = lookaheadCapablePlaceable;
    }

    public final void invoke() {
        Function1 s2 = this.f17326z.b().s();
        if (s2 != null) {
            s2.invoke(this.f17325A.q1());
        }
    }
}
