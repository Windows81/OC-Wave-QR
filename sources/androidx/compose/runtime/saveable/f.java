package androidx.compose.runtime.saveable;

import androidx.compose.runtime.Composer;
import kotlin.jvm.functions.Function2;

public final /* synthetic */ class f implements Function2 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Object f15227A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Function2 f15228B;
    public final /* synthetic */ int C;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ SaveableStateHolderImpl f15229z;

    public /* synthetic */ f(SaveableStateHolderImpl saveableStateHolderImpl, Object obj, Function2 function2, int i2) {
        this.f15229z = saveableStateHolderImpl;
        this.f15227A = obj;
        this.f15228B = function2;
        this.C = i2;
    }

    public final Object m(Object obj, Object obj2) {
        return SaveableStateHolderImpl.i(this.f15229z, this.f15227A, this.f15228B, this.C, (Composer) obj, ((Integer) obj2).intValue());
    }
}
