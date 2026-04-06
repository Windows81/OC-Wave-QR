package com.getkeepsafe.relinker.elf;

public interface Elf {

    public static abstract class DynamicStructure {

        /* renamed from: a  reason: collision with root package name */
        public long f23790a;

        /* renamed from: b  reason: collision with root package name */
        public long f23791b;
    }

    public static abstract class Header {

        /* renamed from: a  reason: collision with root package name */
        public boolean f23792a;

        /* renamed from: b  reason: collision with root package name */
        public int f23793b;

        /* renamed from: c  reason: collision with root package name */
        public long f23794c;

        /* renamed from: d  reason: collision with root package name */
        public long f23795d;

        /* renamed from: e  reason: collision with root package name */
        public int f23796e;

        /* renamed from: f  reason: collision with root package name */
        public int f23797f;

        /* renamed from: g  reason: collision with root package name */
        public int f23798g;

        /* renamed from: h  reason: collision with root package name */
        public int f23799h;

        /* renamed from: i  reason: collision with root package name */
        public int f23800i;

        public abstract DynamicStructure a(long j2, int i2);

        public abstract ProgramHeader b(long j2);

        public abstract SectionHeader c(int i2);
    }

    public static abstract class ProgramHeader {

        /* renamed from: a  reason: collision with root package name */
        public long f23801a;

        /* renamed from: b  reason: collision with root package name */
        public long f23802b;

        /* renamed from: c  reason: collision with root package name */
        public long f23803c;

        /* renamed from: d  reason: collision with root package name */
        public long f23804d;
    }

    public static abstract class SectionHeader {

        /* renamed from: a  reason: collision with root package name */
        public long f23805a;
    }
}
