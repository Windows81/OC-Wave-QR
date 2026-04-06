package okhttp3.internal.concurrent;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

@Metadata
public final class TaskQueue$execute$1 extends Task {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Function0 f42888e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TaskQueue$execute$1(String str, boolean z2, Function0 function0) {
        super(str, z2);
        this.f42888e = function0;
    }

    public long f() {
        this.f42888e.invoke();
        return -1;
    }
}
