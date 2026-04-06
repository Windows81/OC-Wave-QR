package androidx.compose.material3;

import androidx.compose.runtime.Composer;
import kotlin.jvm.functions.Function2;

/* renamed from: androidx.compose.material3.d2  reason: case insensitive filesystem */
public final /* synthetic */ class C0075d2 implements Function2 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ BasicAlertDialogOverrideScope f11990A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ int f11991B;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ DefaultBasicAlertDialogOverride f11992z;

    public /* synthetic */ C0075d2(DefaultBasicAlertDialogOverride defaultBasicAlertDialogOverride, BasicAlertDialogOverrideScope basicAlertDialogOverrideScope, int i2) {
        this.f11992z = defaultBasicAlertDialogOverride;
        this.f11990A = basicAlertDialogOverrideScope;
        this.f11991B = i2;
    }

    public final Object m(Object obj, Object obj2) {
        return DefaultBasicAlertDialogOverride.c(this.f11992z, this.f11990A, this.f11991B, (Composer) obj, ((Integer) obj2).intValue());
    }
}
