package androidx.datastore.core;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
public abstract class State<T> {

    /* renamed from: a  reason: collision with root package name */
    public final int f20640a;

    public /* synthetic */ State(int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i2);
    }

    public final int a() {
        return this.f20640a;
    }

    public State(int i2) {
        this.f20640a = i2;
    }
}
