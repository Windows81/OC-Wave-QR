package androidx.compose.ui.text;

import androidx.compose.runtime.saveable.SaverScope;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

@Metadata
public final class SaversKt$NonNullValueClassSaver$1 implements NonNullValueClassSaver<Object, Object> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Function2 f18396a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Function1 f18397b;

    public SaversKt$NonNullValueClassSaver$1(Function2 function2, Function1 function1) {
        this.f18396a = function2;
        this.f18397b = function1;
    }

    public Object a(Object obj) {
        return this.f18397b.invoke(obj);
    }

    public Object b(SaverScope saverScope, Object obj) {
        return this.f18396a.m(saverScope, obj);
    }
}
