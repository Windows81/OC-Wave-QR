package io.realm;

class MapChangeSetImpl<K> implements MapChangeSet<K> {

    /* renamed from: a  reason: collision with root package name */
    public final MapChangeSet f39902a;

    public MapChangeSetImpl(MapChangeSet mapChangeSet) {
        this.f39902a = mapChangeSet;
    }

    public boolean isEmpty() {
        return this.f39902a.isEmpty();
    }
}
