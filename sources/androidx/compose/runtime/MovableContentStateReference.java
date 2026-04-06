package androidx.compose.runtime;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class MovableContentStateReference {

    /* renamed from: a  reason: collision with root package name */
    public final MovableContent f14728a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f14729b;

    /* renamed from: c  reason: collision with root package name */
    public final ControlledComposition f14730c;

    /* renamed from: d  reason: collision with root package name */
    public final SlotTable f14731d;

    /* renamed from: e  reason: collision with root package name */
    public final Anchor f14732e;

    /* renamed from: f  reason: collision with root package name */
    public List f14733f;

    /* renamed from: g  reason: collision with root package name */
    public final PersistentCompositionLocalMap f14734g;

    /* renamed from: h  reason: collision with root package name */
    public final List f14735h;

    public MovableContentStateReference(MovableContent movableContent, Object obj, ControlledComposition controlledComposition, SlotTable slotTable, Anchor anchor, List list, PersistentCompositionLocalMap persistentCompositionLocalMap, List list2) {
        this.f14728a = movableContent;
        this.f14729b = obj;
        this.f14730c = controlledComposition;
        this.f14731d = slotTable;
        this.f14732e = anchor;
        this.f14733f = list;
        this.f14734g = persistentCompositionLocalMap;
        this.f14735h = list2;
    }

    public final Anchor a() {
        return this.f14732e;
    }

    public final ControlledComposition b() {
        return this.f14730c;
    }

    public final MovableContent c() {
        return this.f14728a;
    }

    public final List d() {
        return this.f14733f;
    }

    public final PersistentCompositionLocalMap e() {
        return this.f14734g;
    }

    public final List f() {
        return this.f14735h;
    }

    public final Object g() {
        return this.f14729b;
    }

    public final SlotTable h() {
        return this.f14731d;
    }

    public final void i(List list) {
        this.f14733f = list;
    }

    public final void j() {
        ControlledComposition controlledComposition = this.f14730c;
        Intrinsics.g(controlledComposition, "null cannot be cast to non-null type androidx.compose.runtime.CompositionImpl");
        this.f14733f = CollectionsKt.x0(this.f14733f, ((CompositionImpl) controlledComposition).J(this.f14732e));
    }
}
