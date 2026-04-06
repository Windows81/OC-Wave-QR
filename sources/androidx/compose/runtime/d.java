package androidx.compose.runtime;

import kotlin.jvm.functions.Function0;

public final /* synthetic */ class d implements Function0 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ MovableContentStateReference f15015A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ ComposerImpl f15016z;

    public /* synthetic */ d(ComposerImpl composerImpl, MovableContentStateReference movableContentStateReference) {
        this.f15016z = composerImpl;
        this.f15015A = movableContentStateReference;
    }

    public final Object invoke() {
        return ComposerImpl.U0(this.f15016z, this.f15015A);
    }
}
