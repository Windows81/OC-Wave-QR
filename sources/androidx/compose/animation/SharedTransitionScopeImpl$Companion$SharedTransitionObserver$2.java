package androidx.compose.animation;

import androidx.compose.runtime.snapshots.SnapshotStateObserver;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class SharedTransitionScopeImpl$Companion$SharedTransitionObserver$2 extends Lambda implements Function0<SnapshotStateObserver> {

    /* renamed from: z  reason: collision with root package name */
    public static final SharedTransitionScopeImpl$Companion$SharedTransitionObserver$2 f2345z = new SharedTransitionScopeImpl$Companion$SharedTransitionObserver$2();

    public SharedTransitionScopeImpl$Companion$SharedTransitionObserver$2() {
        super(0);
    }

    /* renamed from: b */
    public final SnapshotStateObserver invoke() {
        SnapshotStateObserver snapshotStateObserver = new SnapshotStateObserver(AnonymousClass1.f2346z);
        snapshotStateObserver.q();
        return snapshotStateObserver;
    }
}
