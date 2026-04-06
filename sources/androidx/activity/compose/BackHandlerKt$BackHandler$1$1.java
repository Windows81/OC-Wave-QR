package androidx.activity.compose;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class BackHandlerKt$BackHandler$1$1 extends Lambda implements Function0<Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ boolean f136A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ BackHandlerKt$BackHandler$backCallback$1$1 f137z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BackHandlerKt$BackHandler$1$1(BackHandlerKt$BackHandler$backCallback$1$1 backHandlerKt$BackHandler$backCallback$1$1, boolean z2) {
        super(0);
        this.f137z = backHandlerKt$BackHandler$backCallback$1$1;
        this.f136A = z2;
    }

    public final void invoke() {
        this.f137z.j(this.f136A);
    }
}
