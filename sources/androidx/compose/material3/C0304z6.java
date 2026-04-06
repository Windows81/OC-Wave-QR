package androidx.compose.material3;

import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import kotlin.jvm.functions.Function1;

/* renamed from: androidx.compose.material3.z6  reason: case insensitive filesystem */
public final /* synthetic */ class C0304z6 implements Function1 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ String f14519A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ SnackbarData f14520B;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ boolean f14521z;

    public /* synthetic */ C0304z6(boolean z2, String str, SnackbarData snackbarData) {
        this.f14521z = z2;
        this.f14519A = str;
        this.f14520B = snackbarData;
    }

    public final Object invoke(Object obj) {
        return SnackbarHostKt$FadeInFadeOutWithScale$1$1.k(this.f14521z, this.f14519A, this.f14520B, (SemanticsPropertyReceiver) obj);
    }
}
