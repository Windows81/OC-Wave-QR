package androidx.profileinstaller;

enum FileSectionType {
    DEX_FILES(0),
    EXTRA_DESCRIPTORS(1),
    CLASSES(2),
    METHODS(3),
    AGGREGATION_COUNT(4);
    

    /* renamed from: z  reason: collision with root package name */
    public final long f22779z;

    /* access modifiers changed from: public */
    FileSectionType(long j2) {
        this.f22779z = j2;
    }

    public long f() {
        return this.f22779z;
    }
}
