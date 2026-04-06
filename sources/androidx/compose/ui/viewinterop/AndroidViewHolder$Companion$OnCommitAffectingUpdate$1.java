package androidx.compose.ui.viewinterop;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class AndroidViewHolder$Companion$OnCommitAffectingUpdate$1 extends Lambda implements Function1<AndroidViewHolder, Unit> {

    /* renamed from: z  reason: collision with root package name */
    public static final AndroidViewHolder$Companion$OnCommitAffectingUpdate$1 f19203z = new AndroidViewHolder$Companion$OnCommitAffectingUpdate$1();

    public AndroidViewHolder$Companion$OnCommitAffectingUpdate$1() {
        super(1);
    }

    /* access modifiers changed from: private */
    public static final void e(Function0 function0) {
        function0.invoke();
    }

    public final void c(AndroidViewHolder androidViewHolder) {
        androidViewHolder.getHandler().post(new b(androidViewHolder.Q));
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        c((AndroidViewHolder) obj);
        return Unit.f40552a;
    }
}
