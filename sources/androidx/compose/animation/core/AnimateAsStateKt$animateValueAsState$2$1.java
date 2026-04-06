package androidx.compose.animation.core;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.channels.Channel;

@Metadata
public final class AnimateAsStateKt$animateValueAsState$2$1 extends Lambda implements Function0<Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Object f2453A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Channel f2454z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnimateAsStateKt$animateValueAsState$2$1(Channel channel, Object obj) {
        super(0);
        this.f2454z = channel;
        this.f2453A = obj;
    }

    public final void invoke() {
        this.f2454z.L(this.f2453A);
    }
}
