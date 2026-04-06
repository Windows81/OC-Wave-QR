package androidx.compose.foundation.text.input.internal;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.text.MatchResult;

@Metadata
public final class HandwritingGestureApi34$performRemoveSpaceGesture$newText$2 extends Lambda implements Function1<MatchResult, CharSequence> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Ref.IntRef f6193A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Ref.IntRef f6194z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HandwritingGestureApi34$performRemoveSpaceGesture$newText$2(Ref.IntRef intRef, Ref.IntRef intRef2) {
        super(1);
        this.f6194z = intRef;
        this.f6193A = intRef2;
    }

    /* renamed from: b */
    public final CharSequence invoke(MatchResult matchResult) {
        Ref.IntRef intRef = this.f6194z;
        if (intRef.f40906z == -1) {
            intRef.f40906z = matchResult.b().n();
        }
        this.f6193A.f40906z = matchResult.b().o() + 1;
        return "";
    }
}
