package androidx.compose.ui.input.pointer;

import androidx.compose.ui.Modifier;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class HitPathTracker$addHitPath$1 extends Lambda implements Function0<Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Modifier.Node f16817A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ HitPathTracker f16818z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HitPathTracker$addHitPath$1(HitPathTracker hitPathTracker, Modifier.Node node) {
        super(0);
        this.f16818z = hitPathTracker;
        this.f16817A = node;
    }

    public final void invoke() {
        this.f16818z.g(this.f16817A);
    }
}
