package androidx.compose.runtime.snapshots;

import android.os.Parcel;
import kotlin.jvm.functions.Function1;

public final /* synthetic */ class j implements Function1 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ ClassLoader f15378A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Parcel f15379z;

    public /* synthetic */ j(Parcel parcel, ClassLoader classLoader) {
        this.f15379z = parcel;
        this.f15378A = classLoader;
    }

    public final Object invoke(Object obj) {
        return SnapshotStateList$Companion$CREATOR$1.d(this.f15379z, this.f15378A, ((Integer) obj).intValue());
    }
}
