package androidx.compose.material3;

import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import kotlin.jvm.functions.Function1;

/* renamed from: androidx.compose.material3.t5  reason: case insensitive filesystem */
public final /* synthetic */ class C0249t5 implements Function1 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ boolean f12714A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ String f12715B;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ String f12716z;

    public /* synthetic */ C0249t5(String str, boolean z2, String str2) {
        this.f12716z = str;
        this.f12714A = z2;
        this.f12715B = str2;
    }

    public final Object invoke(Object obj) {
        return SearchBarDefaults.g(this.f12716z, this.f12714A, this.f12715B, (SemanticsPropertyReceiver) obj);
    }
}
