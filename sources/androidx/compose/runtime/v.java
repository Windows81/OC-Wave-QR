package androidx.compose.runtime;

import androidx.collection.MutableScatterSet;
import kotlin.jvm.functions.Function0;

public final /* synthetic */ class v implements Function0 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ ControlledComposition f15425A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ MutableScatterSet f15426z;

    public /* synthetic */ v(MutableScatterSet mutableScatterSet, ControlledComposition controlledComposition) {
        this.f15426z = mutableScatterSet;
        this.f15425A = controlledComposition;
    }

    public final Object invoke() {
        return Recomposer.M0(this.f15426z, this.f15425A);
    }
}
