package androidx.compose.runtime;

import androidx.collection.MutableObjectIntMap;
import androidx.compose.runtime.internal.IntRef;
import kotlin.jvm.functions.Function1;

public final /* synthetic */ class m implements Function1 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ IntRef f15178A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ MutableObjectIntMap f15179B;
    public final /* synthetic */ int C;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ DerivedSnapshotState f15180z;

    public /* synthetic */ m(DerivedSnapshotState derivedSnapshotState, IntRef intRef, MutableObjectIntMap mutableObjectIntMap, int i2) {
        this.f15180z = derivedSnapshotState;
        this.f15178A = intRef;
        this.f15179B = mutableObjectIntMap;
        this.C = i2;
    }

    public final Object invoke(Object obj) {
        return DerivedSnapshotState.y(this.f15180z, this.f15178A, this.f15179B, this.C, obj);
    }
}
