package androidx.compose.runtime;

import kotlin.jvm.functions.Function2;

public final /* synthetic */ class g implements Function2 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ SlotWriter f15124A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ RememberManager f15125z;

    public /* synthetic */ g(RememberManager rememberManager, SlotWriter slotWriter) {
        this.f15125z = rememberManager;
        this.f15124A = slotWriter;
    }

    public final Object m(Object obj, Object obj2) {
        return ComposerKt.y(this.f15125z, this.f15124A, ((Integer) obj).intValue(), obj2);
    }
}
