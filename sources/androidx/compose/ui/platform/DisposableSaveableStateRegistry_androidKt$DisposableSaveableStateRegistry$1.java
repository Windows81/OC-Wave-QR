package androidx.compose.ui.platform;

import androidx.savedstate.SavedStateRegistry;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class DisposableSaveableStateRegistry_androidKt$DisposableSaveableStateRegistry$1 extends Lambda implements Function0<Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ SavedStateRegistry f17760A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ String f17761B;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ boolean f17762z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DisposableSaveableStateRegistry_androidKt$DisposableSaveableStateRegistry$1(boolean z2, SavedStateRegistry savedStateRegistry, String str) {
        super(0);
        this.f17762z = z2;
        this.f17760A = savedStateRegistry;
        this.f17761B = str;
    }

    public final void invoke() {
        if (this.f17762z) {
            this.f17760A.e(this.f17761B);
        }
    }
}
