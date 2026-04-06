package androidx.compose.material;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
final class DismissState$Companion$Saver$2 extends Lambda implements Function1<DismissValue, DismissState> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Function1 f7685z;

    /* renamed from: b */
    public final DismissState invoke(DismissValue dismissValue) {
        return new DismissState(dismissValue, this.f7685z);
    }
}
