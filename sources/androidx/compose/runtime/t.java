package androidx.compose.runtime;

import androidx.collection.MutableScatterSet;
import kotlin.jvm.functions.Function1;

public final /* synthetic */ class t implements Function1 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ MutableScatterSet f15387A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ ControlledComposition f15388z;

    public /* synthetic */ t(ControlledComposition controlledComposition, MutableScatterSet mutableScatterSet) {
        this.f15388z = controlledComposition;
        this.f15387A = mutableScatterSet;
    }

    public final Object invoke(Object obj) {
        return Recomposer.d1(this.f15388z, this.f15387A, obj);
    }
}
