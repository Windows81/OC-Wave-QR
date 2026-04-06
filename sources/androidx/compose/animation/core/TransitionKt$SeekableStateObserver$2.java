package androidx.compose.animation.core;

import androidx.compose.runtime.snapshots.SnapshotStateObserver;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class TransitionKt$SeekableStateObserver$2 extends Lambda implements Function0<SnapshotStateObserver> {

    /* renamed from: z  reason: collision with root package name */
    public static final TransitionKt$SeekableStateObserver$2 f2754z = new TransitionKt$SeekableStateObserver$2();

    public TransitionKt$SeekableStateObserver$2() {
        super(0);
    }

    /* renamed from: b */
    public final SnapshotStateObserver invoke() {
        SnapshotStateObserver snapshotStateObserver = new SnapshotStateObserver(AnonymousClass1.f2755z);
        snapshotStateObserver.q();
        return snapshotStateObserver;
    }
}
