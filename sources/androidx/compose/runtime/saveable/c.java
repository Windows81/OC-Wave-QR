package androidx.compose.runtime.saveable;

import androidx.compose.runtime.MutableState;
import kotlin.jvm.functions.Function2;

public final /* synthetic */ class c implements Function2 {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Saver f15222z;

    public /* synthetic */ c(Saver saver) {
        this.f15222z = saver;
    }

    public final Object m(Object obj, Object obj2) {
        return RememberSaveableKt.f(this.f15222z, (SaverScope) obj, (MutableState) obj2);
    }
}
