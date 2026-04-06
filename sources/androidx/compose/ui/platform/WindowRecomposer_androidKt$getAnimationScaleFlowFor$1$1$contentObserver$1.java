package androidx.compose.ui.platform;

import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;
import kotlin.Metadata;
import kotlin.Unit;
import kotlinx.coroutines.channels.Channel;

@Metadata
public final class WindowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$contentObserver$1 extends ContentObserver {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Channel f17944a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WindowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$contentObserver$1(Channel channel, Handler handler) {
        super(handler);
        this.f17944a = channel;
    }

    public void onChange(boolean z2, Uri uri) {
        this.f17944a.L(Unit.f40552a);
    }
}
