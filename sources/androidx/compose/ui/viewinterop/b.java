package androidx.compose.ui.viewinterop;

import kotlin.jvm.functions.Function0;

public final /* synthetic */ class b implements Runnable {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Function0 f19258z;

    public /* synthetic */ b(Function0 function0) {
        this.f19258z = function0;
    }

    public final void run() {
        AndroidViewHolder$Companion$OnCommitAffectingUpdate$1.e(this.f19258z);
    }
}
