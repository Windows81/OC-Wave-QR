package androidx.compose.ui.node;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class LookaheadCapablePlaceable$Companion$onCommitAffectingRuler$1 extends Lambda implements Function1<PlaceableResult, Unit> {

    /* renamed from: z  reason: collision with root package name */
    public static final LookaheadCapablePlaceable$Companion$onCommitAffectingRuler$1 f17324z = new LookaheadCapablePlaceable$Companion$onCommitAffectingRuler$1();

    public LookaheadCapablePlaceable$Companion$onCommitAffectingRuler$1() {
        super(1);
    }

    public final void b(PlaceableResult placeableResult) {
        if (placeableResult.v0()) {
            placeableResult.a().Y0(placeableResult);
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        b((PlaceableResult) obj);
        return Unit.f40552a;
    }
}
