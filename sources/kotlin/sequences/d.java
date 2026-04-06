package kotlin.sequences;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Ref;

public final /* synthetic */ class d implements Function1 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Object f41102A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Ref.BooleanRef f41103z;

    public /* synthetic */ d(Ref.BooleanRef booleanRef, Object obj) {
        this.f41103z = booleanRef;
        this.f41102A = obj;
    }

    public final Object invoke(Object obj) {
        return Boolean.valueOf(SequencesKt___SequencesKt$minus$1.c(this.f41103z, this.f41102A, obj));
    }
}
