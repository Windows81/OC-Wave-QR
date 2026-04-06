package androidx.compose.runtime.saveable;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

@Metadata
public final class SaverKt$Saver$1 implements Saver<Object, Object> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Function2 f15216a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Function1 f15217b;

    public SaverKt$Saver$1(Function2 function2, Function1 function1) {
        this.f15216a = function2;
        this.f15217b = function1;
    }

    public Object a(Object obj) {
        return this.f15217b.invoke(obj);
    }

    public Object b(SaverScope saverScope, Object obj) {
        return this.f15216a.m(saverScope, obj);
    }
}
