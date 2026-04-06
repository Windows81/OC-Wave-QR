package androidx.compose.foundation.gestures;

import androidx.compose.foundation.gestures.MouseWheelScrollingLogic;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelResult;

@Metadata
public final class MouseWheelScrollingLogic$sumOrNull$1 extends Lambda implements Function0<MouseWheelScrollingLogic.MouseWheelScrollDelta> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Channel f3546z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MouseWheelScrollingLogic$sumOrNull$1(Channel channel) {
        super(0);
        this.f3546z = channel;
    }

    /* renamed from: b */
    public final MouseWheelScrollingLogic.MouseWheelScrollDelta invoke() {
        return (MouseWheelScrollingLogic.MouseWheelScrollDelta) ChannelResult.f(this.f3546z.n());
    }
}
