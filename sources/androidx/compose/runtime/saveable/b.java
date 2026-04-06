package androidx.compose.runtime.saveable;

import kotlin.jvm.functions.Function0;

public final /* synthetic */ class b implements Function0 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Saver f15219A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ SaveableStateRegistry f15220B;
    public final /* synthetic */ String C;
    public final /* synthetic */ Object D;
    public final /* synthetic */ Object[] E;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ SaveableHolder f15221z;

    public /* synthetic */ b(SaveableHolder saveableHolder, Saver saver, SaveableStateRegistry saveableStateRegistry, String str, Object obj, Object[] objArr) {
        this.f15221z = saveableHolder;
        this.f15219A = saver;
        this.f15220B = saveableStateRegistry;
        this.C = str;
        this.D = obj;
        this.E = objArr;
    }

    public final Object invoke() {
        return RememberSaveableKt.k(this.f15221z, this.f15219A, this.f15220B, this.C, this.D, this.E);
    }
}
