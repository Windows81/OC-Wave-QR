package kotlinx.coroutines.internal;

import kotlin.Metadata;

@Metadata
public final class Symbol {

    /* renamed from: a  reason: collision with root package name */
    public final String f41869a;

    public Symbol(String str) {
        this.f41869a = str;
    }

    public String toString() {
        return '<' + this.f41869a + '>';
    }
}
