package androidx.compose.runtime;

import androidx.compose.runtime.changelist.ChangeList;
import kotlin.jvm.functions.Function0;

public final /* synthetic */ class c implements Function0 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ ChangeList f14927A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ SlotReader f14928B;
    public final /* synthetic */ MovableContentStateReference C;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ ComposerImpl f14929z;

    public /* synthetic */ c(ComposerImpl composerImpl, ChangeList changeList, SlotReader slotReader, MovableContentStateReference movableContentStateReference) {
        this.f14929z = composerImpl;
        this.f14927A = changeList;
        this.f14928B = slotReader;
        this.C = movableContentStateReference;
    }

    public final Object invoke() {
        return ComposerImpl.T0(this.f14929z, this.f14927A, this.f14928B, this.C);
    }
}
