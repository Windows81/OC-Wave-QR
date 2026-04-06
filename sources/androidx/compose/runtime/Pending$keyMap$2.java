package androidx.compose.runtime;

import androidx.collection.MutableScatterMap;
import androidx.compose.runtime.collection.MultiValueMap;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

@Metadata
public final class Pending$keyMap$2 implements Function0<MultiValueMap<Object, KeyInfo>> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Pending f14764z;

    public Pending$keyMap$2(Pending pending) {
        this.f14764z = pending;
    }

    public final MutableScatterMap b() {
        MutableScatterMap n2 = ComposerKt.Q(this.f14764z.b().size());
        Pending pending = this.f14764z;
        int size = pending.b().size();
        for (int i2 = 0; i2 < size; i2++) {
            KeyInfo keyInfo = (KeyInfo) pending.b().get(i2);
            MultiValueMap.a(n2, ComposerKt.H(keyInfo), keyInfo);
        }
        return n2;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        return MultiValueMap.b(b());
    }
}
