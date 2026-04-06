package androidx.compose.foundation.text.selection;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class AndroidSelectionHandles_androidKt$SelectionHandle$1$1$1$1$1 extends Lambda implements Function0<Boolean> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ OffsetProvider f6706z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AndroidSelectionHandles_androidKt$SelectionHandle$1$1$1$1$1(OffsetProvider offsetProvider) {
        super(0);
        this.f6706z = offsetProvider;
    }

    /* renamed from: b */
    public final Boolean invoke() {
        return Boolean.valueOf((this.f6706z.a() & 9223372034707292159L) != 9205357640488583168L);
    }
}
